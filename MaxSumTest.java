/* Jason Ivey
* 2017
*
* Probably the worst program I have ever written....
*/


import java.util.Random;
public class MaxSumTest{
  
  public static void main(String args[]){
    
    //I would write handlers to stop crash and burn.... but, meh....
    int lengthOfArray = Integer.parseInt(args[0]);
    int numberOfTests = Integer.parseInt(args[1]);
    
    int[] array = randomGen(lengthOfArray);
    
    Stopwatch timer = new Stopwacth();
    
    double[] accum = new double[3];
    accum[ 0 ] = 0.0;
    accum[ 1 ] = 0.0;
    accum[ 2 ] = 0.0; //accum stand for accumulator
    
    for( int iteration = 0; iterations < numberOfTests; iterations++  ){
      timer.setTime();
      int maxSum = maxSum(array, lengthOfArray);
      accum[ 0 ] = timer.getTime();
      
      timer.setTime();
      maxSum = maxSumQ(array, lengthOfArray);
      accum[ 1 ] = timer.getTime();
      
      timer.setTime();
      maxSum = maxSumK(array, lengthOfArray);
      accum[ 2 ] = timer.getTime();
      
    } for ( int iterator : accum ) {
      System.out.println( ( iterator / numberOfTests ) );
    }
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
