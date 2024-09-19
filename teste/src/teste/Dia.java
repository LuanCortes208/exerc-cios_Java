package teste;

public class Dia {
	
	public enum DiaDaSemana {
	    SEGUNDA(1),
	    TERCA(2),
	    QUARTA(3),
	    QUINTA(4),
	    SEXTA(5),
	    SABADO(6),
	    DOMINGO(7);

	    private final int numero;

	    DiaDaSemana(int numero) {
	        this.numero = numero;
	    }

	    public int getNumero() {
	        return numero;
	    }
	}

}
