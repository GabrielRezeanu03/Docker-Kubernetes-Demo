# Docker and Kubernetes Demo Project

## Project Overview

This project demonstrates containerizing a Java Spring Boot application with Docker and deploying it on a Kubernetes cluster using Minikube. The application is built with Maven, packaged into a Docker image, and deployed as a Kubernetes service.

## Features

- **Containerized Java Spring Boot Application**: The application is built with Maven and runs in a containerized environment using Docker.
- **Kubernetes Deployment**: Deployed using Kubernetes on Minikube, with replication to ensure high availability.
- **Docker Image**: Uses `eclipse-temurin:17-jdk` as the base for the runtime environment.
- **Maven Build**: The project leverages Maven for dependency management and packaging.
- **Minikube Integration**: Testing in a local Kubernetes environment using Minikube.

## Technologies Used

- **Java 17 (Eclipse Temurin)**: The application is built using Java 17.
- **Spring Boot**: A simple Spring Boot web application is deployed.
- **Maven**: Used for managing dependencies and building the application.
- **Docker**: The application is containerized using Docker.
- **Kubernetes**: Deployed on Kubernetes, with Minikube as the local testing environment.

## Prerequisites

Before you begin, ensure you have the following installed:

- Docker
- Minikube
- Kubectl
- Maven
- Java 17

## How to Run the Project

### Step 1: Clone the Repository

```bash
git clone https://github.com/GabrielRezeanu03/Docker-Kubernetes-Demo.git
cd Docker-Kubernetes-Demo
```
### Step 2: Build the Docker Image

```bash
docker build -t demo-java-app .
```

### Step 3: Start Minikube and Enable Docker Environment

```bash
minikube start
minikube docker-env
```
### Step 4: Deploy the Application on Kubernetes

```bash
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
```

### Step 5: Access the Application
```bash
minikube service demo-java-app-service --url
```



