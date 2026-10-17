package DSA_150;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindow {

}

//30. Substring with Concatenation of All Words
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        int windowSize = words.length * words[0].length();

        int i = 0;
        int j = windowSize -1;

        List<Integer> ansList = new LinkedList<>();


        while(i<= s.length() - windowSize){

            if(isConcatenated( s, words, i, j)){
                ansList.add(i);
            }
            i++;
            j++;


        }

        return ansList;

    }

    public boolean isConcatenated(String s, String[] words, int i, int j){

        HashMap<String, Integer> map = new HashMap<>();

        for(int k = 0; k<words.length; k++){
            map.put(words[k], map.getOrDefault(words[k], 0) +1);
        }

        int wordsLength = words[0].length();

        for( ; i<=j; i += wordsLength){


            if( !map.containsKey(s.substring(i, i+wordsLength)) ){
                return false;
            }
            else{
                String key = s.substring(i, i+wordsLength);
                if(map.get(key) > 1){
                    map.put(key, map.get(key) -1);
                }
                else{
                    map.remove(key);
                }
            }

        }

        return true;

    }
}
