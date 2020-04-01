package controller;

import java.util.Scanner;

import model.logic.Comparendo;
import model.logic.Modelo;
import view.View;

public class Controller {

	/* Instancia del Modelo*/
	private Modelo modelo;
	
	/* Instancia de la Vista*/
	private View view;
	
	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
	}
		
	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){
				
			case 1:
				
				modelo = new Modelo();
				
			
				long start = System.currentTimeMillis();
				modelo.cargarDatos(); 
				long end = System.currentTimeMillis();
										
				view.printMessage("Datos de comparendos cargados.");
				view.printMessage("Numero total de comparendos " + modelo.darTamano() + "\n---------");		
				view.printMessage("Tiempo de carga (seg): " + (end-start)/1000.0);
				
				view.printMessage("Primer comparendo: " + modelo.darPrimeroCola() + "\n");
				view.printMessage("Ultimo comparendo: "+modelo.darUltimoCola()+"\n");
				
				
				break;				
		

				case 2:
				
					break;

				case 3:
				
					break;

				case 4:
							
					break;
					
				case 5:
		
					view.printMessage("--------- \n Hasta pronto !! \n---------"); 
					lector.close();
					fin = true;
					break;	

				default: 
					view.printMessage("--------- \n Opcion Invalida !! \n---------");
					break;
			}
		}
		
	}	
}
