package com.ngirot;

import java.util.ArrayList;
import java.util.List;

public class NumerationRomaine {

	private static final Chiffre	UN		= new Chiffre(1, "I");
	private static final Chiffre	CINQ	= new Chiffre(5, "V");
	private static final Chiffre	DIX	= new Chiffre(10, "X");

	private List<Chiffre>			chiffres;

	public NumerationRomaine() {
		chiffres = new ArrayList<>();
		chiffres.add(DIX);
		chiffres.add(CINQ);
		chiffres.add(UN);
	}

	public String romain(int arabe) {
		StringBuilder romain = new StringBuilder();

		for (int i = arabe; i > 0;)
		{
			for (Chiffre c : chiffres)
			{
				if (c.arabe <= i)
				{
					romain.append(c.romain);
					i -= c.arabe;
				}
			}
		}

		return romain.toString();
	}

	public static class Chiffre {

		public String	romain;
		public int		arabe;

		public Chiffre(int arabe, String romain) {
			this.romain = romain;
			this.arabe = arabe;
		}

	}
}
