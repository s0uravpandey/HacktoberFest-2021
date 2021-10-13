import java.util.*;
class C
{
    int A[][];
    int s;    
    C(int sz)
    {
        s=sz;
        A=new int[s][s];
    }    
    void input()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter The Values of the array :");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                System.out.print("Enter a Value for "+i+","+j+"th Position :");
                A[i][j]=x.nextInt();
                System.out.println();
            }
        }        
        System.out.println("\nThe Original Matrix is :");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }        
    }    
    void mirror()
    {
        System.out.println("The Mirror Matrix is :");
        for(int i=0;i<s;i++)
        {
            for(int j=s-1;j>=0;j--)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
    }    
    public static void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter Desired size of the Matrix:");
        int sze=x.nextInt();
        C obj=new C(sze);
        obj.input();
        obj.mirror();
    }
}
