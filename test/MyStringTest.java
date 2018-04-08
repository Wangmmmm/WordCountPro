import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MyStringTest {

    @Test
    public void testMyString1() {
        String[] expResults={"input test"};
        ArrayList<MyString> result=new ArrayList<MyString>();
        MyString testString=new MyString("test input");
        result=testString.GetStrings();
        String[] tmp=new String[result.size()];
        for(int i=0;i<result.size();i++){
            tmp[i]=result.get(i).toString();
        }
        for(int j=0;j<result.size();j++){
            Assertions.assertEquals(expResults[j],tmp[j]);
        }
    }//测试单词按字母排序1

    @Test
    public void testMyString2() {
        String[] expResults={"input test array"};
        ArrayList<MyString> result=new ArrayList<MyString>();
        MyString testString=new MyString("test input array");
        result=testString.GetStrings();
        String[] tmp=new String[result.size()];
        for(int i=0;i<result.size();i++){
            tmp[i]=result.get(i).toString();
        }
        for(int j=0;j<result.size();j++){
            Assertions.assertEquals(expResults[j],tmp[j]);
        }
    }//测试单词按字母排序2

    @Test
    public void testMyString3() {
        String[] expResults={"test input"};
        ArrayList<MyString> result=new ArrayList<MyString>();
        MyString testString=new MyString("test test input",1);
        result=testString.GetStrings();
        String[] tmp=new String[result.size()];
        for(int i=0;i<result.size();i++){
            tmp[i]=result.get(i).toString();
        }
        for(int j=0;j<result.size();j++){
            Assertions.assertEquals(expResults[j],tmp[j]);
        }
    }//测试单词按字母排序3

    @Test
    public void testMyString4() {
        String[] expResults={"input test array"};
        ArrayList<MyString> result=new ArrayList<MyString>();
        MyString testString=new MyString("test test input input array",1);
        result=testString.GetStrings();
        String[] tmp=new String[result.size()];
        for(int i=0;i<result.size();i++){
            tmp[i]=result.get(i).toString();
        }
        for(int j=0;j<result.size();j++){
            Assertions.assertEquals(expResults[j],tmp[j]);
        }
    }//测试单词按字母排序4

    @Test
    public void testMyString5() {
        String[] expResults={"test array"};
        ArrayList<MyString> result=new ArrayList<MyString>();
        MyString testString=new MyString("array test test",1);
        result=testString.GetStrings();
        String[] tmp=new String[result.size()];
        for(int i=0;i<result.size();i++){
            tmp[i]=result.get(i).toString();
        }
        for(int j=0;j<result.size();j++){
            Assertions.assertEquals(expResults[j],tmp[j]);
        }
    }//测试单词按字母排序5

    @Test
    public void testMyString6() {
        String[] expResults={"array-1 array-2 test"};
        ArrayList<MyString> result=new ArrayList<MyString>();
        MyString testString=new MyString("test array-2 array-1",1);
        result=testString.GetStrings();
        String[] tmp=new String[result.size()];
        for(int i=0;i<result.size();i++){
            tmp[i]=result.get(i).toString();
        }
        for(int j=0;j<result.size();j++){
            Assertions.assertEquals(expResults[j],tmp[j]);
        }
    }//测试单词按字母排序6

    @Test
    public void testMyString7() {
        String[] expResults={"array-1","test","array"};
        ArrayList<MyString> result=new ArrayList<MyString>();
        MyString testString=new MyString("test",10);
        MyString testString1=new MyString("array-1",11);
        MyString testString2=new MyString("array",2);
        result.add(testString);
        result.add(testString1);
        result.add(testString2);
        MyString.myStrings=result;
        MyString.GetStrings();
        String[] tmp=new String[result.size()];
        for(int i=0;i<result.size();i++){
            tmp[i]=result.get(i).string;
        }
        for(int j=0;j<result.size();j++){
            Assertions.assertEquals(expResults[j],tmp[j]);
        }
    }//测试单词按字母排序7

    @Test
    public void testMyString8() {
        String[] expResults={"array","array-1","test"};
        ArrayList<MyString> result=new ArrayList<MyString>();
        MyString testString=new MyString("test",1);
        MyString testString1=new MyString("array-1",1);
        MyString testString2=new MyString("array",1);
        result.add(testString);
        result.add(testString1);
        result.add(testString2);
        MyString.myStrings=result;
        MyString.GetStrings();
        String[] tmp=new String[result.size()];
        for(int i=0;i<result.size();i++){
            tmp[i]=result.get(i).string;
        }
        for(int j=0;j<result.size();j++){
            Assertions.assertEquals(expResults[j],tmp[j]);
        }
    }//测试单词按字母排序8

    @Test
    public void testMyString9() {
        String[] expResults={"array","test","array-1"};
        ArrayList<MyString> result=new ArrayList<MyString>();
        MyString testString=new MyString("test",2);
        MyString testString1=new MyString("array-1",1);
        MyString testString2=new MyString("array",2);
        result.add(testString);
        result.add(testString1);
        result.add(testString2);
        MyString.myStrings=result;
        MyString.GetStrings();
        String[] tmp=new String[result.size()];
        for(int i=0;i<result.size();i++){
            tmp[i]=result.get(i).string;
        }
        for(int j=0;j<result.size();j++){
            Assertions.assertEquals(expResults[j],tmp[j]);
        }
    }//测试单词按字母排序9

    @Test
    public void testMyString10() {
        String[] expResults={"array","test","array-1"};
        ArrayList<MyString> result=new ArrayList<MyString>();
        MyString testString=new MyString("test",2);
        MyString testString1=new MyString("array-1",1);
        MyString testString2=new MyString("array",2);
        result.add(testString);
        result.add(testString1);
        result.add(testString2);
        MyString.myStrings=result;
        MyString.GetStrings();
        String[] tmp=new String[result.size()];
        for(int i=0;i<result.size();i++){
            tmp[i]=result.get(i).string;
        }
        for(int j=0;j<result.size();j++){
            Assertions.assertEquals(expResults[j],tmp[j]);
        }
    }//测试单词按字母排序10

    @Test
    public void testMyString11() {
        MyString testString=new MyString("test",10);
        int results=testString.GetCount();
        int expResults=10;
        Assertions.assertEquals(expResults,results);
    }//测试词频统计

}