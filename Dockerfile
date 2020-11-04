FROM adoptopenjdk/openjdk11:jdk-11.0.6_10-alpine-slim
COPY target/msisdn-validator-*.jar msisdn-validator.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "msisdn-validator.jar"]