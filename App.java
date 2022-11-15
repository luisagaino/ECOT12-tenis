package br.edu.unifei.ecot12.esporte;

public class App {

	public static void main(String[] args) {		
		Jogador nadal = new Jogador();
		nadal.setNome("Rafael Nadal"); nadal.setNacionalidade("espanhol");
		nadal.setGenero("masculino"); nadal.setMaoDominante(LadoEnum.esquerda);
		Marca babolat = new Marca(); babolat.setNome("Babolat");
		nadal.setPatrocinador(babolat);
		Raquete pureaero = new Raquete();
		pureaero.setMarca(babolat);	pureaero.setModelo("Pure Aero");
		pureaero.setPeso(305); pureaero.setTamanho(630); 
		Bola bola = new Bola(); bola.setMarca(babolat);	bola.setPeso(57); bola.setDiametro(6.7f);
		
		Jogador djoko = new Jogador();
		djoko.setNome("Novak Djokovic"); djoko.setNacionalidade("sérvio");
		
		Saque s1 = new Saque(); s1.setLado(LadoEnum.esquerda);
		s1.setTipo(SaqueEnum.flat); s1.setVelocidade(110);
		Golpe g1 = new Golpe(); g1.setTipo("forehand"); g1.setVelocidade(120);
		Golpe g2 = new Golpe(); g2.setTipo("forehand");
		
		Ponto p2 = new Ponto(); p2.setSaque(s1); p2.getGolpes().add(g1); p2.getGolpes().add(g2);
		for(int i = 0; i < 20; i++) p2.getGolpes().add(new Golpe());
		p2.setWinner(false); p2.setVencedor(nadal); p2.setPerdedor(djoko);
		
		Game game1 = new Game(); game1.setTiebreak(false);
		game1.setVencedor(nadal); game1.setPerdedor(djoko); game1.getPontos().add(p2);
		for(int i = 0; i < 11; i++) game1.getPontos().add(new Ponto());
		game1.setVencedor(nadal); game1.setPerdedor(djoko);
		
		Set set1 = new Set(); set1.getGames().add(game1);
		for(int i = 0; i < 7; i ++) set1.getGames().add(new Game());
		set1.setVencedor(nadal); set1.setPerdedor(djoko);
		
		Match nadalXdjoko = new Match(); nadalXdjoko.setDupla(false);
		nadalXdjoko.setVencedor(nadal); nadalXdjoko.setPerdedor(djoko);
		nadalXdjoko.getSets().add(set1);
		for(int i = 0; i < 3; i ++) nadalXdjoko.getSets().add(new Set());
		
		Quadra saibro = new Simples(); saibro.setPiso(QuadraEnum.saibro);
		Torneio rg = new GrandSlam(saibro);
		rg.setNome("Roland-Garros"); rg.setPais("França");
		rg.getMatches().add(nadalXdjoko); rg.setVencedor(nadal);
		
		Jogador zverev = new Jogador();
		zverev.setNome("Alexander Zverev"); zverev.setNacionalidade("alemão"); zverev.lesionar();
		
		Jogador alcaraz = new Jogador();
		alcaraz.setNome("Carlos Alcaraz"); alcaraz.setNacionalidade("espanhol");
		Masters madrid = new Masters(saibro); madrid.setNome("Masters 1000 Madrid");
		ATP500 barcelona = new ATP500(saibro); barcelona.setNome("ATP500 Barcelona");
		madrid.setVencedor(alcaraz); barcelona.setVencedor(alcaraz);
		
		Jogador medvedev = new Jogador(); medvedev.setNome("Daniil Medvedev");
		Jogador tsitsipas = new Jogador(); tsitsipas.setNome("Stefanos Tsitsipas");
		Jogador ruud = new Jogador(); ruud.setNome("Casper Ruud");
		Jogador rublev = new Jogador(); rublev.setNome("Andrey Rublev");
		Jogador aliassime = new Jogador(); aliassime.setNome("Felix Auger-Aliassime");
		
		Ranking primeiro = new Ranking(); medvedev.setRanking(primeiro);
		Ranking segundo = new Ranking(); zverev.setRanking(segundo);
		Ranking terceiro = new Ranking(); nadal.setRanking(terceiro);
		Ranking quarto = new Ranking(); tsitsipas.setRanking(quarto);
		Ranking quinto = new Ranking(); ruud.setRanking(quinto);
		Ranking sexto = new Ranking(); alcaraz.setRanking(sexto);
		Ranking setimo = new Ranking(); djoko.setRanking(setimo);
		Ranking oitavo = new Ranking(); rublev.setRanking(oitavo);
		Ranking nono = new Ranking(); aliassime.setRanking(nono);
		
		primeiro.setJogador(medvedev); primeiro.setPosicao(1); primeiro.setPontuacao(7775);
		segundo.setJogador(zverev);	segundo.setPosicao(2); segundo.setPontuacao(6850);
		terceiro.setJogador(nadal);	terceiro.setPosicao(3);	terceiro.setPontuacao(6165);
		quarto.setJogador(tsitsipas); quarto.setPosicao(4); quarto.setPontuacao(5045);
		quinto.setJogador(ruud); quinto.setPosicao(5); quinto.setPontuacao(4890);
		sexto.setJogador(alcaraz); sexto.setPosicao(6); sexto.setPontuacao(4845);
		setimo.setJogador(djoko); setimo.setPosicao(7); setimo.setPontuacao(4770);
		oitavo.setJogador(rublev); oitavo.setPosicao(8); oitavo.setPontuacao(3540);
		nono.setJogador(aliassime); nono.setPosicao(9); nono.setPontuacao(3445);
		
		primeiro.setSucessor(segundo); segundo.setSucessor(terceiro); terceiro.setSucessor(quarto);
		quarto.setSucessor(quinto); quinto.setSucessor(sexto); sexto.setSucessor(setimo);
		setimo.setSucessor(oitavo); oitavo.setSucessor(nono);
		
		System.out.println(nadal.getNome() + " é um jogador " + nadal.getNacionalidade() +
				" que joga com a mão " + nadal.getMaoDominante() + ". Ele recebe patrocínio de " +
				nadal.getPatrocinador().getNome() + ", jogando com uma " + pureaero.getModelo() +
				" com " + pureaero.getPeso() + "g e " + pureaero.getTamanho() + "cm^2 de cabeça.");
		System.out.println(djoko.getNome() + " é um jogador " + djoko.getNacionalidade() +
				". Eles se enfrentaram em uma quadra de " + saibro.getPiso() + " durante o torneio "
				+ rg.getNome() + " ocorrido no país " + rg.getPais() + " cujo vencedor foi " +
				rg.getVencedor().getNome() + ".");
		System.out.println("Na partida em que se enfrentaram, " + djoko.getNome() + 
				" abriu com um saque " + s1.getTipo() + " de " + s1.getVelocidade() + "km/h do lado "
				+  s1.getLado() + ".");
		System.out.print(nadal.getNome() + " rebateu com um " + g1.getTipo() + " de " +
				g1.getVelocidade() + "km/h, que foi recebido com um " + g2.getTipo() + " de " +
				djoko.getNome() + " que após " + p2.getGolpes().size() + " golpes resultou em um ");
		 if(p2.isWinner()) System.out.print("winner"); else System.out.print("erro não-forçado");
		 System.out.println(" para " + p2.getVencedor().getNome() + "." );
		 System.out.println("O primeiro game teve " + game1.getPontos().size() + 
				 " pontos, resultando em um game a favor de " + game1.getVencedor().getNome() + 
				 ". Durante esse set houveram " + set1.getGames().size() + 
				 " games, sendo vencido por " + set1.getVencedor().getNome() + ".");
		 System.out.println("A partida foi jogada em " + nadalXdjoko.getSets().size() +
				 " sets, sendo finalmente vencida por " + nadalXdjoko.getVencedor().getNome()
				 + ".");
		 System.out.print(zverev.getNome() + " é um jogador " + zverev.getNacionalidade() +
					" que está atualmente ");
		 if(zverev.getEstado() instanceof Lesionado) System.out.println("lesionado.");
		 else System.out.println("ativo.");
		 System.out.println(alcaraz.getNome() + " é um jogador " + alcaraz.getNacionalidade() +
				 " que venceu o torneio " + madrid.getNome() + " e " + barcelona.getNome() + ".");
		 
		 System.out.println(" --------------------------------------- ");
		 System.out.println("|              Pepperstone              |");
		 System.out.println("| Rank |        Player         | Points |");
		 System.out.println("|    " + primeiro.getPosicao() + " | " + primeiro.getJogador().getNome() + "       | " + primeiro.getPontuacao() + "   |");
		 System.out.println("|    " + segundo.getPosicao() + " | " + segundo.getJogador().getNome() + "      | " + segundo.getPontuacao() + "   |");
		 System.out.println("|    " + terceiro.getPosicao() + " | " + terceiro.getJogador().getNome() + "          | " + terceiro.getPontuacao() + "   |");
		 System.out.println("|    " + quarto.getPosicao() + " | " + quarto.getJogador().getNome() + "    | " + quarto.getPontuacao() + "   |");
		 System.out.println("|    " + quinto.getPosicao() + " | " + quinto.getJogador().getNome() + "           | " + quinto.getPontuacao() + "   |");
		 System.out.println("|    " + sexto.getPosicao() + " | " + sexto.getJogador().getNome() + "        | " + sexto.getPontuacao() + "   |");
		 System.out.println("|    " + setimo.getPosicao() + " | " + setimo.getJogador().getNome() + "        | " + setimo.getPontuacao() + "   |");
		 System.out.println("|    " + oitavo.getPosicao() + " | " + oitavo.getJogador().getNome() + "         | " + oitavo.getPontuacao() + "   |");
		 System.out.println("|    " + nono.getPosicao() + " | " + nono.getJogador().getNome() + " | " + nono.getPontuacao() + "   |");
		 System.out.println(" --------------------------------------- ");
	}

}
