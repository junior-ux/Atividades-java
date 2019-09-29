package Questao5e6e7;



/**
 *
 * @author junny
 */
public class UsaEstoque {
    public static void main(String[] args) {
		Estoque estoque1 = new Estoque();
		Estoque estoque2 = new Estoque();
		Estoque estoque3 = new Estoque();
		//String nome = null;
		//int qtdMinima = 0; 
		int qtd = 0;
		
		estoque1.EstoqueCom("Impressora Jato de Tinta", 13, 6);
		estoque2.EstoqueCom("Monitor LCD 17 polegadas", 11, 13);
		estoque3.EstoqueCom("Mouse Ótico", 6, 2);
		
		
		estoque1.darBaixa(qtd);
		estoque2.repor(qtd);
		estoque3.darBaixa(qtd);
		
		System.out.println(estoque1.mostra());
		System.out.println(estoque2.mostra());
		System.out.println(estoque3.mostra());
		
		
		if(estoque1.precisaRepor()) {
			System.out.println("precisa repor " + estoque1.nome);
		}else {
			System.out.println("Nao precisa repor " + estoque1.nome);
		}
		
		if(estoque2.precisaRepor()) {
			System.out.println("precisa repor " + estoque2.nome);
		}else {
			System.out.println("Nao precisa repor " + estoque2.nome);
		}
		
		
		if(estoque3.precisaRepor()) {
			System.out.println("precisa repor " + estoque3.nome);
		}else {
			System.out.println("Nao precisa repor " + estoque3.nome);
		}

	}
}
