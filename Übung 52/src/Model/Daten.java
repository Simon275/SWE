package Model;

import java.util.ArrayList;
import java.util.HashMap;

public class Daten {
	
	String name;
	String ort;
	String nummer;

	
public Daten(String name, String ort, String nummer) {
	this.name = name;
	this.ort = ort;
	this.nummer = nummer;

	
	 



}

public String getName() {
	return name;
}

public String getOrt() {
	return ort;
}

public String getNummer() {
	return nummer;
}

@Override
public String toString() {
	return "Daten [name=" + name + ", ort=" + ort + ", nummer=" + nummer + "]";
}
}
