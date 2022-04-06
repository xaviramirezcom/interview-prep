package strobogrammatic_number_ii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrobogrammaticNumberIISolution {

    public List<String> solve(int n) {

        return generateNumbers(n, n);
    }

    public static char[][] reversiblePairs = { { '0', '0' }, { '1', '1' }, { '8', '8' }, { '6', '9' }, { '9', '6' } };

    public List<String> generateNumbers(int currentIterationLength, int length) {
        if (currentIterationLength == 0) {
            return List.of("");
        }
        if (currentIterationLength == 1) {
            return Arrays.asList("0", "1", "8");
        }

        List<String> prevStroboNums = generateNumbers(currentIterationLength - 2, length);
        List<String> currentStroboNums = new ArrayList<String>();

        for (String prevStroboNum : prevStroboNums) {
            for (char[] reversiblePair : reversiblePairs) {
                if(reversiblePair[0]!='0'||currentIterationLength!=length){
                    currentStroboNums.add(reversiblePair[0]+prevStroboNum+reversiblePair[1]);

                }
            }
        }

        return currentStroboNums;

    }

}
