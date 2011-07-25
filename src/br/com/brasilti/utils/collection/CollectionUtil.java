package br.com.brasilti.utils.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtil {

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
