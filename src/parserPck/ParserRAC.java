package parserPck;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

import parserExcpts.ArquivoNaoEncontradoException;

public class ParserRAC {	
	private FileReader arq;
	public Vector<Vector<Integer>> v;

	public ParserRAC(){
		arq = null;
		v = new Vector<Vector<Integer>>();
	}

	public void lerArq(String string) throws ArquivoNaoEncontradoException {
		try {
			arq = new FileReader(string);

			BufferedReader buffArq = new BufferedReader(arq);
			
			String linha = buffArq.readLine();
			
			while(linha != null) {
				// Tempo nao pode ser negativo, unica ocorrencia possivel de hifem
				if(linha.charAt(0) == '-') {
					Vector<Integer> vAux = new Vector<Integer>();
					v.add(vAux);
				}
				else {
					v.lastElement().add(Integer.parseInt(linha));
				}
				
				linha = buffArq.readLine();
			}

		}
		catch(Exception e){
			throw new ArquivoNaoEncontradoException(string);
		}
		
	}
}
