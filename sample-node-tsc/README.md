Sample Node w/ TypeScript
-------------------------

Run Locally:
1. [Install Node](https://nodejs.org/en/download/)
1. Install Node modules
    ```
    npm install
    ```
1. Start the dev server:
    ```
    npm run dev
    ```
1. Check it out: [http://localhost:8080](http://localhost:8080)

Run Locally with Buildpacks & Docker:
```
pack build --builder=gcr.io/buildpacks/builder sample-node-tsc
docker run -it -p8080:8080 sample-node-tsc
```

Run on Cloud Run:

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run)

