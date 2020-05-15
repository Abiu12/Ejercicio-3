/**
 * Esta clase realiza una diferencia de numeros introducidos en la misma linea
*@author Franco Matias Abiu Mahanaim
*@version 19/04/2020
 */
 import java.util.Scanner; // se importa el Scanner para poder leer el numero desde el teclado
public class E3{
    
       Scanner sc=new Scanner(System.in);// Se declara la variable del Scanner
          
       
        
        String a=sc.nextLine();//Se lee desde el teclado y se guarda en la varible
        
        
        char b;//char auxiliar
        char c;//char auxiliar
        String j="";//String auxiliar
        String i="";//String auxiliar
         public  int Resta(){
        for(int x=0;x<a.length();x++){
      if(a.charAt(x)!=' '){//condicion para recorrer y guardar en la variable b, para despues agregarlo a la cadena j el caracter que tenga en la posicion x hasta encontrarse con el espacio
         b=a.charAt(x);
        j=j+b;
       }
else {//en caso de encontrarse con el espacio aumenta x en uno para emepzar con el primer numero
    x++;
    
    while(x<a.length()){//ciclo para guardar los caracateres en la variable c ,para despues guardarlos en el String i
        c=a.charAt(x);
       i=i+c;
        
        x++;
    }
    
}}
int s1=(new Integer(j)).intValue();//Se convierte el String j a enteros y se guarada en una variable
int s2=(new Integer(i)).intValue();//Se convierte el String i a enteros y se guarada en una variable
int resta=0;// se crea la variable de resta
resta=s1-s2;// se realiza la operacion
resta=Math.abs(resta);
return resta;} 
}


