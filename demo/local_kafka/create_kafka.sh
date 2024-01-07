#!/bin/sh
docker-compose up --no-start
echo INCHANEL_KAFKA_BOOTSTRAP_SERVER=broker:9092
echo INCHANEL_KAFKA_CONTROL_CENTER_URL=http://0.0.0.0:9021
echo INCHANEL_KAFKA_SCHEMA_REGISTRY_URL=http://0.0.0.0:8090
