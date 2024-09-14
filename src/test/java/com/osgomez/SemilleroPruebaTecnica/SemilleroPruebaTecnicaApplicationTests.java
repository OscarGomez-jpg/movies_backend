package com.osgomez.SemilleroPruebaTecnica;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SemilleroPruebaTecnicaApplicationTests {

	@Test
	void contextLoads() {}

	@Test
	void testMongoClientConnection() {
	    // Verifica que se pueda establecer una conexión con MongoDB
	    try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
	        MongoDatabase database = mongoClient.getDatabase("test");
	        assertNotNull(database);
	    }
	}
}
