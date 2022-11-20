public class ClassWork18_11 {
    public static void main(String[] args) {
        int[] numbers1 = {876, 23,900};
        printArray(numbers1);
        bubbleSort(numbers1);
        printArray(numbers1);
    }
    public static void bubbleSort(int[] array) {
        boolean indicator = true;
        while(indicator == true) {
            indicator = false;
            for(int i = 0; i < array.length-1; i++) {
                int storage;
                if (array[i]> array[i+1]) {
                    storage = array[i];
                    array[i]= array[i+1];
                    array[i+1] = storage;
                    indicator = true;
                    System.out.print("For-iteration-№ "+(i+1) + " " + indicator + " ");
                }
            }
            System.out.println("В конце итерации while " + indicator);
        }
    }
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " " );
        }
        System.out.println(); // перенос строки
    }
}
