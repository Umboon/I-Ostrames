/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intership.iostreamstest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author oom
 */
public class Outputstreamstest {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        InputStream inputStream =null;
        OutputStream outputStream = null;
        try{
        inputStream = new FileInputStream("C:/Users/oom/Desktop/Test/input.txt");
        outputStream = new FileOutputStream("C:/Users/oom/Desktop/Test/output.txt");
        byte[] b = new byte[1024];
        int index;
        while((index = inputStream.read(b)) != -1){
            System.out.println("input = " + index);
            outputStream.write(b, 0, index);
        }
        }finally{
            if(inputStream != null){
                inputStream.close();
            }
            if(outputStream != null){
                outputStream.close();
            }
        }
    }
    
}
