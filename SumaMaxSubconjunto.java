package Periodo1;
import java.util.Scanner;
public class SumaMaxSubconjunto {

	public static void main(String[] args) throws Exception{
		
		//Creacion del array
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce el tamaño del conjunto: "); //tamaño del array
        int n = reader.nextInt();
        int[] array = new int[n];
        
        for(int i=0; i<n; i++){
            System.out.println("Introduce la posicion "+i+": "); //introduce los valores del array
            int numeros = reader.nextInt();
            array[i] = numeros;
        }
        System.out.print("\nSu conjunto es:"); //imprime el array
        for(int i=0; i<n; i++){
            System.out.print(" "+array[i]+ ",");
        }
        reader.close();
         //Declaramos las variables a ocupar
        int inicioTemporal = 0, inicioFinal = 0;
        int posicionFinal = 0;
        int sumaTemporal= array[0], sumaFinal= array[0]; //Inicializamos desde la primer casilla

        for(int y=1; y<n; y++){
            if(array[y] < sumaTemporal + array[y]){ //La suma de todos los valores es mayor al array[y]
                sumaTemporal += array[y];   //se almacena la suma y se mantiene la posicion inicial
            }
            else{  //La suma es menor a array[y]
                sumaTemporal=array[y];  //Se asigna el valor de la suma el valor de array[y]
                inicioTemporal = y;     //Se modifica la posicion incial
            }

            if(sumaTemporal>sumaFinal){ //verifica si la suma temporal es mayor a la final para actualizar los marcadores
                sumaFinal = sumaTemporal; //Actualiza la suma
                inicioFinal = inicioTemporal; //Actualiza la poscion inicial
                posicionFinal = y; //Actualiza la posicion final
            }
        }
        //Impresion de subconjunto y suma
        System.out.print("\nEl subconjunto contiguo es:"); 
            for(int i=inicioFinal; i<=posicionFinal; i++){
                System.out.print(" "+array[i]+ ",");
            }
        System.out.println("\nLa suma maxima es : "+sumaFinal);
        

	}

}
