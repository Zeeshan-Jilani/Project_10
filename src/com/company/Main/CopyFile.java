package com.company.Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {

        int bajt;
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            fis = new FileInputStream("test123.txt");
            fos = new FileOutputStream("copyofTest.txt");

            do{
                bajt = fis.read();
                if(bajt != -1) fos.write(bajt);
            } while(bajt != -1);

        } catch (IOException e){
            System.out.println("Error I/O: " + e);
        } finally {
            try{
                if(fis != null) fis.close();
            } catch (IOException e){
                System.out.println("Error Closing Input File");
            }
            try{
                if(fos != null) fos.close();
            } catch (IOException e){
                System.out.println("Error Closing Output File");
            }
        }
    }
}
