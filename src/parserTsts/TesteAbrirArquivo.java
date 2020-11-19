package parserTsts;
//import static org.junit.Assert.*;

import org.junit.Test;

import parserExcpts.ArquivoNaoEncontradoException;
import parserPck.ParserRAC;

public class TesteAbrirArquivo {

	@Test
	public void TesteAbrirArquivoSucesso() throws ArquivoNaoEncontradoException {
		ParserRAC parser = new ParserRAC();
		parser.open("assets/arquivoDefault.txt");
	}
	
	@Test(expected=Exception.class)
	public void TesteAbrirArquivoArquivoNaoEncontrado() throws ArquivoNaoEncontradoException {
		ParserRAC parser = new ParserRAC();
		parser.open("assets/naoTemEsseArquivo.txt");
	}

}
