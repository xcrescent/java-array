public class BubbleSort {
    public static void sort (int[] intArray) {
        int temp;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 1; j < (intArray.length - i); j++) {
                if (intArray[j - 1] > intArray[j]) {
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }
}
