## Docker composition

Docker Compose is a tool for defining and managing multi-container Docker applications. With Docker Compose, you can describe the configuration of your services, networks, and volumes in a single YAML file, then run and manage it all with a single command. Here are the main features and actions that Docker Compose performs:

Main features of Docker Compose:

- Definition of multi-container applications:

Docker Compose allows you to define all of your application's services in a single YAML file (docker-compose.yml). This includes containers, networks, volumes, and other settings.

- Start all services:

With one command (docker-compose up) you can start all containers, networks and volumes defined in docker-compose.yml.

- Scaling services:

Docker Compose allows you to easily scale services (for example, increase the number of container instances) using the docker-compose up --scale command.

- Stop and delete all services:

The docker-compose down command stops and deletes all containers, networks, and volumes created by Docker Compose.

- View logs and statuses:

The docker-compose logs command allows you to view the logs of all services, and docker-compose ps shows the status of all containers.
Docker Compose Example
Let's look at an example docker-compose.yml file for a simple web application using a web server (eg Nginx) and a database (eg PostgreSQL):

``` yaml
version: '3.8'

services:
 web:
 image:nginx:latest
 ports:
 - "80:80"
 volumes:
 - ./html:/usr/share/nginx/html
 depends_on:
 -db

 db:
 image: postgres:latest
 environment:
 POSTGRES_USER: exampleuser
 POSTGRES_PASSWORD: examplepass
 POSTGRES_DB: exampledb
 volumes:
 - db_data:/var/lib/postgresql/data

volumes:
 db_data:

```
Basic Docker Compose commands:

docker-compose up - Start all services
docker-compose up -d - Start all services in the background
docker-compose logs - View logs of all services:
docker-compose down - Stop all services
docker-compose up --scale web=3 -d - Scaling the service
docker-compose ps - View the status of all containers:

The main elements of the docker-compose.yml file are:

version: Indicates the Docker Compose syntax version.
services: Defines all services that will be started.
image: Specifies the Docker image that will be used to create the container.
ports: Specifies which container ports will be mapped to the host.
volumes: Defines the volumes that will be mounted in the container.
environment: Specifies the environment variables for the container.
depends_on: Indicates dependencies between services.
volumes: Defines volumes that can be used by services.


Benefits of using Docker Compose:
Simplified development and testing: All application components can be defined and run with a single file and a single command.
Service Isolation: Each service runs in its own container, providing isolation and independence.
Ease of configuration and deployment: Service settings can be easily changed and deployed in different environments.