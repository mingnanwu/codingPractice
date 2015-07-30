package com.company;

import java.util.HashMap;

/**
 * Created by v-kevwu on 7/27/2015.
 */
public class compareStrings {

    public boolean compareStringsTest(String a, String b) {
        HashMap<Character, Integer> table = new HashMap<Character, Integer>();
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        for (int i = 0; i < aChars.length; i++) {
            if (table.containsKey(aChars[i])) {
                int temp = table.get(aChars[i]);
                table.replace(aChars[i], temp + 1);
            } else {
                table.put(aChars[i], 1);
            }
        }

        for (int i = 0; i < bChars.length; i++) {
            if (!table.containsKey(bChars[i])) {
                return false;
            } else {

                    int temp = table.get(bChars[i]);
                    if (temp == 1) {
                        table.remove(bChars[i]);
                    } else {
                        table.replace(bChars[i], --temp);
                    }

            }
        }
        return true;
    }
}
