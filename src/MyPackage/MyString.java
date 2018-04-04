package MyPackage;

import java.util.ArrayList;
public class MyString  implements Comparable{


    public String string;
    private int count;
    public MyString(String s)
    {
        string =s;
        count=1;
    }
    public MyString(String s,int n)
    {
        string =s;
        count=n;
    }
    public MyString(MyString ms)
    {
        this.string =ms.string;
        this.count=ms.count;
    }


    public int GetCount()
    {
        return count;
    }
    public int compareTo(Object o) {
        MyString s = (MyString) o;
        if (this.count > s.count) {
            return 1;
        }
        else if(this.count==s.count)
        {
            if(this.string.compareTo(s.string)<0)
            {
                return 1;
            }
            else if((this.string.compareTo(s.string)==0))return 0;
            else return -1;
        }
        else {
            return -1;
        }
      //  return 0;
    }

    private static ArrayList<MyString> myStrings=new ArrayList<MyString>();
    public static void  Insert(String s)
    {
        if(myStrings.isEmpty()){myStrings.add(new MyString(s));return;}
        boolean find=false;
        for (MyString ms:myStrings )
        {
            if(ms.string.equals(s)){ms.count++;find=true;}
        }
        if(!find) myStrings.add(new MyString(s));
    }
    public static ArrayList<MyString> GetStrings()
    {
        quickSort(myStrings,0,myStrings.size()-1);
        if(myStrings.size()<=100)return myStrings;
        else return (ArrayList<MyString>) myStrings.subList(0,99);
       // return null;
    }


    private static int partition(ArrayList<MyString> array,int lo,int hi){
        /** 固定的切分方式 */
        MyString key=new MyString(array.get(lo)) ;//选取了基准点
        while(lo<hi){
            //从后半部分向前扫描
            while(array.get(hi).compareTo(key)<=0&&hi>lo){
                hi--;
            }
            array.set(lo,new MyString(array.get(hi)));
            //从前半部分向后扫描
            while(array.get(lo).compareTo(key)>=0&&hi>lo){
                lo++;
            }
            array.set(hi,new MyString(array.get(lo)));
        }
        array.set(hi,new MyString(key));
        //array[hi]=key;//最后把基准存入
        return hi;
    }

    private static void quickSort(ArrayList<MyString> array,int lo ,int hi){
        if(lo>=hi){
            return ;
        }
        //进行第一轮排序获取分割点
        int index=partition(array,lo,hi);
        //排序前半部分
        quickSort(array, lo, index - 1);
        //排序后半部分
        quickSort(array,index+1,hi);
    }


}
