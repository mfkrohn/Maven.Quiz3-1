package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word:words) {
            if (!VowelUtils.hasVowels(word)) {
                sb.append(word);
                sb.append("ay");
                sb.append(" ");
            }
            else if (VowelUtils.startsWithVowel(word)) {
                sb.append(word);
                sb.append("way");
                sb.append(" ");
            } else if (!VowelUtils.startsWithVowel(word)) {
                sb.append(word.substring(VowelUtils.getIndexOfFirstVowel(word)));
                sb.append(word, 0, VowelUtils.getIndexOfFirstVowel(word));
                sb.append("ay");
                sb.append(" ");
            }

        }

        sb.delete(sb.length()-1,sb.length());
        return sb.toString();
    }

}
