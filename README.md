# springboot-microservices-sample-app

## Info

### How it works

User service requests an endpoint from Department service using RestTemplate.

Microservices, cloud config, cloud gateway, hystrix dashboard register to eureka server which manages their endpoints.

Cloud gateway configures paths, circuit breaker fallback method uris (hystrix), hystrix stream.

Hystrix dashboard accepts http:(host):(port)/hystrix.stream and monitors gateway specified route services.

Cloud config server references a [github repo](https://github.com/Gaurav-Shinde/microservices-config) for service registry in bootstrap.yaml file of services.

### Remarks

Zipkin was not used as Sleuth log tracking for user and department service was sufficient.

Ribbon load balancer and Zuul api gateway were not implemented for a simple project since they do the same thing. Perhaps can be implemented for complex configurations.

### Current Issues

Hystrix dashboard is unable to recognize media stream despite different config attempts. If you know a solution that works for you, please reply in the issue.

## Instructions

Installations:
..* jdk 8
..* maven 1.8
..* sts 4

Run all: registry, gateway, config-server, user-service, department-service, hystrix-dashboard - all in that order.
