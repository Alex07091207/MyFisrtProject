package ensayo;


import Recursos.Base;
import Recursos.Categorias;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

        

public class EFT_S9_Alexander_Augusto_Diaz_Hernandez {

    static String resumen= "Boleta";
    static String nombreTeatro = "TEATRO MORO";
    static int precioBase = 5000;
    static void comprarEntradasAdicionales(){
        System.out.println("Si desea comprar mas entradas seleccione nuevamente opción 1");
    }
    static void mostrarOpciones(){ //Declaro metodo para no repetir el menu repetidas veces a lo largo del código.
        System.out.println("============================");
        System.out.println("Seleccione su opción: \n1. Reserva de entradas \n2. Elección de tarifa \n3. Modificacion de reservas\n4. Confirmar compra \n5. Boleta y salir");
        System.out.println("============================");
    }
    static void posiciones(){ //Declaro metodo de posiciones.
        String[] posicion={"0","1","2","3","4"};
        System.out.println(Arrays.toString(posicion));
        System.out.println("Asientos en \"D\" estan disponibles. Asientos con letra \"O\" estan ocupados");
    }
public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
    //Entrada
        //Declaro variables locales
      int entradaMujer=0;
      int entradaNino=0;
      int entradaEstudiante=0;
      int entradaGeneral=0;
      int entradasAM=0;
      int totalEntradas=0;
      int entradaVIP=0;
      int entradaPlateaBaja=0, entradaPlateaAlta=0, entradaPALCOS=0, entradaGaleria=0;
      int confirmar=0;
      int tarifa=0;
      int edad=0;
      int posicion=0;
      String nombre;
      double IDcompra;
      double IDcliente;
      List<Integer>estudiantes=new ArrayList<>();
      List<Integer>adultoMayor=new ArrayList<>();
      List<Integer>mujer = new ArrayList<>();
      List<Integer>ninos = new ArrayList<>();
      List<String> nombres = new ArrayList<>();
      List<Integer> IDclientes = new ArrayList<>();
      List<Integer> numeroCompra = new ArrayList<>();
      List<Integer> entradaVip = new ArrayList<>();
      List<Integer> entradasPlateaBaja = new ArrayList<>();
      List<Integer> entradasPlateaAlta = new ArrayList<>();
      List<Integer> entradasGaleria = new ArrayList<>();
      List<Integer> entradaPalcos = new ArrayList<>();
      List<Integer> publicoGeneral = new ArrayList<>();
      int ubicacion=0;
      
      int opcion = 0; 
      /*Acá declaro mis arreglos de las ubicaciones del teatro
      */
      String[]Vip = {"D","D","D","D","D"};
      String[]PlateaBaja = {"D","D","D","D","D"};
      String[]PlateaAlta = {"D","D","D","D","D"};
      String[]Palcos = {"D","D","D","D","D"};
      String[]Galeria = {"D","D","D","D","D"};
      System.out.println("==========================");
      System.out.println("Bienvenido a "+nombreTeatro);
      System.out.println("Nuestra capacidad total es de 5 asientos por ubicación:\n5 asientos VIP.\n5 asientos Platea Baja.\n5 asientos Platea Alta.\n5. asientos Palcos.\n5. asientos en Galeria   ");
      System.out.println("Precio pase de entrada: 5000");
      System.out.println("==========================");
      System.out.println("");
      mostrarOpciones();
      opcion = scanner.nextInt();
      while (opcion<=5) {
      switch (opcion){
        case 1 -> {  //Acá el cliente escoge que ubicación desea, mostrandose el plano de la ubicación correspondiente.
            System.out.println("===================================================================================================================================");
            System.out.println("Escriba la ubicación la ubicación del asiento que desea comprar: \n1. VIP.\n2. Platea Alta.\n3. Platea Baja.\n4. Palcos\n5. Galeria");//Escriba la ubicación 
            ubicacion=scanner.nextInt();
            System.out.println("====================================================================================================================================");
            System.out.println("Ingrese la posición del asiento que desea reservar");
            switch (ubicacion){
                /*
                Notese que las posiciones apareceran siempre abajo del plano de asientos para que el usuario tenga claridad de cual
                posición ingresar según su preferencia. Aparte, el asiento cambiara automaticamente a ocupado, por lo que no podrá volverlo
                a ocupar, a no ser que vaya a la opción 3 y libere el asiento.
                */
                case 1:
                    System.out.println(Arrays.toString(Vip));
                    posiciones();
                    posicion = scanner.nextInt();
                    if(Vip[posicion]=="D"){
                        System.out.println("======================");
                        System.out.println("Asiento reservado");
                        totalEntradas++; //break point para verificar que aumente el contador
                        entradaVIP++; // break point
                        Vip[posicion]="O"; // break point. Acá es donde el asiento cambia de "D" a "O".
                        System.out.println("======================");
                        System.out.println("Plano actual");
                        System.out.println(Arrays.toString(Vip));//Muestro como quedaría el plano de asientos, para que se pueda evidenciar
                        comprarEntradasAdicionales();                // que efectivamente el asiento se reservó.
                        mostrarOpciones(); 
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("Asiento ocupado");
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;
                    
                case 2:
                    System.out.println(Arrays.toString(PlateaBaja));
                    posiciones();
                    posicion = scanner.nextInt();
                     if(PlateaBaja[posicion]=="D"){
                        System.out.println("======================");
                        System.out.println("Asiento reservdo");
                        System.out.println("======================");
                        totalEntradas++;
                        entradaPlateaBaja++;
                        PlateaBaja[posicion]="O";
                        System.out.println("======================");
                        System.out.println("Plano actual");
                        System.out.println(Arrays.toString(PlateaBaja));
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("======================");
                        System.out.println("Asiento ocupado");
                        System.out.println("======================");
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;
                    
                case 3:
                    System.out.println(Arrays.toString(PlateaAlta));
                    posiciones();
                    posicion = scanner.nextInt();
                     if(PlateaAlta [posicion]=="D"){
                        System.out.println("======================");
                        System.out.println("Asiento reservado");
                        totalEntradas++;
                        entradaPlateaAlta++;
                        PlateaAlta[posicion]="O";
                        System.out.println("======================");
                        System.out.println("Plano actual");
                        System.out.println(Arrays.toString(Palcos));
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("======================");
                        System.out.println("Asiento ocupado");
                        System.out.println("======================");
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                     break;
                case 4:
                    System.out.println(Arrays.toString(Palcos));
                    posiciones();
                    posicion = scanner.nextInt();
                     if(Palcos [posicion]=="D"){
                        System.out.println("======================");
                        System.out.println("Asiento reservado");
                        totalEntradas++;
                        entradaPALCOS++;
                        Palcos[posicion]="O";
                        System.out.println("======================");
                        System.out.println("Plano actual");
                        System.out.println(Arrays.toString(Palcos));
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("======================");
                        System.out.println("Asiento ocupado");
                        System.out.println("======================");
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                     break;
                case 5:
                    System.out.println(Arrays.toString(Galeria));
                    posiciones();
                    posicion = scanner.nextInt();
                    if(Galeria [posicion]=="D"){
                        System.out.println("======================");
                        System.out.println("Asiento reservado");
                        totalEntradas++;
                        entradaGaleria++;
                        Galeria[posicion]="O";
                        System.out.println("======================");
                        System.out.println("Plano actual");
                        System.out.println(Arrays.toString(Palcos));
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("======================");
                        System.out.println("Asiento ocupado");
                        System.out.println("======================");
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                    
            }
                  
        }
        
        case 2 -> { /*
            En esta opción, el usuario tiene la opción de elegir su tarifa segun si es mujer, niño, adulto mayor o estudiante. Si no es ninguna de las anteriores. Debera
            seleccionar opcion 2 y escribir "n"*/
            System.out.println("Seleccione opción: \nEstudiantes tienen un descuento del 15%\nAdultos mayores de un 25%\nMujeres 20%\nNiños 10%");
            System.out.println("Si aplica a descuento por edad, presione 1, si aplica a descuento por genero o quiere seleccionar entrada publico general, presione 2");
            tarifa = scanner.nextInt();
            switch(tarifa){
                
                case 1:
                    System.out.println("Ingrese su edad");
                    edad = scanner.nextInt();
                    if(edad>=18 && edad<=23){
                        entradaEstudiante++;
                        System.out.println(entradaEstudiante+" entradas de estudiante confirmadas.");
                        System.out.println("=========================");
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                        break;
                        }else if(edad>5 && edad<11 ){
                            entradaNino++;
                            System.out.println(entradaNino+" entradas de niño confirmada");
                            mostrarOpciones();
                           opcion = scanner.nextInt();
                           break;
                        }else if (edad>65 && edad<99){
                            entradasAM++;
                            System.out.println(entradasAM+" entradas de adulto mayor confirmadas");
                            mostrarOpciones();
                           opcion = scanner.nextInt();
                           break;
                        }else{
                           mostrarOpciones();
                           opcion=scanner.nextInt();
                        }
                    break;
                case 2:
                    System.out.println("¿Es mujer? s/n");
                            String option = scanner.next();
                            if(option.equals("s")){
                                System.out.println("¿Cuantas entradas de mujer son?");
                                entradaMujer++;
                                System.out.println(entradaMujer +" entradas de mujer confirmadas");
                                mostrarOpciones();
                                opcion = scanner.nextInt();
                                }else{
                                System.out.println("No aplica descuento por genero");
                                entradaGeneral++;
                                System.out.println(entradaGeneral+"Entrada publico general confirmada");
                                mostrarOpciones();
                                opcion=scanner.nextInt();
                            }
                    break;
            }
        }
        case 3 ->{
            /*
            En este hito, el usuario tendrá la opción de agregar mas entradas antes de confirmar. Debera luego ir a opcion 2 a confirmar su tarifa
            */
             System.out.println("Ingrese la ubicación que desea agregar: 1.VIP, 2.Platea Baja, 3. Platea Alta 4. Palcos, 5. Galeria");
             ubicacion=scanner.nextInt();
             switch(ubicacion){
             case 1:
                    System.out.println(Arrays.toString(Vip));
                    posiciones();
                    posicion = scanner.nextInt();
                    if(Vip[posicion]=="D"){
                        //entradaVip.remove(0);
                        System.out.println("======================");
                        System.out.println("Asiento reservado");
                        totalEntradas++;
                        entradaVIP++;
                        Vip[posicion]="O";
                        System.out.println("======================");
                        System.out.println("Plano actual");
                        System.out.println(Arrays.toString(Vip));
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("Asiento ocupado");
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;  
             case 2:
                    System.out.println(Arrays.toString(PlateaBaja));
                    posiciones();
                    posicion = scanner.nextInt();
                    if(PlateaBaja[posicion]=="D"){
                        System.out.println("======================");
                        System.out.println("Asiento reservado");
                        //entradaPlatea.remove(0);
                        totalEntradas++;
                        entradaPlateaBaja++;
                        Vip[posicion]="O";
                        System.out.println("======================");
                        System.out.println("Plano actual");
                        System.out.println(Arrays.toString(PlateaBaja));
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("Asiento ocupado");
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;
             case 3:
                 System.out.println(Arrays.toString(PlateaAlta));
                    posiciones();
                    posicion = scanner.nextInt();
                    if(PlateaAlta[posicion]=="D"){
                        System.out.println("======================");
                        System.out.println("Asiento reservado");
                        totalEntradas++;
                        entradaPlateaAlta--;
                        PlateaAlta[posicion]="O";
                        System.out.println("======================");
                        System.out.println("Plano actual");
                        System.out.println(Arrays.toString(Palcos));
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("Asiento ocupado");
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;
             case 4:
                 System.out.println(Arrays.toString(Palcos));
                    posiciones();
                    posicion = scanner.nextInt();
                     if(Palcos [posicion]=="D"){
                        System.out.println("======================");
                        System.out.println("Asiento reservado");
                        totalEntradas++;
                        entradaPALCOS++;
                        Palcos[posicion]="O";
                        System.out.println("======================");
                        System.out.println("Plano actual");
                        System.out.println(Arrays.toString(Palcos));
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("======================");
                        System.out.println("Asiento ocupado");
                        System.out.println("======================");
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                     break;
             case 5:
               System.out.println(Arrays.toString(Galeria));
                    posiciones();
                    posicion = scanner.nextInt();
                    if(Galeria [posicion]=="D"){
                        System.out.println("======================");
                        System.out.println("Asiento liberado");
                        totalEntradas++;
                        entradaGaleria++;
                        Galeria[posicion]="D";
                        System.out.println("======================");
                        System.out.println("Plano actual");
                        System.out.println(Arrays.toString(Palcos));
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("======================");
                        System.out.println("Asiento no reservado");
                        System.out.println("======================");
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt(); 
                        
                    }
                    break;
             default:
                 System.out.println("Opcion invalida");
                 mostrarOpciones();
                 opcion=scanner.nextInt();
             }
        }
            
            
        
        case 4 ->{
            /*
            En este hito el usuario decide si confirmar o no la compra. Si decide no confirmar
            se detiene completamente el programa. Si confirma, se pedirá el nomnre, se agrega-
            rá a la lista nombre y se creará automaticamente un ID de compra y un ID de cliente.
            */
             System.out.println("¿Desea confirmar compra?\n1. SI\n2. NO");
             confirmar = scanner.nextInt();
             if (confirmar==1){
                 System.out.println("Ingrese su nombre solo su primer nombre: ");
                 nombre=scanner.next();
                 nombres.add(nombre);
                 IDcliente = Math.random();
                 IDcompra = Math.random();
                 IDclientes.add((int)(IDcliente*1000));
                 numeroCompra.add((int)(IDcompra*1000));
                 entradaVip.add(entradaVIP);
                 entradasPlateaBaja.add(entradaPlateaBaja); //Break points para verificar que se agregue el resultado a las listas
                 entradasPlateaAlta.add(entradaPlateaAlta);
                 entradaPalcos.add(entradaPALCOS);
                 entradasGaleria.add(entradaGaleria);
                 estudiantes.add(entradaEstudiante);
                 adultoMayor.add(entradasAM);
                 mujer.add(entradaMujer);
                 ninos.add(entradaNino);
                 publicoGeneral.add(entradaGeneral);
                 System.out.println("======================");
                 System.out.println("Nombres: "+nombres);
                 System.out.println("======================");
                 System.out.println("ID Cliente: "+IDclientes);
                 System.out.println("Su ID de compra es: "+numeroCompra);
                 System.out.println("Platea Alta: "+entradasPlateaAlta);
                 System.out.println("Platea Baja: "+entradasPlateaBaja);
                 System.out.println("Palcos: "+entradaPalcos);
                 System.out.println("Galeria: "+entradasGaleria);
                 System.out.println("Entrada niño: "+ninos);
                 System.out.println("Entrada estudiantes: "+estudiantes);
                 System.out.println("Entrada mujer: "+mujer);
                 System.out.println("Entrada adulto mayor: "+adultoMayor);
                 System.out.println("Entrada publico general: "+entradaGeneral);
                 System.out.println("======================");
                 System.out.println("Gracias por su compra. Para el resumen de su compre seleccione opcion 5");
                 mostrarOpciones();
                 opcion = scanner.nextInt();
            }else{
                 System.out.println("Vuelva pronto");
                 opcion = 6;
             }
             break;
                   }
        case 5->{
            /*
            Finalmente, en este hito el usuario recibirá el resumen de su compra
            dependiento si es estudiante, adulto mayor o publico general.
            */
            System.out.println("=====================================================================||");
            System.out.println(resumen+"                                                               ||");
            System.out.println(nombreTeatro+"                                                          ||");
            System.out.println("=====================================================================||");
            System.out.println("Total entradas compradas: "+totalEntradas+"                                          ||"); 
            System.out.println("Entrada niño: "+ninos+"                                                     ||");
            System.out.println("Entrada estudiantes: "+estudiantes+"                                              ||");
            System.out.println("Entrada mujer: "+mujer+"                                                    ||");
            System.out.println("Entrada adulto mayor: "+adultoMayor+"                                             ||");
            System.out.println("Entrada publico general: "+entradaGeneral+"                                           ||");
            System.out.println("=====================================================================||");
            int j = entradaGeneral*precioBase;
            double z = entradaNino*precioBase*0.90;
            double r = entradasAM*precioBase*0.75 ;
            double e = entradaEstudiante*precioBase*0.85;
            double u = entradaMujer * precioBase * 0.80;
            double g = j+z+r+e+u; // break point para verificar que se agregue el resultado a la lista
            System.out.println("VIP: "+entradaVip+ "                                                              ||");
            System.out.println("Platea Baja: "+entradasPlateaBaja+"                                                      ||");
            System.out.println("Platea Alta: "+entradasPlateaAlta+"                                                      ||");
            System.out.println("Palcos: "+entradaPalcos+"                                                           ||");
            System.out.println("Galeria: "+entradasGaleria+"                                                          ||");
            System.out.println("Costo final sin descuentos: " +totalEntradas*precioBase+ "                                        ||");
            System.out.println("Costo final publico general: "+j+"                                       ||");
            System.out.println("Costo final por niños: "+z+"                                           ||");
            System.out.println("Costo final por adulto mayor: "+r+"                                    ||");
            System.out.println("Costo final por estudiantes: "+e+"                                     ||");
            System.out.println("Costo final por mujer: "+u+ "                                           ||");
            System.out.println("Total: "+g+"                                                           ||");
            System.out.println("=====================================================================||");
            opcion = 6;
            }
     

                   
            default->{
                
            }
                
            
        }
      
        }
     
     scanner.close();
     }

}




    
       
       
        



            
        
            
        
        
            
        
        



     
     
     
             
     
     
    
        
        


        
        
     
        
        
        
 
        
    
    


    
    
    
     
       
        

      
             
    
    
    
    
      

     
      

    
    



              
    

       
        
        
        
    


           
    
    
    

        




    
    
    
    
    
  



  

  
  
  
  
  
  
  
    
  
  
     
  
  
 
 
     
      
      
  
  
     

 
  
    
      
     
     
            
      
      
  

      


