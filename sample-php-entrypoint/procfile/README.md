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
pack build --builder=gcr.io/buildpacks/builder sample-php-entrypoint-procfile -v
docker run -it --rm -p 8080:8080 sample-php-entrypoint-procfile
```