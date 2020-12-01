package model;

import java.util.ArrayList;

public class Player {
	protected String name;
	protected boolean isTrun;
	protected ArrayList<Card> playerDeck;
	protected boolean vencedor;
	protected Integer pontosPartida;
	protected Integer pontosDuelo;
	
	public Player() {
		super();
	}

	public Player(String name, boolean isTrun, ArrayList<Card> playerDeck, boolean vencedor, Integer pontosPartida,
			Integer pontosDuelo) {
		super();
		this.name = name;
		this.isTrun = isTrun;
		this.playerDeck = playerDeck;
		this.vencedor = vencedor;
		this.pontosPartida = pontosPartida;
		this.pontosDuelo = pontosDuelo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isTrun() {
		return isTrun;
	}

	public void setTrun(boolean isTrun) {
		this.isTrun = isTrun;
	}

	public ArrayList<Card> getPlayerDeck() {
		return playerDeck;
	}

	public void setPlayerDeck(ArrayList<Card> playerDeck) {
		this.playerDeck = playerDeck;
	}

	public boolean isVencedor() {
		return vencedor;
	}

	public void setVencedor(boolean vencedor) {
		this.vencedor = vencedor;
	}

	public Integer getPontosPartida() {
		return pontosPartida;
	}

	public void setPontosPartida(Integer pontosPartida) {
		this.pontosPartida = pontosPartida;
	}

	public Integer getPontosDuelo() {
		return pontosDuelo;
	}

	public void setPontosDuelo(Integer pontosDuelo) {
		this.pontosDuelo = pontosDuelo;
	}
	
	
	
	
}
