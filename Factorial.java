import java.util.*;
class Factorial
{
public static void main(string args[])
{
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int fact=1;
for(int i=1;i<=N;i++)
{
fact*=i;
}
System.out.println(fact);
}
}
