package com.pk.testAtrifact.incident;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "setNameClass")
public class InputSetName {
	private String nameInput;

	public String getNameInput() {
		return nameInput;
	}
	@XmlElement(name = "name", required = true)
	public void setNameInput(String nameInput) {
		
		this.nameInput = nameInput;
	}
}
