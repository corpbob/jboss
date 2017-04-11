package com.pk.testAtrifact.incident;
import  com.pk.webclient.*;
public class OutputCountryService {
private String cityNames;
private GetCitiesByCountryResponse cCityName= new GetCitiesByCountryResponse();
public String getCountryName() {

	/*String countryNameImprtedfromC =cCityName.getGetCitiesByCountryResult();
			cityNames=countryNameImprtedfromC;*/
	return cityNames;
}

public void setCountryName (String cityNames) {
/*	String ab = null;
	GlobalWeatherSoap cd = null;
	ab= cd.getCitiesByCountry(cityNames);
	this.cityNames = ab;*/
	
	this.cityNames=cityNames;
	
}
}
