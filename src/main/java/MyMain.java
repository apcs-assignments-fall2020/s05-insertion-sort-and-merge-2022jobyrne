import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        // YOUR CODE HERE
        //return null;
        for (int i = 1; i < list.size(); i++){
            int val2 = list.get(i);
            int val = i-1;
            while ((val > -1) && (list.get(val).compareTo(val2) == 1)){
                list.set(val+1, list.get(val));
                val--;
            }
            list.set(val+1, val2);
        }
        return list;
        //return values;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int[] arr3 = new int[arr1.length * 2];
        int val1 = 0;
        int val2 = 0;
        int val3 = 0;
        while ((val1 < arr1.length) && ( val2 < arr2.length))
        {

            if (arr1[val1] < arr2[val2])
            {

                arr3[val3] = arr1[val1];
                val1++;
            }
            else
            {
                arr3[val3] = arr2[val2];
                val2++;
            }
            val3++;
        }
        while (val1 < arr1.length)
        {
            arr3[val3] = arr1[val1];
            val1++;
            val3++;
        }
        while (val2 < arr2.length)
        {

            arr3[val3] = arr2[val2];
            val2++;
            val3++;
        }
        return arr3;
    
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
