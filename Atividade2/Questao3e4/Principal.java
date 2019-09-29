package Questao3e4;

public class Principal {

    public static void main(String[] args) {
        UsaQuadrado q1 = new UsaQuadrado(2);
        UsaQuadrado q2 = new UsaQuadrado(4);
        UsaQuadrado q3 = new UsaQuadrado(5);

        System.out.println("area " + (q1.area()));
        System.out.println("perimetro " + (q1.perimetro()));
        System.out.println("area " + (q2.area()));
        System.out.println("perimetro " + (q2.perimetro()));
        System.out.println("area " + (q3.area()));
        System.out.println("perimetro " + (q3.perimetro()));
    }

}
