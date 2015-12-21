# Dashery Front End [![Build Status](https://travis-ci.org/Cowbacca/dashery-front-end.svg?branch=master)](https://travis-ci.org/Cowbacca/dashery-front-end) [![codecov.io](https://codecov.io/github/Cowbacca/dashery-front-end/coverage.svg?branch=master)](https://codecov.io/github/Cowbacca/dashery-front-end?branch=master)

Web front end for Dashery clothing search.

[Staging](https://dashery-front-end-staging.herokuapp.com/)

[Live](http://www.dashery.co.uk)

## Local Setup

Run `npm install`.  This will install bower, and run bower install as a postinstall script.  Then run the spring boot app either from the IDE or via `mvn spring-boot:run`.

## Heroku Setup

Heroku needs to be set up to run npm install first.

```bash
heroku buildpacks:add --index 1 heroku/nodejs
heroku buildpacks:add --index 2 heroku/java
```

## Deployment

Standard Spring Boot deployment.  Requires the following properties to be present in the environment, whether via yml/properties file or environment variable:

```
spring:
  cloud:
    config:
      profile: #e.g. will get values from the dashery-autocomplete-{profile}.properties file from the config server.
      uri: #the uri of the config server, e.g.  http://dashery-config-server.herokuapp.com 
      username: #username to access the config server.
      password: #password to access the config server.
```
