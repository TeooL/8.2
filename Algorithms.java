import java.util.ArrayList;

public class Algorithms {
    public int numElementsContainStr(String[][] arr, String str){
        int count = 0;
        for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[r].length;c++){
                if (arr[r][c].indexOf(str) >= 0) count++;
            }
        }
        return count;
    }
    public boolean containsInt(int[][] arr, int target){
        for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[r].length;c++){
                if (arr[r][c] == (target)) return true;
            }
        }
        return false;
    }
    public int[] indexOfTarget(int[][] arr, int target){
        for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[r].length;c++){
                if (arr[r][c] == target) return new int[]{r,c};
            }
        }
        return new int[]{-1,-1};
    }
    public int[] diagonalElements(int[][] arr){
        int[] diagonalElementsArray = new int[arr.length];
        for (int r = 0; r < arr.length;r++){
            diagonalElementsArray[r] = arr[r][r];
        }
        return diagonalElementsArray;
    }
    public String concatenatedString(String[][] arr, int column){
        String concatenated = "";
        for (int i = 0; i < arr.length; i ++){
            if (i == arr.length - 1) concatenated += arr[i][column];
            else concatenated += arr[i][column] + " ";
        }
        return concatenated;
    }
    public int maximum(int[][] arr){
        int max = arr[0][0];
        for (int[] r:arr){
            for (int c = 0;c<r.length;c++){
                if (r[c] > max) max = r[c];
            }
        }
        return max;
    }
    public int minimum(int[][] arr){
        int min = arr[0][0];
        for (int[] r:arr){
            for (int c = 0;c<r.length;c++){
                if (r[c] < min) min = r[c];
            }
        }
        return min;
    }
    public String shortest(String[][] arr){
        String shortest = arr[0][0];
        for (String[] r:arr){
            for (int c = 0; c < r.length;c++){
                if(r[c].length() < shortest.length()) shortest = r[c];
            }
        }
        return shortest;
    }
    public String longest(String[][] arr){
        String longest = arr[0][0];
        for (String[] r:arr){
            for (int c = 0; c < r.length;c++){
                if(r[c].length() > longest.length()) longest = r[c];
            }
        }
        return longest;
    }
    public int largestAbsDifference(int[][] arr1, int[][] arr2){
        int largestAbsDifference = Math.abs(arr1[0][0] - arr2[0][0]);
        for (int r = 0; r < arr1.length;r++){
            for (int c = 0; c < arr1[r].length;c++){
                if (Math.abs(arr1[r][c] - arr2[r][c]) > largestAbsDifference) largestAbsDifference = Math.abs(arr1[r][c] - arr2[r][c]);
            }
        }
        return largestAbsDifference;
    }
    public double meanAverage(double[][] arr){
        double sum = 0;
        double numElements = 0;
        for (double[] doubleArr: arr){
            for (int c = 0; c < doubleArr.length;c++){
                sum += doubleArr[c];
                numElements++;
            }
        }
        return sum / numElements;
    }
    public boolean containsTwoEqv(int[][] arr){
        for (int r = 0;r<arr.length;r++){
            for (int c = 0; c < arr[r].length;c++){
                int current_val = arr[r][c];
                for (int i = r;i<arr.length;i++){
                    if (i == r){
                        for (int k = c + 1;k<arr[i].length;k++){
                            if(arr[i][k] == current_val) return true;
                        }
                    }
                    else{
                        for (int k = 0; k<arr[i].length;k++){
                            if(arr[i][k] == current_val) return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public String lastAlphabetically(String[][] arr){
        String last = arr[0][0];
        for (String [] array:arr){
            for (int i = 0; i < array.length;i++){
                if (array[i].compareTo(last) > 0) last = array[i];
            }
        }
        return last;
    }

    public ArrayList<Integer> createTestCase(int[] nums){
        ArrayList<Integer> newNum = new ArrayList<Integer>();
        for (int i: nums){
            newNum.add(i);
        }
        return newNum;
    }
    public ArrayList<String> createTestCase(String[] words) {
        ArrayList<String> newNum = new ArrayList<String>();
        for (String i : words) {
            newNum.add(i);
        }
        return newNum;
    }
}



