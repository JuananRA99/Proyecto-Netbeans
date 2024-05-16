/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;
import org.json.JSONObject;


/**
 *
 * @author Juan Antonio
 */
public class JSON {
    public int indicesGrado= 0;
      public static void main(String[] args) {
       
        try {
            // Lee el JSON
     String obj = new String(Files.readAllBytes(Paths.get("C:\\Users\\Juan Antonio\\Downloads\\BaseDeDatos.json")));

            // Convierte el String a un objeto JSON
            JSONObject jsonObject = new JSONObject(obj);
            System.out.println("Lee " + jsonObject);

            // Accede al array de los grados
            JSONArray grados = jsonObject.getJSONArray("grados");

            // Itera sobre de grados
            for (int i = 0; i < grados.length(); i++) {
                JSONObject grado = grados.getJSONObject(i);
                String nombre = grado.getString("nombre");
                System.out.println("Nombre del grado: " + nombre);

                JSONArray juegos = grado.getJSONArray("juegos");
                // Itera sobre los juegos
                for (int j = 0; j < juegos.length(); j++) {
                    JSONObject juego = juegos.getJSONObject(j);
                    String titulo = juego.getString("titulo");
                    String descripcion = juego.getString("descripcion");
                    // Leer los datos del juego
                    System.out.println("Título: " + titulo);
                    System.out.println("Descripción: " + descripcion);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
