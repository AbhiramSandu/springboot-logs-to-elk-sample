# Project Title

This project is a simple tutorial on how to process SpringBoot logs to ELK stack

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

What things you need to install the software and how to install them

```
Java 8
Docker & Docker Compose
Maven 3
```

### Installing

A step by step series of examples that tell you how to get a development env running

```
docker-compose up -d
mvn clean package && java -jar ./target/elasticsearch-0.0.1-SNAPSHOT.jar
```

To see the logs visit [Kibana](http://localhost:5601) and configure index patterns

Check the logs in the Discover tab

![Logs](https://i.imgur.com/ZL2gXjX.png)

## Running the tests

```
mvn clean tests
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Spring](http://www.http://spring.io) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ELK](https://www.elastic.co/elk-stack) - ELK Stack

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Vitor Vezani** - *Initial work* - [github](https://github.com/vvezani)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
