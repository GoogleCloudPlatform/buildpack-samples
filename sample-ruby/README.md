Sample Ruby
-----------

Run Locally:
1. [Install Ruby](https://www.ruby-lang.org/en/documentation/installation/)
1. Install [Bundler](https://bundler.io/)
    ```
    gem install bundler
    ```
1. Install application dependencies
    ```
    bundle install
    ```
1. Run the server locally:
    ```
    ruby app.rb -p 8080
    ```

Run Locally with Buildpacks & Docker:
```
pack build --builder=gcr.io/buildpacks/builder sample-ruby
docker run -it -ePORT=8080 -p8080:8080 sample-ruby
```

Run on Cloud Run:

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run)
