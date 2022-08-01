FROM gradle:jdk11-alpine AS build
COPY src /home/gradle/src
COPY settings.gradle build.gradle /home/gradle/
WORKDIR /home/gradle/
RUN gradle clean build bootJar

FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
COPY --from=build "home/gradle/build/libs/reto-devsu-pichincha-0.0.1-SNAPSHOT.jar" "reto-devsu-pichincha.jar"
EXPOSE 9091
ENTRYPOINT ["java","-jar","reto-devsu-pichincha.jar"]