package group_anagrams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramsSolution {
    

    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> ans = new HashMap<String, List<String>>();
        int[] counts = new int[26];

        for(String str:strs){
            Arrays.fill(counts, 0);
            for(char c:str.toCharArray()){
                counts[c-'a']++;
            }
            StringBuilder key = new StringBuilder();
            for(int i:counts){
                key.append("#");
                key.append(i);
            }

            if(!ans.containsKey(key.toString())){
                ans.put(key.toString(), new ArrayList<String>());
            }
            ans.get(key.toString()).add(str);
        }

        ans.values();

        return new ArrayList(ans.values());
        
    }
}
