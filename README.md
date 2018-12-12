# axon-kotlin-spring-maven-seed

This project is a [atomist] seed for creating [axon] (spring boot) projects that are driven by [maven] and written in Kotlin.

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

We use H2 SQL databse. Web console is enabled and it should be available on `/h2-console` URL (eg. `http://localhost:8080/h2-console`). Please check your `application.yml` for datasource URL.

---

Created by [idugalic].

[maven]: https://maven.apache.org/ (Maven)
[atomist]: https://www.atomist.com/ (Atomist)
[idugalic]: http://idugalic.pro/ (Ivan Dugalic)
[axon]: https://axoniq.io/ (Axon)