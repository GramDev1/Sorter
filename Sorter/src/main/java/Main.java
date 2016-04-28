import java.util.Scanner;

/**
 * Created by thejp on 4/27/2016.
 */
public class Main
{
    public static void main(String[] args) throws InterruptedException{
        int tosort, fixer;
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF INTS!"); //Reference
        tosort = s.nextInt();
        int a[] = new int[tosort]; //Can't be an an arraylist, I need SOME point of reference P
        System.out.println("Enter all ze INTS!:");
        for (int i = 0; i < tosort; i++)
        {
            a[i] = s.nextInt();
            
            //To record the ints
        }
        for (int i = 0; i < tosort; i++)
        {
            for (int ascend = i + 1; j < tosort; j++)
            {
                if (a[i] > a[j])
                {
                    fixer = a[i];
                    a[i] = a[ascend];
                    a[ascend] = fixer;
                    //This make sures that the ints are sorted properly
                }
            }
        }
        System.out.print("Big to small here we go!:");
        for (int i = 0; i < tosort - 1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[tosort - 1]);
    }
    }

