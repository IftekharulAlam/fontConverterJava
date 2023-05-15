/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject.BasePackage;

import java.io.BufferedWriter;
import java.io.File;

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

}
