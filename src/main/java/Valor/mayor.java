import java.util.Scanner;           
            
public class mayor          
            
{ // Abre clase Deitel_4_23        
Scanner entrada = new Scanner(System.in);        
private String mensaje;          
private int mayor;          
private int segundo;          
            
public mayor( String cadena)         
{ // Abre constructor         
mensaje = cadena;          
} // Cierra constructor         
            
///////////////////////////////////////////////////////////////////////////            
//METODO RECIBE           
/////////////////////////////////////////////////////////////////////////            
            
public void Recibe()          
{ // Abre el metodo recibe       
int numero;           
int contador = 1;         
            
System.out.printf("\nEste es su mensaje: %s\n", mensaje);       
            
System.out.printf("\nEscriba por favor el numero %d: ", contador++);     
mayor = entrada.nextInt();          
            
System.out.printf("\nEscriba por favor el numero %d: ", contador++);     
segundo = entrada.nextInt();          
            
if ( segundo > mayor )       
Intercambia(segundo, mayor);           
            
while ( 10 >= contador)        
{ // Abre while         
            
System.out.printf("\nEscriba por favor el numero %d: ", contador++);     
numero = entrada.nextInt();          
            
if ( numero > mayor)        
Intercambia(numero, mayor);           
            
            
            
} // Cierra while         
            
            
System.out.printf("\nEl numero mayor es: %d y el siguiente es %d\n", mayor, segundo); 
            
} // Cierra el metodo recibe       
            
            
//////////////////////////////////////////////////////////////////////////            
//METODO INTERCAMBIA           
////////////////////////////////////////////////////////////////////////////            
public void Intercambia( int x, int y)      
{ // Abre metodo intercambia        
mayor = x;          
segundo = y;          
} // Cierra metodo intercambia        
            
            
            
            
} // Cierra clase mayor       