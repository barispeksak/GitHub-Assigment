public class Operator
{
    private int[] randomArray;

    public int[] formArray(int[] randomArray, int arraySize)
    {
        for(int a = 0; a < arraySize; a++)
        {
            randomArray[a] = (int)(Math.random() * 1000);
        }

        return randomArray;
    }


    //task C added by Ozan
    public static int theBiggestOfArray (int[] givenArray)
    {
        int biggestNum = givenArray[0];
        for(int num: givenArray)
        {
            if (num > biggestNum)
            {
                biggestNum = num;
            }
        }
        return biggestNum;
    }

    public static int theSmallestOfArray (int[] givenArray)
    {
        int smallestNum = givenArray[0];
        for(int num: givenArray)
        {
            if (num < smallestNum)
            {
                smallestNum = num;
            }
        }
        return smallestNum;
    }
    //task C finishes here
}

