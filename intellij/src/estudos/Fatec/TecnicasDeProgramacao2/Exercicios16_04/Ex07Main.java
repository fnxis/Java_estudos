package estudos.Fatec.TecnicasDeProgramacao2.Exercicios16_04;

public class Ex07Main {

    public static void main(String[] args) {
        Ex07Retangulo novoRetangulo = new Ex07Retangulo();

        novoRetangulo.setLado1(10.0f);
        novoRetangulo.setLado2(5.0f);
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();

        System.out.println("\n--- Atualizando Lado 2 para 7 ---");
        novoRetangulo.setLado2(7.0f);
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();

        System.out.println("\n--- Outras 5 instâncias ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Retângulo extra #" + i);
            Ex07Retangulo r = new Ex07Retangulo((float)Math.random()*10, (float)Math.random()*10);
            r.calcularArea();
            r.calcularPerimetro();
            System.out.println("\n");
        }
    }

}
