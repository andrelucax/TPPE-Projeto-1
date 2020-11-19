package parserPck;

import java.io.FileNotFoundException;
import java.io.FileReader;

import parserExcpts.ArquivoNaoEncontradoException;

public class ParserRAC {	
	private FileReader arq;

	public ParserRAC(){
		
	}

	public void open(String string) throws ArquivoNaoEncontradoException {
		try {
			arq = new FileReader(string);
		}
		catch(FileNotFoundException e){
			throw new ArquivoNaoEncontradoException(string);
		}
	}
}
