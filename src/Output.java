import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Output {
    private ArrayList<MyString> out_content = null;
    private String output_String = ".txt文件单词词频统计：";

    //构造函数，调用GetStrings方法，获取要输出的内容
    public Output() {
        ArrayList<MyString> out_content = MyString.GetStrings();
    }

    //测试用的构造函数
    public Output(ArrayList<MyString> test) {
        out_content = test;
    }

    //进行结果的输出打印,返回1表示正常输出，返回0表示异常
    public int write() {
        int out = 0;
        //设置要写入的文件
        File write_file = new File("result.txt");

        //判断文件存在与否
        if (!write_file.exists()) {
            try {
                write_file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            //创建BufferedWriter
            FileWriter fw = new FileWriter(write_file);
            BufferedWriter bufw = new BufferedWriter(fw);

            //遍历out_content，完成output_String
            int length = out_content.size();
            for (int i = 0; i < length; i++) {
                MyString temp = out_content.get(i);
                output_String = output_String + "\n\n" + temp.string + " " + temp.GetCount();
            }

            //结果输出
            bufw.write(output_String);
            bufw.close();
            fw.close();
            out = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }
}