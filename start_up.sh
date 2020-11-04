#!/bin/bash
echo "======================================================================="
echo ""
echo "Building project with tests ..."
mvn clean install
echo "Build successful"
echo "======================================================================="
echo ""
echo "Building docker image ..."
build=$(docker build -t elimuraya/jp-msisdn-validator:1.0-SNAPSHOT .)
echo "Docker image built: $build"
echo "======================================================================="
echo ""

echo "Starting new container instance ..."
docker-compose down --remove-orphans && docker-compose up -d
echo "Container started successfully."
echo "======================================================================="
echo ""
