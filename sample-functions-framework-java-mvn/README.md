Sample Functions Framework Java and Maven
-----------------------------------------

Run Locally (using [Java](https://java.com/en/download/help/download_options.xml) and [Maven](http://maven.apache.org/install.html)):
```
mvn function:run
```

Run Locally with Buildpacks & Docker:
```
pack build --builder gcr.io/buildpacks/builder:v1 sample-functions-java-mvn
docker run -it -ePORT=8080 -p8080:8080 sample-functions-java-mvn
```

Run on Cloud Run:

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run)
