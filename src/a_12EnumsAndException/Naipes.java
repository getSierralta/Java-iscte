package a_12EnumsAndException;

import java.util.ArrayList;
import java.util.List;

public class Naipes {
	//Defina um enumerado Suit para representar os quatro naipes das cartas de jogar
	//(espadas, paus, copas, e ouros).
	//a. Defina um enumerado Rank para representar os treze valores possíveis para
	//uma carta de jogar (Às, 7 (Manilha), Rei, Valete, Dama, 10, 9, 8, 6, 5, 4, 3, 2),
	//assumindo que estas vão ser utilizadas para o jogo da Sueca (embora as cartas
	//10, 9, e 8 não sejam utilizadas). Desta forma, as cartas têm uma ordem de
	//valor, pelo que a ordem pela qual as constantes do enumerado são definidas
	//poderá ser relevante (para determinar qual o valor mais alto entre duas
	//cartas). Inclua informação relativa aos pontos que cada carta vale no jogo da
	//Sueca (Ás=11, Manilha=10, Rei=4, Valete=3, Dama=2, outras=0).
	//b. Defina uma função de teste que dado uma lista de Rank devolve o somatório
	//de pontos.
	//c. Utilizando as exceções que conhece, complete o exercício anterior
	public enum Suit {
		ESPADAS, PAUS, COPAS, OUROS
	}

	public enum Rank {
		AS(11), MANILHA(10), REI(4), VALENTE(3), DAMA(2), DEZ(0), NOVE(0), OITO(0), SEIS(0), CINCO(0), QUATRO(0), TRES(0), DOS(0);
		private int value;
		Rank(int i) {
			this.value = i;
		}

		public int getValue() {
			return value;
		}


	}
	public static int getPoints(ArrayList<Rank> ranks){
		int points = 0;
		for (Rank rank: ranks) {
			points += rank.getValue();
		}
		return points;
	}
	public static void main(String[] args){
		List<Rank> ranks = new ArrayList<Rank>();
		List<Rank> ranks1 = new ArrayList<Rank>();
		ranks.add(Rank.AS);
		ranks.add(Rank.NOVE);
		ranks.add(Rank.DAMA);
		ranks.add(Rank.VALENTE);
		ranks.add(Rank.MANILHA);
		ranks.add(Rank.DAMA);
		System.out.println(getPoints((ArrayList<Rank>) ranks));

	}


}
