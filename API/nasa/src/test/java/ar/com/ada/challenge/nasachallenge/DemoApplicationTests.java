package ar.com.ada.challenge.nasachallenge;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ar.com.ada.challenge.nasa.entities.Pais;
import ar.com.ada.challenge.nasa.services.PaisService;
import ar.com.ada.challenge.nasa.services.PaisService.PaisValidationType;

@SpringBootTest
class DemoApplicationTests {


	@Autowired 
	PaisService paisService;

	@Test
	void contextLoads() {
	}

	@Test
	void verificarPais() {

		Pais pais = new Pais();

		PaisValidationType validationType = paisService.verificarSerie(pais);
		
		assertEquals(PaisValidationType.PAIS_DATOS_INVALIDOS, validationType);
		
	}

	@Test
	void verificarSerieTempDuplicada() {

		Serie serie = new Serie();
		serie.setNombre("Euphoria");
		serie.setAño(2019);
		serie.setGenero("Drama");
		Temporada temporada = new Temporada();

		temporada.setNumeroTemporada(1);

		serie.getTemporadas().add(temporada);
		
		Episodio e = new Episodio();

		temporada.getEpisodios().add(e);
		
		Temporada temporada2 = new Temporada();

		temporada2.setNumeroTemporada(3);
		
		serie.getTemporadas().add(temporada2);
		
		e = new Episodio();

		temporada2.getEpisodios().add(e);
		

		SerieValidationType serieValidationType = service.verificarSerie(serie);
		
		assertEquals(SerieValidationType.TEMPORADA_DUPLICADA, serieValidationType);

	}


}
