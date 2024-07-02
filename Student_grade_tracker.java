import java.util.*;
class grade{
    public static void main(String[] args){
        System.out.println("Welcome to grade tracker");
        System.out.println("Enter the number of students");
        int n;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the grade");
        int[] a=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        float min=a[0],max=a[0],sum=0;
        for(i=0;i<n;i++){
            sum+=a[i];
            if(min>a[i]){
                min=a[i];
            }
            if(max<a[i]){
                max=a[i];
            }

        }
        float avg;
        avg=sum/n;
        System.out.println("Average : "+avg);
        System.out.println("Highest : "+max);
        System.out.println("Lowest : "+min);

    }
}