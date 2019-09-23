# FunWithAPIs
Resources to support a Java workshop about combining APIs

# Introduction
This repository contains code and resources to support the [Brighton Java Fun With APIs workshop](https://www.meetup.com/Brighton-Java/events/264746384/).

# Workshop
There is a good resource of [public APIs on github](https://github.com/public-apis/public-apis). The workshop will involve picking two of these APIs and combining them (what used to be referred to as [a mashup](https://en.wikipedia.org/wiki/Mashup_(web_application_hybrid))). 

This repository contains a basic example using Spring Boot that can be customised.

## 1 - Create basic project
I downloaded [a Spring Boot guide application](https://spring.io/guides/gs/spring-boot/) to use as a basis and imported this into intellij. This gaves me a build system with no need to mess around. When importing the project, I made sure to use external sources for the build tooling, which set all the libraries appropriately. 

## 2 - Add in dependencies
The example I worked with used REST, so I added the Jersey libraries to gradle.

## 3 - Add classes to capture responses
Next I made some classes to map the responses. This produces a coupling between the endpoint and the code. I’m not sure if there is a way to make this more flexible, but as this is a quick-and-dirty demo, it will do.

## 4 - Update the controller
I then edited the HelloController class within the downloaded Spring Boot project, and wrote some quick code for downloading the APIs. This is a very long way from production quality, with no error management, but it does the job

At this point the code can be executed from the command line with the command ‘gradle bootRun’.

# Resources
* A comprehensive [guide to APIs](https://github.com/Kikobeats/awesome-api)
* Some interesting posts from have-i-been-pwned about APIs, one on [adding authetication to APIs](https://www.troyhunt.com/authentication-and-the-have-i-been-pwned-api/), and another on [pragmatic versioning](https://www.troyhunt.com/your-api-versioning-is-wrong-which-is/).
* An example using [JAX-RS and Jersey to read XML/JSON apis](https://www.baeldung.com/jersey-jax-rs-client)
* Another [Jersey/REST example](https://www.vogella.com/tutorials/REST/article.html)
* I've written a [blog post on the workshop](http://jamesburt.me.uk/uncategorized/fun-with-apis/) which includes a simple example; the comments are available for people to list what they've done
