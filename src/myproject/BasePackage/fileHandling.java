/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject.BasePackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Iftekharul Alam
 */
public class fileHandling {

    public void DataSave(String data, File file) {

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {

            fw = new FileWriter(file, true);;

        } catch (Exception ex) {

        }

        bw = new BufferedWriter(fw);

        try {
            bw.write(data);
            bw.write("\n");
        } catch (IOException ex) {

        } finally {
            try {
                bw.close();

            } catch (Exception ex) {

            }
        }

    }

    public String DataRead(File file) {
        String s = "";

        FileReader fr = null;
        BufferedReader br = null;

        try {

            fr = new FileReader(file);;

        } catch (Exception ex) {

        }

        br = new BufferedReader(fr);

        try {
            s = br.readLine();

        } catch (IOException ex) {

        } finally {

            try {
                br.close();

            } catch (Exception ex) {

            }
        }
        return s;

    }

}
