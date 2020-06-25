# Sample Go

Run Locally with Go installed:
```
go build
./sample-go
```

Run Locally with pack & Docker:
```
pack build --builder=gcr.io/buildpacks/builder sample-go
docker run -p8080:8080 sample-go
```

Check it out: [http://localhost:8080](http://localhost:8080)

Run on Cloud Run:

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run)
