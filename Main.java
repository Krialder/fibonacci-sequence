import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true)
        {


            System.out.print("Enter a number for the upper limit for the shown fibonacci number. (or type 'exit' to quit): ");
            input = scanner.next();

            if (input.equalsIgnoreCase("exit"))
            {
                break;
            }
            try
            {
                int n = Integer.parseInt(input);

                if (n < 0)
                {
                    System.out.println("Please enter a positive number.");
                }
                else
                {
                    for (int f = 1; fibo(f) <= n; f++)
                    {
                        System.out.println(fibo(f));
                    }
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        }
    }


    public static int fibo(int f)
    {
        if (f == 1)
        {
            return 0;
        }
        else if (f == 2)
        {
            return 1;
        }
        else
        {
            return fibo(f - 1) + fibo(f - 2);
        }
    }
}





