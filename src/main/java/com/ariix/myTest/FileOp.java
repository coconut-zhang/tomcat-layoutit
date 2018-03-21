package com.ariix.myTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class FileOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readLog();
	}
	
	public static String readLog()
    {
        StringBuffer sb=new StringBuffer();
        String tempstr=null;
        Map<String, Integer> map = new TreeMap<String,Integer>();
        try
        {
            String path="C:\\Users\\arlo.zhang\\Desktop\\pcode.txt";
            File file=new File(path);
            if(!file.exists())
                throw new FileNotFoundException();
            FileInputStream fis=new FileInputStream(file);
            BufferedReader br=new BufferedReader(new InputStreamReader(fis));
            while((tempstr=br.readLine())!=null){
            	int index1 = tempstr.indexOf("(");
            	int index2 = tempstr.indexOf(",");
            	String url = tempstr.substring(index1 + 2, index2 -1);
            	//System.out.println(url);
            	//System.out.println(tempstr);
            	String ss = tempstr.replaceAll("00", url) + ",";
            	System.out.println(ss);
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex.getStackTrace());
        }
        return sb.toString();
    }

}
