package practica1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erica Dubon
 */
public class Practica1 {
    
    //variables
private static Scanner input;
private static Formatter  output ;
private static int numero;
private static int numero1;
//variables de modificacion
private static Scanner inputLlave;
private static int llave;
//variable para buscar la llave 
private static Scanner inputllave;

    /**
     * @param args the command line arguments
     */
    
      private static int op1,op2,op3,op4,op5,op6;
      
    public static void main(String[] args) {
        Scanner proce=new Scanner (System.in);
        System.out.println("1) Crear dispositivo");
        System.out.println("2) Administrar dispositivo");
        System.out.println("3) Acciones con dispositivos");
        System.out.println("4) Acciones externas del dispositivo");
        System.out.println("5) Carga masiva");
        System.out.println("6) Logs");
        System.out.println(" ");
        System.out.println("Seleccione la opcion a ejecutar:");
        
         op1=proce.nextInt();
         
          switch(op1){ 
            case 1:
                System.out.println("\t  Crear dispositivo");
                 System.out.println("1.1) Computadora portatil");
                 System.out.println("1.2) Tablet");
                 System.out.println("1.3) SmartWatch");
                 System.out.println("1.4) SmartPhone");
                 System.out.println("1.5) Aurticulares inalambricos");
                 System.out.println("Selecciones tipo de dispositivo a crear:");
               op2=proce.nextInt();
               switch(op2){ 
                   case 1:
                        //3 pasos para escribir un archivo
                       abrirArchivo();
                       escribirArchivo();
                       cerrarArchivo();
                    break; 
                   case 2:
                       abrirArchivo2();
                       escribirArchivo2();
                       cerrarArchivo2();
                    break;
                   case 3:
                       abrirArchivo3();
                       escribirArchivo3();
                       cerrarArchivo3();
                    break;
                   case 4:
                       abrirArchivo4();
                       escribirArchivo4();
                       cerrarArchivo4();
                    break;
                   case 5:
                       abrirArchivo5();
                       escribirArchivo5();
                       cerrarArchivo5();
                    break;
               }
            break;
          
          
          
       
            case 2:
                System.out.println("\t Administrar dispositivo");
                 System.out.println("2.1) Computadora portatil");
                 System.out.println("2.2) Tablet");
                 System.out.println("2.3) SmartWatch");
                 System.out.println("2.3) SmartPhone");
                 System.out.println("2.4) Aurticulares inalambricos");
                 System.out.println("Selecciones tipo de dispositivo a administrar:");
                op3=proce.nextInt();
                switch(op3){
                    case 1:
                        
                        
                        break;
                }
                
            break;
         
          
         
            case 3:
                System.out.println("\t Acciones dw dispositivo");
                 System.out.println("3.1) Computadora portatil");
                 System.out.println("3.2) Tablet");
                 System.out.println("3.3) SmartWatch");
                 System.out.println("3.3) SmartPhone");
                 System.out.println("3.4) Aurticulares inalambricos");
                 System.out.println("Selecciones tipo de a un tipo de dispocitivo:");
                op4=proce.nextInt();            
            break; 
         
          
          
         
            case 4:
                System.out.println("\t Acciones externas del dispositivo");
                System.out.println("Seleccione el tipo de accion a realizar");
                System.out.println("4.1) Llamada telefonica");
                System.out.println("4.2) Mensaje");
                System.out.println("4.3) Notificacion");
                System.out.println("Seleccione accion a realizar:");
                
                op5=proce.nextInt();            
            break;
          
          
          
       
            case 5:
                System.out.println("\t Carga masiva");
                
                
                op6=proce.nextInt();            
            break;
        
          
          
        
            case 6:
                System.out.println("\t Logs");
                
                           
            break;
        
          
     }      
   }
    
    
    
    
    
    
    //Crear dispositivo
//Block de computadora
public static  void abrirArchivo(){
        try {
             output = new Formatter("dispositivo.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Error al abrir el archivo.");
            System.exit(1);
        }
        catch (SecurityException securityException){
            System.out.println("Permiso de escritura no otorgada.");
            System.exit(1);
        }
    }


public static void escribirArchivo(){
            Scanner input= new Scanner(System.in);
            
            String pregunta ="si";
            while(pregunta.equals("si")){
            try{
            System.out.println("Ingrese los siguientes Datos");
            System.out.println("Correo ");
            output.format("%s ",input.next());
            System.out.println("Nombre dispositivo ");
            output.format("%s ",input.next());
            System.out.println("Visible para coneccion ");
            output.format("%s ",input.next());
            System.out.println("Estado de dispositivo");
            output.format("%s ",input.next());
            
            System.out.println("Ingrese cualquier tecla para salir");
                        pregunta = input.next();
            
                }
       
                catch (FormatterClosedException formatterClosedException){
                    System.err.println("Error al escribir archivo");
                    
                }
                catch (NoSuchElementException elementException){
                    System.err.println("Entrada no la valida");
                    input.nextLine();
                    
                }
                }
            
}
        public static void cerrarArchivo(){
            if(output != null){
                output.close();
            }    
  
    }
        
        
         
    //Crear dispositivo
//Block de Tablet
public static  void abrirArchivo2(){
        try {
             output = new Formatter("dispositivo.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Error al abrir el archivo.");
            System.exit(1);
        }
        catch (SecurityException securityException){
            System.out.println("Permiso de escritura no otorgada.");
            System.exit(1);
        }
    }


public static void escribirArchivo2(){
            Scanner input= new Scanner(System.in);
            
            String pregunta ="si";
            while(pregunta.equals("si")){
            try{
            System.out.println("Ingrese los siguientes Datos");
            System.out.println("Correo ");
            output.format("%s ",input.next());
            System.out.println("Nombre dispositivo ");
            output.format("%s ",input.next());
            System.out.println("Visible para coneccion ");
            output.format("%s ",input.next());
            System.out.println("Estado de dispositivo");
            output.format("%s ",input.next());
            
            System.out.println("Ingrese cualquier tecla para salir");
                        pregunta = input.next();
            
                }
       
                catch (FormatterClosedException formatterClosedException){
                    System.err.println("Error al escribir archivo");
                    
                }
                catch (NoSuchElementException elementException){
                    System.err.println("Entrada no la valida");
                    input.nextLine();
                    
                }
                }
            
}
        public static void cerrarArchivo2(){
            if(output != null){
                output.close();
            }    
  
    }
        
             
   
        
        
        
        
         //Crear dispositivo
//Block de SmartWatch
public static  void abrirArchivo3(){
        try {
             output = new Formatter("dispositivo.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Error al abrir el archivo.");
            System.exit(1);
        }
        catch (SecurityException securityException){
            System.out.println("Permiso de escritura no otorgada.");
            System.exit(1);
        }
    }


public static void escribirArchivo3(){
            Scanner input= new Scanner(System.in);
            
            String pregunta ="si";
            while(pregunta.equals("si")){
            try{
            System.out.println("Ingrese los siguientes Datos");
            System.out.println("Correo ");
            output.format("%s ",input.next());
            System.out.println("Nombre dispositivo ");
            output.format("%s ",input.next());
            System.out.println("Visible para coneccion ");
            output.format("%s ",input.next());
            System.out.println("Estado de dispositivo");
            output.format("%s ",input.next());
            
            System.out.println("Ingrese cualquier tecla para salir");
                        pregunta = input.next();
            
                }
       
                catch (FormatterClosedException formatterClosedException){
                    System.err.println("Error al escribir archivo");
                    
                }
                catch (NoSuchElementException elementException){
                    System.err.println("Entrada no la valida");
                    input.nextLine();
                    
                }
                }
            
}
        public static void cerrarArchivo3(){
            if(output != null){
                output.close();
            }    
  
    }
        
        
        
        
        
        
         //Crear dispositivo
//Block de SmartPhone
public static  void abrirArchivo4(){
        try {
             output = new Formatter("dispositivo.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Error al abrir el archivo.");
            System.exit(1);
        }
        catch (SecurityException securityException){
            System.out.println("Permiso de escritura no otorgada.");
            System.exit(1);
        }
    }


public static void escribirArchivo4(){
            Scanner input= new Scanner(System.in);
            
            String pregunta ="si";
            while(pregunta.equals("si")){
            try{
            System.out.println("Ingrese los siguientes Datos");
            System.out.println("Correo ");
            output.format("%s ",input.next());
            System.out.println("Nombre dispositivo ");
            output.format("%s ",input.next());
            System.out.println("Visible para coneccion ");
            output.format("%s ",input.next());
            System.out.println("Estado de dispositivo");
            output.format("%s ",input.next());
            
            System.out.println("Ingrese cualquier tecla para salir");
                        pregunta = input.next();
            
                }
       
                catch (FormatterClosedException formatterClosedException){
                    System.err.println("Error al escribir archivo");
                    
                }
                catch (NoSuchElementException elementException){
                    System.err.println("Entrada no la valida");
                    input.nextLine();
                    
                }
                }
            
}
        public static void cerrarArchivo4(){
            if(output != null){
                output.close();
            }    
  
    }
        
        
        
        
         //Crear dispositivo
//Block de Auriculares
public static  void abrirArchivo5(){
        try {
             output = new Formatter("dispositivo.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Error al abrir el archivo.");
            System.exit(1);
        }
        catch (SecurityException securityException){
            System.out.println("Permiso de escritura no otorgada.");
            System.exit(1);
        }
    }


public static void escribirArchivo5(){
            Scanner input= new Scanner(System.in);
            
            String pregunta ="si";
            while(pregunta.equals("si")){
            try{
            System.out.println("Ingrese los siguientes Datos");
            System.out.println("Correo ");
            output.format("%s ",input.next());
            System.out.println("Nombre dispositivo ");
            output.format("%s ",input.next());
            System.out.println("Visible para coneccion ");
            output.format("%s ",input.next());
            System.out.println("Estado de dispositivo");
            output.format("%s ",input.next());
            
            System.out.println("Ingrese cualquier tecla para salir");
                        pregunta = input.next();
            
                }
       
                catch (FormatterClosedException formatterClosedException){
                    System.err.println("Error al escribir archivo");
                    
                }
                catch (NoSuchElementException elementException){
                    System.err.println("Entrada no la valida");
                    input.nextLine();
                    
                }
                }
            
}
        public static void cerrarArchivo5(){
            if(output != null){
                output.close();
            }    
  
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
