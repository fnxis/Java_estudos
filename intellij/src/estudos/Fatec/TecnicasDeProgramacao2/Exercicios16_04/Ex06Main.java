package estudos.Fatec.TecnicasDeProgramacao2.Exercicios16_04;

public class Ex06Main {

    public static void main(String[] args) {
        Ex06Funcionario func = new Ex06Funcionario("João Silva", "MAT-123", 3000.00, "10/01/2024", "123.456.789-00");

        System.out.println("Funcionário: " + func.getNome());
        System.out.println("Salário Bruto Mensal: R$ " + func.getSalario());

        System.out.printf("Ganho Bruto Anual: R$ %.2f\n", func.calcularGanhoBrutoAnual());
        System.out.printf("Ganho Líquido Mensal: R$ %.2f\n", func.calcularGanhoLiquidoMensal());
        System.out.printf("Imposto Total Pago (Ano): R$ %.2f\n", func.calcularImposto());
        System.out.printf("Ganho Líquido Anual: R$ %.2f\n", func.calcularGanhoLiquidoAnual());

        func.receberAumento(500.00);
        System.out.println("\n--- Após Aumento de R$ 500,00 ---");
        System.out.printf("Novo Ganho Líquido Mensal: R$ %.2f\n", func.calcularGanhoLiquidoMensal());
    }

}
