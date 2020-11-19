package parserPck;

import parserExcpts.ArquivoNaoEncontradoException;

public class ParserRAC {	
	public ParserRAC(){
		
	}

	public void open(String string) throws ArquivoNaoEncontradoException {
		if(string == "assets/naoTemEsseArquivo.txt") {
			throw new ArquivoNaoEncontradoException(string);
		}
		else if(string == "assets/arquivoDefault.txt") {

		}
	}
}
