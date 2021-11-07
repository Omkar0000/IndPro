import java.util.*;
class Ip1 
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");   
int n1=sc.nextInt();   
int[] arr = new int[n1];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n1; i++)  
{     
arr[i]=sc.nextInt();  
}  
  int n = arr.length;
  System.out.print((ShortestSubarray(arr, n)));
}

static int ShortestSubarray(int arr[],int n)
{
  int Minlen;
  int lt = 0;
  int rt = n - 1;
 
  while (lt < rt && arr[lt + 1] >= arr[lt])
  {
    lt++;
  }
  if (lt == n - 1)
    return 0;
  while (rt > lt && arr[rt - 1] <= arr[rt])
  {
    rt--;
  }
 
  Minlen = Math.min(n - lt - 1,rt);
  int b = rt;
  for (int a = 0; a < lt + 1; a++)
  {
    if (arr[a] <= arr[b])
    {
      Minlen = Math.min(Minlen,b - a - 1);
    }
    else if (b < n - 1)
    {
      b++;
    }
    else
    {
      break;
    }
  }
  return Minlen;
}
}