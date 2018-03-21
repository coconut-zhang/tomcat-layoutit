package com.ariix.myTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapReduce {

	public static void main(String[] args) {
		//readLog();
		
		List<String> l1 = new MapReduce().readLogToList("C:\\Users\\arlo.zhang\\Desktop\\localhost_access_log.2017-04-04.txt");
		List<String> l2 = new MapReduce().readLogToList("C:\\Users\\arlo.zhang\\Desktop\\localhost_access_log.2017-04-04_210.txt");
		List l = new MapReduce().diff(l1,l2);
		writeLogList(l);
	}
	
	public static String readLog()
    {
        StringBuffer sb=new StringBuffer();
        String tempstr=null;
        Map<String, Integer> map = new TreeMap<String,Integer>();
        try
        {
            String path="C:\\Users\\arlo.zhang\\Desktop\\localhost_access_log.2017-04-04.txt";
            File file=new File(path);
            if(!file.exists())
                throw new FileNotFoundException();
            FileInputStream fis=new FileInputStream(file);
            BufferedReader br=new BufferedReader(new InputStreamReader(fis));
            while((tempstr=br.readLine())!=null){
            	int index1 = tempstr.indexOf("/Online");
            	int index2 = tempstr.indexOf("HTTP");
            	String url = tempstr.substring(index1, index2 -1);
            	if(url.contains("?")){
            		url = url.substring(0,url.indexOf("?"));
            	}
            	
            	if(url.contains("static")){
            		url = url.substring(0,url.indexOf("static") + 7);
            	}
            	if(map.get(url) == null){
            		map.put(url, 1);
            	}else{
            		int val = map.get(url);
            		map.put(url, val + 1);
            	}
            }
            List<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(map.entrySet());
            
            Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {
                public int compare(Entry<String, Integer> o1,Entry<String, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }

                
            });
            
            for(String key: map.keySet()){
            	System.out.println(key);
            	System.out.println(map.get(key));
            }
            
            writeLogEntry(list);

        	//writeLog(map);

        }
        catch(IOException ex)
        {
            System.out.println(ex.getStackTrace());
        }
        return sb.toString();
    }

	public  List<String> readLogToList(String path){
		List<String> list = new ArrayList<String>();
		String tempstr=null;
        try
        {
            File file=new File(path);
            if(!file.exists())
                throw new FileNotFoundException();
            FileInputStream fis=new FileInputStream(file);
            BufferedReader br=new BufferedReader(new InputStreamReader(fis));
            while((tempstr=br.readLine())!=null){
            	int index1 = tempstr.indexOf("/Online");
            	int index2 = tempstr.indexOf("HTTP");
            	String url = tempstr.substring(index1, index2 -1);
            	if(url.contains("?")){
            		url = url.substring(0,url.indexOf("?"));
            	}
            	
            	if(url.contains("static")){
            		url = url.substring(0,url.indexOf("static") + 7);
            	}
            	if(!list.contains(url)){
                	list.add(url);
            	}

            }
        }catch(Exception e){
        	e.printStackTrace();
        }
        return list;
	}
	
	 public static void writeLog(Map<String,Integer> map){
	        try
	        {
	        String path="C:\\Users\\arlo.zhang\\Desktop\\210.txt";
	        File file=new File(path);
	        if(!file.exists())
	            file.createNewFile();
	        FileOutputStream out=new FileOutputStream(file,false);       
	        StringBuffer sb=new StringBuffer();
	        for(String key : map.keySet()){
	        	out.write(key.getBytes("utf-8"));
	        	out.write(",".getBytes("utf-8"));
	        	out.write((map.get(key).toString()+"\n").getBytes("utf-8"));
	        }
	        out.close();
	        }
	        catch(IOException ex)
	        {
	            System.out.println(ex.getStackTrace());
	        }
	 }
	 
	 public static void writeLogEntry(List<Map.Entry<String, Integer>> list){
	        try
	        {
	        String path="C:\\Users\\arlo.zhang\\Desktop\\220_test.txt";
	        File file=new File(path);
	        if(!file.exists())
	            file.createNewFile();
	        FileOutputStream out=new FileOutputStream(file,false);
	        StringBuffer sb=new StringBuffer();
	        for(Map.Entry<String, Integer> map : list){
	        	out.write(map.getKey().getBytes("utf-8"));
	        	out.write(",".getBytes("utf-8"));
	        	out.write((map.getValue().toString()+"\n").getBytes("utf-8"));
	        }
	        out.close();
	        }
	        catch(IOException ex)
	        {
	            System.out.println(ex.getStackTrace());
	        }
	 }
	 
	 public static void writeLogList(List<String> list){
	        try
	        {
	        String path="C:\\Users\\arlo.zhang\\Desktop\\diff.txt";
	        File file=new File(path);
	        if(!file.exists())
	            file.createNewFile();
	        FileOutputStream out=new FileOutputStream(file,false);
	        StringBuffer sb=new StringBuffer();
	        for(String s : list){
	        	out.write((s.toString()+"\n").getBytes("utf-8"));
	        }
	        out.close();
	        }
	        catch(IOException ex)
	        {
	            System.out.println(ex.getStackTrace());
	        }
	 }
	 
	public List intersect(List ls, List ls2) {
		List list = new ArrayList(Arrays.asList(new Object[ls.size()]));
		Collections.copy(list, ls);
		list.retainAll(ls2);
		return list;
	}

	public List union(List ls, List ls2) {
		List list = new ArrayList(Arrays.asList(new Object[ls.size()]));
		Collections.copy(list, ls);
		list.addAll(ls2);
		return list;
	}

	public List diff(List ls, List ls2) {
		List list = new ArrayList(Arrays.asList(new Object[ls.size()]));
		Collections.copy(list, ls);
		list.removeAll(ls2);
		return list;
	}

}
