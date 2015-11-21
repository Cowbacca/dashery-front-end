# Dashery Front End

[![Build Status](https://travis-ci.org/Cowbacca/dashery-front-end.svg?branch=master)](https://travis-ci.org/Cowbacca/dashery-front-end)

Web front end for Dashery clothing search.

[Staging](https://dashery-front-end-staging.herokuapp.com/)

[Live](http://www.dashery.co.uk)

# Local Setup

Run `npm install`.  This will install bower, and run bower install as a postinstall script.  Then run the spring boot app either from the IDE or via `mvn spring-boot:run`.

# Heroku Setup

Heroku needs to be set up to run npm install first.

```bash
heroku buildpacks:add --index 1 heroku/nodejs
heroku buildpacks:add --index 2 heroku/java
```
