# Kafka-Demo Project


![image](https://github.com/balajidontul/kafka-demo/assets/83111706/dee6b863-43c8-4fa7-b06c-ad9c72f18438)

![Screenshot (10)](https://github.com/balajidontul/kafka-demo/assets/83111706/1b9994a3-3032-4221-a066-2e5855b7f3b1)


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
