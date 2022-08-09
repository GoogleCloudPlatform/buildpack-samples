Sample PHP
-----------

Run Locally:
1. Install PHP
1. Install [Composer](https://getcomposer.org/download/)
1. Install application dependencies
    ```
    composer install
    ```
1. Run the server locally:
    ```
    php -S localhost:8000
    ```

Run Locally with Buildpacks & Docker:
```
pack build --builder=gcr.io/buildpacks/builder sample-php -v
docker run -it --rm -p 8080:8080 sample-php
```