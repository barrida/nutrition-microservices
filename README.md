# Spring Boot Microservices From Scratch

## Microservices

We implement following microservices:  

- Config server registry 
- Service registry 
- Food service that produces food resources
- Feign-client service that consumes the Food REST service as a registry-aware client Spring Cloud Netflix Feign Client
- Rest-client service that consumes the Food REST service as a Ribbon-aware client Spring Discovery client enabled RestTemplate

## Tech Stack

- Java/Spring Boot/Maven
- Spring Cloud Config Server
- Eureka Server and Client
- Spring Cloud NetflixFeign Client
- Spring Discovery client enabled RestTemplate

### Spring Cloud Config Server
<p>With microservices, we create a&nbsp;<strong>central config server where all configurable parameters of micro-services are written version controlled</strong>. The benefit of a central config server is that if we change a property for a microservice, it can reflect that on the fly without redeploying the microservice.</p>

### Eureka Server

Service Discovery is one of the key tenets of a microservice-based architecture. Trying to hand-configure each client or some form of convention can be difficult to do and can be brittle. Eureka is the Netflix Service Discovery Server and Client. The server can be configured and deployed to be highly available, with each server replicating state about the registered services to the others. Eureka Server is also known as Discovery Server.[1]

### Eureka Client
_Food Service_, _Spring Cloud Netflix Feign Client_ and _Spring Discovery client enabled RestTemplate_ are _Eureka Clients_. Every microservice will register into the Eureka server and Eureka server knows all the client applications running on each port and IP address.

#### Config vs Eureka Server

<p>The default way to use Eureka and Config Server is to use Config First bootstrap. Essentially, you make eureka server a client of the config server but you don't make the config server a client of eureka.</p>

### Spring Cloud NetflixFeign Client

An alternative to the Spring Ribbon-enabled RestTemplate class is Netflix’s Feign client library. The Feign library takes a different approach to call a REST service by having the developer first define a Java interface and then annotating that interface with Spring Cloud annotations to map what Eureka-based service Ribbon will invoke.[2]

### Spring Discovery client enabled RestTemplate

This is one of the more common mechanisms for interacting with Ribbon via Spring. To use a Ribbon-aware RestTemplate class, we need to define a RestTemplate bean construction method with a Spring Cloud annotation called @LoadBalanced.[3]

## References
[1] https://cloud.spring.io/spring-cloud-netflix/multi/multi__service_discovery_eureka_clients.html  
[2] John Carnell; Illary Huaylupo Sánchez. Spring Microservices in Action, Second Edition MEAP V05 (Kindle Locations 4038-4040). Manning Publications Co.. Kindle Edition.  
[3] John Carnell; Illary Huaylupo Sánchez. Spring Microservices in Action, Second Edition MEAP V05 (Kindle Locations 3976-3978). Manning Publications Co.. Kindle Edition.   
