 public class Producto

    {           // Abre clase Producto


        
    int producto = 1;
    // Variable comun y accesible a todos los 
    // metodos de la clase

        public void Producto()
        {          // Abre metodo producto

    System.out.println("\nEste programa calcula el producto ");
    System.out.println("\nde los enteros impares del 1 al 15\n");


    // Se asume que el numero que no es par es impar
    // y por lo tanto producto sera igual a producto*numero
    

    for ( int i = 1; i <= 15; i++ )
    {           // Abre for

        if( i % 2 != 0 )
            producto *= i;

    }           // Cierra for



        }         // Cierra metodo producto


    public void Imprime()
    {         // Abre metodo Imprime
    System.out.printf("\nEl producto es: %d\n", producto );
    }         // Cierra metodo Imprime

    }           // Cierra clase Producto