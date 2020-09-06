/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.json.simple.JSONObject;
import sun.net.www.http.HttpClient;

/**
 *
 * @author Estudiantes
 */
public class PruebasJson {
    
    
    public static void main(String[] args){
        
        try {
            JSONObject obj = new JSONObject();
            obj.put("codigo", "" + new Integer(1));
            obj.put("estado", "" + new Integer(1));
            obj.put("fechaFinal", "2020-09-29T00:00:00-05:00");
            obj.put("fechaInicio", "2020-09-06T00:00:00-05:00");
            obj.put("fechaInscripcion", "2020-09-05T00:00:00-05:00");
            obj.put("notaDefinitiva", ""+new Double(4.0));
            obj.put("pkEstudiante", ""+new Integer(222));
            obj.put("pkMateria", ""+new Integer(3));
            System.out.print(obj);
            
            

            URL url = new URL("http://192.168.16.12:7101/ProyectoServiciosWeb/resources/serviciosWebMatricula/matricularEstudiante");
            
            byte[] postDataBytes = obj.toJSONString().getBytes("utf-8");
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            System.out.println("CONEXÓN REALIZADA");
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json; utf-8");
            conn.setDoOutput(true);
            
            
            conn.getOutputStream().write(postDataBytes);
            conn.getOutputStream().flush();
            
            System.out.println("JSON ENVIADO");
            

        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
               ex.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        
    }
}
