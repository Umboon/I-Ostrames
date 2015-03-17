/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intership.iostreamstest;

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
public class ReaderStreamstest {
    public static void main(String[] args) throws IOException {
        Reader reader = null;
        try {
            reader = new FileReader("C:/Users/oom/Desktop/Test/Um.txt");
            int index ;
            while((index = reader.read()) != -1){
                System.out.println("Reader = " + (char)index);
            }
        } 
        finally{
            if(reader != null){
                reader.close();
            }
        }
    }
    
}
