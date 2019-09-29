
package Questao3e4;


public class Quadrado {
    double lado;
	double area;
	double perimetro;
	
	public Quadrado(double ladoQua) {
	lado = ladoQua;
	}
	
	double area() {
		area = Math.pow(lado, 2);
		return area;
	}
	
	double perimetro() {
		perimetro = 4*lado;
		return perimetro;
	}

}
