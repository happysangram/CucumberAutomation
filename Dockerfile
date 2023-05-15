From openjdk:8u191-jre-alpine3.8

#Workspace
WORKDIR /Users/sangram.das/GIT/CucumberAutomation/Builds

#ADD .jar under target from host into image
ADD target/selenium-docker-tests.jar          selenium-docker-tests.jar
ADD target/libs                               libs

#ADD suite files
ADD testng.xml                                testng.xml

ENTRYPOINT  java -cp selenium-docker-tests.jar:libs/* org.testng.TestNG testng.xml