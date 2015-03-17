/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intership.iostreamstest;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oom
 */
public class WriterStreamstest {

    public static void main(String[] args) throws IOException {
        Writer writer = null;
        try {
            writer = new FileWriter("C:/Users/oom/Desktop/Test/Oum.txt");
            writer.append("Naiyanet");
            System.out.println(writer);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
