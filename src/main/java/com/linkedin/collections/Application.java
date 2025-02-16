package com.linkedin.collections;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		Collection<String> c =  new ArrayDeque<>();
		c.addAll(List.of("snowboard","linux","books","snowboard"));
		System.out.println(c);
		Collection<String> favoriteThings = new HashSet<>(c);
		System.out.println(favoriteThings);
		

	}

}
