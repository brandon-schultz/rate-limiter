package com.redwood.rest.webservices.rate_limiter.ratelimiter;

import java.util.concurrent.TimeUnit;

public abstract class RateLimiter {
    private final long capacity;
    private final long refillRate; // tokens per second
    private String rateLimiterName;
    private long currentTokens;
    private long lastRefillTimestamp;

    public RateLimiter(long capacity, long refillRate, String rateLimiterName) {
        this.capacity = capacity;
        this.refillRate = refillRate;
        this.currentTokens = capacity; // Start with a full bucket
        this.rateLimiterName = rateLimiterName;
        this.lastRefillTimestamp = System.nanoTime();
    }

    public synchronized boolean allowRequest() {
        refillTokens();
        System.out.print("\n Number of tokens for - " + rateLimiterName + " " + currentTokens);
        if (currentTokens > 0) {
            currentTokens--;
            return true;
        }
        return false;
    }

    private void refillTokens() {
        long now = System.nanoTime();
        long timeElapsed = now - lastRefillTimestamp;
        if (timeElapsed > 0) {
            long tokensToAdd = (timeElapsed * refillRate) / TimeUnit.SECONDS.toNanos(1);
            currentTokens = Math.min(capacity, currentTokens + tokensToAdd);
            lastRefillTimestamp = now;
        }
    }
}
