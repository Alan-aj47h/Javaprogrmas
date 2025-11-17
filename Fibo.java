public class Fibo
{
    int a = 0,b = 1,next = 0;
    void Series(int x)
    {
        System.out.println("Fibonacci series upto "+x);
        System.out.println(a);
        System.out.println(b);
        for( int i=2;i<x;i++)
        {
            next=a+b;
            System.out.println(next+" ");
            a=b;
            b=next;
        }

    }
    public static void main(String[] args)
    {
      Fibo f = new Fibo();
      f.Series(10);
    }
}