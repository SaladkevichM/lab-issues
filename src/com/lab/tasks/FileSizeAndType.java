package com.lab.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FileSizeAndType {
        
    public enum Type {        
        MUSIC, 
        VIDEO, 
        IMAGE,         
        OTHER;   
        
        public static String music = "mp3,ace,wav,flac";
        public static String video = "mp4,avi,mov,mkv";
        public static String image = "bmp,jpeg,gif,tiff";             
    }
        
    public static Type getType(String ext) {                        
        if(Type.music.indexOf(ext) != -1) {
            return Type.MUSIC; 
        }
        if(Type.video.indexOf(ext) != -1) {
            return Type.VIDEO;
        }
        if(Type.image.indexOf(ext) != -1) {
            return Type.IMAGE;            
        }        
        return Type.OTHER;
    } 
    
    public static String getExt(String filename) {                
        return filename.substring(filename.lastIndexOf(".") + 1, filename.length());        
    }    
    
    public static Long getSize(String sizeString) {
        return Long.valueOf(sizeString.substring(0, sizeString.length() - 1));          
    }
    
    public static Map<Type, Long> getInfoByStrings(String info) {         
        Map<Type, Long> map = new HashMap<>();
        String[] lines = info.split(System.lineSeparator());                       
        for(String line : lines) {
            
            String[] parts = line.split("_");            
            String ext = getExt(parts[0]);
            Long size = getSize(parts[1]);
            
            Type type = getType(ext);            
            if(map.get(type) != null) {
                Long storedSize = map.get(type);
                storedSize += size;
                map.put(type, storedSize);
            } else {
                map.put(type, size);
            }            
        }        
        return map;        
    }
    
    public static void main(String[] args) {
                
        String inputText = "qwerty1.exe_123b" + System.lineSeparator();      
        inputText += "qwerty2.txt_111b" + System.lineSeparator();
        inputText += "qwerty2.mp3_98b" + System.lineSeparator();
        inputText += "qwerty3.ace_32b" + System.lineSeparator();
        inputText += "qwerty4.avi_32b" + System.lineSeparator();
        inputText += "qwerty44.avi_32b" + System.lineSeparator();
        inputText += "qwerty6.mp4_32b" + System.lineSeparator();
        inputText += "qwerty65.bmp_32b" + System.lineSeparator();
        
        Map<Type, Long> info = getInfoByStrings(inputText);
        for(Entry<Type, Long> entry : info.entrySet()) {
            System.out.print(entry.getKey() + " : " + entry.getValue());
            System.out.println();
        }
        
    }

}
