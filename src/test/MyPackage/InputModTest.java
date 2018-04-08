package test.MyPackage; 

import MyPackage.InputMod;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** 
* InputMod Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 4, 2018</pre> 
* @version 1.0 
*/ 
public class InputModTest { 

@Before
public void before() throws Exception {
    System.out.println("*****************Test Start:*****************");
}

@After
public void after() throws Exception {
    System.out.println("*****************Test Complete!***************");
}

/** 
* 
* Method: ReadContent(String path) 
* 
*/ 
@Test
public void testReadContent() throws Exception {
    String pathes[]={"d:/test.txt","d:test.doc","test.txt","test.doc",""," "};
    boolean[] expResult={true,false,false,false,false,false};
    int pathCount=pathes.length;
    boolean [] results=new boolean[pathCount];
    for(int i=0;i<pathCount;i++){
        results[i]= InputMod.ReadContent(pathes[i]);
    }
    for(int i=0;i<pathCount;i++){
        Assert.assertEquals("error",expResult[i],results[i]);
    }
//TODO: Test goes here... 
} 

/** 
* 
* Method: IsTxtFormat(String path) 
* 
*/ 
@Test
public void testIsTxtFormat() throws Exception { 
//TODO: Test goes here...
    String pathes[]={".txt",". txt"," .txt",""," ",".doc"};
    boolean[] expResult={true,false,true,false,false,false};
    int pathCount=pathes.length;
    boolean [] results=new boolean[pathCount];
    for(int i=0;i<pathCount;i++){
        results[i]= InputMod.IsTxtFormat(pathes[i]);
    }
    for(int i=0;i<pathCount;i++){
        Assert.assertEquals("error",expResult[i],results[i]);
    }
} 

/** 
* 
* Method: IsAbsolutePath(String path) 
* 
*/ 
//@Test
//public void testIsAbsolutePath() throws Exception {
////TODO: Test goes here...
//}
//
///**
//*
//* Method: ShowWordTable()
//*
//*/
//@Test
//public void testShowWordTable() throws Exception {
////TODO: Test goes here...
//}


} 
