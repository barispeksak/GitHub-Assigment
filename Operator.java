public class Operator
{    
    private int[] randomArray;
    private int arraySize;
    
    //Task A is buried in the constructor. (Ege)
    public Operator(int arrayLength)
    {
        this.randomArray = new int[arrayLength];
        this.arraySize = arrayLength;
        
        for(int a = 0; a < arrayLength; a++)
        {
            this.randomArray[a] = (int)(Math.random() * 100);
        }
    }

    //task C added by Ozan
    public int theBiggestOfArray ()
    {
        int biggestNum = this.randomArray[0];
        for(int num: this.randomArray)
        {
            if (num > biggestNum)
            {
                biggestNum = num;
            }
        }
        return biggestNum;
    }

    public int theSmallestOfArray ()
    {
        int smallestNum = this.randomArray[0];
        for(int num: this.randomArray)
        {
            if (num < smallestNum)
            {
                smallestNum = num;
            }
        }
        return smallestNum;
    }
    //task C finishes here

    public int ToFindSumOfEven ()
    {
        int sumOfEven = 0;
        for(int i = 0 ; i < this.arraySize ; i++)
        {
            if(i % 2 == 0)
            {
                sumOfEven += this.randomArray[i];
            }
        }
        return sumOfEven;
    }
    public int ToFindSumOfOdd ()
    {
        int sumOfOdd = 0;
        for(int i = 0 ; i < this.arraySize ; i++)
        {
            if(i % 2 != 0)
            {
                sumOfOdd += this.randomArray[i];
            }
        }
        return sumOfOdd;
    }

    //Task D
    public int[] differences()
    {
        int total = 0;
        for(int number : this.randomArray)
        {
            total += number;
        }
        int avarage = total / this.arraySize;

        int[] newArray = new int[this.arraySize];

        for (int i = 0; i < this.arraySize; i++) 
        {
            newArray[i] = this.randomArray[i] - avarage;
        }

        return newArray;
    }

    //Getter method for reaching the array.(Ege)
    public int[] getArray()
    {
        return this.randomArray;
    }
}
