/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intership.iostreamstest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.Buffer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oom
 */
public class InputStreamsReader {
    public static void main(String[] args) throws IOException {
        InputStream inputstream = null;
        Reader reader = null;
        try {
            inputstream = new FileInputStream("C:/Users/oom/Desktop/Test/input.txt");
            reader = new InputStreamReader(inputstream);
            int index;
            while((index = reader.read()) != -1){
                System.out.println(" index = " + (char)index);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InputStreamsReader.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(inputstream != null){
                inputstream.close();
            }
            if(reader != null){
                reader.close();
            }
        }
    }
    
}
