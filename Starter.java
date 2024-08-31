import java.util.ArrayList;

public class Starter {
    public int begins(String[] words, String first) {
        ArrayList<String> usedWords = new ArrayList<String>();
        int counter = 0;
        for(String word: words){
            if(word.substring(0, 1).equals(first)){
                if(usedWords.contains(word)){
                    continue;
                }else{
                    usedWords.add(word);
                    counter++;
                }
            }
        }
        return counter;
    }
}