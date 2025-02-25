1. Container Management
docker run <image> – Creates and starts a new container from an image.
docker ps – Lists running containers.
docker ps -a – Lists all containers (including stopped ones).
docker start <container> – Starts a stopped container.
docker stop <container> – Stops a running container.
docker restart <container> – Restarts a container.
docker rm <container> – Removes a container.
docker logs <container> – Shows logs of a container.
docker exec -it <container> bash – Opens an interactive shell inside a running container.
2. Image Management
docker images – Lists all available images.
docker pull <image> – Downloads an image from Docker Hub.
docker push <image> – Uploads an image to Docker Hub.
docker build -t <image_name> . – Builds an image from a Dockerfile.
docker rmi <image> – Removes an image.
3. Network Management
docker network ls – Lists available Docker networks.
docker network create <network_name> – Creates a custom Docker network.
docker network connect <network> <container> – Connects a container to a network.
docker network inspect <network> – Shows details about a network.
4. Volume Management
docker volume ls – Lists all volumes.
docker volume create <volume_name> – Creates a volume.
docker volume inspect <volume_name> – Displays volume details.
docker volume rm <volume_name> – Removes a volume.
5. Docker Compose
docker-compose up – Starts services defined in docker-compose.yml.
docker-compose down – Stops and removes containers defined in docker-compose.yml.
docker-compose logs – Shows logs for services in Docker Compose.
6. System Cleanup
docker system prune – Removes unused containers, networks, and images.
docker image prune – Removes unused images.
docker container prune – Removes stopped containers.