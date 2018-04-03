import java.util.ArrayList;
public class MyString {


    public String string;
    private int count;
    public MyString(String s)
    {
        string =s;
        count=1;
    }

    public int GetCount()
    {
        return count;
    }

    private static ArrayList<MyString> myStrings=new ArrayList<MyString>();
    public static void  Insert(String s)
    {
            if(myStrings.isEmpty()){myStrings.add(new MyString(s));return;}
        for (MyString ms:myStrings )
        {
            if(ms.string.equals(s))ms.count++;
            else myStrings.add(new MyString(s));
        }
    }
    public static ArrayList<MyString> GetStrings()
    {
        return null;
    }


}
