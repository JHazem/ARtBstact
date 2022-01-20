package com.abstractArt.interfacees;

import java.util.ArrayList;

public class Musem {
	public static void main(String[] args) {
		
		ArrayList<Art> museum = new ArrayList<Art> ();

		Painting p1 = new Painting("The Boating Party", "Mary Cassatt", "woman, man, and child on small sailboat", "oil on canvas");
		Painting p2 = new Painting("Red Canna", "Georgia O'Keefe", "red flowers in a vase", "watercolor on paper");
		Painting p3 = new Painting("Der Kuss", "Gustav Klimpt", "a couple embrace", "oil and gold leaf on canvas");
		
		Sculpture s1 = new Sculpture("Winged Victory of Samothrace", "unknown", "depicts the goddess Nike", "marble");
		Sculpture s2 = new Sculpture("David", "Michelangelo", "depicts biblical figure David", "marble");
		p1.viewArt();
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(s1);
		System.out.println(s2);
		
		museum.add(p1);
		
	}

}
