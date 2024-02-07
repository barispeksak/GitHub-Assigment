public class Operator
{
    int[] randomArray;

    public int[] formArray(int[] randomArray, int arraySize)
    {
        for(int a = 0; a < arraySize; a++)
        {
            randomArray[a] = Math.random(100);
        }

        return randomArray;
    }
}

