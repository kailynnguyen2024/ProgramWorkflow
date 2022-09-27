
public class ForLoops
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;

    public void run() {
        for (int i = 0; i <=15; i++) {
            System.out.println("i is " + i);
        }

        for (int j = 10; j != 0; j -= 2) {
            System.out.println("j is " + j);
        }

        for (int k = 10; k != 0; k -= 3) {
            System.out.println("k is " + k + " and is in an infinite loop");
        }
    }

    public static void main(String[] args)
    {        
        ForLoops hw = new ForLoops();
        hw.run();
    }
}

