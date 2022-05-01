# Java Database Template
This is a simple java project for setting up a connection to a database. It uses
Maven to manage dependencies and docker to run the database.

## Quick Start

### Start Database
To start the database, run the following command in the project root directory:
```
docker-compose up
```
Connection String: `mysql://localhost:3306`<br>
Username: `root`<br>
Password: `example`

### Database Connector
The MySQL JDBC driver is included in the project. Most IDEs will automatically download the dependency for you. If not, view [Maven in 5 minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html) and the [pom.xml](pom.xml) file of this project.