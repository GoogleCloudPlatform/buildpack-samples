# Sample Functions Framework C++

Run Locally with CMake and [vcpkg] installed:
```
cmake -S . -B .build -DCMAKE_TOOLCHAIN_FILE=${VCPKG_ROOT}/scripts/buildsystems/vcpkg.cmake
cmake --build .build
.build/hello
```

Run Locally with pack & Docker:
```
pack build --builder=gcr.io/buildpacks/builder sample-functions-framework-cpp
docker run -p8080:8080 sample-functions-framework-cpp
```

Check it out: [http://localhost:8080](http://localhost:8080)

Run on Cloud Run:

[![Run on Google Cloud](https://deploy.cloud.run/button.svg)](https://deploy.cloud.run)
