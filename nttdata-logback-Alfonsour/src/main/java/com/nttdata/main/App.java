package com.nttdata.main;

/**
 * Hello world!
 *
 */
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.ArrayList;
import java.util.Scanner;
public class App 
{
	private static final Logger log = LoggerFactory.getLogger(App.class);

	/**
	 * Método Principal -- Contabilizador del Personal.
	 * @author UrBaNo_24
	 * @param args
	 */
	
	public static void main(String[] args) throws InterruptedException {
		log.debug("Inicializar Scanner");
		//Generar Scanner para guardar los datos.
		Scanner sc = new Scanner(System.in);
		
		log.debug("Inicialización de la función/método");
		// Inicializar el arrayList
		log.debug("Inicialización del arrayList");
		ArrayList<String> array = new ArrayList<String>();
		// Generar variable para guardar cada nombre.
		log.info("Inicializar variable `name`");
		String name = "";
		// Generar variable para guardar las diferentes opciones se irán eligiendo.
		log.info("Inicializar variable `choose`");
		int choose = 1;
		log.debug("Inicialización del bucle principal");
		do {
			System.out.print("\nElija una opción(0-4): \n1-Contabilizar llegada del personal \n2-Contabilizar salida del personal \n3-Resetear Contabilizador\n 4-Mostrar Contabilizador\n 0-Salir\n");
			choose = sc.nextInt(); //Guardar opción elegida en la variable choose.
			//Opciones:
			//Opción 1 : Contabilizar llegada del personal.
			if (choose == 1) {
				System.out.print("Introduce un nombre:"); //Pedir dato seleccionado.
				array.add(name = sc.next()); //almacenar dato en el arrayList
				System.out.print("\nPersona añadida con éxito.\n");
			}
			//Opción 2 : Contabilizar salida del personal
			else if (choose == 2) {
				System.out.print("Introduce la persona que ha salido:"); //Pedir dato seleccionado.
				name  = sc.next(); //Almacenar nombre que queremos sacar.
				for (int i = 0; i<array.size();i++) {
					if(array.get(i).equals(name)) { //Comprobar si el nombre que se quiere scar es igual a cada una de las posiciones del array, cuando coincida, ese nombre se sacará.
						array.remove(i);
						System.out.print("\nPersona eliminada con éxito.\n");
					}
				}
			}
			//Opcion 3 : Resetear Contabilizador
			else if (choose == 3) {
                int count = array.size(); //Almacenar tamaño actual del array en la variable count, ya que el tamaño va cambiando conforme vamos eliminando nombres.
                for (int i = 0; i < count; i++) {
                    array.remove(0);
                }
                System.out.print("\nContabilizador eliminado con éxito.\n");
            }
			//Opción 4 : Mostrar Contabilizador.
			else if (choose == 4) {
				for (int i = 0; i<array.size();i++) {
					System.out.print(i + 1 + "- " + array.get(i) + "\n");
				}
			}
		}	while(choose != 0);
		
		sc.close();
		
		
			
	}
}



		

