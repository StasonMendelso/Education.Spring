# Education.Spring

## What is the project about?

Repository is for educational purpose - learning a Spring framework.
I am watching the [course][1] about Spring framework,
making some notes and adding them to the project, writing examples from the
videos and mastering my skill in this framework.

## What is the purpose of this project?

The **purpose** of the project is ***learning more*** about the framework,
how it should be used correctly to get the *most benefit*. As for me, I haven't got
almost any experience of using [Spring][2] and now want to try it instead of using
the [Servlet API][3] in web-applications.

In addition to, it is the first project, where I use the MarkDown language and make
description to the project. So, the skill in using MarkDown language is being acquired too.

## Getting Started

As there isn't a real or PET project, for viewing the all notes, which were made
during my study, you can switch between branches and see my notes, some examples
of code for each lesson.

### Prerequisites

For running some branches of the projects you need the next:

* [Tomcat 9.0.60](https://tomcat.apache.org/) - for running the Spring MVC application part.
* [Xmind](https://xmind.app/) - if you need to edit some my notes and then save it. Otherwise, you can see
  my notes in .png extension without any downloading additional program.
* [PostgreSQL 15](https://www.postgresql.org/) - for running the app with database. Also you can use another database. 
  You can find the [script](database/dump.sql) of creating database in directory with name "*[database](database)*".

#### What things you need to install the software and how to install them


##### Database configuration

For running the database you can use as me PostgreSQL or create your own database on another SQL server
using the [script](database/dump.sql) file of creating the database.
<br>
**Note**: if you use another server not such
PostgreSQL you should change JDBC driver for working with it and configurate the connection to your
server in appropriate property file, which you must create manually. If you change driver, you should
make some changes in [pom.xml file](pom.xml)
<br>

##### Server configuration

For running the code you needn't install server and configure it, because the Spring Boot starter
makes it instead of you using the pom.xml.

### Running the web-app
You can find an empty [application configuration file](src/main/resources/application.properties.origin),
which must be renamed to "*application.properties*" instead of "*application.properties.origin*". This file
contains only keys for configuration the application using the Spring Boot, so you can put your values to the file and run
application with this application configuration. You can find more about configuration of Spring Boot application on
the Internet.
<br>
For running the app on the server you need only run the main method in Java class. Also, you can
package app to the jar file and deploy the file on the server manually.

[//]: # ()

[//]: # (```)

[//]: # (Give examples)

[//]: # (```)

[//]: # ()

[//]: # (### Installing)

[//]: # ()

[//]: # (A step by step series of examples that tell you how to get a development env running)

[//]: # ()

[//]: # (Say what the step will be)

[//]: # ()

[//]: # (```)

[//]: # (Give the example)

[//]: # (```)

[//]: # ()

[//]: # (And repeat)

[//]: # ()

[//]: # (```)

[//]: # (until finished)

[//]: # (```)

[//]: # ()

[//]: # (End with an example of getting some data out of the system or using it for a little demo)

[//]: # ()

[//]: # (## Running the tests)

[//]: # ()

[//]: # (Explain how to run the automated tests for this system)

[//]: # ()

[//]: # (### Break down into end to end tests)

[//]: # ()

[//]: # (Explain what these tests test and why)

[//]: # ()

[//]: # (```)

[//]: # (Give an example)

[//]: # (```)

[//]: # ()

[//]: # (### And coding style tests)

[//]: # ()

[//]: # (Explain what these tests test and why)

[//]: # ()

[//]: # (```)

[//]: # (Give an example)

[//]: # (```)

[//]: # ()

[//]: # (## Deployment)

[//]: # ()

[//]: # (Add additional notes about how to deploy this on a live system)

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Author

* **Stanislav Hlova** - *All work* - [StasonMendelso](https://github.com/StasonMendelso)

[1]:https://www.udemy.com/course/spring-alishev/

[2]:https://spring.io/

[3]:https://metanit.com/java/javaee/4.1.php