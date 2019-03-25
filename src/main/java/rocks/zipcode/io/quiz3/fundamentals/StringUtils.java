package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        Character n = str.charAt(indexToCapitalize);
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0,indexToCapitalize));
        sb.append(n.toString().toUpperCase());
        sb.append(str.substring(indexToCapitalize+1));
        return sb.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if(baseString.charAt(indexOfString) == characterToCheckFor){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> allSubs = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length()+1; j++) {
                allSubs.add(string.substring(i,j));
            }
        }

        return allSubs.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
