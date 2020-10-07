
package linear.search;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
       int m,key,temp=0;
       Scanner obj =new Scanner(System.in);
       System.out.println("enter number of elements");
               m=obj.nextInt();
               int arr[]=new int[m];
               for(int i=0;i<m;i++)
               {
                   arr[i]=obj.nextInt();
               }
               
         System.out.println("enter element to be found");
         key=obj.nextInt();
         for(int i=0;i<m;i++)
         {
             if(key==arr[i])
             {
                 System.out.println("Element found at"+" "+i+  " "+"index");
                 temp++;
             }
                 
         }
         if(temp==0)
             System.out.println("Element not present");
        
        
    }
    
}
