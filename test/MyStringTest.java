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
        String[] expResults={"array-1","test","array"};
        ArrayList<MyString> result=new ArrayList<MyString>();
        MyString testString=new MyString("test",4);
        MyString testString1=new MyString("array-1",10);
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
        String[] expResults={"array","array-1","test"};
        ArrayList<MyString> result=new ArrayList<MyString>();
        MyString testString=new MyString("test",5);
        MyString testString1=new MyString("array-1",6);
        MyString testString2=new MyString("array",7);
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
    }//词频统计1

    @Test
    public void testMyString12() {
        MyString testString=new MyString("test-ed",10);
        int results=testString.GetCount();
        int expResults=10;
        Assertions.assertEquals(expResults,results);
    }//词频统计2

    @Test
    public void testMyString13() {
        MyString testString=new MyString("test ed");
        int results=testString.GetCount();
        int expResults=1;
        Assertions.assertEquals(expResults,results);
    }//词频统计3

    @Test
    public void testMyString14() {
        MyString testString=new MyString("2u");
        int results=testString.GetCount();
        int expResults=1;
        Assertions.assertEquals(expResults,results);
    }//词频统计4

    @Test
    public void testMyString15() {
        MyString testString=new MyString("2u-ed");
        int results=testString.GetCount();
        int expResults=1;
        Assertions.assertEquals(expResults,results);
    }//词频统计5

    @Test
    public void testMyString16() {
        MyString testString=new MyString("test",10);
        MyString testString1=new MyString("tested",2);
        int results=testString.GetCount();
        int results1=testString1.GetCount();
        int expResults=10;
        int expResults1=2;
        Assertions.assertEquals(expResults,results);
        Assertions.assertEquals(expResults1,results1);
    }//词频统计6

    @Test
    public void testMyString17() {
        MyString testString=new MyString("test ed",8);
        MyString testString1=new MyString("test-ed",2);
        int results=testString.GetCount();
        int results1=testString1.GetCount();
        int expResults=8;
        int expResults1=2;
        Assertions.assertEquals(expResults,results);
        Assertions.assertEquals(expResults1,results1);
    }//词频统计7

    @Test
    public void testMyString18() {
        MyString testString=new MyString("2u",1);
        MyString testString1=new MyString("2u-ed",5);
        int results=testString.GetCount();
        int results1=testString1.GetCount();
        int expResults=1;
        int expResults1=5;
        Assertions.assertEquals(expResults,results);
        Assertions.assertEquals(expResults1,results1);
    }//词频统计8

    @Test
    public void testMyString19() {
        MyString testString=new MyString("2u-ed",4);
        MyString testString1=new MyString("tested",8);
        int results=testString.GetCount();
        int results1=testString1.GetCount();
        int expResults=4;
        int expResults1=8;
        Assertions.assertEquals(expResults,results);
        Assertions.assertEquals(expResults1,results1);
    }//词频统计9

    @Test
    public void testMyString20() {
        MyString testString=new MyString("test-ed2u",1);
        MyString testString1=new MyString("test",3);
        int results=testString.GetCount();
        int results1=testString1.GetCount();
        int expResults=1;
        int expResults1=3;
        Assertions.assertEquals(expResults,results);
        Assertions.assertEquals(expResults1,results1);
    }//词频统计10

    @Test
    public void testMyString21() {
        MyString testString=new MyString("test-ed2u",1);
        MyString testString1=new MyString("2utest-ed",3);
        int results=testString.GetCount();
        int results1=testString1.GetCount();
        int expResults=1;
        int expResults1=3;
        Assertions.assertEquals(expResults,results);
        Assertions.assertEquals(expResults1,results1);
    }//词频统计11

    @Test
    public void testMyString22() {
        MyString testString=new MyString("test-ed2u",5);
        MyString testString1=new MyString("test",6);
        int results=testString.GetCount();
        int results1=testString1.GetCount();
        int expResults=1;
        int expResults1=3;
        Assertions.assertEquals(expResults,results);
        Assertions.assertEquals(expResults1,results1);
    }//词频统计12

    @Test
    public void testMyString23() {
        MyString testString=new MyString("abc",4);
        MyString testString1=new MyString("ewa-3",6);
        int results=testString.GetCount();
        int results1=testString1.GetCount();
        int expResults=4;
        int expResults1=6;
        Assertions.assertEquals(expResults,results);
        Assertions.assertEquals(expResults1,results1);
    }//词频统计13

    @Test
    public void testMyString24() {
        MyString testString=new MyString("clearlove",5);
        MyString testString1=new MyString("4-c",6);
        int results=testString.GetCount();
        int results1=testString1.GetCount();
        int expResults=5;
        int expResults1=6;
        Assertions.assertEquals(expResults,results);
        Assertions.assertEquals(expResults1,results1);
    }//词频统计14

}