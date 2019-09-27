package Questoes;

import java.util.Scanner;

public class Questoes {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //q4();
        //q5();
        //q6();
        // q7();
        //q8();
        //q9();
        //q10();
        // q11();
        //q12();
        //q12();
        //q13();
        //q14();
        // q15();
        //  q16();
        // q17();
        //  q18();
        // q19();
        //  q20();
        // q21()
        // q22();
        // q23();
        // q24();
        // q25();
        // q26();
        // q27();
        // q28();
        // q29();
        // q30();
        // q31();
        // q32();
        // q33();
        // q34();
        // q35();
        // q36();
        // q37();
        // q38();
        // q39();
        // q40();
        // q41();
        // q42();
        // q43();
        // q44();
        // q45();
        // q46();
        // q47();
        // q48();
        // q49();
        // q50();
        // q51();
        // q52();
        // q53();
        // q54();
        // q55();

    }

    public static void q1() {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o primeiro numero: ");
        num2 = sc.nextDouble();
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Mutiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));
    }

    public static void q2() {
        double distancia, totalCom;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a distancia percorrida em KM: ");
        distancia = sc.nextDouble();
        System.out.println("Digite o total de combustivel gasto em litros: ");
        totalCom = sc.nextDouble();
        System.out.println("O consumo médio de combustivel é " + (totalCom / distancia) + " litros.");
    }

    public static void q3() {
        Scanner sc = new Scanner(System.in);
        String nome;
        Double salarioFixo, totalDeVendas;
        System.out.println("Digite o nome: ");
        nome = sc.next();
        System.out.println("Digite o salario fixo: ");
        salarioFixo = sc.nextDouble();
        System.out.println("Digite o total de vendas: ");
        totalDeVendas = sc.nextDouble();
        System.out.println("Nome: " + (nome));
        System.out.println("Salario fixo: " + (salarioFixo));
        System.out.println("Salario final: " + (salarioFixo + (totalDeVendas * 0.15)));

    }

    public static void q4() {
        double grauCel;
        System.out.println("Digite a temperatura em grau Celsius: ");

        Scanner sc = new Scanner(System.in);
        grauCel = sc.nextDouble();

        double f = ((9 * grauCel + 160) / 5);
        System.out.println("A temperatura em grau Fahrenheit é: " + f);

    }

    public static void q5() {
        double dolar;
        double cotacao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a cotação do dolar: ");
        dolar = sc.nextDouble();
        System.out.println("Digite quantos dolares você tem: ");
        cotacao = sc.nextDouble();
        double f = dolar / cotacao;
        System.out.println("o total em reais é: " + f);
    }

    public static void q6() {
        double depositado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor para depositar : ");
        depositado = sc.nextDouble();
        double f = depositado * 1 * 1.70;
        System.out.println("o total em reais é: " + f);
    }

    public static void q7() {
        double valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor total: ");
        valor = sc.nextDouble();
        double f = valor / 5;
        System.out.println("as prestações ficaram em 5x de: " + f);
    }

    public static void q8() {
        double produto;
        double taxa;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        produto = sc.nextDouble();
        System.out.println("informe a taxa em porcentagem: ");
        taxa = sc.nextDouble();
        double taxaPorcent = taxa / 100;
        double total = (produto * taxaPorcent) + produto;
        System.out.println("o valor total em é " + total);
    }

    public static void q9() {
        double valorCarro;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor inicial do carro: ");
        valorCarro = sc.nextDouble();
        double total = (valorCarro * 0.45) + (valorCarro * 0.28) + valorCarro;
        System.out.println("o valor total em é " + total);
    }

    public static void q10() {
        int a = 10;
        int b = 20;

        int c = a;
        int d = b;

        a = d;
        b = c;
        System.out.println("O valor de A é: " + a + " E o valor de B é:" + b);
    }

    public static void q11() {

        System.out.println("A) vai ser impresso 120, 100 e 234.");
        System.out.println("B) vai ser impresso 500, 140, 500, 300, 140 e 440.");
        System.out.println("C) vai ser impresso 34, 67 e 79.");
        System.out.println("D) vai dar erro porque Z não recebeu nada.");
    }

    public static void q12() {
  

        System.out.println("Apenas a 1 - [A] tem resultados iguais!");
    }

    public static void q14() {

        double num;

        Scanner novo = new Scanner(System.in);
        System.out.println("Digite um número:");
        num = novo.nextDouble();

        System.out.println("Antecessor:" + (num - 1) + "Sucessor:" + (num + 1));
    }

    public static void q15() {
 
        double base;
        double altura;

        Scanner novo = new Scanner(System.in);

        System.out.println("informe a base do retângulo em metros:");
        base = novo.nextDouble();
        System.out.println("informe a altura do retângulo em metros:");
        altura = novo.nextDouble();

        System.out.println("A área do retângulo é:" + (base * altura) + " m²");
    }

    public static void q16() {
       
        int ano;
        int meses;
        int dias;
        int aux, aux2;

        Scanner novo = new Scanner(System.in);

        System.out.println("informe sua idade exata com ano, mês e dia:");
        ano = novo.nextInt();
        meses = novo.nextInt();
        dias = novo.nextInt();

        aux = ano * 365;
        aux2 = meses * 30;

        System.out.println("Idade em dias: " + (aux + aux2 + dias));
    }

    public static void q17() {

        Scanner novo = new Scanner(System.in);
        int totalDeEleitores;
        int nulos;
        int brancos;
        int validos;

        System.out.println("Total de eleitores:");
        totalDeEleitores = novo.nextInt();
        System.out.println("Votos Nulos/Brancos/Válidos:");
        nulos = novo.nextInt();
        brancos = novo.nextInt();
        validos = novo.nextInt();

        if ((nulos < totalDeEleitores) & (brancos < totalDeEleitores) & (validos < totalDeEleitores)) {
            System.out.println("Porcentagem nula:" + (100 * nulos / totalDeEleitores));
            System.out.println("Porcentagem brancos:" + (100 * brancos / totalDeEleitores));
            System.out.println("Porcentagem validos:" + (100 * validos / totalDeEleitores));
        } else {
            System.out.println("Sua contagem é incompatível!");
        }
    }

    public static void q18() {
       
        double salario;
        double reajuste;
        double pReajuste;

        Scanner novo = new Scanner(System.in);
        System.out.println("Salário normal:");
        salario = novo.nextInt();
        System.out.println("Porcentagem de reajuste:");
        reajuste = novo.nextInt();

        pReajuste = reajuste / 100;

        System.out.println("Salário reajustado: " + (salario + (salario * pReajuste)));
    }

    public static void q19() {
        
        Scanner novo = new Scanner(System.in);
        double custoDeFabrica;
        double custoComImposto;

        System.out.println("Custo de fábrica: ");
        custoDeFabrica = novo.nextDouble();

        custoComImposto = +custoDeFabrica + (custoDeFabrica * 0.45);

        System.out.println("Custo ao consumidor:" + (custoComImposto + (custoComImposto * 0.28)));
    }

    public static void q20() {
       

        double salarioFixo;
        int numCarrosV;
        double totalDeVenda;
        double valorPorCarro;

        Scanner novo = new Scanner(System.in);
        System.out.println("Número de carros vendidos:");
        numCarrosV = novo.nextInt();
        System.out.println("Valor total de vendas:");
        totalDeVenda = novo.nextDouble();
        System.out.println("Salário fixo:");
        salarioFixo = novo.nextDouble();
        System.out.println("Valor por carro:");
        valorPorCarro = novo.nextDouble();

        System.out.println("Salário final:" + (salarioFixo + (totalDeVenda * 0.05) + valorPorCarro * numCarrosV));
    }

    public static void q21() {
        
        double valor;

        Scanner novo = new Scanner(System.in);
        System.out.println("Digite um número:");
        valor = novo.nextInt();

        if (valor > 10) {
            System.out.println("Maior que 10!");
        } else {
            System.out.println("Menor que 10!");
        }
    }

    public static void q22() {
        
        int valor;

        Scanner novo = new Scanner(System.in);
        System.out.println("Digite um número:");
        valor = novo.nextInt();

        System.out.println((valor >= 0) ? "Positivo" : "negativo");
    }

    public static void q23() {
       
        int numDeCompra;

        Scanner novo = new Scanner(System.in);
        System.out.println("Quantas deseja comprar?");
        numDeCompra = novo.nextInt();

        System.out.println((numDeCompra >= 12) ? ("Total a pagar: " + (numDeCompra * 1))
                : ("Total a pagar" + (numDeCompra * 1.30)));
    }

    public static void q24() {
        float nota1;
        float nota2;
        float media;
        Scanner novo = new Scanner(System.in);

        System.out.println("Notas:");
        nota1 = novo.nextFloat();
        nota2 = novo.nextFloat();

        media = (nota1 + nota2) / 2;

        System.out.println((media >= 6) ? ("Aprovado com média: " + (media)) : "Reprovado com média: " + ((media)));
    }

    public static void q25() {
        int anoAtual;
        int anoNascimento;
        int votar;
        Scanner novo = new Scanner(System.in);

        System.out.println("Ano de nascimento:");
        anoNascimento = novo.nextInt();
        System.out.println("Ano atual:");
        anoAtual = novo.nextInt();

        votar = anoAtual - anoNascimento;

        System.out.println((votar >= 18) ? "Você pode votar!" : "Você não pode votar!");
    }

    public static void q26() {
        double valor1;
        double valor2;

        Scanner novo = new Scanner(System.in);
        System.out.println("Digite um número:");
        valor1 = novo.nextInt();
        System.out.println("Digite um número:");
        valor2 = novo.nextInt();

        System.out.println((valor1 > valor2) ? (valor1) + " é maior!" : (valor2) + " é maior!");
    }

    public static void q27() {
        double valor1;
        double valor2;

        Scanner novo = new Scanner(System.in);
        System.out.println("Digite um número:");
        valor1 = novo.nextInt();
        System.out.println("Digite um número:");
        valor2 = novo.nextInt();

        System.out.println((valor1 > valor2) ? (valor1) + ", " + (valor2) : (valor2) + ", " + (valor1));
    }

    public static void q28() {
        int horaI;
        int horaF;
        int hora;
        int dura;

        Scanner novo = new Scanner(System.in);
        System.out.println("Hora inicial:");
        horaI = novo.nextInt();
        System.out.println("Hora final:");
        horaF = novo.nextInt();

        hora = horaF - horaI;

        if (hora < 0) {
            dura = hora + 24;
            System.out.println("O jogo teve " + dura + " horas de duração");
        } else {
            System.out.println("O jogo teve " + hora + " horas de duração");
        }
    }

    public static void q29() {
       

        Scanner sc = new Scanner(System.in);
        Double salarioPorHora, horaPorSemana, numHorasMes, horasExtras;
        System.out.println("Digite o numero de horas que vc trabalhou no mes: ");
        numHorasMes = sc.nextDouble();
        System.out.println("Digite seu salario por hora: ");
        salarioPorHora = sc.nextDouble();
        horaPorSemana = (numHorasMes / 4);
        horasExtras = numHorasMes - 160;

        if (horaPorSemana > 40) {
            System.out.println(
                    "O salario no final do mes é " + ((salarioPorHora * 160) + (horasExtras * 0.50) * salarioPorHora));
        } else {
            System.out.println("O salario no final do mes é " + (salarioPorHora * numHorasMes));
        }
    }

    public static void q30() {
       

        Scanner sc = new Scanner(System.in);
        String nome;
        Double alturaCm, alturaM, pesoIdeal;
        int sexo = 0;

        System.out.println("Digite seu nome: ");
        nome = sc.next();
        System.out.println("Digite sua altura em centimetros: ");
        alturaCm = sc.nextDouble();
        alturaM = alturaCm / 100;

        while ((sexo != 1) || (sexo != 2)) {
            System.out.println("Digite seu sexo (1) masculino ou (2) feminino: ");
            sexo = sc.nextInt();
            if (sexo == 1) {
                pesoIdeal = ((72.7 * alturaM) - 58);
                System.out.println("Seu peso ideal é: " + pesoIdeal);
                break;
            } else if (sexo == 2) {
                pesoIdeal = ((62.1 * alturaM) - 44.7);
                System.out.println("Seu peso ideal é: " + pesoIdeal);
                break;
            } else {
                System.out.println("opcao invalida!");
            }
        }
    }

    public static void q31() {
        Scanner novo = new Scanner(System.in);
        int salarioF;
        int totalVendas;

        System.out.println("Digite seu salário fixo:");
        salarioF = novo.nextInt();
        System.out.println("Informe o valor das vendas efetuadas:");
        totalVendas = novo.nextInt();

        if (totalVendas > 1500) {
            System.out.println("Salario final:" + (totalVendas * 0.05) + salarioF);
        } else if (totalVendas <= 1500) {
            System.out.println("Salario final:" + (totalVendas * 0.03) + salarioF);
        }

    }

    public static void q32() {
        Scanner novo = new Scanner(System.in);
        int numeroConta;
        double saldo;
        double credito;
        double debito;
        double saldoAtual;

        System.out.println("Informe o numero da conta:");
        numeroConta = novo.nextInt();
        System.out.println("Informe seu saldo:");
        saldo = novo.nextDouble();
        System.out.println("Informe se é  credito ou debito:");
        credito = novo.nextInt();
        debito = novo.nextInt();

        saldoAtual = (saldo - debito) + credito;

        System.out.println((saldoAtual >= 0) ? "Saldo positivo: " + (saldoAtual) : "Saldo negativo: " + (saldoAtual));
    }

    public static void q33() {
      
        Scanner sc = new Scanner(System.in);
        Double quantidadeAtual, quantidadeMaxima, quantidadeMinima, quantidadeMedia;
        System.out.println("Digite a quantidade atual em estoque: ");
        quantidadeAtual = sc.nextDouble();
        System.out.println("Digite a quantidade maxima em estoque: ");
        quantidadeMaxima = sc.nextDouble();
        System.out.println("Digite a quantidade minima em estoque: ");
        quantidadeMinima = sc.nextDouble();
        quantidadeMedia = ((quantidadeMinima + quantidadeMaxima) / 2);

        if (quantidadeAtual >= quantidadeMedia) {
            System.out.println("Não efetuar compra!");
        } else {
            System.out.println("Efetuar compra!");
        }

    }

    public static void q34() {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positivo!");
        } else if (num < 0) {
            System.out.println("Negativo!");
        } else {
            System.out.println("Zero!");
        }
    }

    public static void q35() {
     
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, numMaior;
        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextInt();
        numMaior = num1;
        do {
            System.out.println("Digite o segundo numero: ");
            num2 = sc.nextInt();
        } while (num2 == num1);
        if (num2 > numMaior) {
            numMaior = num2;
        }
        do {
            System.out.println("Digite o terceiro numero: ");
            num3 = sc.nextInt();
        } while (num3 == num1 || num3 == num2);
        if (num3 > numMaior) {
            numMaior = num3;
        }
        System.out.println("O numero maior é " + numMaior);
    }

    public static void q36() {
        Scanner novo = new Scanner(System.in);
        double valor1;
        double valor2;
        double valor3;
        double soma;

        System.out.println("Valor1:");
        valor1 = novo.nextDouble();
        System.out.println("Valor2:");
        valor2 = novo.nextDouble();
        System.out.println("Valor3:");
        valor3 = novo.nextDouble();

        if ((valor1 < valor2) & (valor1 < valor3)) {

            soma = valor2 + valor3;
            System.out.println("A soma dos dois maiores numeros e: " + (soma));
        } else if ((valor2 < valor1) & (valor2 < valor3)) {
            soma = valor1 + valor3;
            System.out.println("A soma dos dois maiores numeros e: " + (soma));
        } else {
            soma = valor1 + valor2;
            System.out.println("A soma dos dois maiores valores e: " + soma);
        }
    }

    public static void q37() {
        double valor1;
        double valor2;
        double valor3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o 1º valor:  ");
        valor1 = sc.nextDouble();

        System.out.println("Digite o 2º valor:  ");
        valor2 = sc.nextDouble();

        System.out.println("Digite o 3º valor:  ");
        valor3 = sc.nextDouble();

        //teste 1
        if ((valor1 > valor2) && (valor2 >= valor3)) {
            System.out.println(valor3 + " " + valor2 + " " + valor1);
        } //teste 2
        else if ((valor2 >= valor1) && (valor2 > valor3) && (valor1 >= valor3)) {
            System.out.println(valor3 + " " + valor1 + " " + valor2);
        } //teste 3
        else if ((valor2 > valor1) && (valor2 >= valor3) && (valor1 <= valor3)) {
            System.out.println(valor1 + " " + valor3 + " " + valor2);
        } //teste 4
        else if ((valor2 < valor1) && (valor1 < valor3)) {
            System.out.println(valor2 + " " + valor1 + " " + valor3);
        } //teste 5
        else if ((valor2 < valor3) && (valor3 <= valor1)) {
            System.out.println(valor2 + " " + valor3 + " " + valor1);
        } //teste 6
        else {
            System.out.println(valor1 + " " + valor2 + " " + valor3);
        }

    }

    public static void q38() {
        double l1;
        double l2;
        double l3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o 1º lado:  ");
        l1 = sc.nextDouble();

        System.out.println("Digite o 2º lado:  ");
        l2 = sc.nextDouble();

        System.out.println("Digite o 3º lado:  ");
        l3 = sc.nextDouble();

        //teste 1
        if ((l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l1 + l2)) {
            System.out.println("é triangulo");
        } else {
            System.out.println("não é triangulo");
        }

    }

    public static void q39() {
        String time1;
        String time2;
        int golT1;
        int golT2;

        Scanner sc = new Scanner(System.in);
        System.out.println("qual o 1º time:   ");
        time1 = sc.nextLine();

        System.out.println("qual o 2º time::  ");
        time2 = sc.nextLine();

        System.out.println("Quantos gols o  " + time1 + " fez: ");
        golT1 = sc.nextInt();

        System.out.println("Quantos gols o  " + time2 + " fez: ");
        golT2 = sc.nextInt();

        //teste 1
        if ((golT1 > golT2)) {
            System.out.println(" O " + time1 + " ganhou ");
        } else if ((golT1 < golT2)) {
            System.out.println(" O " + time2 + " ganhou ");
        } else {
            System.out.println("houve empate.  ");
        }

    }

    public static void q40() {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o 1º número: ");
        num1 = sc.nextInt();

        System.out.println("digite o 2º número: ");
        num2 = sc.nextInt();

        //testes 1
        if ((num1 > num2)) {
            System.out.println(" Primeiro é maior");
        } else if ((num1 < num2)) {
            System.out.println(" segundo é maior");
        } else {
            System.out.println("números iguais  ");
        }

    }

    public static void q41() {

        Scanner novo = new Scanner(System.in);
        int res;

        System.out.print("Digite x: ");
        int x = novo.nextInt();

        System.out.print("Digite y: ");
        int y = novo.nextInt();

        int z = (x * y) + 5;

        if (z <= 0) {
            res = 'A';
        } else if (z <= 100) {
            res = 'B';
        } else {
            res = 'C';
        }
        System.out.println(z + ", " + res);
    }

    public static void q42() {
       
        Scanner novo = new Scanner(System.in);
        double desconto;
        int combustivel;
        System.out.print("Número de Litros vendidos: ");
        int litro = novo.nextInt();

        System.out.print("Combustível [1]-A [2]-G: ");
        combustivel = novo.nextInt();

        if (litro <= 20 && combustivel == 2) {
            desconto = 3.30 + (3.30 * 0.03);
            System.out.println("Desconto: " + desconto);
        } else if (litro > 20 && combustivel == 2) {
            desconto = 3.30 + (3.30 * 0.05);
            System.out.println("Desconto: " + desconto);
        } else if (litro <= 20 && combustivel == 1) {
            desconto = 2.90 + (2.90 * 0.04);
            System.out.println("Desconto: " + desconto);
        } else if (litro > 20 && combustivel == 2) {
            desconto = 2.90 + (2.90 * 0.06);
            System.out.println("Desconto: " + desconto);
        }
    }

    public static void q43() {

        Scanner novo = new Scanner(System.in);
        int idadeH1;
        int idadeH2;
        int idadeM1;
        int idadeM2;
        int velhoH;
        int velhoM;
        int novoH;
        int novoM;

        System.out.print("Idade Homem 1: ");
        idadeH1 = novo.nextInt();

        do {
            System.out.print("Idade Homem 2: ");
            idadeH2 = novo.nextInt();
        } while (idadeH1 == idadeH2);
        if (idadeH1 > idadeH2) {
            velhoH = idadeH1;
            novoH = idadeH2;
        } else {
            velhoH = idadeH2;
            novoH = idadeH1;
        }
        System.out.print("Idade Mulher 1: ");
        idadeM1 = novo.nextInt();

        do {
            System.out.print("Idade Mulher 2: ");
            idadeM2 = novo.nextInt();
        } while (idadeM1 == idadeM2);
        if (idadeM1 > idadeM2) {
            velhoM = idadeM1;
            novoM = idadeM2;
        } else {
            velhoM = idadeM2;
            novoM = idadeM1;
        }
        System.out.println("Soma 1: " + (velhoH + novoM));
        System.out.println("Soma 2: " + (novoH + velhoM));
    }

    public static void q44() {

        Scanner novo = new Scanner(System.in);
        double precoMa = 1.80;
        double precoMo = 2.50;
        double pesoMa;
        double pesoMo;
        double totalMo;
        double totalMa;
        double precoFinal;

        System.out.print("Quantos Kilos de morango: ");
        pesoMo = novo.nextDouble();

        System.out.print("Quantos Kilos de maçã: ");
        pesoMa = novo.nextDouble();

        if (pesoMo > 5) {
            totalMo = (precoMo - 0.3) * pesoMo;
        } else {
            totalMo = precoMo * pesoMo;
        }

        if (pesoMa > 5) {
            totalMa = (precoMa - 0.3) * pesoMa;
        } else {
            totalMa = precoMa * pesoMa;
        }
        if ((totalMo + totalMa) > 25 || (pesoMo + pesoMa) > 8) {
            precoFinal = (totalMo + totalMa) * 0.9;
        } else {
            precoFinal = totalMo + totalMa;
        }

        System.out.println("Preço finl da compra: R$" + precoFinal);
    }

    public static void q45() {

        Scanner novo = new Scanner(System.in);
        int usu;
        int senha;
        int cont = 0;

        do {
            if (cont > 0) {
                System.out.println("USUARIO INVALIDO !!!");
            }
            System.out.print("Usuario: ");
            usu = novo.nextInt();
            cont++;
        } while (usu != 1234);
        cont = 0;
        do {
            if (cont > 0) {
                System.out.println("SENHA INVALIDA !!!");
            }
            System.out.print("Senha: ");
            senha = novo.nextInt();
            cont++;
        } while (senha != 9999);
        System.out.println("ACESSO PERMITIDO !!!");
    }

    public static void q46() {
        
        System.out.println("VERDADEIRO\nFALSO\nFALSO");
    }

    public static void q47() {
  
        Scanner novo = new Scanner(System.in);
        double descMenor5 = 0.02;
        double descMenor10 = 0.03;
        double descMaior10 = 0.05;
        String produto;
        int quantidade;
        double preco;
        double total;
        double descont = 0;

        System.out.println("Nome do produto: ");
        produto = novo.nextLine();
        System.out.println("Quantidade: ");
        quantidade = novo.nextInt();
        System.out.println("Preço Unitario: ");
        preco = novo.nextDouble();

        total = quantidade * preco;

        if (quantidade <= 5) {
            descont = total * descMenor5;
        }
        if (quantidade > 5 && quantidade <= 10) {
            descont = total * descMenor10;
        }
        if (quantidade > 10) {
            descont = total * descMaior10;
        }
        System.out.println("Produto: " + produto);
        System.out.println("Preço unitário: " + preco);
        System.out.println("Total: " + total);
        System.out.println("Desconto: " + descont);
        System.out.println("Total a pagar: " + (total - descont));

    }

    public static void q48() {
    
        Scanner novo = new Scanner(System.in);
        int ano = 2011;

        System.out.println("Entre com seu codigo: ");
        int codigo = novo.nextInt();

        System.out.println("Entre com a data de nascimento: ");
        int data = novo.nextInt();

        System.out.println("Entre com o Ano de ingresso na empresa: ");
        int tempo = novo.nextInt();

        if (ano - data >= 16) {
            if (ano - data >= 65) {
                System.out.println("Requer Aposentadoria");
            } else {
                if (ano - tempo >= 30) {
                    System.out.println("Requer Aposentadoria");
                } else {
                    if ((ano - data >= 60) && (ano - tempo >= 25)) {
                        System.out.println("Requer Aposentadoria");
                    } else {
                        System.out.println("NÃO Requer Aposentadoria");
                    }
                }
            }
        } else {
            System.out.println("Você não tem idade para trabalhar");
        }
    }

    public static void q49() {
      

        Scanner novo = new Scanner(System.in);
        double a;
        double b;
        double c;
        String mens;

        System.out.println("Informe os lados do triângulo:");
        a = novo.nextDouble();
        b = novo.nextDouble();
        c = novo.nextDouble();

        if ((a < b + c) & (b < a + c) & (c < a + b)) {
            if ((a == b) & (b == c)) {
                mens = "triângulo equilátero";
            } else if ((a == b) || (b == c) || (a == c)) {
                mens = "Triângulo isóseles";
            } else {
                mens = "Triângulo escaleno";
            }
        } else {
            mens = "Não é possível formar um triângulo";
        }
        System.out.println(mens);

        System.out.println("*****RESPOSTAS*****");
        System.out.println("Não é possível formar um triângulo");
        System.out.println("Triângulo escaleno");
        System.out.println("Triângulo isóseles");
        System.out.println("Triângulo equilátero");
        System.out.println("Triângulo isóseles");
    }

    public static void q50() {
        
        
        Scanner novo = new Scanner(System.in);
        System.out.print("Digite: ");
        double n1 = novo.nextInt();
        double n2;
        do {
            System.out.print("Digite: ");
            n2 = novo.nextInt();
        } while (n2 == 0);

        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
    }

    public static void q51() {
 

        Scanner novo = new Scanner(System.in);
        System.out.print("Digite: ");
        double n1 = novo.nextInt();
        double n2;
        do {
            System.out.print("Digite: ");
            n2 = novo.nextInt();
        } while (n2 == 0);

        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
    }

    public static void q52() {
       
        Scanner novo = new Scanner(System.in);
        int res;

        System.out.print("Digite x: ");
        int x = novo.nextInt();
        int y;
        do {
            System.out.print("Digite y: ");
            y = novo.nextInt();

        } while (y == 0);
        int z = (x * y) + 5;

        if (z <= 0) {
            res = 'A';
        } else if (z <= 100) {
            res = 'B';
        } else {
            res = 'C';
        }
        System.out.println(z + ", " + res);
    }

    public static void q53() {
     
        Scanner novo = new Scanner(System.in);
        double desconto;
        int combustivel;
        System.out.print("Número de Litros vendidos: ");
        int litro = novo.nextInt();

        System.out.print("Combustível [1]-A [2]-G: ");
        combustivel = novo.nextInt();

        if (litro <= 20 && combustivel == 2) {
            desconto = 3.30 + (3.30 * 0.03);
            System.out.println("Desconto: " + desconto);
        } else if (litro > 20 && combustivel == 2) {
            desconto = 3.30 + (3.30 * 0.05);
            System.out.println("Desconto: " + desconto);
        } else if (litro <= 20 && combustivel == 1) {
            desconto = 2.90 + (2.90 * 0.04);
            System.out.println("Desconto: " + desconto);
        } else if (litro > 20 && combustivel == 2) {
            desconto = 2.90 + (2.90 * 0.06);
            System.out.println("Desconto: " + desconto);
        }
    }

    public static void q54() {
   
        Scanner novo = new Scanner(System.in);
        double nota1;
        double nota2;
        do {
            System.out.println("Nota 1: ");
            nota1 = novo.nextDouble();
            System.out.println("Nota 2: ");
            nota2 = novo.nextDouble();
        } while (nota1 < 0 || nota2 < 0 || nota1 > 10 || nota2 > 10);

        System.out.println("Média Simples: " + (nota1 + nota2) / 2);

    }

    public static void q55() {
       

        Scanner novo = new Scanner(System.in);

        int usu;
        int senha;
        int cont = 0;

        do {
            if (cont > 0) {
                System.out.println("USUARIO INVALIDO !!!");
            }
            System.out.print("Usuario: ");
            usu = novo.nextInt();
            cont++;
        } while (usu != 1234);
        cont = 0;
        do {
            if (cont > 0) {
                System.out.println("SENHA INVALIDA !!!");
            }
            System.out.print("Senha: ");
            senha = novo.nextInt();
            cont++;
        } while (senha != 9999);
        System.out.println("ACESSO PERMITIDO !!!");
    }

}
