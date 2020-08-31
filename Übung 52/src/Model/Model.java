package Model;

import java.util.HashMap;

public class Model  {
	
HashMap<Integer, Daten> map;



	public Model() {
map = new HashMap<Integer, Daten>();
	
Daten a = new Daten("Müller","München","1412");
Daten b = new Daten("Heinz","BGL","11356");
Daten c = new Daten("Baum","Düsseldorf","1578");
Daten d = new Daten("Tisch","BGL","1689");
Daten e = new Daten("Holz","BGL","1649");
Daten f = new Daten("Fischer","München","5725");
Daten g = new Daten("Fuchs","Düsseldorf","1680");
Daten h = new Daten("Huber","Düsseldorf","1795");
Daten i	= new Daten("Fischer","BGL","35737");
Daten j	= new Daten("Müller","Berlin","3534");
Daten k	= new Daten("Fischer","Berlin","854");
Daten l	= new Daten("Heinz","Düsseldorf","966624");
Daten m	= new Daten("Heinz","Berlin","22394624");
Daten n	= new Daten("Müller","GL","2868624");


	map.put(1, a);
	map.put(2,b);
	map.put(3, c);
	map.put(4, d);
	map.put(5, e);
	map.put(6, f);
	map.put(7, g);
	map.put(8, h);
	map.put(9, i);
	map.put(10, j);
	map.put(11, k);
	map.put(12, l);
	map.put(13, m);
	map.put(14, n);
	}


	public void suchen(String Name,String ort ) {
		
		for (int i = 1; i < map.size()+1; i++) {
			if(Name.equals(map.get(i).getName()) && ort.equals( "Ort")) {
					System.out.println(map.get(i));
				}
			if(Name.equals(map.get(i).getName()) && ort.equals(map.get(i).getOrt())) {
				
						System.out.println(map.get(i));
				
						}
			else
			
		
						if(ort.equals(map.get(i).getOrt()) && Name.equals(map.get(i).getName()))
					{
					
					
							System.out.println(map.get(i));
					
					}	
			
		
		
}
	

	}





	public void rsuchen(String string) {
		for (int i = 1; i < map.size()+1; i++) {
			if(string.equals(map.get(i).getNummer())) {
				System.out.println("Name: "+map.get(i).getName()+"\n"+"Ort: "+map.get(i).getOrt());
				
				
			}
			
		}

		
	}
}
