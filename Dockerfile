FROM openjdk:14-alpine
COPY target/msisdn-validator-*.jar msisdn-validator.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "msisdn-validator.jar"]