## **Kafka Producer and Consumer Example**

Container Kafka Docker server, running on Windows OS. 

Docker Kafka server is the modification of [Wurstmeister Kafka](https://hub.docker.com/r/wurstmeister/kafka/) image: 


This project assumes you have Java and docker configured on your OS.

>The project was not tested for _Docker Toolbox_, thus configurations may change in **docker-compose-single-broker.yml** file.

> If you don't have Docker installed, refer the link below to run Zookeeper and Kafka broker on Windows.

Unix users should do the same, but to execute files with `*.sh` extension.

https://dzone.com/articles/running-apache-kafka-on-windows-os



1. Open `CMD`/`Terminal`
2. Navigate to **kafka-server** directory and execute `docker-compose -f docker-compose-single-broker.yml`
3. Import the project as Maven project


There are two Maven modules:
 * kafka-consumer-demo 
 * kafka-producer-demo
 
 They both are separate spring-boot servers and should be treated as different projects, as if they would be in different directories.