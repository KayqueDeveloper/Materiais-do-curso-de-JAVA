package excecao.personalizadaB;

public class Validar {

	private Validar() {}
	
	public static void testeAluno(Aluno aluno) throws StringVaziaException , NumeroForaIntervaloException  {
		
		if(aluno == null) {
			throw new IllegalArgumentException("aluno esta nulo");
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if (aluno.nota > 10 || aluno.nota < 0) {
			throw new NumeroForaIntervaloException("nota");
		}
	
	}
	
}
