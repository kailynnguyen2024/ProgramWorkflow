
public class DoWhile
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;

    public void run() {
        int i = 10;
        do {
            System.out.println("i is " + i + " but is less than 15");
            i++;
        } while (i < 15);
        int k = 10; 
        do {
            System.out.println("k is " + k + " but is greater than 5");
            k -= 1;
        } while (k > 5);
        do {
            System.out.println("a is " + a + " but is less than 10 and b is " + b + " but is < or = to 20");
            a += 1;
            b += 1;
        } while (a < 10 && b <= 20);
    }

    public static void main(String[] args)
    {        
        DoWhile hw = new DoWhile();
        hw.run();
    }
}

