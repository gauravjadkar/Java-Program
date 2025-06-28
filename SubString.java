public class SubString {
    public static void main(String arg[]) throws Exception
    {
          String str="Hello,World!,Hello World,World";
          String substring1="World";
          FindSubString(str,substring1);

    }
    public static <T> void FindSubString(String str,String substring1)
    {
        int index=str.indexOf(substring1);
        int len=substring1.length()-1;
        int occur=0;
        if(index!=-1)
        {
           
            
            System.out.println("SubString Found At The Index:"+index+
            "\nRange:"+index+"-"+(index+len));
        }
        else{
            System.out.println("String is Not Found");
        }
        //Loop for Finding the Occurance of SubString
        index=0;
        String substr;

        while(len!=(str.length()))
        {
            substr=str.substring(index,len+1);
            if(substr.equals(substring1))
            {
                occur++;
            }
            index++;
            len++;

        }
        System.out.println("Occurance:"+occur);
         
        
    }
}
