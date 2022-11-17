public class ClassWork17_11 {
    public static void main(String[] args) {
        int[] numbers = {1, 100, 89, -14, 7, 160, 220};
        int[] minNumbers = {-1, -100, -890, -14, -7, -160, -220};
        printArray(numbers);
        int resultNumber = findMaxIndex(numbers);
        System.out.println(resultNumber);
        System.out.println(findMinIndex(minNumbers));
        sumOfArrayElem(numbers);
        sumOfArrayElemTwo(numbers);
    }

    private static void sumOfArrayElem(int... numbers) {
        int result = 0;
        for (int i : numbers) {
            result += i;
        }
        System.out.println("the sum of element: " + result);
    }

    private static void sumOfArrayElemTwo(int[] numbers) {
        int result = 0;
        for (int i : numbers) {
            result += i;
        }
        System.out.println("the sum of element another way: " + result);
    }

    public static int findMaxIndex(int[] array) {
        int biggest = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > biggest) {
                biggest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int findMinIndex(int[] array) {
        int biggest = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < biggest) {
                biggest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
