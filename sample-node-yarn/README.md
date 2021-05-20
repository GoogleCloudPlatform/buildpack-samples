Sample Node
-----------

Run Locally:
1. [Install Node](https://nodejs.org/en/download/)
1. [Install yarn](https://classic.yarnpkg.com/en/docs/install/)
1. Install Node modules
    ```
    yarn install
    ```
1. Start the server:
    ```
    yarn run start
    ```
1. Check it out: [http://localhost:8080](http://localhost:8080)

Run Locally with Buildpacks & Docker:
```
pack build --builder=gcr.io/buildpacks/builder sample-node-yarn
docker run -it -ePORT=8080 -p8080:8080 sample-node-yarn
```

Run on Cloud Run:

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run)

