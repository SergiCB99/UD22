package C4.JUnit_Geometria;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestGeometria {
		
		@Test
		public void testAreaCuadrado() {
			int resultado = Geometria.areacuadrado(1);
			int esperado = 1;
			assertEquals(esperado,resultado);
		}

		@Test
		public void testAreaCirculo() {
			double resultado = Geometria.areaCirculo(1);
			double esperado = 3.14;
			double delta = 0.2;
			assertEquals(esperado,resultado,delta);
		}
		
		@Test
		public void testAreaTriangulo() {
			double resultado = Geometria.areatriangulo(2,2);
			double esperado = 2;
			assertEquals(esperado,resultado);
		}
		
		@Test
		public void testAreaRectangulo() {
			double resultado = Geometria.arearectangulo(3,2);
			double esperado = 6;
			assertEquals(esperado,resultado);
		}
		
		@Test
		public void testAreaPentagono() {
			double resultado = Geometria.areapentagono(3,2);
			double esperado = 3;
			assertEquals(esperado,resultado);
		}
		
		@Test
		public void testAreaRombo() {
			double resultado = Geometria.arearombo(2,3);
			double esperado = 3;
			assertEquals(esperado,resultado);
		}
		
		@Test
		public void testAreaRomboide() {
			double resultado = Geometria.arearomboide(3,2);
			double esperado = 6;
			assertEquals(esperado,resultado);
		}
		
		@Test
		public void testAreaTrapecio() {
			double resultado = Geometria.areatrapecio(3,2,3);
			double esperado = 6;
			assertEquals(esperado,resultado);
		}
		
		@Test
		public void testFiguraCuadrado() {
			String resultado = Geometria.figura(1);
			String esperado = "cuadrado";
			assertEquals(esperado,resultado);
		}
		
		@Test
		public void testFiguraCirculo() {
			String resultado = Geometria.figura(2);
			String esperado = "Circulo";
			assertEquals(esperado,resultado);
		}
		
		@Test
		public void testFiguraTriangulo() {
			String resultado = Geometria.figura(3);
			String esperado = "Triangulo";
			assertEquals(esperado,resultado);
		}
		
		@Test
		public void testFiguraRectangulo() {
			String resultado = Geometria.figura(4);
			String esperado = "Rectangulo";
			assertEquals(esperado,resultado);
		}
		
		@Test
		public void testFiguraPentagono() {
			String resultado = Geometria.figura(5);
			String esperado = "Pentagono";
			assertEquals(esperado,resultado);
		}
		
		@Test
		public void testFiguraRombo() {
			String resultado = Geometria.figura(6);
			String esperado = "Rombo";
			assertEquals(esperado,resultado);
		}
		
		@Test
		public void testFiguraRomboide() {
			String resultado = Geometria.figura(7);
			String esperado = "Romboide";
			assertEquals(esperado,resultado);
		}
		
		@Test
		public void testFiguraTrapecio() {
			String resultado = Geometria.figura(8);
			String esperado = "Trapecio";
			assertEquals(esperado,resultado);
		}
		
		@Test
		public void testFiguraDefault() {
			String resultado = Geometria.figura(9);
			String esperado = "Default";
			assertEquals(esperado,resultado);
		}
		
		@Test
		public void testGetID() {
			Geometria test = new Geometria(1);
			int resultado = test.getId();
			int esperado = 1;
			assertEquals(esperado,resultado);
		}
		
		@Test
		public void testGetNom() {
			Geometria test = new Geometria(1);
			String resultado = test.getNom();
			String esperado = "cuadrado";
			assertEquals(esperado,resultado);
		}
		
		@Test
		public void testToString() {
			Geometria test = new Geometria(1);
			String resultado = test.toString();
			String esperado = "Geometria [id=1, nom=cuadrado, area=0.0]";
			assertEquals(esperado,resultado);
		}
		
		
		
}

