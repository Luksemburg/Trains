package com.foo.code;

import java.util.Random;

public enum Towns {
	Kyiv,
	Lvov,
	Odesa,
	Kharkov,
	Cherkasy,
	Chernigiv,
	Dnipro,
	Lugansk,
	Donetsk,
	Zhitomir,
	Lutsk,
	Uzhgorod;
		
	public static Towns pickTown(){
		Random rand = new Random();
		return values()[rand.nextInt(values().length)];
	}
}
