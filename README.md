# Rate Limiter
Rate limiter is a demo spring boot restful api app to demostrate how to control the number of httpRequests a server can handle.

Essentially a load balancer

## Usage

Start the RestfulWebServicesApplication

Using Postman call the endpoint multiple times defined in the StaffResources class. Eventually you will get a 429 TOO-MANY-REQUESTS exception

Alternatively run the unit test RateLimiterTest
