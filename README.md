# Phone Validation API
* This project is an API developed to validate  phone numbers.

## Running the application
```
mvn spring-boot:run
```

## Running the tests
Tests are written using Junit5 and Mockito for mocking. Execute the following command at the root of the folder to run the tests.

```
 ./mvnw test
```


## Endpoints
Below is a description of the request and response payloads for the endpoints in this app.


### Phone number validation endpoint
This endpoint validates whether a given phone number is valid or not.

URL: GET /api/v1/webtribe/validation-service?msisdn={phone_number}

Response payload:
```
{
  "id": 5,
  "providerName": "EQUITEL",
  "code": 202
}
```

If the given number is invalid, below is the response payload:
```
{
  "id": 0,
  "message": "Provided phone number is invalid: 76411223399",
  "code": 400
}
```



## Built With
* [Micronaut v2.1.2](https://micronaut.io) - Framework used
* [JDK 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html) - Java Runtime
* [Maven 3](https://maven.apache.org/) - Dependency Management


## Versioning
1.0-SNAPSHOT


## Authors
* **[Elijah Muraya](https://www.linkedin.com/in/elijah-muraya-dev95)** - 
