package com.pk.testAtrifact.incident;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Date;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;

import java.text.ParseException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
/*import org.jboss.resteasy.jose.jwe.JWEBuilder;
import org.jboss.resteasy.jose.jwe.JWEInput;*/
import org.junit.Assert;

/*import org.jboss.resteasy.jose.jwe.*;*/
import  com.pk.webclient.*;
public class cunsumeCountryApiProcessor implements Processor  {
	@Override
    public void process(Exchange exchange) throws Exception {
		/* KeyPair keyPair = KeyPairGenerator.getInstance("RSA").generateKeyPair();

	      String content = "Live long and prosper.";

	      
	      String encoded = new JWEBuilder().contentBytes(content.getBytes()).RSA1_5((RSAPublicKey)keyPair.getPublic());
	      System.out.println("encoded: " + encoded);
	      byte[] raw = new JWEInput(encoded).decrypt((RSAPrivateKey)keyPair.getPrivate()).getRawContent();
	      String from = new String(raw);
	      Assert.assertEquals(content, from);
	      */
        // set reply
		/*String citiesName = exchange.getIn().getBody(InputCountryService.class).getCountryName();
		OutputCountryService output = new OutputCountryService();
		output.setCountryName(citiesName);
		exchange.getOut().setBody(output);*/
        //exchange.getOut().setBody(output);
	/*	String citiesName = exchange.getIn().getBody(GetCitiesByCountry.class).getCountryName();
		GetCitiesByCountryResponse output= new GetCitiesByCountryResponse();
        output.setGetCitiesByCountryResult(citiesName);
        exchange.getOut().setBody(output);*/
/*		String key = "balalalalalalala";
		 
		String jwt = 
		    Jwts.builder().setIssuer("http://trustyapp.com/")
		        .setSubject("users/1300819380")
		        .setExpiration(null)
		        .put("scope", "self api/buy") 
		        .signWith(SignatureAlgorithm.HS256,key)
		        .compact();
		System.out.println("token is : "+jwt);*/
	 String message = "Hello world!";

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
		    }

		    System.out.println("Recovered payload message: " + jwsObject.getPayload());
	       System.out.println("************blablabalabnasaLSFjskgjdkfjhfikla***********");
	       System.out.println("encoded: " + "encoded");
	        System.out.println("Create Web Service Client...");
	        GlobalWeather service2 = new GlobalWeather();
	        System.out.println("Create Web Service...");
	        GlobalWeatherSoap port9 = service2.getGlobalWeatherSoap();
	        System.out.println("Call Web Service Operation...");
	       // System.out.println("Server said: " + port9.getCitiesByCountry(null));
	        //Please input the parameters instead of 'null' for the upper method!
	        String countryName = exchange.getIn().getBody(InputCountryService.class).getCountryName();
	        System.out.println("Call Web Service Operation..."+countryName);
	        String cities= port9.getCitiesByCountry(countryName);
	        System.out.println("Call Web Service Operation..."+cities);
	        OutputCountryService output = new OutputCountryService();
	        output.setCountryName(cities);
	        exchange.getOut().setBody(output);
	        
    }
}
