import java.util.Scanner;


   public class rombos

   {         // Abre clase rombos

   private int Tamano = 9;

     
   // la varibale Tamano controla la diagonal del rombo


       // Se define el metodo Imprime
   public void Imprime()
   {     // Abre metodo Imprime
   
   Scanner entrada = new Scanner(System.in);
   int x = 4;  // 4 no tiene ningun sentido especial
               // se puede usar cualquier numero par

   System.out.print("\nEste programa despliega un rombo en la pantalla.");

   while ( x % 2 == 0 )
   {   // Abre while

   System.out.println("\nPor favor introduzca un entero impar que definira su dimension: ");
   x = entrada.nextInt();

   }     // Cierra while

   Tamano = x;

   System.out.println("\nAqui esta el rombo: \n\n");

   for ( int i = 1; i <= ((Tamano/2) + 1); i ++ )
   {   // Abre for
          
   for ( int  k = 1; k <= Tamano / 2 - i + 1; k++ )
   System.out.printf(" ");
                         
   // Este ciclo imprime el triangulo superior       
   for ( int j = (Tamano / 2) - i + 2; j <= (Tamano / 2) + i; j++ )  
   System.out.printf("*");


   System.out.printf("\n"); 
    
   }   // Cierra for


   // Abre segundo for, que imprime el triangulo de abajo

   for ( int l = 1; l <= Tamano / 2; l++ )
   {    // Abre for que imprime el segundo triangulo
   
   // Se imprimen los espacios

   for( int m = 1; m <= l; m++ )
   {     // Abre for
   
   System.out.printf(" "); 
   
   }     // Cierra for 

   for (int n = l + 1; n <= Tamano - l  ; n++)
   System.out.printf("*");

    
   System.out.println();

   }    // Cierra for que imprime el segundo triangulo

   }     // Cierra metodo Imprime
   }         // Cierra clase rombos