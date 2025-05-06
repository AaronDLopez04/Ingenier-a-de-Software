package mx.unam.aragon.ico.is.computadoraapi;

import mx.unam.aragon.ico.is.computadoraapi.entities.Computadora;
import mx.unam.aragon.ico.is.computadoraapi.repositories.ComputadoraRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComputadoraapiApplicationTests {
	@Autowired
	private ComputadoraRepository computadorarepository;

	@Test
	void contextLoads() {
	}

	@Test
	void insertarComputadora() {
		Computadora computadora = new Computadora(0,  "HP", "pavillion 2000", null, 13000.0f);
		computadorarepository.save(computadora); //insert into
	}

	@Test
	void leerComputadoraPorClave() {
		Long claveTmp = 2l;
		Computadora tmp = computadorarepository.findComputadoraByClave(claveTmp);
		System.out.println(tmp);
	}

	@Test
	public void eliminarComputadora() {
		Long claveTmp = 2l;
		computadorarepository.deleteById(claveTmp);
	}

	@Test
	public void actualizarComputadora() {
		Long claveTmp = 4l;
		Computadora tmp = computadorarepository.findComputadoraByClave(claveTmp);
		tmp.setModelo("Patito 3000");
		computadorarepository.save(tmp);
	}

}