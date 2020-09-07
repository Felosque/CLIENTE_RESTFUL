/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constantes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Estudiantes
 */
public class RequestJson {

    public static final String POST = "POST";
    public static final String GET = "GET";
    public static final String PUT = "PUT";
    public static final String DELETE = "DELETE";
    
    public static int sendRequest(String obj, String pUrl, String pMethod){
            
        try {
            URL url = new URL(pUrl);
            
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            System.out.println("CONEXÓN REALIZADA");
            conn.setRequestMethod(pMethod);
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            conn.setRequestProperty("Accept", "application/json");
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            if(obj != null){
                wr.write(obj);
            }
            wr.flush();
            System.out.println("JSON ENVIADO");
            
            StringBuilder sb = new StringBuilder();  
            int httpResult = conn.getResponseCode(); 
            if (httpResult == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(conn.getInputStream(), "utf-8"));
                String line = null;  
                while ((line = br.readLine()) != null) {  
                    sb.append(line + "\n");  
                }
                br.close();
                System.out.println("" + sb.toString());  
            } else {
                System.out.println(conn.getResponseMessage());  
            } 
            return httpResult;
           
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
               ex.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return -1;
    } 
    
    
    public static String recibirPeticion(String pUrl, String pMethod){
        
        try{
            URL url = new URL(pUrl);
            
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            System.out.println("CONEXÓN REALIZADA");
            conn.setRequestMethod(pMethod);
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            conn.setRequestProperty("Accept", "application/json");
            conn.setDoOutput(true);
            
            StringBuilder sb = new StringBuilder();  
            int HttpResult = conn.getResponseCode(); 
            if (HttpResult == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(conn.getInputStream(), "utf-8"));
                String line = null;  
                while ((line = br.readLine()) != null) {  
                    sb.append(line + "\n");  
                }
                br.close();
                System.out.println("" + sb.toString());
                return sb.toString();
            } else {
                System.out.println(conn.getResponseMessage());  
            }  
            

        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
               ex.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        
        return null;
    }
    
    
}
