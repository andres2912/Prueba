package com.pruebaQuipux.services.numeros;

/**
 * Esta interfaz define un servicio para la validación y categorización de números enteros de acuerdo con ciertos criterios. <br>

 * @author Andrés Felipe Lopera <br>
 * Creado el Dec 20, 2024 a las 3:00:15 PM <br>
 */
public interface NumerosService {
	/**
	 * Valida un número siguiendo ciertos criterios <br>
	 * <ul>
	 * <li>Si el número es impar, retorna "Quipux".</li>
	 * <li>Si el número es par y está en el rango de 2 a 5 (inclusive), retorna "No
	 * Quipux".</li>
	 * <li>Si el número es par y está en el rango de 6 a 20 (inclusive), retorna
	 * "Quipux".</li>
	 * <li>Si el número es par y es mayor que 20, retorna "No Quipux".</li>
	 * </ul>
	 * Creado el Dec 20, 2024 a las 3:00:16 PM<br>
	 *
	 * @param numero debe ser un valor entero entre 1 y 100.
	 * @return un String con el mensaje correspondiente según el número.
	 * @throws IllegalArgumentException Si el número no está en el rango determinado
	 */
	String validacionNumero(Integer numero);
}
