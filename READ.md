This project assumes you have Java and docker configured on your systems.
The project was not tested for Docker Toolbox, thus configurations may change in docker-compose-single-broker.yml file

If you don't have docker installed, refer the link below to run Zookeeper and Kafka broker on Windows
Unix users should do the same, but to execute files with .sh extension

https://dzone.com/articles/running-apache-kafka-on-windows-os



1. Open cmd
2. Navigate to kafka-server directory and eecute docker-compose -f docker-compose-single-broker.yml
3. Import project as Maven project

There are two Maven modules (consumer and producer) and they both are separate spring-boot servers.
You should treat them as two totally separate servers/projects