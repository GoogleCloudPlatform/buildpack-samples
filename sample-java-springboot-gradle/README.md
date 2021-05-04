Java - Spring Boot
------------------

## Run Locally:
1. Start the local server: `./gradlew bootRun`
1. (Optional) To enable auto-reload, in another terminal / shell: `./gradlew -t classes`
1. Open: [localhost:8080](http://localhost:8080)

## Deploy on Cloud Run (with a couple clicks):
[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run)

## Run on Google Cloud Run (with the command line):

1. [Install & setup gcloud](https://cloud.google.com/sdk/install)

1. Enable the Container, Container Registry, Cloud Build, and Cloud Run APIs:
    ```
    gcloud services enable container.googleapis.com containerregistry.googleapis.com cloudbuild.googleapis.com run.googleapis.com
    ```

1. Build the container image on Cloud Build using Buildpacks, storing the image on Google Container Registry:
    ```
    export PROJECT_ID=YOUR_GCP_PROJECT_ID
    gcloud builds submit --pack=image=gcr.io/$PROJECT_ID/sample-java-springboot-gradle
    ```

1. Deploy on Google Cloud Run:
    ```
    gcloud run deploy \
      --image=gcr.io/$PROJECT_ID/sample-java-springboot-gradle \
      --platform=managed \
      --allow-unauthenticated \
      --project=$PROJECT_ID \
      --region=us-central1 \
      sample-java-springboot-gradle
    ```

## Local Docker Build & Run

1. [Install Docker](https://docs.docker.com/get-docker/)

1. Build the image
    ```
    ./gradlew bootBuildImage --builder=gcr.io/buildpacks/builder:v1 --imageName=sample-java-springboot-gradle
    ```

1. Run image:
    ```
    docker run -p8080:8080 sample-java-springboot-gradle
    ```

1. Open: [localhost:8080](http://localhost:8080)
