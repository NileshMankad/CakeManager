

Pre-Requisites for Getting Started
Java 8 is installed.

Any Java IDE (preferably STS or IntelliJ IDEA).

Basic understanding of Java and Spring-based web development and UI development using HTML, CSS, and JavaScript.

--------

I have used Maven as the build tool

--------------

Application is built onto Spring boot framework as the base.

For DB operations, I have used SpringData JPA, here other databases can be used.

There are classes related to DTO and Entity.

Javascript, HTML and Angular scripts used to render UI and to give download feature.

------------------

The application can be built using:

mvn clean install then run as a runnable jar file by using

java -jar cakedemo-0.0.1-SNAPSHOT.jar

OR
from the IDE you can run the CakeDemoApplication.java file as Run As Spring Boot Application

Open the browser and hit 

http://localhost:8080/cakes

Above should give you the UI to insert the cake details.

http://localhost:8080/

Above should give the list of inserted cakes

OR

If you want to go with Docker way, follow the steps given below (I have pushed the image into Docker public hub)

1) sudo yum install -y docker (optional if docker is already installed)
2) sudo service docker start (optional if docker service is already up)
3) sudo docker run -d -p 80:8080 njm003/nilesh:CakeDemoNilesh
4) Open the browser and visit the http://localhost/cakes  (please note that we do not have to put 8080 now)

