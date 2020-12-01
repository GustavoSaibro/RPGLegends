package controller;
import java.util.ArrayList;

import model.*;


public class ArenaController {
	
	protected Player player1;
	protected Player player2;
	protected FullDeck fullDeck;
	protected Card cartaVencedora;
	protected Player jogadorVencedorDuelo;
	protected Player jogadorVencedorPartida;
	protected ArrayList<Card> cartasDuelo;
	public ArenaController() {
		super();
	}
	public ArenaController(Player player1, Player player2, FullDeck fullDeck, Card cartaVencedora,
			Player jogadorVencedorDuelo, Player jogadorVencedorPartida, ArrayList<Card> cartasDuelo) {
		super();
		this.player1 = player1;
		this.player2 = player2;
		this.fullDeck = fullDeck;
		this.cartaVencedora = cartaVencedora;
		this.jogadorVencedorDuelo = jogadorVencedorDuelo;
		this.jogadorVencedorPartida = jogadorVencedorPartida;
		this.cartasDuelo = cartasDuelo;
	}
	public Player getPlayer1() {
		return player1;
	}
	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}
	public Player getPlayer2() {
		return player2;
	}
	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	public FullDeck getFullDeck() {
		return fullDeck;
	}
	public void setFullDeck(FullDeck fullDeck) {
		this.fullDeck = fullDeck;
	}
	public Card getCartaVencedora() {
		return cartaVencedora;
	}
	public void setCartaVencedora(Card cartaVencedora) {
		this.cartaVencedora = cartaVencedora;
	}
	public Player getJogadorVencedorDuelo() {
		return jogadorVencedorDuelo;
	}
	public void setJogadorVencedorDuelo(Player jogadorVencedorDuelo) {
		this.jogadorVencedorDuelo = jogadorVencedorDuelo;
	}
	public Player getJogadorVencedorPartida() {
		return jogadorVencedorPartida;
	}
	public void setJogadorVencedorPartida(Player jogadorVencedorPartida) {
		this.jogadorVencedorPartida = jogadorVencedorPartida;
	}
	public ArrayList<Card> getCartasDuelo() {
		return cartasDuelo;
	}
	public void setCartasDuelo(ArrayList<Card> cartasDuelo) {
		this.cartasDuelo = cartasDuelo;
	}
	
	public void givePlayerDeck(Player player) {
		
	}
	
	public boolean encerrarPartida() {
		return true;
	}
	
	public void esvaziar() {
		
	}
	
	public void desconectar() {
		
	}
	
	public void iniciarNovaPartida(int ordem, String adversario) {
		
		
	}
	
	public void iniciar() {
		
	}
	
	public boolean iniciarPartida() {
		return true;
	}
	
	public void desistir() {
		
	}
	
	public ArrayList<Card> receberCartas(ArrayList<Card> cartas) {
		return null;
	}
	
	public ArrayList<Card> enviarCartas(ArrayList<Card> cartas) {
		return null;
	}
	
	public ArrayList<Card> confirmarLance(ArrayList<Card> cartas) {
		return null;
	}
	
	public void atribuirVencedor() {
		
	}
	
	public ArrayList<Card> verificarCartas(){
		return null;		
	}
	
	public ArrayList<Card> verificarPrimeiraATK(){
		return null;		
	}
	
	public void verificarVida() {
		
	}
	
	public void atacar() {
		
	}
	
	public Card escolherProximaCarta() {
		return null;
	}
	
	public Player verificarCartaVencedora(Card carta) {
		return null;
	}
	
	public Card marcarCartaVencedora() {
		return null;
	}
	
	public void descartarCartas() {
		
	}
	
	public Player duelar() {
		return null;
	}
	
	public Player atribuirVencedorDuelo(Player jogador) {
		return null;
	}
	
	public Integer atribuirPontoDuelo() {
		return null;
	}
	
	public Player atribuirVencedorRodada() {
		return null;
	}
	
	public Integer atribuirPontoVencedorRodada(Player jogador) {
		return null;
	}
	
	public void TrocarTurno() {
		
	}
	
	public Card verificarProximaCarta() {
		return null;
	}
	
	public void verificarClasse() {
		
	}
	
	

}

