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
}

