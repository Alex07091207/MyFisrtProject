package teatrosmoro;
import java.util.Timer;
import java.util.Scanner;
import java.util.Arrays;
import java.util.TimerTask;

public class Exp2s6AlexanderDiazTeatros{
   

//Declaro variables estaticas y métodos estaticos
    static String boleta= "Boleta de compra";
    static String nombreTeatro = "Teatros Moro";
    static double totalIngresosPorVenta = 1;
    static double precioBaseEntrada = 10000;
    static void comprarEntradasAdicionales(){
        System.out.println("Si desea comprar mas entradas seleccione nuevamente opción 1");
    }
    static void mostarOpciones(){ //Declaro metodo para no repetir el menu repetidas veces a lo largo del código.
        System.out.println("============================");
        System.out.println("Seleccione su opción: \n1. Reservar entradas \n2. Venta de entradas\n3. Modificar \n4. Imprimir boleta \n5. Salir");
        System.out.println("============================");
    }
    //Entrada 
    public static void main(String[] args) {
        //Declaro variables locales
        Timer timer = new Timer();
       String entrada;
       String[] ubicaciones= new String[4];
       int entradasReservadas = 0;
       String[]asientosA ={"a1","a2","x"}; //Asientos "x" estan ocupados, al ingresarlos arrojará asiento inválido
       String[]asientosB ={"b1","b2","x"};
      Scanner scanner=new Scanner(System.in); 
      System.out.println("==========================");
      System.out.println("Bienvenido a "+nombreTeatro);
      System.out.println("Nuestra capacidad total es de 6 asientos. Fila A corresponde a VIP. Fila B corresponde a Palcos");
      System.out.println("==========================");
      mostarOpciones();
      int opcion = scanner.nextInt(); 
      while (opcion<=4) {
     switch (opcion){
        case 1 -> {  //Acá el cliente escoje que entrada busca según su ubicación, junto con la cantidad de entradas para esas ubicaciones.
            System.out.println("===================================================================================================================================");
            System.out.println("Ingrese el la ubicación del asiento que desea reservar. Tenga en cuenta que asientos con \"x\" estan reservados por otras personas" );
            System.out.println("Los asientos que es usted reserve apareceran como \"reservados\"junto con el numero del asiento reservado");
            System.out.println("====================================================================================================================================");
            System.out.println (Arrays.toString(asientosA));
            System.out.println (Arrays.toString(asientosB));
            entrada=scanner.next().toLowerCase();
            
            if ( entrada.equals("a1") && entradasReservadas<4){
                System.out.println("=======================================");
                System.out.println("Has reservado asiento a1 por un minuto");
                System.out.println("=======================================");
                ubicaciones[0]="a1"; //Break point para verificar que a1 se guarde en la posición 0 del array
                asientosA[0]= "reservado a1"; //Acá un break point para verificar que se guarde en la posición 0 del array
                entradasReservadas++;// Para verificar que esta sumando el acumulador
                TimerTask tarea = new TimerTask(){
                    @Override
                    public void run(){
                    asientosA[0]="a1";
                    System.out.println("La reserva del asiento ha expirado a1");
                }
                };
                timer.schedule(tarea,60000);     
                comprarEntradasAdicionales();
                mostarOpciones();
                opcion = scanner.nextInt();
            }else if( entrada.equals("a2") && entradasReservadas<4){
                System.out.println("==========================================");
                System.out.println("Has reservado el asiento a2 por un minuto");
                System.out.println("==========================================");
                ubicaciones[1]="a2";
                asientosA[1] = "reservado a2";
                entradasReservadas++;
                TimerTask tarea = new TimerTask(){
                    @Override
                    public void run(){
                    asientosB[1]="a2";
                    System.out.println("La reserva del asiento ha expirado b1");   
                    }
                    };
                    timer.schedule(tarea,60000); 
                comprarEntradasAdicionales();   
                mostarOpciones();
                opcion = scanner.nextInt();
                break;
            }else if( entrada.equals("b1") && entradasReservadas<4){
                System.out.println("=======================================");
                System.out.println("Has reservado entrada b1 por un minuto");
                System.out.println("=======================================");
                ubicaciones[2]="b1";
                asientosB[0] = "reservado b1";
                entradasReservadas++;
                TimerTask tarea = new TimerTask(){
                    @Override
                    public void run(){
                    asientosB[0]="b1";
                    System.out.println("La reserva del asiento ha expirado b1");   
                    }
                    };
                    timer.schedule(tarea,60000); 
                comprarEntradasAdicionales();    
                mostarOpciones();
                opcion = scanner.nextInt();
            }else if( entrada.equals("b2") && entradasReservadas<4){
                System.out.println("========================================");
                System.out.println("Has reservado entrada b2 por un minuto");
                System.out.println("========================================");
                ubicaciones[3]="b2";
                asientosB[1] = "reservado b2";
                entradasReservadas++;
                TimerTask tarea = new TimerTask(){
                    @Override
                    public void run(){
                    asientosB[1]="b2";
                    System.out.println("La reserva del asiento ha expirado b1");   
                    }
                    };
                    timer.schedule(tarea,60000); 
                comprarEntradasAdicionales();    
                mostarOpciones();
                opcion = scanner.nextInt();
            }else{
                System.out.println("Asiento inválido");
                comprarEntradasAdicionales();
                mostarOpciones(); //Se sugiere ir a opción 3 en caso de que desee liberar algún asiento, para así poder confirmar la compra en la opción 2 
                opcion = scanner.nextInt(); //y luego imprimir boleta en opción 4
            }
            }
        case 2 -> {
            System.out.println("¿Desea comprar las entradas? Ingrese el numero de su opcion: \n1. SI \n2. NO "); 
            int comprarEntrada = scanner.nextInt();                             //
            if (comprarEntrada==1){
                System.out.println("Ubicaciones"+Arrays.toString(ubicaciones));
                System.out.println("Numero de entradas compradas: "+entradasReservadas);
            }
            timer.cancel(); //Acá se cancela el cronometro
            mostarOpciones();
            opcion = scanner.nextInt();
                }
        case 3 -> { 
            System.out.println("Le gustaría liberar un asiento: \n1. SI\n2.NO"); //En esta sección el cliente puede decidir si liberal o no un asiento. Aunque esta opción esta
            int opcion2 = scanner.nextInt();                                       // en el hito 3, puede hacerlo antes de confirmar la compra en la opción 2.
            System.out.println("¿Que entrada desea eliminar? Escriba la letra y el número del asiento. Si reservo, por ejemplo, el \"a1\", entonces escriba a1.");
            System.out.println (Arrays.toString(asientosA));
            System.out.println (Arrays.toString(asientosB));
            entrada=scanner.next().toLowerCase();
            if (entrada.equals("a1")){
                asientosA[0]="a1"; //Aca va un break point para verificar que se actualizó la posición 0 del array
                ubicaciones[0]="liberado a1"; //Acá va un break point para verificar que se actualizó la posición 0 del array
                System.out.println("Ha liberado asiento a1");
                entradasReservadas--;// Acá va un break point para verificar que se restó el acumular y se vea reflejado el número real de 
                                     //entradas compradas en la boleta.
            }else if (entrada.equals("a2")){
                asientosA[1]="a2";
                ubicaciones[1]="liberado a2";
                System.out.println("Ha liberado asiento a2");
                entradasReservadas--;
            }else if (entrada.equals("b1")){
                asientosB[0]= "b1";
                ubicaciones[2]="liberado b1";
                System.out.println("Has liberado el asiento b1");
                entradasReservadas--;
            }else if (entrada.equals("b2")){
                asientosB[1]= "b2";
                ubicaciones[3]="liberado b2";
                System.out.println("Has liberado el asiento b2");
                entradasReservadas--;
            }else{
                System.out.println("Asientos no han sido reservados aún");
            }    
            mostarOpciones();
            opcion = scanner.nextInt();
                }
        case 4 -> { 
            System.out.println("===================");
            System.out.println(boleta);
            System.out.println("===================");
            System.out.println("Total entradas compradas: "+entradasReservadas); //Break point para verificar que se efectuaron los cambios de valor en la variable a lo largo del ciclo.
            System.out.println("Ubicaciones: "+Arrays.toString(ubicaciones));//Break point para verificar que se efectuaron los cambios de valor en la variable a lo largo del ciclo
            System.out.println("Precio final: "+(precioBaseEntrada*entradasReservadas)); //Para verificar que se esten multipliclando los valores correspondientes a las variables.
            System.out.println("Total ingresos: "+(totalIngresosPorVenta)*(entradasReservadas*precioBaseEntrada));
            System.out.println("===================");
            System.out.println("===================");
            System.out.println("Para salir seleccione opcion 5");
            mostarOpciones();
            opcion = scanner.nextInt();
            
        }
        default ->{
            
            
            
        }
        }
     }
     
      }
    }


      
      
      
      

      
   
    



        
    
           
           
          
           
       
       
  


       
       
        
    
      
             
    

    

