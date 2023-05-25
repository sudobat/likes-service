## Microservice tweet likes
#### version 1.0
### Prerequisites
 - Install docker and docker compose
 - JDK 17.
 - Maven
 - Postman or another tool to launch RESTFull Request

### Layout structure
 - `/compose` contains docker-compose file needed to launch Redis
 - `/src` java source code
 - `/postamn` contains a postman collection to launch requesto

### Getting started
 1. Go to compose directory and launch the following command in order to start a standalone Redis container:
    ```
    \> docker-compose up
    ```
    
2. Launch microservice using your favourite IDE. Microservice will be listen on `http://localhost:8080/` endpoint.
3. Open Postman project attached  in postman directory and launch REST queries . Also you can using curl command or another REST Client. 

