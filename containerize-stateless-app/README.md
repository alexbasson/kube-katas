# Kata: Containerize Stateless App

## Goal:

To build, run, and push to DockerHub a container image of this app.

## You'll be done when:

From your local machine, you can run

```shell script
$ docker run -p 8080:8080 <your-docker-id>/containerize-stateless-app:0.0.1
```

and then visit `http://localhost:8080/hello?name=<your-name>` to see a friendly greeting.

## Notes

- You can follow the [Spring Boot with Docker](https://spring.io/guides/gs/spring-boot-docker/) guide for step-by-step instructions.
- On a client project, you won't want to push your images to DockerHub—that would expose client code to the public internet. Future katas will address how to handle this situation.
