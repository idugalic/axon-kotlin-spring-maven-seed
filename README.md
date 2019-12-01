# [projects](http://idugalic.github.io/projects)/axon-kotlin-spring-maven-seed

This project is a seed for creating [axon] (spring boot) projects that are driven by [maven] and written in [kotlin].

A seed is a project that works as a starting point. It is real, functional code, not a template.

> Additionally, you can automate your project creation within your organization by using an Atomist [Software Delivery Machine](https://github.com/idugalic/axon-sdm) generator that we provide. Generators copy the code from this seed, and then modify the code in certain ways, such as renaming classes and packages so that it’s ready to use without lots of manual find and replace. Generators frequently also configure supporting systems, for example, by creating a dedicated Slack channel, setting up issue tracking, and so on.

## Development

This project is driven using [maven].

### Run Axon Server

You can [download](https://download.axoniq.io/axonserver/AxonServer.zip) a ZIP file with AxonServer as a standalone JAR. This will also give you the AxonServer CLI and information on how to run and configure the server.

Alternatively, you can run the following command to start AxonServer in a Docker container:

```
$ docker run -d --name axonserver -p 8024:8024 -p 8124:8124 axoniq/axonserver
```

### Run locally

You can run the following command to start your project locally:

```
$ ./mvnw spring-boot:run
```

### Run tests

This project comes with some rudimentary tests as a good starting
point for writing your own. Use the following command to execute the
tests using Maven:

```
$ ./mvnw test
```

### In-memory database

We use H2 SQL databse. Web console is enabled and it should be available on `/h2-console` URL (eg. `http://localhost:8080/h2-console`). Please check your `application.properties` for datasource URL.

---

[maven]: https://maven.apache.org/ (Maven)
[atomist]: https://www.atomist.com/ (Atomist)
[axon]: https://axoniq.io/ (Axon)
[kotlin]: https://kotlinlang.org/ (Kotlin)
