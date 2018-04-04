package MyPackage;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args)
    {



        Statistics st=new Statistics();
        String s="asdssssss,dh,123as-dfhh.dh'";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            st.Count(c);
        }
        st.End();

        ArrayList<MyString> mss=MyString.GetStrings();


        for (MyString stemp:mss
                ) {
            System.out.println(stemp.GetCount()+" "+stemp.string);
        }

        //System.out.pri ntln(a);

    }

}
