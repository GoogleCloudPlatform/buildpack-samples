Sample Node
-----------

Run Locally:
1. [Install Node](https://nodejs.org/en/download/)
1. [Install pnpm](https://pnpm.io/installation)
1. Install Node modules
    ```
    pnpm install
    ```
1. Start the server:
    ```
    pnpm start
    ```
1. Check it out: [http://localhost:8080](http://localhost:8080)

Run Locally with Buildpacks & Docker:
```
pack build --builder=gcr.io/buildpacks/builder:google-22 sample-node-pnpm
docker run -it -ePORT=8080 -p8080:8080 sample-node-pnpm
```

Run on Cloud Run:

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run)

