import java.util.*;
class act1
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        String name = "", reg_no = "";
        int[] marks = new int[5];
        int max = -1, i;
        name = x.nextLine();
        reg_no = x.nextLine();
        
        //Taking input for marks
        for(i = 0 ; i < marks.length ; i++)
        marks[i] = x.nextInt();
        
        int min = marks[0];
        
        //For max marks
        for(int j : marks)
        if(marks[j]>max)
        max = marks[i];
        
        //For min marks
        for(int j : marks)
        if(marks[j]<min)
        min = marks[i];
        
        //Displaying info
        System.out.println("\nName : "+name);
        System.out.println("Reg. no.: "+reg_no);
        System.out.println("Max. mark : "+max);
        System.out.println("Min. mark : "+min);
    }
}