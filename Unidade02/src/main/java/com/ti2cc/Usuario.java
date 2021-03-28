package com.TI2;

public class Membro {
	private int ID;
	private String Nome;
	private String Idade;
	private char Inicial;
	
	public Membro() {
		this.ID = -1;
		this.Nome = "";
		this.Idade = "";
		this.Inicial= '*';
	}
	
	public Membro(int ID, String Nome, String Idade, char Inicial) {
		this.ID = ID;
		this.Nome = Nome;
		this.Idade = Idade;
		this.Inicial = Inicial;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getNome() {
		return Nome;
	}

	public void setIdade(String Idade) {
		this.Idade = Idade;
	}

	public String getInical() {
		return Inicial;
	}

	public void setIdade(String Idade) {
		this.Idade = Idade;
	}

	public char getInicial() {
		return Inicial;
	}

	public void setInicial(char Inicial) {
		this.Inicial = Inicial;
	}

	@Override
	public String toString() {
		return "Membro [ID=" + ID + ", Nome=" + Nome + ", Idade=" + Idade + ", Inicial=" + Inicial + "]";
	}
	
}
