package teatrosmoro;

import java.util.Scanner;
import java.util.Arrays;

public class Exp2s4AlexanderDiazTeatros{
    


    public static void main(String[] args) {
        //Declaro mis variables
      Scanner scanner=new Scanner(System.in);
       int precioEntrada = 5000;
       int descEstudiante = 500;
       int descAdultoMayor = 750;
       int totalEntradas = 0;
      String[] asientosA = {"a1" , "a2" , "a3"};
      String[] asientosB = {"b1",  "b2" , "b3"};
      String[] asientosC = {"c1",  "c2" , "c3"};
      System.out.println("Bienvenido a Teatros Moro");
      System.out.println("Seleccione su opción: \nCOMPRAR \nSALIR");
      String text = scanner.next().toUpperCase();
      //Al presionar salir, nada del código siguiente se ejecutara
      if (text.equals("SALIR")){
          System.out.println("Gracias por visitarnos"); //A continuación, viene todo el proceso del programa. En la se solicita la edad
      }else{                                              // y el plano de los asientos en arrays que puede escoger el cliente.
      
      do{
              System.out.println(Arrays.deepToString(asientosA));
              System.out.println(Arrays.deepToString(asientosB));
              System.out.println (Arrays.deepToString(asientosC));
              System.out.println("Escoja su asiento escribiendo la letra y número correspondiente");
              String asiento = scanner.next();
              System.out.println("Ingrese su edad. Recuerde que estudiantes tienen 10% descuento sobre precio base, publico general sin descuentos, y adulto mayor del 15% ");
              int edad = scanner.nextInt();
              if (asiento.equals("a1") && edad>=18 && edad<30){
                  System.out.println("Ha reservado el asiento a1");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada-descEstudiante));
                  totalEntradas++;
              }else if(asiento.equals("a1") && edad>=30 && edad<65){
                  System.out.println("Ha reservado el asiento a1");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada));
                  totalEntradas++;
              }else if(asiento.equals("a1") && edad>=65){
                  System.out.println("Ha reservado el asiento a1");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada-descAdultoMayor));
                  totalEntradas++;
              }else if(asiento.equals("a2") && edad>=18 && edad<30){
                  System.out.println("Ha reservado el asiento a2");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada-descEstudiante));
                  totalEntradas++;
              }else if(asiento.equals("a2") && edad>=30 && edad<65){
                  System.out.println("Ha reservado el asiento a2");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada));
                  totalEntradas++;
              }else if(asiento.equals("a2") && edad>=65){
                  System.out.println("Ha reservado el asiento a2");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada-descAdultoMayor));
                  totalEntradas++;
              }else if(asiento.equals("a3") && edad>=18 && edad<30){
                  System.out.println("Ha reservado el asiento a3");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada-descEstudiante));
                  totalEntradas++;
              }else if(asiento.equals("a3") && edad>=30 && edad<65){
                  System.out.println("Ha reservado el asiento a3");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada));
                  totalEntradas++;    
              }else if(asiento.equals("a3") && edad>=65){
                  System.out.println("Ha reservado el asiento a3");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada-descAdultoMayor));
                  totalEntradas++;
              }else if(asiento.equals("b1") && edad>=18 && edad<30){
                  System.out.println("Ha reservado el asiento b1");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada-descEstudiante));
                  totalEntradas++;
              }else if(asiento.equals("b1") && edad>=30 && edad<65){
                  System.out.println("Ha reservado el asiento b1");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada));
                  totalEntradas++;    
              }else if(asiento.equals("b1") && edad>=65){
                  System.out.println("Ha reservado el asiento b1");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada-descAdultoMayor));
                  totalEntradas++;
              }else if(asiento.equals("b2") && edad>=18 && edad<65){
                  System.out.println("Ha reservado el asiento b2");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada-descEstudiante));
                  totalEntradas++;
              }else if(asiento.equals("b2") && edad>=30 && edad<65){
                  System.out.println("Ha reservado el asiento b2");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada));
                  totalEntradas++;        
              }else if(asiento.equals("b2") && edad>=65){
                  System.out.println("Ha reservado el asiento b2");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada-descAdultoMayor));
                  totalEntradas++;
              }else if(asiento.equals("b3") && edad>=18 && edad<65){
                  System.out.println("Ha reservado el asiento b3");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada-descEstudiante));
                  totalEntradas++;
              }else if(asiento.equals("b3") && edad>=30 && edad<65){
                  System.out.println("Ha reservado el asiento b3");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada));
                  totalEntradas++;    
              }else if(asiento.equals("b3") && edad>=65){
                  System.out.println("Ha reservado el asiento b3");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada-descAdultoMayor));
                  totalEntradas++;
              }else if(asiento.equals("c1") && edad>=18 && edad<65){
                  System.out.println("Ha reservado el asiento c1");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada-descEstudiante));
                  totalEntradas++;
              }else if(asiento.equals("c1") && edad>=30 && edad<65){
                  System.out.println("Ha reservado el asiento c1");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada));
                  totalEntradas++;     
              }else if(asiento.equals("c1") && edad>=65){
                  System.out.println("Ha reservado el asiento c1");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada-descAdultoMayor));
                  totalEntradas++;
              }else if(asiento.equals("c2") && edad>=18 && edad<30){
                  System.out.println("Ha reservado el asiento c2");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada-descEstudiante));
                  totalEntradas++;
              }else if(asiento.equals("c2") && edad>=30 && edad<65){
                  System.out.println("Ha reservado el asiento c2");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada));
                  totalEntradas++;     
              }else if(asiento.equals("c2") && edad>=65){
                  System.out.println("Ha reservado el asiento c2");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada-descAdultoMayor));
                  totalEntradas++;
              }else if(asiento.equals("c3") && edad>=18 && edad<30){
                  System.out.println("Ha reservado el asiento c3");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada-descEstudiante));
                  totalEntradas++;
              }else if(asiento.equals("c3") && edad>=30 && edad<65){
                  System.out.println("Ha reservado el asiento c1");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada));
                  totalEntradas++;     
              }else if(asiento.equals("c3") && edad>=65){
                  System.out.println("Ha reservado el asiento c3");
                  System.out.println("Precio base: $5000. Su total a pagar es: "+(precioEntrada-descAdultoMayor));
                  totalEntradas++;
              }
              System.out.println("Desea continuar: SALIR, COMPRAR");
              text = scanner.next().toUpperCase();
        }while(text.equals("COMPRAR")); //En caso de que cliente desee mas entradas, puede presionar comprar, y se repetirá nuevamente el proceso.
      System.out.println("Total de entradas reservadas: "+totalEntradas);
      System.out.println("Gracias por preferirnos. Disfrute la función\nVuelva pronto");
       //Fin de proceso, mostrando el total de entradas que ha comprado con un mensjae de despedida       
      
     
    
      }
      
    }
    
}
          
        
    
           
           
          
           
       
       
  


       
       
        
    
      
             
    

    

