spring-boot-microservices

Demo microservices project using spring boot and spring cloud config

There are 3 microservices :
- microservices-demo-movie-catalog-service
- microservices-demo-movie-info-service
- microservices-demo-ratings-data-service

All of them communicate with each other using REST.

They use Eureka for service discovery.

Spring cloud config server is used to store properties, instead of putting them in application.properties
