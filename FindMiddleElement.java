public class FindMiddleElement {
    public static void main(String arg[])
    {
        Integer arr[]={11,12,13,14,15};
         MiddleElement(arr);

    }
    public static <T> void MiddleElement(T[] arr)
    {
        int top=0;
        int bottom=arr.length;
        System.out.println("Element Present at  Mid of Array:"+arr[(top+bottom)/2]);
    }
}
