package teatrosmoro;

import java.util.Scanner;

public class Exp2s5AlexanderDiazTeatros{
   //Declaro mis variables de instancia
     String nombre;
     String correo;
public Exp2s5AlexanderDiazTeatros (String nombre,String correo){
        this.nombre="";
        this.correo="";
}
//Declaro variables estaticas
    static double totalIngresosPorVenta = 0;
    static double precioEntrada = 10000;
    static void mostarOpciones(){ //Declaro metodo para no repetir el menu repetidas veces a lo largo del metodo.
        System.out.println("Seleccione su opción: \n1. Busqueda de entradas \n2. Promociones \n3. Venta de entradas \n4. Eliminación de entradas \n5. Resumen de compra");
    }
    //Entrada 
    public static void main(String[] args) {
        //Declaro variables locales
       double precioFinal1 = precioEntrada*0.90;
       double precioFinal2 = precioEntrada*0.85;
       int cantEntradas = 0;
       String tipoEntrada;
       String ubicacion;
       int deleteEntrada;
      Scanner scanner=new Scanner(System.in);
       int tipoTarifa = 0;
      System.out.println("Bienvenido a Teatros Moro");
      System.out.println("Cuales es su nombre");
      
      mostarOpciones();
      int opcion = scanner.nextInt();
      while (opcion<5) {
     switch (opcion){
        case 1 -> {  //Acá el cliente escoje que entrada busca según su ubicación, junto con la cantidad de entradas para esas ubicaciones.
            System.out.println ("Que tipo de entrada busca. Escriba su ubicación en el buscador: \n VIP  \n Platea \nPalcos");
            tipoEntrada = scanner.next().toUpperCase();
            if (tipoEntrada.equals("VIP") ){
                System.out.println("VIP: 5 \nSi desea comprar entradas ir a opción 3.");
                mostarOpciones();;
                opcion = scanner.nextInt();
                break;
            }else if(tipoEntrada.equals("PLATEA")){
                System.out.println("Platea: 5 \n Si desea comprar entradas ir a opción 3.");
                mostarOpciones();
                opcion = scanner.nextInt();
            }else{
                System.out.println("Palcos: 10 \nSi desea continuar con la compra ir a opción 3.");
                mostarOpciones();
                opcion = scanner.nextInt();
            }  
        }
        case 2 -> { //Acá se simula la promoción al cliente.
            System.out.println("Tenemos la siguiente promoción estimado cliente, puede conseguir 2 entradas VIP por el precio de 1 entrada si compra nuestro combo de 2 cajas grandes de cabritas con una bebida");
            mostarOpciones();;
            opcion = scanner.nextInt();
                }
        case 3 -> { //En esta opción del código se permite al cliente comprar la cantidad de entradas teniendo que consideración las entradas disponiblies por ubicación
                    //También se muestra el precio base de la entrada, y el descuento que aplicara si es estudiante o adulto mayor.
            System.out.println("Tenemos un total de 20 entradas disponibles: \nVIP: 5\nPLATEA: 5 \nPALCOS : 10");
            System.out.println ("Precio base de entrada: 10000. Escoja el número de su tarifa \n1. Estudiante 10% descuento \n2.Tercera edad 15% descuento");
            tipoTarifa= scanner.nextInt();
            System.out.println("¿Que ubicacion desea: VIP, Platea, Palcos?");
            ubicacion = scanner.next().toUpperCase();
            System.out.println("¿Que cantidad de entradas desea?");
            cantEntradas = scanner.nextInt();
            if(ubicacion.equals("VIP") && cantEntradas<=5){
                System.out.println("Excelente. Has reservado "+cantEntradas+" entradas en la ubicacion "+ubicacion);  
            }else if (ubicacion.equals("PLATEA") && cantEntradas<=5 ){
                System.out.println("Excelente. Has reservado "+cantEntradas+" entradas en la ubicacion "+ubicacion);
            }else if (ubicacion.equals("PALCOS") && cantEntradas<=10){
                System.out.println("Excelente. Has reservado "+cantEntradas+" entradas en la ubicacion "+ubicacion);
            }else{
                System.out.println("Ingrese ubicación o cantidad de entradas correcta");
            }
            mostarOpciones();
            opcion = scanner.nextInt();
                }
        case 4 -> { //En esta parte se permite al cliente eliminar las entradas previamente compradas en opción 3, y según la ubicación.
            System.out.println("Que cantidad de entradas desea eliminar");
            deleteEntrada = scanner.nextInt();
            System.out.println("¿Que ubicacion? \nVIP \nPLATEA \nPALCOS "); 
            ubicacion = scanner.next().toUpperCase(); //Utilizamos el .toUpperCase para que en caso de que el cliente no escriba el nombre de la 
                                                      //ubicación en mayuscula, pueda seguir ejecutandose el código
            if(ubicacion.equals("VIP") && deleteEntrada<=5){
                System.out.println(" Has eliminado "+deleteEntrada+" entradas en la ubicacion "+ubicacion);
                System.out.println("Entradas restantes: "+(cantEntradas-deleteEntrada));
            }else if (ubicacion.equals("PLATEA") && deleteEntrada<=5 ){
                System.out.println("Has eliminado "+deleteEntrada+" entradas en la ubicacion "+ubicacion);
                System.out.println("Entradas restantes: "+(cantEntradas-deleteEntrada));
            }else if (ubicacion.equals("PALCOS") && deleteEntrada<=10){
                System.out.println("Has eliminado "+deleteEntrada+" entradas en la ubicacion "+ubicacion);
                System.out.println("Entradas restantes: "+(cantEntradas-deleteEntrada));
            }else{
                System.out.println("Ingrese ubicación o cantidad de entradas correcta");
            }
            mostarOpciones();
            opcion = scanner.nextInt();
            
      
               
            //El cliente, al marcar opción 5, puede visualizar el resumen de su compra, donde muestra la ubicación, entradas vendidas, precio final e ingresos.
            //Cabe resaltar que es preciso ir en orden para que muestre el resumen de la compra. Si el cliente no ha comprado entradas, ni elminado entradas
            //no aparecerá el resumen. Tiene que comprar entradas y al menos eliminar una para que pueda aparecer el resumen de su compra.
            System.out.println("Resumen de compra");
            System.out.println("Ubicación: "+ubicacion);
            System.out.println("Cantidad de entradas vendidas: " +(cantEntradas-deleteEntrada));
            if (tipoTarifa==1){
               System.out.println("Precio final por tarifa estudiante: "+precioFinal1*(cantEntradas-deleteEntrada));
               totalIngresosPorVenta = precioFinal1*(cantEntradas-deleteEntrada) ;
               System.out.println("Total Ingresos: "+totalIngresosPorVenta);
            }else{
                System.out.println("Precio final por tarifa adulto mayor: "+precioFinal2*(cantEntradas-deleteEntrada));
               totalIngresosPorVenta = precioFinal2*(cantEntradas-deleteEntrada);
               System.out.println("Total Ingresos: "+totalIngresosPorVenta);
               System.out.println("Gracias por su compra");
               
            }
            
        }
     }
     
      }
    }
}

      
      
      
      

      
   
    



        
    
           
           
          
           
       
       
  


       
       
        
    
      
             
    

    

