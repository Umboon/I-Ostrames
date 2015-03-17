/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intership.iostreamstest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oom
 */
public class InputStreamstest {
    public static void main(String[] args) throws IOException {
        InputStream inputstream = null;
        try {
            inputstream = new FileInputStream("C:/Users/oom/Desktop/Test/input.txt");
            byte[] b = new byte[1024];
            int index;
            while((index = inputstream.read(b)) != -1){
                System.out.println(" input " + index);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InputStreamstest.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(inputstream != null){
                inputstream.close();
            }
        }
    }
    
    
}
