FROM node:12.18.0

RUN mkdir /usr/src/app
WORKDIR /usr/src/app

RUN npm install -g @angular/cli

COPY . /usr/src/app

CMD ng serve --host 0.0.0.0 --port 4200

# 2ª nivle

FROM openjdk:8
ARG PROFILE

ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS={ADDITIONAL_OPTS}

WORKDIR /opt/spring_boot

COPY /target/api_cadastro-*.jar api_cadastro.jar

SHELL ["/bin/sh","-c"]

EXPOSE 55005
EXPOSE 8080

CMD java ${ADDITIONAL_OPTS} -jar api_cadastro.jar --spring.profiles.active={PROFILE}

