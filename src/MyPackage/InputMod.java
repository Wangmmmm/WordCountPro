package MyPackage;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class InputMod {
    public static String filePath;

    private static String enableFormat=".txt";

    private static String absoloteSymble=":";

    public  static String fileContent;

    public static ArrayList<String> wordTable=new ArrayList<String>();

    public static boolean ReadContent(String path)throws Exception{
        if(path==null||path.isEmpty()||path.length()==0){
            System.out.println("empty path！");
            return false;
        }

        if(!IsTxtFormat(path)){

            return false;
        }

        StringBuilder stringBuilder=new StringBuilder();
        File file=new File(path);

        if(!file.exists()){
            System.out.println("file not exist");
            return false;
        }

        FileReader reader=new FileReader(file);

        StringBuilder wordStringBuilder=new StringBuilder();

        int tempChar;
        Statistics st=new Statistics();

        while((tempChar=reader.read())!=-1){
          st.Count((char)tempChar);
        }
        reader.close();
        st.End();

        fileContent=stringBuilder.toString();
        System.out.println("read file success!");
        return true;
    }

    public static boolean IsTxtFormat(String path){
        String format;
        int indexOfPoint=path.lastIndexOf(".");
        if(indexOfPoint<0){
            System.out.println("error format!");
            return false;
        }
        format=path.substring(indexOfPoint);
        if(format.contains(enableFormat))
            return true;
        System.out.println("error format!");
        return false;
    }

    public static boolean IsAbsolutePath(String path){
        if(path.contains(absoloteSymble))
            return true ;
        return false;
    }

    public static void ShowWordTable(){
        for (String s :
                wordTable) {
            System.out.println(s);
        }
    }
}
