package com.multithreading.webapp;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WebappApplicationTests {

	@Test
	void contextLoads() {
	}

//	@Test
//	void testSum() throws IOException {
//
//		// Given
//		//1st number is 1 billion
//		StringEntity myEntity1 = new StringEntity("1000000000", ContentType.create("text/plain", "UTF-8"));
//		HttpPost request1 = new HttpPost("http://localhost:8080/sum/result");
//		request1.setEntity(myEntity1);
//
//		//2nd number is 2 billions
//		StringEntity myEntity2 = new StringEntity("2000000000", ContentType.create("text/plain", "UTF-8"));
//		HttpPost request2 = new HttpPost("http://localhost:8080/sum/result");
//		request2.setEntity(myEntity2);
//
//		//3rd number is 3 billions
//		StringEntity myEntity3 = new StringEntity("3000000000", ContentType.create("text/plain", "UTF-8"));
//		HttpPost request3 = new HttpPost("http://localhost:8080/sum/result");
//		request3.setEntity(myEntity3);
//
//		// end request
//		StringEntity myEntity4 = new StringEntity("end", ContentType.create("text/plain", "UTF-8"));
//		HttpPost request4 = new HttpPost("http://localhost:8080/sum/result");
//		request4.setEntity(myEntity4);
//
//
//		// When
//		org.apache.http.HttpResponse httpResponse1 = HttpClientBuilder.create().build().execute( request1 );
//		org.apache.http.HttpResponse httpResponse2 = HttpClientBuilder.create().build().execute( request2 );
//		org.apache.http.HttpResponse httpResponse3 = HttpClientBuilder.create().build().execute( request3 );
//		HttpResponse httpResponse4 = HttpClientBuilder.create().build().execute( request4 );
//
//		HttpEntity entity1 = httpResponse1.getEntity();
//		String responseString1 = EntityUtils.toString(entity1, "UTF-8");
//
//		HttpEntity entity2 = httpResponse2.getEntity();
//		String responseString2 = EntityUtils.toString(entity2, "UTF-8");
//
//		HttpEntity entity3 = httpResponse3.getEntity();
//		String responseString3 = EntityUtils.toString(entity3, "UTF-8");
//
//		HttpEntity entity4 = httpResponse4.getEntity();
//		String responseString4 = EntityUtils.toString(entity4, "UTF-8");
//
//		// Then
//		assertEquals(responseString1, "6000000000");
//		assertEquals(responseString2, "6000000000");
//		assertEquals(responseString3, "6000000000");
//		assertEquals(responseString4, "6000000000");
//
//
//	}
}
