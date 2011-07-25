package br.com.brasilti.utils.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class CollectionUtilTest {

	@Test(expected = IllegalArgumentException.class)
	public void deveLancarExcecaoQuandoOParametroForNuloException() {
		CollectionUtil.convert(null);
	}

	@Test
	public void deveRetornarUmaListaVazia() {
		List<String> list = CollectionUtil.convert();

		assertTrue(list.isEmpty());
	}

	@Test
	public void deveRetornarUmaListaComUmElementoNulo() {
		String element = null;
		List<String> list = CollectionUtil.convert(element);

		assertEquals(1, list.size());
		assertNull(list.get(0));
	}

	@Test
	public void deveRetornarUmaListaComUmElementoNaoNulo() {
		String element = "a";
		List<String> list = CollectionUtil.convert(element);

		assertEquals(1, list.size());
		assertEquals("a", list.get(0));
	}

	@Test
	public void deveRetornarUmaListaComDoisElementos() {
		List<String> list = CollectionUtil.convert("a", "b");

		assertEquals(2, list.size());
		assertEquals("a", list.get(0));
		assertEquals("b", list.get(1));
	}

	@Test
	public void deveRetornarUmaListaComTresElementos() {
		String[] varargs = { "a", "b", "c" };
		List<String> list = CollectionUtil.convert(varargs);

		assertEquals(3, list.size());
		assertEquals("a", list.get(0));
		assertEquals("b", list.get(1));
		assertEquals("c", list.get(2));
	}

}
