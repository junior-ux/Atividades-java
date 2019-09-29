package Questao5e6e7;
import java.util.Scanner;
public class Estoque {
    String nome;
	int qtdAtual;
	int qtdMinima;
	
	Scanner sc = new Scanner(System.in);
	
	void EstoqueSem() {
		
	}
	
	void EstoqueCom(String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}
	
	void mudarNome(String nome) {
		System.out.println("Digite o nome do produto: ");
		this.nome = sc.next();
	}
	
	void mudarQtdMinima(int qtdMinima) {
		do {
			System.out.println("Digite a quantidade minima: ");
			this.qtdMinima = sc.nextInt();
			if(this.qtdMinima < 0) {
				System.out.println("A quantidade minima tem que ser positiva!\n");
			}
		}while(this.qtdMinima < 0);
		
	}
	
	void repor(int qtd) {
		qtd = 0;
		
		do {
			System.out.println("Digite quanto vc quer adicionar no estoque: ");
			qtd = sc.nextInt();
			if(qtd < 0) {
				System.out.println("A quantidade tem que ser positiva!\n");
			}
		}while(qtd < 0);
		this.qtdAtual = qtdAtual + qtd;
			
	}
	
	void darBaixa(int qtd) {
		qtd = 0;
		
		do {
			System.out.println("Digite quanto vc quer remover do estoque: ");
			qtd = sc.nextInt();
			if(qtd < 0) {
				System.out.println("Tem que ser positiva!");
			}
		}while(qtd < 0 );
		this.qtdAtual = qtdAtual - qtd;
			
	}
	
	String mostra() {
		return nome+" "+qtdMinima+" "+qtdAtual;
	}
	
	Boolean precisaRepor() {
		if(qtdAtual <= qtdMinima) {
			return true;
		}else {
			return false;
		}
	}
	
}
