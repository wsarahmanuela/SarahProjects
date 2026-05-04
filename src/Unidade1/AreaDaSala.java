package Unidade1;

public class AreaDaSala {
    public static void main(String[] args) {
        float frente = 5.5f;
        float lateral = 8.78f;
        float area = frente * lateral;
        System.out.println("A área da sala é: " + area + " m²");

        float lado1 = 5.5f;
        float lado2 = 8.78f;
        float areaperimetro = lado1 * 2 + lado2 * 2;
        System.out.println("O perímetro da sala é: " + areaperimetro + " cm");

    }

}
