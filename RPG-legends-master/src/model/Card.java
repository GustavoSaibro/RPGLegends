package model;

public class Card {
	protected String nome;
	protected Integer health;
	protected Double armor;
	protected Double spellBlock;
	protected  Double attackDamage;
	protected Double spellDamage;
	protected Double movespeed;
	protected String icon;
	
	public Card() {
		super();
	}

	public Card(String nome, Integer health, Double armor, Double spellBlock, Double attackDamage, Double spellDamage,
			Double movespeed, String icon) {
		super();
		this.nome = nome;
		this.health = health;
		this.armor = armor;
		this.spellBlock = spellBlock;
		this.attackDamage = attackDamage;
		this.spellDamage = spellDamage;
		this.movespeed = movespeed;
		this.icon = icon;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	public Double getArmor() {
		return armor;
	}

	public void setArmor(Double armor) {
		this.armor = armor;
	}

	public Double getSpellBlock() {
		return spellBlock;
	}

	public void setSpellBlock(Double spellBlock) {
		this.spellBlock = spellBlock;
	}

	public Double getAttackDamage() {
		return attackDamage;
	}

	public void setAttackDamage(Double attackDamage) {
		this.attackDamage = attackDamage;
	}

	public Double getSpellDamage() {
		return spellDamage;
	}

	public void setSpellDamage(Double spellDamage) {
		this.spellDamage = spellDamage;
	}

	public Double getMovespeed() {
		return movespeed;
	}

	public void setMovespeed(Double movespeed) {
		this.movespeed = movespeed;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	
	
	
}
