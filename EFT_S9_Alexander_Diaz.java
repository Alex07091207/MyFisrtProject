package teatrosmoro;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;


public class EFT_S9_Alexander_Diaz{
//Declaro variables estaticas y métodos estaticos
    static int totalEVip=0;
    static int totalEPlateaBaja=0;
    static int totalEPlateaAlta = 0;
    static int totalEGaleria=0;
    static int totalEPalcos=0;
    static  int totalEntradasDisponibles = 40;
    static String resumen= "BOLETA";
    static String nombreTeatro = "TEATRO MORO";
    static int precioBase = 5000;
    static void comprarEntradasAdicionales(){
        System.out.println("Si desea comprar mas entradas seleccione nuevamente opción 1");
    }
    static void mostrarOpciones(){ //Declaro metodo para no repetir el menu repetidas veces a lo largo del código.
        System.out.println("============================");
        System.out.println("Seleccione su opción: \n1. Reserva de entradas \n2. Descuentos \n3. Modificacion de reservas\n4. Confirmar compra \n5. Resumen de compra \n6. Salir");
        System.out.println("============================");
    }
    static void opcionDesc(){
        System.out.println("¿Desea reservar obtener mas descuentos? \n1. SI \n2. NO");
    }
    static void opcionMasEntradas(){
        System.out.println("¿Desea reservar mas entradas? \n1. SI \n2. NO");
    }
    static void deleteEntrada(){
        System.out.println("¿Desea eliminar mas entradas? \n1. SI \n2. NO");
    }
    //Entrada 
    public static void main(String[] args) {
//Declaro variables locales
      Scanner scanner=new Scanner(System.in);
      double tarifaM = precioBase * 0.20;
      double tarifaEst = precioBase*0.10;
      double tarifaAM = precioBase*0.25;
      double tarifaNino = precioBase * 0.15;
      int entradaMujer=0;
      int entradaNino=0;
      int entradaEstudiante=0;
      int entradasAM=0;
      int entradaVIP=0;
      int totalEntradas=0;
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
      int ubicacion=0;
      
      int opcion = 0; 
      System.out.println("==========================");
      System.out.println("Bienvenido a "+nombreTeatro);
      System.out.println("Nuestra capacidad total es de 10 asientos por ubicación:\n10 Asientos VIP.\n10 Asientos PLATEA BAJA.\n10 Asientos PLATEA ALTA. \n10 Asientos PALCOS. \n10 Asientos GALERIA");
      System.out.println("Precio pase de entrada: 10000");
      System.out.println("Estudiantes cuentan con un 10% de descuento"); 
      System.out.println("Adultos mayores con un 15% de descuento");
      System.out.println("==========================");
      mostrarOpciones();
      opcion=scanner.nextInt();
      while(opcion!=6) {
      switch (opcion){
        case 1 -> {  //Acá el cliente escoge que ubicación desea, mostrandose el plano de la ubicación correspondiente.
            System.out.println("===================================================================================================================================");
            System.out.println("Ingrese número de la ubicación la ubicación del asiento que desea comprar: 1. VIP 2. PLATEA BAJA 3. PLATEA ALTA 4. PALCOS 5. GALERIA");
            if (scanner.hasNextInt()){
            ubicacion=scanner.nextInt();
            }else{
                System.out.println(" Opcion invalida.");
                opcion=1;            
                        }
            System.out.println("====================================================================================================================================");
            System.out.println("Ingrese la posición del asiento que desea reservar");
            switch (ubicacion){
                case 1:
                    System.out.println("¿Cuántas entradas desea?");
                    entradaVIP = scanner.nextInt();
                    if(entradaVIP<10){
                        System.out.println("======================");
                        System.out.println("Entradas reservadas");
                        totalEntradas=entradaVIP;
                        mostrarOpciones();
                        opcion=scanner.nextInt();
                    }else{
                        System.out.println("Excede máximo de entradas");
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;
                    
                case 2:
                    System.out.println("¿Cuántas entradas desea?");
                    entradaPlateaBaja = scanner.nextInt();
                    if(entradaPlateaBaja<10){
                        System.out.println("======================");
                        System.out.println("Entradas reservadas");
                        totalEntradas=entradaPlateaBaja;
                        opcionMasEntradas();
                        int option = scanner.nextInt();
                        if(option==1){
                            opcion = 1;
                        }
                    }else{
                        System.out.println("Excede máximo de entradas");
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;
                    
                case 3:
                   System.out.println("¿Cuántas entradas desea?");
                    entradaPlateaAlta = scanner.nextInt();
                    if(entradaPlateaAlta<10){
                        System.out.println("======================");
                        System.out.println("Entradas reservadas");
                        totalEntradas = entradaPlateaAlta;
                        opcionMasEntradas();
                        int option = scanner.nextInt();
                        if(option==1){
                            opcion = 1;
                        }
                    }else{
                        System.out.println("Excede máximo de entradas");
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;
                case 4:
                    System.out.println("¿Cuántas entradas desea?");
                    entradaPALCOS = scanner.nextInt();
                    if(entradaPALCOS<10){
                        System.out.println("======================");
                        System.out.println("Entradas reservadas");
                        totalEntradas = entradaPALCOS;
                        opcionMasEntradas();
                        int option = scanner.nextInt();
                        if(option==1){
                           opcion = 1;
                        }
                    }else{
                        System.out.println("Excede máximo de entradas");
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;
                  
                case 5:
                    System.out.println("¿Cuántas entradas desea?");
                    entradaGaleria = scanner.nextInt();
                    if(entradaGaleria<10){
                        System.out.println("======================");
                        System.out.println("Entradas reservadas");
                        totalEntradas = entradaGaleria;
                        mostrarOpciones();
                        opcion=scanner.nextInt();
                    }else{
                        System.out.println("Excede máximo de entradas");
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;
                    
            }
              
               
        }
      
        
        case 2 -> { 
            System.out.println("Seleccione opción: \nEstudiantes tienen un descuento del 15%\nAdultos mayores de un 25%\nMujeres 20%\nNiños 10%");
            System.out.println("Si aplica a descuento por edad, presione 1, si aplica a descuento por genero, presione 2");
            tarifa = scanner.nextInt();
            switch(tarifa){
                
                case 1:
                    System.out.println("Ingrese su edad");
                    edad = scanner.nextInt();
                    if(edad>=18 && edad<=23){
                        System.out.println("¿Cuantas entradas de estudiante son?");
                        entradaEstudiante=scanner.nextInt();
                        System.out.println(entradaEstudiante+" entradas de estudiante confirmadas.");
                        System.out.println("=========================");
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                        break;
                        }else if(edad>5 && edad<11 ){
                            System.out.println("¿Cuantas entradas de niño son?");
                            entradaNino=scanner.nextInt();
                            System.out.println(entradaNino+" entradas de niño confirmada");
                            mostrarOpciones();
                           opcion = scanner.nextInt();
                           break;
                        }else if (edad>65 && edad<99){
                            System.out.println("¿Cuántas entradas de adulto mayor son?");
                            entradasAM=scanner.nextInt();
                            System.out.println(entradasAM+" entradas de adulto mayor confirmadas");
                            mostrarOpciones();
                           opcion = scanner.nextInt();
                           break;
                        }else{
                            System.out.println("No aplica descuento por edad");
                            mostrarOpciones();
                           opcion = scanner.nextInt();
                        }
                    break;
                case 2:
                    System.out.println("¿Es mujer? s/n");
                            String option = scanner.next();
                            if(option.equals("s")){
                                System.out.println("¿Cuantas entradas de mujer son?");
                                entradaMujer=scanner.nextInt();
                                System.out.println(entradaMujer +" entradas de mujer confirmadas");
                                mostrarOpciones();
                                opcion = scanner.nextInt();
                                }else{
                                System.out.println("No aplica descuento por genero");
                                mostrarOpciones();
                                opcion=scanner.nextInt();
                            }
                    break;
                            }
            }
        
            
        
        case 3 ->{
            
             System.out.println("Ingrese la ubicación que desea eliminar: \n1. VIP \n2. Platea Baja \n3. Platea Alta \n4. Palcos \n5. Galeria ");
             ubicacion=scanner.nextInt();
             switch(ubicacion){
             case 1:
                    System.out.println("¿Cuántas entradas desea eliminar?");
                    int i=scanner.nextInt();
                    if(entradaVIP<=totalEntradas){
                    totalEntradas-=i;
                    entradaVIP-=i;
                    System.out.println("Entradas eliminadas exitosamente");
                            mostrarOpciones();
                            opcion = scanner.nextInt();
                        
                    }else{
                        System.out.println("Excede cántidad de entradas reservadas");
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;  
             case 2:
                    System.out.println("¿Cuántas entradas desea eliminar?");
                    i=scanner.nextInt();
                    if(entradaPlateaBaja<=totalEntradas){
                    totalEntradas-=i;
                    entradaPlateaBaja-=i;
                    System.out.println("Entradas eliminadas exitosamente");
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                        
                    }else{
                        System.out.println("Excede cántidad de entradas reservadas");
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;  
             case 3:
                 System.out.println("¿Cuántas entradas desea eliminar?");
                    i=scanner.nextInt();
                    if(entradaPlateaAlta<=totalEntradas){
                    totalEntradas-=i;    
                    entradaPlateaAlta-=i;
                    System.out.println("Entradas eliminadas exitosamente");
                            mostrarOpciones();
                            opcion = scanner.nextInt();
                        
                    }else{
                        System.out.println("Excede cántidad de entradas reservadas");
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;  
             case 4:
                 System.out.println("¿Cuántas entradas desea eliminar?");
                    i=scanner.nextInt();
                    if(entradaPALCOS<=totalEntradas){
                    totalEntradas-=i;    
                    entradaPALCOS-=i;
                    System.out.println("Entradas eliminadas exitosamente");
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                        
                    }else{
                        System.out.println("Excede cántidad de entradas reservadas");
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;  
             
             case 5:
               System.out.println("¿Cuántas entradas desea eliminar?");
                    i=scanner.nextInt();
                    if(entradaGaleria<=totalEntradas){
                    totalEntradas-=i;    
                    entradaGaleria-=i;
                    System.out.println("Entradas eliminadas exitosamente");
                            mostrarOpciones();
                            opcion = scanner.nextInt();
                        
                    }else{
                        System.out.println("Excede cántidad de entradas reservadas");
                        comprarEntradasAdicionales();
                        mostrarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;  
             default:
                System.out.println("Opción inválida");
                mostrarOpciones();
                opcion=scanner.nextInt();
        }
             break;
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
                 entradasPlateaBaja.add(entradaPlateaBaja);
                 entradasPlateaAlta.add(entradaPlateaAlta);
                 entradaPalcos.add(entradaPALCOS);
                 entradasGaleria.add(entradaGaleria);
                 System.out.println("======================");
                 System.out.println("Nombres: "+nombres);
                 System.out.println("======================");
                 System.out.println("ID Cliente: "+IDclientes);
                 System.out.println("Su ID de compra es: "+numeroCompra);
                 System.out.println("VIP: "+entradaVip);
                 System.out.println("Platea Alta: "+entradasPlateaAlta);
                 System.out.println("Platea Baja: "+entradasPlateaBaja);
                 System.out.println("Palcos: "+entradaPalcos);
                 System.out.println("Galeria: "+entradasGaleria);
                 System.out.println("======================");
                 mostrarOpciones();
                 opcion=scanner.nextInt();
             }   
        }
        case 5->{
            /*
            Finalmente, en este hito el usuario recibirá el resumen de su compra
            dependiento si es estudiante, adulto mayor o publico general.
            */
            System.out.println("===================");
            System.out.println(resumen);
            System.out.println(nombreTeatro);
            System.out.println("===================");
            System.out.println("Total entradas compradas: "+totalEntradas); 
            System.out.println("VIP: "+entradaVip);
            System.out.println("Platea Baja: "+entradasPlateaBaja);
            System.out.println("Platea Alta: "+entradasPlateaAlta);
            System.out.println("Palcos: "+entradaPalcos);
            System.out.println("Galeria: "+entradasGaleria);
            System.out.println("Costo final sin descuentos: "+precioBase*totalEntradas);
            int publicoGeneral = entradaNino-entradasAM-entradaEstudiante-entradaMujer;
            System.out.println("Costo final publico general: "+publicoGeneral*(-precioBase));
            System.out.println("Costo final por niños: "+entradaNino*precioBase*0.90);
            System.out.println("Costo final por adulto mayor: "+entradasAM*precioBase*0.75);
            System.out.println("Costo final por estudiantes: "+entradaEstudiante*precioBase*0.85);
            System.out.println("Costo final por mujer: "+entradaMujer*precioBase*0.80);
            opcion = 6;
           
            }
                   }
            
                
           
                
            
        }
      
        }
     
     
     }
      }
    


      
      
      
      

      
   
    



        
    
           
           
          
           
       
       
  


       
       
        
    
      
             
    

    

