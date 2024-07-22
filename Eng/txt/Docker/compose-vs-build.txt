## Compose vs build

### Purpose:

Docker Compose: Managing, running, scaling, and orchestrating multi-container applications.
docker build: Create Docker images from a Dockerfile.
docker run: Used to run and manage single containers. This is a low-level tool that requires you to explicitly specify all parameters each time you run it.

### Usage:

Docker Compose: Used to run and manage multiple services that may depend on each other.
docker build: Used to create images that can then be run as separate containers or used in Docker Compose.
docker run: Suitable for quickly launching individual containers or performing one-off tasks.

### Configuration files:

Docker Compose: Uses the docker-compose.yml file to define the configuration of services.
docker build: Uses a Dockerfile to define the steps to build the image.
docker run: Configuration options are specified directly on the command line.

### How they work together:

Creating images using docker build:

First, you create a Dockerfile for each component of your application and build the images using the docker build command.

Running applications with Docker Compose:

You then use Docker Compose to orchestrate these images and manage your multi-container application, defining all services and their configurations in docker-compose.yml.