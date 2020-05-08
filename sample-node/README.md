Sample Node
-----------

Run Locally:
1. [Install Node](https://nodejs.org/en/download/)
1. Install Node modules
    ```
    npm install
    ```
1. Start the server:
    ```
    npm run start
    ```
1. Check it out: [http://localhost:3000](http://localhost:3000)

Run Locally with Buildpacks & Docker:
```
pack build --builder=gcr.io/buildpacks/builder sample-node
docker run -it -ePORT=8080 -p8080:8080 sample-node
```

Run on Cloud Run:

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run/?cloudshell_context=cloudrun-gbp)

