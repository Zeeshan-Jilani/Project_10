package com.company.Main;

import java.io.*;

class T4{
    String FullNameZeeshan56855 ;
    void readDataZeeshan56855() throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter Your Full Name");
        FullNameZeeshan56855=rd.readLine();
    }
    void WriteDataToFileZeeshan56855(){
        try(FileWriter fr = new FileWriter("ZeeshanJilani.txt")) {
            fr.write(FullNameZeeshan56855);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void ReadDataFromFileZeeshan56855(){
        String result;
        try(BufferedReader br = new BufferedReader(new FileReader("ZeeshanJilani.txt"))) {
            while((result=br.readLine()) !=null){
                System.out.println(result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

public class DataManagement {
    public static void main(String []args) throws IOException {
        DataManagement obj = new DataManagement();
        //obj.readDataZeeshan56855();
        //obj.WriteDataToFileZeeshan56855();
        //System.out.println("--------------------------------------------------");
        //obj.ReadDataFromFileZeeshan56855();
    }

}

