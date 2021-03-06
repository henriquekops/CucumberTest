# CucumberTest

This repo contains the necessary integration for working with [Cucumber](https://cucumber.io/) when using [Spring Boot](https://spring.io/projects/spring-boot) + [React](https://pt-br.reactjs.org/) stack.

<img src="https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/cucumber-slice-royalty-free-image-153556336-1562870568.jpg" width=500>

## Spring Boot

To test the application change the root folder to `cucumber_spring`:

```sh
# change to project root
$ cd cucumber_spring
```

Then install deps:
```bash
# install dependencies
$ mvn clean install
```

And simply trigger:
```bash
# run cucumber integrated tests
$ mvn clean test
```

You can also package an test the Spring Boot server with:
```bash
# package into jar
$ mvn clean package

# test application
$ java -jar target/cucumber_spring-1.0.0-SNAPSHOT.jar
```

## React

To test the application change the root folder to `cucumber_react`:

```sh
# change to project root
$ cd cucumber_react
```

Then install deps:
```bash
# install dependencies
$ npm install
```

And simply trigger:
```bash
# run cucumber integrated tests
$ npm test
```

You can also test the React app with:
```bash
# test application
$ npm start
```