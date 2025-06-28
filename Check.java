//import java.util.ArrayList;

public class Check
{
     public static <T extends Comparable <T>> int CheckSort(T arr[])   //Use of Generics
     {
        int temp=0;
        for(int j=0;j<arr.length-1;j++)
        {
             if(arr[j].compareTo(arr[j+1])<=0) 
             {
               temp=1;
             }
             else
             {
              temp=0;
               break;
             }
        }
        return temp;

     }
     public static void main(String arg[]) throws Exception
     {
        
               //Integer arr[]= {12,11,15,14,15};
               String arr2[]={"A","B","C","A"};
           if(CheckSort(arr2)==1)
           {
               System.out.println("Given array, is Sorted in Non-Descending Order");
           }
           else{
               System.out.println("Given array, is Not Sorted  in Non-Descending Order!");
           }
     }
}