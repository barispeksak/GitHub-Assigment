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

    public static int ToFindSumOfEven (int[] merhaba)
    {
        
        int sumOfEven = 0;
        for(int i = 0 ; i < merhaba.length ; i++)
        {
            if(i % 2 == 0)
            {
                sumOfEven += merhaba[i];
            }
            
        }
        return sumOfEven;
    }
    public static int ToFindSumOfOdd (int[] merhaba)
    {
        int sumOfOdd = 0;
        for(int i = 0 ; i < merhaba.length ; i++)
        {
            if(i % 2 != 0)
            {
                sumOfOdd += merhaba[i];
            }
            
        }
        return sumOfOdd;
    }
}

