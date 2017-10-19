import java.util.Scanner;

public class FiboNthTerm
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter N. ");
  System.out.println("Nth term is:"+fibo(sc.nextInt()));
  
  
}

public static int fibo(int n)
{
  if(n==1||n==2)
  {
    return 1;
  }
  else
  {
    return(fibo(n-1)+fibo(n-2));
  }
}
}
