import java.util.*;
import java.io.*;

public class WelcomeBack 

{
   public int[] sumNumbers(int n)
      {
       int[] nums = new int[n+1];
       int index = 1;
       for (int i = 1; i < nums.length; i++)
         {
            int sum = 0;
            for (int j = 0; j <= index; j++)
               {
                  sum = sum + j;
               }
            nums[i] = sum;
            index++;
         }
       return nums;
      }
      
      
   
   public Map<Integer, Integer> mapLengths(String[] words)
      {
         HashMap<Integer, Integer> mapL = new HashMap<Integer, Integer>();
          
         ArrayList<Integer> alreadyUsed = new ArrayList<Integer>();
         
         int count = 0;
         for(int i = 0; i < words.length; i++)
            {
               if(alreadyUsed.contains(words[i].length()) == true)
                  {
                     continue;
                  }
               int lengthOfWord = words[i].length();
           
               for(int j = i; j < words.length; j++)
                  {
                     if(lengthOfWord == words[j].length())
                        {
                           count++;
                        }
                  }
            mapL.put(lengthOfWord, count);
            alreadyUsed.add(lengthOfWord);
            count = 0;
            }
          return mapL; 
      }
      
      public int sumDigitsRecur(int n)
      {
          if (n == 0)
          {
            return 0;
           }
        return (n % 10 + sumDigitsRecur(n / 10));       
      }
      
      public int sumDigits(int num)
      {
         int d = 0;
         int sum = 0;
         while(0 < num)
          {
            d = num % 10; 
            sum = sum + d;
            num = num/10; 
          }
      return sum;
   }
   
   public int sumWithoutCarry(int a, int b)
   {
         //make 3 arrays add  cut store return
         int arrayA[] = new int[(a+"").length()];
         int arrayB[] = new int[(b+"").length()];
         int arrayAnswer[] = new int[(a+"").length()];
         
         int counterA = a; 
         int counterB = b;
         for (int i = arrayA.length - 1; i > -1; i--)
            {
               arrayA[i] = counterA % 10;
               counterA = counterA / 10;
            }
            
         for (int i = arrayB.length - 1; i > -1; i--)
             {
               arrayB[i] = counterB % 10;
               counterB = counterB / 10;
             }
         
         for (int i = 0; i < arrayA.length; i++)
            {
               arrayAnswer[i] = arrayA[i] + arrayB[i];
               arrayAnswer[i] = arrayAnswer[i] % 10;
            }
          
         int sum = 0;
         for (int i = 0; i < arrayAnswer.length; i++)
         {
            sum = 10 * sum + arrayAnswer[i];   
         }
            System.out.println(Arrays.toString(arrayAnswer));
         return sum;
   }
   
   
  public void zeck(String fileName)
   {
      Scanner file = null;
        try {
            file = new Scanner(new File("zeck.txt"));
        }
        catch (IOException e) {
            System.out.println("Can't find the file!");
        }
      int plusCounter = 0;
      while (file.hasNext() == true)
         {
           int currentNumber = file.nextInt();
           System.out.print(currentNumber + " = ");
           while (0 < currentNumber)
               {
                  int fibNumber = smallFib(currentNumber);
                  if (plusCounter == 0)
                     {
                        System.out.print(fibNumber);
                        plusCounter--; 
                     }
                  else 
                  {
                  System.out.print(" + " + fibNumber);
                  }
                  currentNumber -= fibNumber;         
               }
            System.out.println();
            plusCounter = 0;
    }
    
  }
    //helper method
 public static int smallFib(int n)
      {
        int fib1 = 0;
        int fib2 = 1; 
        int fib3 = 1;
        while (fib3 <= n) 
        {
            fib1 = fib2;
            fib2 = fib3;
            fib3 = fib1 + fib2;
        }
        return fib2;
      }
   } 

