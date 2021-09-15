FROM openkbs/jdk11-mvn-py3
ADD /build/libs/webDemoApi-0.0.1-SNAPSHOT.jar webAppTest.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java","-jar","webAppTest.jar"]
