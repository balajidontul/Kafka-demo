# Kafka-Demo Project
![image](https://github.com/balajidontul/kafka-demo/assets/83111706/dee6b863-43c8-4fa7-b06c-ad9c72f18438)

![Screenshot (10)](https://github.com/balajidontul/kafka-demo/assets/83111706/1b9994a3-3032-4221-a066-2e5855b7f3b1)


# Setting up Kafka on Windows

To set up Kafka on a Windows environment for development or testing purposes, follow these steps:

## Prerequisites

- Java Development Kit (JDK) installed (Kafka requires Java)
- Command Prompt or PowerShell

## Steps

### 1. Download Kafka

1. Go to the [Apache Kafka website](https://kafka.apache.org/downloads) and download the latest Kafka version for Windows.
2. Extract the downloaded archive to your preferred directory (e.g., `C:\kafka`).

### 2. Start ZooKeeper

Kafka uses ZooKeeper, so it needs to be started first.

1. Open Command Prompt or PowerShell.
2. Navigate to the Kafka directory:

    ```bash
    cd C:\kafka
    ```

3. Start ZooKeeper using the following command:

    ```bash
    .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
    ```

   This starts the ZooKeeper instance on the default port `2181`.

### 3. Start Kafka Server

After ZooKeeper is running, start the Kafka server.

1. Open a new Command Prompt or PowerShell window.
2. Navigate to the Kafka directory:

    ```bash
    cd C:\kafka
    ```

3. Start Kafka using the following command:

    ```bash
    .\bin\windows\kafka-server-start.bat .\config\server.properties
    ```

   This command starts the Kafka server on the default port `9092`.

### 4. Create a Topic (Optional)

To test your Kafka setup, create a topic.

1. Open a new Command Prompt or PowerShell window and navigate to the Kafka directory.
2. Run the following command to create a topic named `demotopic`:

    ```bash
    .\bin\windows\kafka-topics.bat --create --topic demotopic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
    ```

   Adjust the topic name, partitions, and replication factor as needed.

### 5. Verify Installation

To verify that Kafka is running and configured correctly:

1. Start a producer that publishes messages to the topic:

    ```bash
    .\bin\windows\kafka-console-producer.bat --topic demotopic --bootstrap-server localhost:9092
    ```

2. Start a consumer to read messages from the topic:

    ```bash
    .\bin\windows\kafka-console-consumer.bat --topic demotopic --from-beginning --bootstrap-server localhost:9092
    ```


## Overview
The Kafka-Demo project is a Java 17-based application using Spring Boot that demonstrates basic Kafka functionalities.
It consists of producer and consumer configurations to work with a Kafka topic named demotopic.

## Usage
This project includes several classes:

### KafkaDemoApplication.java
Main class for the Spring Boot application.
Implements a CommandLineRunner to produce messages and send them to the Kafka topic demotopic.

### KafkaProducerConfig.java
Configuration class for the Kafka producer.
Configures the producer properties and creates a KafkaTemplate bean to send messages to Kafka.

### KafkaConsumerConfig.java
Configuration class for the Kafka consumer.
Sets up consumer properties and defines a factory for concurrent Kafka message listeners.

### KafkaTopicConfig.java
Configuration class that defines the Kafka topic demotopic using TopicBuilder.

### KafkaListeners.java
Component class with a @KafkaListener method.
Listens to messages on the demotopic Kafka topic and prints received data to the console.

## Setup and Execution
To run the Kafka-Demo project:

Ensure you have Kafka installed and running.
Configure spring.kafka.bootstrap-server in application.properties or through environment variables.
Run the KafkaDemoApplication.java class.
The application will start, produce messages to the demotopic Kafka topic, and the KafkaListeners component will listen and print received data to the console.
