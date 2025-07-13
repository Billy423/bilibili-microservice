# bilibili-microservice

This repository implements a simple backend microservice for the Bilibili platform. It features:

- A Spring Boot application exposing REST endpoints under `/demos` for testing purpose.
- Registration as a Eureka Client for service discovery.
- Circuit-breaking on the `/timeout` endpoint using Resilience4j.
- FastJSON HTTP message conversion for JSON payloads.
