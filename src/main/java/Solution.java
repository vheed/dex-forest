import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String mostCommonWord() {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        //String[] words = instring.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        String para = paragraph.replaceAll("\\p{Punct}", "").toLowerCase();
        System.out.println(para);
        String[] banned = new String[]{"hit"};
        String[] wordsInParagraph = para.split(" ");
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
        for (String str : wordsInParagraph) {
            //str = str.toLowerCase();
            if (wordCount.containsKey(str)) {
                wordCount.put(str, wordCount.get(str)+1);
            } else {
                wordCount.put(str, 1);
            }
        }
        for (String bannedStr : banned) {
            if (wordCount.containsKey(bannedStr)) {
                wordCount.remove(bannedStr);
            }
        }
        CommonUtils.printHashMap(wordCount);
        Map<String, Integer> sortedMapDesc = CommonUtils.sortByComparator(wordCount);
        return (sortedMapDesc.keySet().toArray()[0]).toString();
    }
}
