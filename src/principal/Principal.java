package principal;

import javax.swing.JOptionPane;
import conversorMoneda.SeleccionConversion;

public class Principal {

	public static void main(String[] args) {
		
		int opcion;


		do {
			String[] opciones = {"Moneda"};
			String cuadroOpciones = (String) JOptionPane.showInputDialog(null,
					"Seleccione una opción de conversión",
					"Menú",
					JOptionPane.PLAIN_MESSAGE,
					null,
					opciones,
					"Temperatura");
			if (cuadroOpciones != null) {
				switch (cuadroOpciones) {
				case "Moneda": {
					String opcionesMoneda = (String) JOptionPane.showInputDialog(null,
							"Seleccione una opción de conversión",
							"Menú",
							JOptionPane.PLAIN_MESSAGE,
							null,
							new Object[] {"De ARS a USD", "De ARS a EUR", "De USD a ARS", "De USD a EUR", "De EUR a ARS", "De EUR a USD"},
							"De ARS a USD");
					SeleccionConversion.seleccion(opcionesMoneda);
					
					break;
				}
				default:
					break;
				}

			} else {
				break;
			}
			

			opcion = JOptionPane.showConfirmDialog(null,"¿Desea continuar?", "Pregunta", 
					JOptionPane.YES_NO_OPTION);
		} while (opcion == 0);
	}

}
