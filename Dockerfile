FROM hseeberger/scala-sbt:8u181_2.12.7_1.2.6 AS base

FROM base AS builder
RUN mkdir -p /app
WORKDIR /app
COPY . .
RUN sbt "set test in assembly := {}" clean assembly

FROM openjdk:8-jre-alpine AS app
WORKDIR /app
COPY --from=builder /app/target/scala-2.12/sbt-container-example-*.jar container.jar
CMD ["java", "-jar", "container.jar"]
