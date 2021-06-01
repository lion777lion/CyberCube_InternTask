package com.company;

import java.util.Random;

public class StringGenerator {
    String s;
    String t;
    int position;
    String result;
    char c;
    Random rand = new Random();

    public String AddLetter(String s) {
        this.s = s;
        c = (char) (rand.nextInt(26) + 'a');
        position = rand.nextInt(s.length() - 1);
        t = s.substring(0, position) + c + s.substring(position);
        return t.toLowerCase();
    }

    public String FindDiff(String s, String t) {
        if ((s.length() <= 1000) && (t.length() - s.length()) == 1) {
            char[] sa = s.toLowerCase().toCharArray();
            char[] ta = t.toLowerCase().toCharArray();
            for (int i = 0; i < s.length(); i++) {
                if (sa[i] != ta[i]) {
                    result = Character.toString(ta[i]);
                    return result;
                }
            }
            result = Character.toString(ta[ta.length - 1]);
        } else {
            result = "Cant compare";
        }
        return result;
    }


}
