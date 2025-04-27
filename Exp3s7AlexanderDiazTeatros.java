package teatrosmoro;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Exp3s7AlexanderDiazTeatros{
    public static int ventaEntradas = 0;
    

//Declaro variables estaticas y métodos estaticos
    static int tarifa;
    static int totalEVip=0;
    static int totalEPlatea=0;
    static int totalEPalcos=0;
    static int tarifaAM;
    static int tarifaEST;
    static String boleta= "Boleta de compra";
    static String nombreTeatro = "TEATRO MORO";
    static int precioBaseEntrada = 10000;
    static void comprarEntradasAdicionales(){
        System.out.println("Si desea comprar mas entradas seleccione nuevamente opción 1");
    }
    static void mostarOpciones(){ //Declaro metodo para no repetir el menu repetidas veces a lo largo del código.
        System.out.println("============================");
        System.out.println("Seleccione su opción: \n1. Comprar entradas \n2. Resumen de compra \n3. Generar boleta \n4. Salir");
        System.out.println("============================");
    }
    //Entrada 
    public static void main(String[] args) {
        //Declaro variables locales
      Scanner scanner=new Scanner(System.in); 
      List<Integer> entradaVip = new ArrayList<>();
      List<Integer> entradaPlateaAlta = new ArrayList<>();
      List<Integer> entradaPalcos = new ArrayList<>();
      String ubicacion;
      
      int entrada=0;
      System.out.println("==========================");
      System.out.println("Bienvenido a "+nombreTeatro);
      System.out.println("Nuestra capacidad total es de 40 asientos.\n10 asientos VIP.\n10 asientos PLATEA.\n20 asientos PALCOS");
      System.out.println("Precio pase de entrada: 10000");
      System.out.println("Estudiantes cuentan con un 10% de descuento"); 
      System.out.println("Adultos mayores con un 15% de descuento");
      System.out.println("==========================");
      mostarOpciones();
      int opcion = scanner.nextInt(); 
      while (opcion<=3) {
      switch (opcion){
        case 1 -> {  //Acá el cliente escoje que entrada busca según su ubicación, junto con la cantidad de entradas para esas ubicaciones.
            System.out.println("===================================================================================================================================");
            System.out.println("Escriba la ubicación la ubicación del asiento que desea comprar: VIP, PLATEA, PALCOS");//Escriba la ubicación 
            ubicacion=scanner.next().toUpperCase();
            System.out.println("====================================================================================================================================");
            System.out.println("Ingrese la cantidad de entradas que desea comprar");
            entrada = scanner.nextInt();
           
            switch (ubicacion){
                case "VIP":
                    if(entrada>0 && entrada<=10){
                        System.out.println("Enhorabuena, entradas compradas");
                        totalEVip+=entrada;
                        entradaVip.add(totalEVip);
                        mostarOpciones();
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("Excede cantidad de entradas");
                        comprarEntradasAdicionales();
                        mostarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;
                    
                case "PLATEA":
                     if(entrada>0 && entrada<=10){
                        System.out.println("Enhorabuena, entradas compradas");
                        totalEPlatea+=entrada;
                        entradaPlateaAlta.add(totalEPlatea);
                        mostarOpciones();
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("Excede cantidad de entradas");
                        comprarEntradasAdicionales();
                        mostarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;
                    
                case "PALCOS":
                     if(entrada>0 && entrada<=20){
                        System.out.println("Enhorabuena, entradas compradas");
                        totalEPalcos+=entrada;
                        entrada=totalEPalcos;
                        entradaPalcos.add(entrada);
                        mostarOpciones();
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("Excede cantidad de entradas");
                        comprarEntradasAdicionales();
                        mostarOpciones();
                        opcion = scanner.nextInt();
                    }
            }
                    break;
        }
        
        case 2 -> { 
            System.out.println("Escoja su tarifa: \n1. Estudiante. \n2. Adulto mayor");
            tarifa=scanner.nextInt();
            switch (tarifa){
                case 1:
                    System.out.println("Ha obtenido un 10% del precio base de la entrada");
                    System.out.println("Has comprado entradas VIP: "+totalEVip);
                    System.out.println("Has comprado entradas Platea Alta: "+totalEPlatea);
                    System.out.println("Has comprado entradas Platea Alta: "+totalEPalcos);
                    tarifaEST=precioBaseEntrada*(totalEVip+totalEPlatea+totalEPalcos);
                    System.out.println("Costo final: "+0.90*tarifaEST);
                    comprarEntradasAdicionales();
                    mostarOpciones();
                    opcion = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Ha obtenido un 15% del precio base de la entrada");
                    System.out.println("Has comprado entradas VIP: "+totalEVip);
                    System.out.println("Has comprado entradas Platea Alta: "+totalEPlatea);
                    System.out.println("Has comprado entradas Platea Alta: "+totalEPalcos);
                    tarifaAM=precioBaseEntrada*(totalEVip+totalEPlatea+totalEPalcos);
                    System.out.println("Costo final: "+0.85*tarifaAM);
                    comprarEntradasAdicionales();
                    mostarOpciones();
                    opcion = scanner.nextInt();
                    break;
            }
            
            
        }
        case 3 ->{
            if (tarifa==1){
                System.out.println("===================");
            System.out.println(boleta);
            System.out.println(nombreTeatro);
            System.out.println("===================");
            System.out.println("Total entradas compradas: "); 
            System.out.println("Ubicacion VIP: "+entradaVip);/*Si hace dos compras o mas compras de una ubicación, iran apareciendo en indices diferentes de la lista
            Ejemplo: si primero compre 2 entradas VIP, y luego 6, aparecera de la siguiente manera: [2,6], que es un total de 8.
            */
            System.out.println("Ubicación Platea Alta: "+entradaPlateaAlta);
            System.out.println("Ubicación Palcos: "+entradaPalcos);
            System.out.println("Costo final: "+0.90*tarifaEST);
            System.out.println("===================");
            System.out.println("Estadisticas globales");
            System.out.println("Total ingresos por estudiantes: "+0.90*tarifaEST);
            System.out.println("Entradas vendidas: "+(totalEVip+totalEPlatea+totalEPalcos));
            System.out.println("===================");
            System.out.println("Para salir seleccione opcion 4");
            mostarOpciones();
            opcion = scanner.nextInt();
            break;
                
            }else{
                 System.out.println("===================");
            System.out.println(boleta);
            System.out.println(nombreTeatro);
            System.out.println("===================");
            System.out.println("Total entradas compradas: "); 
            System.out.println("VIP: "+entradaVip);
            System.out.println("Platea Alta: "+entradaPlateaAlta);
            System.out.println("Palcos: "+entradaPalcos);
            System.out.println("Costo final: "+0.85*tarifaAM);
            System.out.println("===================");
            System.out.println("Estadisticas globales");
            System.out.println("Total ingresos por adulto mayor: ");
            System.out.println("Total ingresos por estudiantes: "+(totalEVip+totalEPlatea+totalEPalcos));
            System.out.println("Entradas vendidas: "+(totalEVip+totalEPlatea+totalEPalcos));
            System.out.println("===================");
            System.out.println("Para salir seleccione opcion 4");
            mostarOpciones();
            opcion = scanner.nextInt();
            break;
            }
                   }
        default->{
            
            System.out.println("Gracias por su compra. Vuelva pronto...");
            
            
        }
      
        }
     
     }
     
      }
    }


      
      
      
      

      
   
    



        
    
           
           
          
           
       
       
  


       
       
        
    
      
             
    

    

