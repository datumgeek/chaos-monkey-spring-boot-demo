#!/usr/bin/env bash -x
curl --data '{"status": "OUT_OF_SERVICE" }' -v http://hotdeals.workshop.demo/actuator/maintenance -H"Content-Type: application/json"
