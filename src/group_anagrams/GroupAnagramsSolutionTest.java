package group_anagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class GroupAnagramsSolutionTest {

    private List<List<String>> expected = new ArrayList<List<String>>();

    @Test
    public void whenEmptyArrayThenReturnEmptyList() {
        String[] strs = {};
        GroupAnagramsSolution groupAnagramsSolution = new GroupAnagramsSolution();
        List<List<String>> expected = new ArrayList<List<String>>();
        assertEquals(expected, groupAnagramsSolution.groupAnagrams(strs));

    }

    @Test
    public void testCase1() {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        GroupAnagramsSolution groupAnagramsSolution = new GroupAnagramsSolution();
        expected.add(List.of("bat"));
        expected.add(List.of("nat","tan"));
        expected.add(List.of("ate","eat","tea"));

        assertEquals(expected.size(), groupAnagramsSolution.groupAnagrams(strs).size());

    

    }
}
