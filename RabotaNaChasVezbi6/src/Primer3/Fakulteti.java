package Primer3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fakulteti {

	 public static void main (String []args) {
		   List<String> fakulteti =new ArrayList<String>();
		   fakulteti.add("FIKT");
		   fakulteti.add("Arhitektonski");
		   fakulteti.add("Gradezen");
		   Collections.sort(fakulteti);
		   System.out.println(fakulteti);
	 }
}
