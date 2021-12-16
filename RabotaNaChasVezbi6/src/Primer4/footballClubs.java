package Primer4;

import java.util.ArrayList;
import java.util.List;

public class footballClubs {

	 public static void main (String []args) {
		   List<String> footballClubs =new ArrayList<String>();
		   footballClubs.add("Real Madrid");
		   footballClubs.add("FC Barcelona");
		   footballClubs.add("Manchester United");
		   footballClubs.remove("Real Madrid");
		   System.out.println("Goleminata na listata e: " + footballClubs.size());
	 }
}