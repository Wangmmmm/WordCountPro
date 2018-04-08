import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OutputTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
        //要写的文件已经存在，且统计得到的单词数<=100个
    void write1() {
        File read_file = new File("result.txt");
        if (!read_file.exists()) {
            try {
                read_file.createNewFile();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }

        String expected_string = writeDocument_100();

        String content = getContent();

        //对String类型对象进行比较
        assertEquals(expected_string, content);
    }


    @Test
        //要写的文件已经存在，且统计得到的单词数>100个
    void write2() {
        File read_file = new File("result.txt");
        if (!read_file.exists()) {
            try {
                read_file.createNewFile();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }

        String expected_string = writeDocument_100_more();

        String content = getContent();

        //对String类型对象进行比较
        assertEquals(expected_string, content);
    }

    @Test
        //要写的文件不存在，且统计得到的单词数<=100个
    void write3() {
        File read_file = new File("result.txt");
        if (read_file.exists()) {
            read_file.delete();
        }

        String expected_string = writeDocument_100();

        String content = getContent();

        //对String类型对象进行比较
        assertEquals(expected_string, content);
    }

    @Test
        //要写的文件不存在，且统计得到的单词数>100个
    void write4() {
        File read_file = new File("result.txt");
        if (read_file.exists()) {
            read_file.delete();
        }

        String expected_string = writeDocument_100_more();

        String content = getContent();

        //对String类型对象进行比较
        assertEquals(expected_string, content);
    }

    @Test
        //统计单词的out_content数组为null
    void write5() {
        String expected_string = writeDocument_null();

        String content = getContent();

        //对String类型对象进行比较
        assertEquals(expected_string, content);
    }


    //写result.txt文件时，写入内容为空
    String writeDocument_null() {
        ArrayList<MyString> test_one = null;
        Output test = new Output(test_one);
        test.write();
        String expected_string = "";
        return expected_string;
    }


    //向result.txt文件中写入多于100个统计结果
    String writeDocument_100_more() {
        //初始化ArrayList数组
        MyString test1 = new MyString("a", 10);
        MyString test2 = new MyString("b", 15);
        MyString test3 = new MyString("c", 20);
        MyString test4 = new MyString("d", 25);
        MyString test5 = new MyString("e", 30);
        ArrayList<MyString> test_one = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            test_one.add(test1);
            test_one.add(test2);
            test_one.add(test3);
            test_one.add(test4);
            test_one.add(test5);
        }
        Output test = new Output(test_one);
        test.write();
        String expected_string = "\n.txt文件单词词频统计：";
        for (int i = 0; i < 20; i++) {
            expected_string = expected_string + "\n\na 10\n\nb 15\n\nc 20\n\nd 25\n\ne 30";
        }
        return expected_string;
    }

    //向result.txt文件中写入少于100个统计结果
    String writeDocument_100() {
        //初始化ArrayList数组
        MyString test1 = new MyString("a", 10);
        MyString test2 = new MyString("b", 15);
        MyString test3 = new MyString("c", 20);
        MyString test4 = new MyString("d", 25);
        MyString test5 = new MyString("e", 30);
        ArrayList<MyString> test_one = new ArrayList<>();
        test_one.add(test1);
        test_one.add(test2);
        test_one.add(test3);
        test_one.add(test4);
        test_one.add(test5);
        Output test = new Output(test_one);
        test.write();
        String expected_string = "\n.txt文件单词词频统计：\n\na 10\n\nb 15\n\nc 20\n\nd 25\n\ne 30";
        return expected_string;
    }

    //获取result.txt文件中的内容到一个Stirng类型的变量中
    String getContent() {
        //读取result.txt中的内容到content中
        String content = "";
        File file = new File("result.txt");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader bufr = new BufferedReader(fr);
            String s = null;
            //获取文本全部内容
            while ((s = bufr.readLine()) != null) {
                content = content + "\n" + s;
            }
            bufr.close();
            fr.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return content;
    }
}