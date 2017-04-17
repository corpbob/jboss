package com.pk.webclient.clientsample;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;

import javax.ws.rs.core.MediaType;

/*import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;*/

import org.junit.Assert;

import com.pk.webclient.*;

public class ClientSample {

	public static void main(String[] args) throws NoSuchAlgorithmException/*, JOSEException*/ {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	     /*   GlobalWeather service2 = new GlobalWeather();
	        System.out.println("Create Web Service...");
	        GlobalWeatherSoap port9 = service2.getGlobalWeatherSoap();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port9.getCitiesByCountry(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port9.getWeather(null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        GlobalWeatherSoap port10 = service2.getGlobalWeatherSoap();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port10.getCitiesByCountry(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port10.getWeather(null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        GlobalWeatherSoap port11 = service2.getGlobalWeatherSoap12();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port11.getCitiesByCountry(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port11.getWeather(null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        GlobalWeatherSoap port12 = service2.getGlobalWeatherSoap12();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port12.getCitiesByCountry(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port12.getWeather(null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        GlobalWeatherHttpPost port13 = service2.getGlobalWeatherHttpPost();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port13.getCitiesByCountry(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port13.getWeather(null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        GlobalWeatherHttpPost port14 = service2.getGlobalWeatherHttpPost();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port14.getCitiesByCountry(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port14.getWeather(null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        GlobalWeatherHttpGet port15 = service2.getGlobalWeatherHttpGet();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port15.getCitiesByCountry(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port15.getWeather(null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        GlobalWeatherHttpGet port16 = service2.getGlobalWeatherHttpGet();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port16.getCitiesByCountry(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port16.getWeather(null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	        */
	       
	      /*  KeyPair keyPair = KeyPairGenerator.getInstance("RSA").generateKeyPair();

		      String content = "Live long and prosper.";

		      
		      String encoded = new JWEBuilder().contentBytes(content.getBytes()).RSA1_5((RSAPublicKey)keyPair.getPublic());
		      System.out.println("encoded: " + encoded);
		      byte[] raw = new JWEInput(encoded).decrypt((RSAPrivateKey)keyPair.getPrivate()).getRawContent();
		      String from = new String(raw);
		      Assert.assertEquals(content, from);*/
	       /* 	 String message = "Hello world!";

		    Payload payload = new Payload(message);

		    System.out.println("JWS payload message: " + message);

		    // Create JWS header with HS256 algorithm
		    JWSHeader header = new JWSHeader(JWSAlgorithm.HS256);
		  //  header.setContentType("text/plain");

		    System.out.println("JWS header: " + header.toJSONObject());

		    // Create JWS object
		    JWSObject jwsObject = new JWSObject(header, payload);

		    // Create HMAC signer
		    String sharedKey = "a0a2abd8-6162-41c3-83d6-1cf559b46afc";

		    System.out.println("HMAC key: " + sharedKey);

		    JWSSigner signer = new MACSigner(sharedKey.getBytes());

		    try {
		      jwsObject.sign(signer);
		    }
		    catch (JOSEException e) {

		      System.err.println("Couldn't sign JWS object: " + e.getMessage());
		      return;
		    }

		    // Serialise JWS object to compact format
		    String s = jwsObject.serialize();

		    System.out.println("Serialised JWS object: " + s);

		    // Parse back and check signature

		    try {
		      jwsObject = JWSObject.parse(s);
		    }
		    catch (ParseException e) {

		      System.err.println("Couldn't parse JWS object: " + e.getMessage());
		      return;
		    }

		    System.out.println("JWS object successfully parsed");

		    JWSVerifier verifier = new MACVerifier(sharedKey.getBytes());

		    boolean verifiedSignature = false;

		    try {
		      verifiedSignature = jwsObject.verify(verifier);
		    }
		    catch (JOSEException e) {

		      System.err.println("Couldn't verify signature: " + e.getMessage());
		    }

		    if (verifiedSignature) {
		      System.out.println("Verified JWS signature!");
		    }
		    else {
		      System.out.println("Bad JWS signature!");
		      return;
		    }*/
	}
}
