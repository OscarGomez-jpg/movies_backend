package com.osgomez.SemilleroPruebaTecnica;

import com.mongodb.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SemilleroPruebaTecnicaApplication {

	public static void main(String[] args) {

		SpringApplication.run(SemilleroPruebaTecnicaApplication.class, args);
	}

}
