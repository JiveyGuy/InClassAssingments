import java.util.Random;
public class SortTester{
  
  public static void main(String args[]){
    int lengthOfArray = Integer.parseInt(args[0]);
    int[] array = randomGen(lengthOfArray);
    
    Stopwatch timer0 = new Stopwatch();
    int maxSum = maxSum(array, lengthOfArray);
    double time0 = timer0.elapsedTime();
    
    Stopwatch timer1 = new Stopwatch();
    int maxSumQ = maxSumQ(array, lengthOfArray);
    double time1 = timer1.elapsedTime();
    
    Stopwatch timer2 = new Stopwatch();
    int maxSumK = maxSumK(array, lengthOfArray);
    double time2 = timer1.elapsedTime();
    
    System.out.println( "For " + lengthOfArray + "\nBruteForce: " + time0 + "\nQuadratic: " + time1 + "\nKadane: " + time2);
  }
  
  public static int[] randomGen(int n){
    int[] result = new int[n];
    Random rand = new Random();
    for(int x = 0; x < n; x++){
      result[x] = rand.nextInt(500) + 1;
    }
    return result; 
  }
  
  
  public static int maxSumK(int a[], int n)
  {
    int maxSum = 0,sum = 0;
    int i;
    for(i = 0;i<n;i++)
    {
      sum = sum + a[i];
      if(sum < 0)
        sum = 0;
      else if(sum > maxSum)
        maxSum = sum;
    }
    return maxSum;
  }
  
  
  
  public static int maxSumQ(int a[],int n )
  {
    int i,j,sum,maxSum;
    maxSum = 0;
    for(i = 0;i<n;i++)
    {
      sum = 0;
      for(j=i;j<n;j++)
      {
        sum = sum + a[j];
        if(sum>maxSum)
          maxSum = sum;
      }
    }
    return maxSum;
  }
  
  
  
  public static int maxSum(int a[],int n)
  {
    int i,j,k;
    int sum,maxSum = 0;
    for(i=0; i<n; i++)
    {
      for(j=i; j<n; j++)
      {
        sum = 0;
        for(k=i ; k<j; k++)
        {
          sum = sum + a[k];
        }
        if(sum>maxSum)
          maxSum = sum;
      }
    }
    return maxSum;
  } 
}
