import java.util.Scanner;

public class TaskB {
    public static void displayArray(int[] array, int size)
    {
        for(int n = 0; n < size; n++)
        {
            System.out.print(array[n] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Operator operatorArray = new Operator(10);

        int menuInput;
        boolean cont = true;

        System.out.println("Array is:" );
        displayArray(operatorArray.getArray(), 10);
        while (cont) {
            System.out.println("enter method:\n1. Find Maximum\n2. Find Minimum\n3. Find differences between avarage and terms\n4. Find Sums(odds and evens)\n5. exit");
            menuInput = in.nextInt();
            
            if(menuInput == 1)// find maximum
            {
                System.out.println("biggest term of array is: " + operatorArray.theBiggestOfArray());
            }

            else if(menuInput == 2)// find minimum
            {
                System.out.println("smallest term of array is: " + operatorArray.theSmallestOfArray());
            }

            else if(menuInput == 3)//find avarage
            {
                System.out.println("Difference between avarage of terms and array terms is: " );
                displayArray(operatorArray.differences(), 10);
            }

            else if (menuInput == 4)//find sums
            {
                System.out.println("Sum of even terms af array is: " + operatorArray.ToFindSumOfEven());
                System.out.println("Sum of odd terms of array is: " + operatorArray.ToFindSumOfOdd());
            }

            else if (menuInput == 5) // exit
            {
                cont = false;
            }
        }
        
        in.close();
    }
}