Steps to run beer-service application

Command to build application:
        mvn clean install

Command to build docker image of application:
        mvn clean package docker:build

Command to build run docker image
        docker run -it -p 8080:8080 beerservice

Command to stop all the container
        docker stop $(docker ps -a -q)

Command to remove all the container
        docker rm $(docker ps -a -q)

Command to remove all the image
        docker rmi -f $(docker images -q)


Below are the sample URLs to test application using Postman or browser

To get beer with different ID using browser or postman
   http://localhost:8080/mybeer/randombeer?id=1
