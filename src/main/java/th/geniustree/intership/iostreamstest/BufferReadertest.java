/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intership.iostreamstest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oom
 */
public class BufferReadertest {
    public static void main(String[] args) throws IOException {
        Reader reader = null;
        BufferedReader buffer = null;
        try {
            reader = new FileReader("C:/Users/oom/Desktop/Test/input.txt");
            buffer = new BufferedReader(reader);
            String index;
            while((index = buffer.readLine()) != null){
                System.out.println("print = " + index);
            }
        
        }finally{
            if(reader != null){
                reader.close();
            }
            if (buffer != null) {
                buffer.close();
            }
        }
        
    }
    
}
