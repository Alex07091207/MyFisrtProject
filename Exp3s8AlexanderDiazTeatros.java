package teatrosmoro;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;


public class Exp3s8AlexanderDiazTeatros{
   
//Declaro variables estaticas y métodos estaticos
    static int totalEVip=0;
    static int totalEPlatea=0;
    static int totalEPalcos=0;
    static String resumen= "RESUMEN DE COMPRA";
    static String nombreTeatro = "TEATRO MORO";
    static int precioBaseEntrada = 5000;
    static void comprarEntradasAdicionales(){
        System.out.println("Si desea comprar mas entradas seleccione nuevamente opción 1");
    }
    static void mostarOpciones(){ //Declaro metodo para no repetir el menu repetidas veces a lo largo del código.
        System.out.println("============================");
        System.out.println("Seleccione su opción: \n1. Reserva de entradas \n2. Descuentos y promociones \n3. Modificacion de reservas\n4. Confirmar compra \n5. Resumen de compra \n6. Salir");
        System.out.println("============================");
    }
    static void posiciones(){ //Declaro metodo de posiciones.
        String[] posicion={"0","1","2","3"};
        System.out.println(Arrays.toString(posicion));
        System.out.println("Asientos en \"D\" estan disponibles. Asientos con letra \"O\" estan ocupados");
    }
    //Entrada 
    public static void main(String[] args) {
        //Declaro variables locales
      Scanner scanner=new Scanner(System.in);
      int entradasTotales=0;
      int confirmar=0;
      int tarifa=0;
      int edad=0;
      int posicion=0;
      String nombre;
      double IDcompra;
      double IDcliente;
      List<String> nombres = new ArrayList<>();
      List<Integer> IDclientes = new ArrayList<>();
      List<Integer> numeroCompra = new ArrayList<>();
      List<Integer> entradaVip = new ArrayList<>();
      List<Integer> entradaPlatea = new ArrayList<>();
      List<Integer> entradaPalcos = new ArrayList<>();
      String ubicacion;
      /*Acá declaro mis arreglos de las ubicaciones del teatro
      */
      String[]Vip = {"D","D","D","D"};
      String[]Platea = {"D","D","D","D"};
      String[]Palcos = {"D","D","D","D"};
      System.out.println("==========================");
      System.out.println("Bienvenido a "+nombreTeatro);
      System.out.println("Nuestra capacidad total es de 4 asientos por ubicación:\n4 asientos VIP.\n4 asientos PLATEA.\n4 asientos PALCOS");
      System.out.println("Precio pase de entrada: 10000");
      System.out.println("Estudiantes cuentan con un 10% de descuento"); 
      System.out.println("Adultos mayores con un 15% de descuento");
      System.out.println("==========================");
      System.out.println("");
      mostarOpciones();
      int opcion = scanner.nextInt(); 
      while (opcion<=5) {
      switch (opcion){
        case 1 -> {  //Acá el cliente escoge que ubicación desea, mostrandose el plano de la ubicación correspondiente.
            System.out.println("===================================================================================================================================");
            System.out.println("Escriba la ubicación la ubicación del asiento que desea comprar: VIP, PLATEA, PALCOS");//Escriba la ubicación 
            ubicacion=scanner.next().toUpperCase();
            System.out.println("====================================================================================================================================");
            System.out.println("Ingrese la posición del asiento que desea reservar");
            switch (ubicacion){
                /*
                Notese que las posiciones apareceran siempre abajo del plano de asientos para que el usuario tenga claridad de cual
                posición ingresar según su preferencia. Aparte, el asiento cambiara automaticamente a ocupado, por lo que no podrá volverlo
                a ocupar, a no ser que vaya a la opción 3 y libere el asiento.
                */
                case "VIP":
                    System.out.println(Arrays.toString(Vip));
                    posiciones();
                    posicion = scanner.nextInt();
                    if(Vip[posicion]=="D"){
                        System.out.println("======================");
                        System.out.println("Asiento reservado");
                        entradasTotales++;
                        totalEVip++;
                        Vip[posicion]="O"; //Acá es donde el asiento cambia de "D" a "O".
                        System.out.println("======================");
                        System.out.println("Plano actual");
                        System.out.println(Arrays.toString(Vip));//Muestro como quedaría el plano de asientos, para que se pueda evidenciar
                        comprarEntradasAdicionales();                // que efectivamente el asiento se reservó.
                        mostarOpciones(); 
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("Asiento ocupado");
                        comprarEntradasAdicionales();
                        mostarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;
                    
                case "PLATEA":
                    System.out.println(Arrays.toString(Platea));
                    posiciones();
                    posicion = scanner.nextInt();
                     if(Platea[posicion]=="D"){
                        System.out.println("======================");
                        System.out.println("Asiento reservdo");
                        System.out.println("======================");
                        entradasTotales++;
                        totalEPlatea++;
                        Platea[posicion]="O";
                        System.out.println("======================");
                        System.out.println("Plano actual");
                        System.out.println(Arrays.toString(Platea));
                        comprarEntradasAdicionales();
                        mostarOpciones();
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("======================");
                        System.out.println("Asiento ocupado");
                        System.out.println("======================");
                        comprarEntradasAdicionales();
                        mostarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;
                    
                case "PALCOS":
                    System.out.println(Arrays.toString(Palcos));
                    posiciones();
                    posicion = scanner.nextInt();
                     if(Palcos [posicion]=="D"){
                        System.out.println("======================");
                        System.out.println("Asiento reservado");
                        entradasTotales++;
                        totalEPalcos++;
                        Palcos[posicion]="O";
                        System.out.println("======================");
                        System.out.println("Plano actual");
                        System.out.println(Arrays.toString(Palcos));
                        comprarEntradasAdicionales();
                        mostarOpciones();
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("======================");
                        System.out.println("Asiento ocupado");
                        System.out.println("======================");
                        comprarEntradasAdicionales();
                        mostarOpciones();
                        opcion = scanner.nextInt();
                    }
            }
                    break;
        }
        
        case 2 -> { /*
            En esta opción, el usuario tiene la opción de aplicar a un descuento si es estudiante o adulto mayor.
            Si no es estudiante, se le preguntará la edad para validar si es adulto mayor. Si no es adulto mayor, 
            quedara con la tarifa de publico general.
            */
            System.out.println("Estudiantes tienen un descuento del 10%\nAdultos mayores de un 15%");
            System.out.println("¿Es estudiante? \n1. SI \n2. NO");
            tarifa = scanner.nextInt();
            if (tarifa==1){
                System.out.println("Has obtenido un descuento del 10% sobre tu costo total");
                mostarOpciones();
                opcion = scanner.nextInt();
            }else{
                System.out.println("======================");
                System.out.println("¿Ingrese su edad?");
                System.out.println("======================");
                edad=scanner.nextInt();
                if(edad>65 && edad<100){
                System.out.println("======================================================");
                System.out.println("Has obtenido un descuento del 15% sobre tu costo total");
                System.out.println("======================================================");
                mostarOpciones();
                opcion = scanner.nextInt();
                }else{
                System.out.println("===============================");
                System.out.println("No te corresponde ningún descuento");
                System.out.println("===============================");
                mostarOpciones();
                opcion = scanner.nextInt();
                }
                    
            }
            break;
            }
        case 3 ->{
            /*
            En este hito, el usuario tendrá la opción de liberar algunas de las entradas reservadas 
            Se mostrará el plano de la ubicación que el cliente ingrese, y si la posición que desea
            liberar esta con letra "O", es que porque corresponde a un asiento que fue reservado y
            por lo tanto se puede liberar, y si esta con letra "D" es porque el asiento esta dispo-
            ble, por lo que no el sistema no lo aceptará.
            */
             System.out.println("Ingrese la ubicación que desea eliminar: VIP, Platea, Palcos");
             ubicacion=scanner.next().toUpperCase();
             switch(ubicacion){
             case "VIP":
                    System.out.println(Arrays.toString(Vip));
                    posiciones();
                    posicion = scanner.nextInt();
                    if(Vip[posicion]=="O"){
                        //entradaVip.remove(0);
                        System.out.println("======================");
                        System.out.println("Asiento reservado");
                        entradasTotales--;
                        totalEVip--;
                        Vip[posicion]="D";
                        System.out.println("======================");
                        System.out.println("Plano actual");
                        System.out.println(Arrays.toString(Vip));
                        comprarEntradasAdicionales();
                        mostarOpciones();
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("Asiento no esta reservado");
                        comprarEntradasAdicionales();
                        mostarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;  
             case "PLATEA":
                    System.out.println(Arrays.toString(Platea));
                    posiciones();
                    posicion = scanner.nextInt();
                    if(Platea[posicion]=="O"){
                        System.out.println("======================");
                        System.out.println("Asiento liberado");
                        //entradaPlatea.remove(0);
                        entradasTotales--;
                        totalEPlatea--;
                        Vip[posicion]="D";
                        System.out.println("======================");
                        System.out.println("Plano actual");
                        System.out.println(Arrays.toString(Platea));
                        comprarEntradasAdicionales();
                        mostarOpciones();
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("Asiento no ocupado");
                        comprarEntradasAdicionales();
                        mostarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;
             case "PALCOS":
                 System.out.println(Arrays.toString(Palcos));
                    posiciones();
                    posicion = scanner.nextInt();
                    if(Palcos[posicion]=="O"){
                        System.out.println("======================");
                        System.out.println("Asiento liberado");
                        entradasTotales--;
                        totalEPalcos--;
                        Vip[posicion]="D";
                        System.out.println("======================");
                        System.out.println("Plano actual");
                        System.out.println(Arrays.toString(Palcos));
                        comprarEntradasAdicionales();
                        mostarOpciones();
                        opcion = scanner.nextInt();
                    }else{
                        System.out.println("Asiento no ocupado");
                        comprarEntradasAdicionales();
                        mostarOpciones();
                        opcion = scanner.nextInt();
                    }
                    break;
               
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
                 entradaVip.add(totalEVip);
                 entradaPlatea.add(totalEPlatea);
                 entradaPalcos.add(totalEPalcos);
                 System.out.println("======================");
                 System.out.println("Nombres: "+nombres);
                 System.out.println("======================");
                 System.out.println("ID Cliente: "+IDclientes);
                 System.out.println("Su ID de compra es: "+numeroCompra);
                 System.out.println("VIP: "+entradaVip);
                 System.out.println("Platea: "+entradaPlatea);
                 System.out.println("Palcos: "+entradaPalcos);
                 System.out.println("======================");
                 System.out.println("Gracias por su compra. Para el resumen de su compre seleccione opcion 4");
                 mostarOpciones();
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
            if (tarifa==1){
            System.out.println("===================");
            System.out.println(resumen);
            System.out.println(nombreTeatro);
            System.out.println("===================");
            System.out.println("Total entradas compradas: "+entradasTotales); 
            System.out.println("VIP: "+totalEVip);
            System.out.println("Platea Alta: "+totalEPlatea);
            System.out.println("Palcos: "+totalEPalcos);
            System.out.println("Las ubicaciones con \"O\" correspondes a tus ubicaciones");
            System.out.println(Arrays.toString(Vip));
            System.out.println(Arrays.toString(Platea));
            System.out.println(Arrays.toString(Palcos));
            System.out.println("Primera fila corresponde a VIP, la segunda a Platea alta y la tercera a Palcos");
            System.out.println("Costo final: "+precioBaseEntrada*entradasTotales);
            System.out.println("Costo final con descuento del 10%: "+entradasTotales*precioBaseEntrada*0.90 );
            System.out.println("===================");
            System.out.println("Estadisticas globales");
            System.out.println("====================");
            System.out.println("Total ingresos por estudiantes: "+entradasTotales*precioBaseEntrada*0.90);
            System.out.println("Entradas vendidas: "+entradasTotales);
            System.out.println("===================");
            System.out.println("Para salir seleccione opcion 5");
            mostarOpciones();
            opcion = scanner.nextInt();
                
            }else if(edad>65){
            System.out.println("===================");
            System.out.println(resumen);
            System.out.println(nombreTeatro);
            System.out.println("===================");
            System.out.println("Total entradas compradas: "+entradasTotales); 
            System.out.println("VIP: "+totalEVip);
            System.out.println("Platea Alta: "+totalEPlatea);
            System.out.println("Palcos: "+totalEPalcos);
            System.out.println("Las ubicaciones con \"O\" correspondes a tus ubicaciones");
            System.out.println(Arrays.toString(Vip));
            System.out.println(Arrays.toString(Platea));
            System.out.println(Arrays.toString(Palcos));
            System.out.println("Primera fila corresponde a VIP, la segunda a Platea alta y la tercera a Palcos");
            System.out.println("Costo final: "+precioBaseEntrada*entradasTotales);
            System.out.println("Costo final con descuento del 15%: "+entradasTotales*precioBaseEntrada*0.85);
            System.out.println("===================");
            System.out.println("Estadisticas globales");
            System.out.println("Total ingresos por adulto mayor: "+entradasTotales*precioBaseEntrada*0.85);
            System.out.println("Entradas vendidas: "+entradasTotales);
            System.out.println("===================");
            System.out.println("Para salir seleccione opcion 5");
            mostarOpciones();
            opcion = scanner.nextInt();
            }else{
            System.out.println("===================");
            System.out.println(resumen);
            System.out.println(nombreTeatro);
            System.out.println("===================");
            System.out.println("Total entradas compradas: "+entradasTotales); 
            System.out.println("VIP: "+totalEVip);
            System.out.println("Platea Alta: "+totalEPlatea);
            System.out.println("Palcos: "+totalEPalcos);
            System.out.println("Las entradas con \"O\" correspondes a tus ubicaciones");
            System.out.println(Arrays.toString(Vip));
            System.out.println(Arrays.toString(Platea));
            System.out.println(Arrays.toString(Palcos));
            System.out.println("Costo final publico general: "+entradasTotales*precioBaseEntrada);
            System.out.println("===================");
            System.out.println("Estadisticas globales");
            System.out.println("Total ingresos: ");
            System.out.println("Total ingresos: "+entradasTotales*precioBaseEntrada);
            System.out.println("Entradas vendidas: "+entradasTotales);
            System.out.println("===================");
            System.out.println("Para salir seleccione opcion 5");
            mostarOpciones();
            opcion = scanner.nextInt();  
            }
                   }
            default->{
                
            }
                
            
        }
      
        }
     
     scanner.close();
     }
      }
    


      
      
      
      

      
   
    



        
    
           
           
          
           
       
       
  


       
       
        
    
      
             
    

    

