package prime;
public class Prime {
    static public boolean isPrime(int number)
    {
        int squareRoot =(int) Math.sqrt(number);
        boolean prime=true;
        if (number != 2 && number %2 == 0)
            prime = false; 
        else 
        {
            for (int i= 2 ; i < squareRoot;  i++) 
            {
                if (number % i == 0 )
                {
                    prime = false ;
                    break;
                }
            }
        }
        return prime; 
    }
    public static void main(String[] args) {   
        int[] numbers = { 5, 22, 18, 19, 17}; 
        for (int i=0 ; i < numbers.length ; i++)
        {
            if (isPrime(numbers[i]))
                System.out.println(numbers[i]+" is a prime");
            else
                System.out.println(numbers[i]+" is NOT a prime");
        }
    }
}
