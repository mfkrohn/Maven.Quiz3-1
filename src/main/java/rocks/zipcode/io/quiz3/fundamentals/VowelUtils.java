package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    private static final Character[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
    public static Boolean hasVowels(String word) {
        for (int i = 0; i < word.length(); i++) {
            for(char vowel:vowels){
                if(word.charAt(i)==vowel){
                    return true;
                }
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            for(char vowel:vowels){
                if(word.charAt(i)==vowel){
                    return i;
                }
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        for(char vowel:vowels) {
            if (word.charAt(0) == vowel) {
                return true;
            }
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        for (char vowel:vowels){
            if(character == vowel){
                return true;
            }
        }
        return false;
    }
}
