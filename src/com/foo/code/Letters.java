package com.foo.code;

import java.util.Random;

public enum Letters {
	A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;
	
	public static Letters someLetter(){
		Random rand = new Random();
		return values()[rand.nextInt(values().length)];
	}
}
