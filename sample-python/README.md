Sample Python
-------------

Run all commands from this `sample-python` directory:

```sh
cd sample-python
```

### Run locally with Python

```sh
python3 -m venv venv
source venv/bin/activate
pip install -r requirements.txt
python main.py
```

Open http://localhost:8080 in your browser.

### Build and run locally with Buildpacks

Install [Docker](https://docs.docker.com/get-docker/) and the [`pack` CLI](https://buildpacks.io/docs/tools/pack/), then build and run the container image:

```sh
pack config trusted-builders add gcr.io/buildpacks/builder:google-24
pack build --builder=gcr.io/buildpacks/builder:google-24 --path . sample-python
docker run --rm -e PORT=8080 -p 8080:8080 sample-python
```

> **Note:** On Apple Silicon (`arm64`) Macs, pass `--platform linux/amd64` to `pack build`, or build remotely using Cloud Run below.

### Deploy from source on Cloud Run

Ensure your Google Cloud project meets the [Cloud Run source deployment prerequisites](https://cloud.google.com/run/docs/deploying-source-code), then deploy with authenticated access and test via the local proxy:

```sh
gcloud run deploy sample-python \
  --source . \
  --region=us-central1 \
  --no-allow-unauthenticated

gcloud run services proxy sample-python --region=us-central1
```

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run?git_repo=https://github.com/GoogleCloudPlatform/buildpack-samples.git&dir=sample-python)
