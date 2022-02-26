import java.util.*;
public class prg1
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("enter a no");
        int a=inp.nextInt();
        for(int i=1;i<a;i++)
        {
            if(i%2==0)
            System.out.println(i);
        }
        
    }
}
