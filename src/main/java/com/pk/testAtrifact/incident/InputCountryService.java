package com.pk.testAtrifact.incident;
import  com.pk.webclient.*;
public class InputCountryService {
  private String countryName;
  private GetCitiesByCountry cCountryName= new GetCitiesByCountry();
public String getCountryName() {
	
	/*String countryNameImprtedfromC =cCountryName.getCountryName();
	countryName=countryNameImprtedfromC;*/
	return countryName;
}

public void setCountryName(String countryName) {
/*	cCountryName.setCountryName(countryName);*/
	this.countryName = countryName;
}
}
