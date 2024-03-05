import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Algorithms a = new Algorithms();

        String[][] testcase1 = {{"Hello,", "world", "!"}, {"It's", "me", "Genevieve"}};
        String[][] testcase2 = {{"for,", "sky"}, {"me", "find"}};
        String[][] testcase3 = {{"clean,", "planet", "world"}, {"clear", "blue", "sea"}};
        System.out.println(a.numElementsContainStr(testcase1, "e"));
        System.out.println(a.numElementsContainStr(testcase2, "f"));
        System.out.println(a.numElementsContainStr(testcase3, "ea"));

        int[][] testcase4 = {{1,2},{3,4}};
        int[][] testcase5 = {{1,2,3},{4,5,6}};
        int[][] testcase6 = {{-2,2,-4},{-3,2,1}};
        System.out.println(a.containsInt(testcase4,5));
        System.out.println(a.containsInt(testcase5,6));
        System.out.println(a.containsInt(testcase6,-3));

        int[][] testcase7 = {{1,2},{3,4}};
        int[][] testcase8 = {{1,2,3},{4,5,6}};
        int[][] testcase9 = {{-2,2,-4},{-3,2,1}};
        System.out.println(Arrays.toString(a.indexOfTarget(testcase7, 3)));
        System.out.println(Arrays.toString(a.indexOfTarget(testcase8, 6)));
        System.out.println(Arrays.toString(a.indexOfTarget(testcase9, -3)));

        int[][] testcase10 = {{1,2},{3,4}};
        int[][] testcase11 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] testcase12 = {{-2,2,-4},{-3,2,1},{4,1,3}};
        System.out.println(Arrays.toString(a.diagonalElements(testcase10)));
        System.out.println(Arrays.toString(a.diagonalElements(testcase11)));
        System.out.println(Arrays.toString(a.diagonalElements(testcase12)));

        String[][] testcase13 = {{"Hello,", "world", "!"}, {"It's", "me", "Margaret"}};
        String[][] testcase14 = {{"I,", "am", "real"}, {"For", "Honor", "Marge"}};
        String[][] testcase15 = {{"Hello,", "people", "three"}, {"It's", "him", "Fred"}};
        System.out.println(a.concatenatedString(testcase13,1));
        System.out.println(a.concatenatedString(testcase14,0));
        System.out.println(a.concatenatedString(testcase15,2));

        int[][] testcase16 = {{3,2,1},{4,5,6}};
        int[][] testcase17 = {{2,4,8},{3,-1,-6}};
        int[][] testcase18 = {{2,6,12},{-9,2,3}};
        System.out.println(a.maximum(testcase16));
        System.out.println(a.maximum(testcase17));
        System.out.println(a.maximum(testcase18));
        System.out.println(a.minimum(testcase16));
        System.out.println(a.minimum(testcase17));
        System.out.println(a.minimum(testcase18));

        String[][] testcase19 = {{"Hello,", "world", "!"}, {"It's", "me", "Margaret"}};
        String[][] testcase20 = {{"speaking", "hide", "cooking"}, {"typing", "folding", "this is the longest"}};
        String[][] testcase21 = {{"tens,", "world shaper", "four"}, {"cry", "buck", "short"}};
        System.out.println(a.shortest(testcase19));
        System.out.println(a.shortest(testcase20));
        System.out.println(a.shortest(testcase21));
        System.out.println(a.longest(testcase19));
        System.out.println(a.longest(testcase20));
        System.out.println(a.longest(testcase21));

        int[][] testcase22 = {{2, 3, 4}, {-1, -2, -3}};
        int[][] testcase23 = {{1, 2, 3}, {4, 5, 6}};
        int[][] testcase24 = {{6, 3, 1}, {-10, -2, -3}};
        int[][] testcase25 = {{-10, 2, 2}, {2, 5, 4}};
        int[][] testcase26 = {{1, 2, 5}, {-1, -2, -1}};
        int[][] testcase27 = {{6, 2, -8}, {4, 12, 7}};
        System.out.println(a.largestAbsDifference(testcase22,testcase23));
        System.out.println(a.largestAbsDifference(testcase24,testcase25));
        System.out.println(a.largestAbsDifference(testcase26,testcase27));

        double[][] testcase28 = {{1.6, 3.2, 5.4}, {6.3, 4.1, 2.5}};
        double[][] testcase29 = {{5.0, 10.0, 15.0}, {10, 20, 0}};
        double[][] testcase30 = {{3.6, 3.4, 5.4}, {4.3, 4.7, 5.6}};
        System.out.println(a.meanAverage(testcase28));
        System.out.println(a.meanAverage(testcase29));
        System.out.println(a.meanAverage(testcase30));

        int[][] testcase31 = {{1,2},{3,2}};
        int[][] testcase32 = {{1,3,2},{1,4,5}};
        int[][] testcase33 = {{4,5,6},{1,2,3}};
        System.out.println(a.containsTwoEqv(testcase31));
        System.out.println(a.containsTwoEqv(testcase32));
        System.out.println(a.containsTwoEqv(testcase33));

        String[][] testcase34 = {{"bravo", "charlie"}, {"zebra", "alpha"}};
        String[][] testcase35 = {{"brain", "lambda"}, {"esoteric", "cat"}};
        String[][] testcase36 = {{"alpha", "dearest"}, {"finder", "mouse"}};
        System.out.println(a.lastAlphabetically(testcase34));
        System.out.println(a.lastAlphabetically(testcase35));
        System.out.println(a.lastAlphabetically(testcase36));
    }
}

