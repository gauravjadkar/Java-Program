public class FindTwoElements {
    public static void main(String arg[])
    {
       // Integer arr[]={12,13,14,15,16};
       String arr[]={"Raj","Gaurav","Shree"};
        CheckExistance(arr,"Raj","Gaurv");
    }
    public static <T> void CheckExistance(T[] arr,T target1,T target2)
    {
         int i1=0,i2=0;
           
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i].equals(target1))
           {
            System.out.println("Element 1st Found at index:"+i);
            i1=1;
           }
           else if(arr[i].equals(target2))
           {
             System.out.println("Element 2nd Found at index:"+i);
             i2=1;
           }
        }
        if(i1==0 && i2==0 )
        {
          System.out.println("Both Elements Are Not Present In Array");
        }
        else if(i1==0 || i2==0)
        {
            System.out.println("Other Provided Element is Not Present");
        }
    }
}
