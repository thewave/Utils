package br.com.brasilti.utils.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Agrupa metodos estaticos com o objetivo de facilitar a manipulacao de colecoes.
 * 
 * @author Benedito Barbosa
 * @author Christian Peixoto
 * 
 */
public class CollectionUtil {

	/**
	 * Converte um determinado varargs em uma lista. Cada elemento do varargs ocupara a mesma posicao na lista retornada.
	 * 
	 * @param varargs
	 * @return Lista de elementos.
	 * @exception IllegalArgumentException
	 *                se o varargs for nulo.
	 */
	public static <T> List<T> convert(T... varargs) {
		if (varargs == null) {
			throw new IllegalArgumentException();
		}

		List<T> list = new ArrayList<T>();

		for (int i = 0; i < varargs.length; i++) {
			list.add(varargs[i]);
		}

		return list;
	}

}
