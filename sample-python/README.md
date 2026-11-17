Sample Python
-------------

Set up a local Python environment:

```sh
python3 -m venv venv
source venv/bin/activate
pip install -r requirements.txt
```

Run the server locally:

```sh
python main.py
```

Check it out: http://localhost:8080

Run locally with Buildpacks and Docker:

```sh
pack build --builder=gcr.io/buildpacks/builder:google-24 sample-python
docker run --rm -e PORT=8080 -p 8080:8080 sample-python
```

Deploy from source on Cloud Run:

```sh
gcloud run deploy sample-python --source .
```

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run?git_repo=https://github.com/GoogleCloudPlatform/buildpack-samples.git&dir=sample-python)
