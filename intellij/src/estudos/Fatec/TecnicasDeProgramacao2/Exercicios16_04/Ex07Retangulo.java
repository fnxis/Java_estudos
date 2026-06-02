package estudos.Fatec.TecnicasDeProgramacao2.Exercicios16_04;

public class Ex07Retangulo {

    private float lado1;
    private float lado2;
    private float area;
    private float perimetro;

    public Ex07Retangulo() {}

    public Ex07Retangulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void calcularArea() {
        this.area = this.lado1 * this.lado2;
        System.out.println("Área do retângulo: " + this.area);
    }

    public void calcularPerimetro() {
        this.perimetro = (2 * this.lado1) + (2 * this.lado2);
        System.out.println("Perímetro do retângulo: " + this.perimetro);
    }

    public void setLado1(float lado1) { this.lado1 = lado1; }
    public void setLado2(float lado2) { this.lado2 = lado2; }

}
