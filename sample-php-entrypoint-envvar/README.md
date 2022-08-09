Sample PHP
-----------

Run Locally:
1. Install PHP
1. Run the server locally:
    ```
    php -S localhost:8000
    ```

Run Locally with Buildpacks & Docker:
```
pack build --builder=gcr.io/buildpacks/builder sample-php-entrypoint-envvar -v --env GOOGLE_ENTRYPOINT="php -S 0.0.0.0:8080"
docker run -it --rm -p 8080:8080 sample-php-entrypoint-envvar
```

Run on Cloud Run:

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run)