/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import constantes.RequestJson;
import constantes.UtilitiesFunctions;
import estructural.Matricula;
import java.util.Date;

/**
 *
 * @author Estudiantes
 */
public class PruebasJson {
    
    
    public static void main(String[] args){
        
        String peti = RequestJson.recibirPeticion("http://localhost:7101/ProyectoServiciosWeb/resources/serviciosWebMatricula/darMatriculaCodigo?codigo=33", "GET");
        Matricula er = new Matricula();
        er.setCodigo(1);
        er.setEstado(1);
        er.setFechaFinal("2020-09-30T05:00:00-05:00");
        er.setFechaInicio("2020-09-30T05:00:00-05:00");
        er.setFechaInscripcion("2020-09-30T05:00:00-05:00");
        er.setNotaDefinitiva(2.0);
        er.setPkEstudiante("111");
        er.setPkMateria(1);
        System.out.println(""+ er.toJSON());
        
        RequestJson.sendRequest(er.toJSON(), "");
        
//JSONParser parser = new JSONParser(peti, null, true)
        
        /*try {
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
        
    }*/
    }
}
