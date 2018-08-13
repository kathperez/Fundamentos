/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareacinco.jsonreader;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author kathperez
 */
public class jsonreader {
     public boolean Reader(String user, String password) throws ParseException {
        JSONParser prsr = new JSONParser();
        boolean valid = false;

        try {

            Object obj = prsr.parse(new FileReader("C:\\Users\\kath\\Desktop\\TareaCinco\\src\\users.json"));

            JSONObject jsonObject = (JSONObject) obj;

            String name = (String) jsonObject.get(user);
            if (name != null && name == password ) {
                valid = true;
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se pudo abrir el archivo");
        }

        return valid;
    }
}
