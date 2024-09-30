import java.util.Scanner;

public class GetArrayMean {

    public static double ArrayMean(int[] array){
        double sum = 0;
        for (int num : array){
            sum += num;
        }
        return sum / array.length;
    }
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int elements = value.nextInt();
        int[] numbers = new int[elements];

        for(int i = 0; i < elements; i++){
            System.out.print("Enter Number: ");
            numbers[i] = value.nextInt();
        }

        double mean = ArrayMean(numbers);
        System.out.printf("Max of array is: %.2f%n", mean);

        value.close();
    }
}