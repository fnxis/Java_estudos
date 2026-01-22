package estudos;

public class calculos {
    public static void main(String[] args) {
        // Exemplos de uso da classe Math
        double x=3.0; // base
        double y=4.0; // expoente / outro valor para testes
        double z=-5.0; // valor negativo para demonstrar Math.abs
        double A,B,C; // variáveis de resultado (nomes genéricos usados no exemplo original)

        // Raiz quadrada
        A=Math.sqrt(x); // calcula a raiz quadrada de x
        B=Math.sqrt(y); // calcula a raiz quadrada de y
        C=Math.sqrt(25.0); // calcula a raiz quadrada do valor literal 25
        System.out.println("Raiz quadrada de "+x+ " = "+A);
        System.out.println("Raiz quadrada de "+y+ " = "+B);
        System.out.println("Raiz quadrada de 25 = "+C);

        // Potenciação
        A=Math.pow(x,y);  // x elevado a y
        B=Math.pow(x,2.0);  // x ao quadrado
        C=Math.pow(5.0,2.0);  // 5 ao quadrado
        System.out.println(x+" elevado a "+y+" = "+A);
        System.out.println(x+" elevado ao quadrado = "+B);
        System.out.println("5 elevado ao quadrado = "+C);

        // Valor absoluto
        A=Math.abs(y);  // valor absoluto de y (já positivo no exemplo)
        B=Math.abs(z);  // valor absoluto de z (converte -5.0 em 5.0)
        System.out.println("Valor absoluto de "+y+" = "+A);
        System.out.println("Valor absoluto de "+z+" = "+B);

        /* Observações para estudo:
         - Math.sqrt recebe um double e retorna a raiz quadrada (NaN para valores negativos).
         - Math.pow aceita expoentes reais; o resultado pode ser fracionário.
         - Math.abs retorna o valor absoluto para tipos numéricos.
         - Para exemplos didáticos, é recomendado usar nomes de variáveis mais descritivos
           (ex: resultadoRaizX, resultadoPotencia) em vez de A/B/C.
         - Se transformar esse exemplo em exercícios interativos, valide entradas do usuário
           e trate casos especiais (expoentes negativos, divisão por zero, etc.).
        */


    }
}