public class SortingAlgorithms {
    static int[] SwapArray(int testArray[]){
        for(int i = 0; i < testArray.length; i++){
            int temp = testArray[i];
            int Randomise = (int) (Math.random() * testArray.length);
            testArray[i] = testArray[Randomise];
            testArray[Randomise] = temp;
        }
        System.out.println("Array randomised:");
        return testArray;
    }

    static void BubbleSort(int testArray[]){
        System.out.println("\nArray bubble sorted:");
        int temp;
        for(int i = 0; i < testArray.length; i++){
            for(int j = 0; j < testArray.length - 1; j++){
                if(testArray[j] > testArray[j + 1]){   
                    temp = testArray[j];
                    testArray[j] = testArray[j + 1];
                    testArray[j + 1] = temp;
                }
            }
        }
    }

    static void SelectionSort(int testArray[]){
        System.out.println("\nArray selection sorted:");
        int temp;
        int minNum;
        for(int i = 0; i < testArray.length; i++){
            minNum = i;
            for(int j = i + 1; j < testArray.length - 1; j++){
                if(testArray[j] < testArray[minNum]){
                    minNum = j; 
                }
            }
            temp = testArray[minNum];
            testArray[minNum] = testArray[i];
            testArray[i] = temp;
        }
    }

    static void InsertionSort(int testArray[]){
        System.out.println("\nArray insertion sorted:");
        int temp;
        for(int i = 1; i < testArray.length; i++){
            temp = testArray[i];
            int j = i;
            while (j > 0 && testArray[j - 1] >= temp) {
                testArray[j] = testArray[j - 1];
                j--;
            }
            testArray[j] = temp;
        }
    }

    static void showArray(int testArray[]){
        for(int i = 0; i < testArray.length; i++){
            System.out.print(testArray[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] testArray = new int[15];
        for(int i = 0; i < testArray.length; i++){
            testArray[i] = i;
        }
        int[] SwappedArray = SwapArray(testArray);
        //showArray(testArray);
        //SelectionSort(SwappedArray);
        //showArray(testArray);
        //InsertionSort(SwappedArray);
        //showArray(testArray);
    }
}
