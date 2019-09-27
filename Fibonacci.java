public class Fibonacci
{
    public static void main(String[] args)
    {
        System.out.println("Printing Fibonacci series");
        Fibonacci myclass = new Fibonacci();
        myclass.printFibo(0,1,100);
    }

    void printFibo(int a,int b,int upperLimit)
    {

        System.out.println(a);
        while (b<upperLimit){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;


        }
    }


}
