import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Statistics st = new Statistics();
        String s = "asdssssss,dh,123as-dfhh.dh'";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            st.Count(c);
        }
        st.End();

        ArrayList<MyString> mss = MyString.GetStrings();


        for (MyString stemp : mss
                ) {
            System.out.println(stemp.GetCount() + " " + stemp.string);
        }

        //System.out.pri ntln(a);


        //以下是Output的测试，忽略就好
        /*MyString test1 = new MyString("a", 10);
        MyString test2 = new MyString("b", 15);
        MyString test3 = new MyString("c", 20);
        MyString test4 = new MyString("d", 25);
        MyString test5 = new MyString("e", 30);
        MyString test6 = new MyString("f", 48);
        MyString test7 = new MyString("q", 100);
        ArrayList<MyString> test_one = new ArrayList<>();
        test_one.add(test1);
        test_one.add(test2);
        test_one.add(test3);
        test_one.add(test4);
        test_one.add(test5);
        test_one.add(test6);
        test_one.add(test7);

        Output test = new Output(test_one);
        int out = test.write();
        if (out == 1)
            System.out.println("正确输出！");
        else
            System.out.println("错误输出！");*/

    }

}
