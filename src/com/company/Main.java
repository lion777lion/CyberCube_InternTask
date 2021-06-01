package com.company;

public class Main {

    public static void main(String[] args) {
        StringGenerator generate = new StringGenerator();
	    String s = "wasd";
	    String t = generate.AddLetter(s);

	System.out.print( "Origin " +  s + ",generated " + t + ",added letter " + generate.FindDiff(s, t));
    }
}
