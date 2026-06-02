package estudos.Fatec.TecnicasDeProgramacao2.Exercicios16_04;

public class Ex03Aluno {

    private int identificador;
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Ex03Aluno() {}

    public Ex03Aluno(int identificador, String nome, int idade, double peso, double altura) {
        this.identificador = identificador;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void exibir() {
        System.out.println("ID: " + identificador);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.printf("IMC: %.2f\n", calcularIMC());
        System.out.println("---------------------------");
    }
    
    public float calcularIMC() {
        return (float) (peso / (altura * altura));
    }

}
