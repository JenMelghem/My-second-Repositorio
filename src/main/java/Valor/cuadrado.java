import java.util.Scanner;
 
 public class cuadrado
 
 {        
 private String mensaje;
 Scanner entrada = new Scanner(System.in);
 
 ////////////////////////////////////////////////////////////////////////
 //ABRE CONSTRUCTOR
 //////////////////////////////////////////////////////////////////////
 
 
 public Deitel_4_29(String cadena)
 {                  // Abre constructor
  mensaje = cadena;
 }                      // Cierra constructor
 
 ///////////////////////////////////////////////////////////////////////
 //METODO RECIBE 
 ///////////////////////////////////////////////////////////////////////
 
 public void Recibe()
 {               // Abre metodo recibe
 
 int lado;       // Se recibe el lado del cuadrado
 System.out.println("\nPor favor introduzca un numero entre 1 y 20 y se imprimira un cuadrado con ese numero de lado:");
 lado = entrada.nextInt();
 
 Imprime( lado);
 
 
 }              // Cierra metodo recibe
 
 
 ///////////////////////////////////////////////////////////////////////////
 //METODO IMPRIME
 //////////////////////////////////////////////////////////////////////////
 
 public void Imprime( int x)
 {                 // Abre el metodo Imprime
 int contadorHorizontal = 1;
 int contadorVertical = 2;
 
 while( contadorHorizontal++ <= x)
 {    // Abre while
 System.out.print("*");
 }       // Cierra while
 System.out.print("\n");
 
 // Aqui se cambia el valor de contadorHorizontal a 1, indicando que se esta en un nuevo renglon.
 contadorHorizontal = 1;
 
 while ( contadorVertical++ < x) // LOs limites van de 2( valor inicial) a
 // x-1, ya que enla primera y ultima linea se imprimen asteriscos
 
 
 {          // Abre while que controla columnas
 
 while ( x >= contadorHorizontal)  // Aqui se imprime el renglon
 {              // Abre while anidado
 if ((1 == contadorHorizontal) || (x == contadorHorizontal))
 System.out.print("*");
 else
 System.out.print(" ");
 
 contadorHorizontal++;
 }               // Cierra while anidado
 
 System.out.print("\n");  // con esto se cambia de renglon
 contadorHorizontal = 1;
 }             // Cierra while 
 
 contadorHorizontal = 1;
 while ( contadorHorizontal++ <= x)
 { // ABre while
 System.out.print("*");
 }         // Cierra while
 
 System.out.println("\n");
 }                // Cierra el metodo Imprime
 }           