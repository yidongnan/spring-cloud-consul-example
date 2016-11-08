#!/usr/bin/env bash

set -eo pipefail

modules=( admin-dashboard hystrix-dashboard service-a service-b zuul )

for module in "${modules[@]}"; do
    docker build -t "spring-cloud-consul-example/${module}:latest" ${module}
done
