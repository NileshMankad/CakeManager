FROM java:8

MAINTAINER Nilesh Mankad "nileshmankad@yahoo.com"

WORKDIR /usr/local/bin/

EXPOSE 8080

# copy the packaged jar file into our docker image
COPY target/cakedemo-0.0.1-SNAPSHOT.jar .
 
# set the startup command to execute the jar
CMD ["java", "-jar", "cakedemo-0.0.1-SNAPSHOT.jar"]

