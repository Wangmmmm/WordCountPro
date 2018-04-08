//import org.junit.Assert;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class StatisticsTest {
//    @BeforeEach
//    void setUp()
//    {
//        MyString.myStrings=new ArrayList<MyString>();
//    }
//
//
//    @Test
//    void getResult1() {
//        Statistics stat=new Statistics();
//        stat.Input("abc");
//        String[] expRes={"abc"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//            Assert.assertArrayEquals("error",expRes,res);
//
//    }
//    @Test
//    void getResult2() {
//        Statistics stat=new Statistics();
//        stat.Input("abC");
//        String[] expRes={"abc"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//
//    }
//    @Test
//    void getResult3() {
//        Statistics stat=new Statistics();
//        stat.Input("abc-");
//        String[] expRes={"abc"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult4() {
//        Statistics stat=new Statistics();
//        stat.Input("abc-d");
//        String[] expRes={"abc-d"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//
//    @Test
//    void getResult5() {
//        Statistics stat=new Statistics();
//        stat.Input("-abc");
//        String[] expRes={"abc"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult6() {
//        Statistics stat=new Statistics();
//        stat.Input("abc--");
//        String[] expRes={"abc"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult7() {
//        Statistics stat=new Statistics();
//        stat.Input("abc1");
//        String[] expRes={"abc"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult8() {
//        Statistics stat=new Statistics();
//        stat.Input("abc,");
//        String[] expRes={"abc"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult9() {
//        Statistics stat=new Statistics();
//        stat.Input("abc1d");
//        String[] expRes={"abc","d"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult10() {
//        Statistics stat=new Statistics();
//        stat.Input("abc,d");
//        String[] expRes={"abc","d"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult11() {
//        Statistics stat=new Statistics();
//        stat.Input("abc d");
//        String[] expRes={"abc","d"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult12() {
//        Statistics stat=new Statistics();
//        stat.Input("abc\rd");
//        String[] expRes={"abc","d"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult13() {
//        Statistics stat=new Statistics();
//        stat.Input("abC,d");
//        String[] expRes={"abc","d"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult14() {
//        Statistics stat=new Statistics();
//        stat.Input("abC-2d");
//        String[] expRes={"abc","d"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult15() {
//        Statistics stat=new Statistics();
//        stat.Input("abc!d");
//        String[] expRes={"abc","d"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult16() {
//        Statistics stat=new Statistics();
//        stat.Input("abc,,,,,d");
//        String[] expRes={"abc","d"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult17() {
//        Statistics stat=new Statistics();
//        stat.Input("abc,d,efg");
//        String[] expRes={"abc","d","efg"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//
//    @Test
//    void getResult18() {
//        Statistics stat=new Statistics();
//        stat.Input("abC,d,efg");
//        String[] expRes={"abc","d","efg"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult19() {
//        Statistics stat=new Statistics();
//        stat.Input("abc,d,ef-g");
//        String[] expRes={"abc","d","ef-g"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult20() {
//        Statistics stat=new Statistics();
//        stat.Input("");
//        String[] expRes=new String[0];
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult21() {
//        Statistics stat=new Statistics();
//        stat.Input("-");
//        String[] expRes=new String[0];
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult22() {
//        Statistics stat=new Statistics();
//        stat.Input(" ");
//        String[] expRes=new String[0];
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult23() {
//        Statistics stat=new Statistics();
//        stat.Input(" ");
//        String[] expRes=new String[0];
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//    @Test
//    void getResult24() {
//        Statistics stat=new Statistics();
//        stat.Input("abc123abc");
//
//        String[] expRes={"abc"};
//        ArrayList<String>  string=stat.GetResult();
//        int count=string.size();
//        String[] res=new String[count];
//        for(int i=0;i<count;i++)
//        {
//            res[i]=string.get(i);
//        }
//
//        Assert.assertArrayEquals("error",expRes,res);
//    }
//
//
//
//}