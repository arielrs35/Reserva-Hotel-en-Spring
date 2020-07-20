FROM openjdk:8
COPY /target/e-reservation.jar  /usr/src/
CMD ["java",  "-jar", "/usr/src/e-reservation.jar"]
EXPOSE 8080