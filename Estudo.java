import java.util.Scanner;

public class Estudo {
    public static void main(String[]args){

        byte opcao;
        Scanner scanner = new Scanner(System.in);
        System.out.println("" + "Escolhe uma opção:\n" +
                "1- Par ou Ímpar\n" +
                "2- Palindromo\n" +
                "3- Tabuada de Multiplicação\n" +
                "4- Contador de Palavra\n" +
                "5- Area do Circulo\n" +
                "6- Ordem Crescente\n" +
                "7- Maior Deles\n" +
                "8- Contar Vogais\n" +
                "9- FizzBuzz\n" +
                "10- Inverter Palavra\n" +
                "11- Soma dos Números\n");
        opcao = scanner.nextByte();

        switch(opcao){
            case 1:
                int numb;
                System.out.println("==== Par ou Ímpar ====");

                System.out.println("Diga um número: ");
                numb = scanner.nextInt();

                if(numb % 2 == 0) {
                    System.out.println(numb + "\n" + "O número escolhido é par");
                }else {
                    System.out.println(numb + "\n" + "O número escolhido é ímpar");
                }

                break;

            case 2:
                Scanner input = new Scanner(System.in);
                System.out.println("==== Palindromo ====");
                String palavra;
                String invertida = "";

                System.out.println("Digite uma palavra: ");
                palavra = input.nextLine();

                for (int i = palavra.length() - 1; i >= 0; i--){
                    invertida = invertida + palavra.charAt(i);
                }

                if(palavra.equals(invertida)) {
                    System.out.println("A palavra " + palavra + " é palindromo");
                }else{
                    System.out.println("A palavra " + palavra + " não é palindromo");
                }
                break;

            case 3:
                System.out.println("==== Tabuada de Multiplicação ====");

                int x;
                System.out.println("Escolha de 1 a 10:");
                x = scanner.nextInt();

                for(int i = 1; i <= 10; i++) {
                    System.out.println(x + " x " + i + " = " + (x * i));
                }
                break;

            case 4:
                System.out.println("==== Contador de Palavra ====");
                scanner.nextLine();
                String frase;
                System.out.println("Digite uma frase:");
                frase = scanner.nextLine();

                String[] palavras = frase.split(" ");
                int quantidade = palavras.length;

                System.out.println("A frase escolhida tem " + quantidade + " palavras");

                break;

            case 5:
                System.out.println("==== Area do Circulo ====");
                double raio;

                System.out.println("Digite o valor do raio:");

                raio = scanner.nextDouble();
                double area = Math.PI * raio * raio;

                System.out.println("A area do circulo é " + area);

                break;

            case 6:
                System.out.println("==== Ordem Crescente ==== ");
                int a, b, c;

                System.out.println("Digite o primeiro número:");
                a = scanner.nextInt();
                System.out.println("Digite o segundo número:");
                b = scanner.nextInt();
                System.out.println("Digite o terceiro número:");
                c = scanner.nextInt();

                if(a <= b && a<=c){
                    if(b <= c){
                        System.out.println("Fica: " + a + ", " + b +", " + c);
                    }else{
                        System.out.println("Fica: " + a + ", " + c +", " + b);
                    }
                } else if (b <= a && b<=c) {
                    if(a <= c){
                        System.out.println("Fica: " + b + ", " + a +", " + c);
                    }else{
                        System.out.println("Fica: " + b + ", " + c +", " + a);
                    }
                }else {
                    if(a <= b){
                        System.out.println("Fica: " + c + ", " + a +", " + b);
                    }else{
                        System.out.println("Fica: " + c + ", " + b +", " + a);
                    }
                }
                break;

            case 7:
                System.out.println("==== Maior Deles ==== ");
                int n1;
                int n2;
                int n3;
                int maior;
                System.out.println("Digite o primeiro número:");
                n1 = scanner.nextInt();
                System.out.println("Digite o segundo número:");
                n2 = scanner.nextInt();
                System.out.println("Digite o terceiro número:");
                n3 = scanner.nextInt();

                maior = n1;
                if(n2 > maior){
                    maior = n2;
                }
                if(n3 > maior){
                    maior = n3;
                }

                System.out.println("O maior número é: " + maior);

                break;

            case 8:
                System.out.println("==== Contar Vogais ==== ");
                scanner.nextLine();
                String palavrab;
                int contador = 0;
                System.out.println("Digite uma palavra:");
                palavrab = scanner.nextLine();


                for(int i = 0; i < palavrab.length(); i++){
                    char l = palavrab.charAt(i);
                    if(l == 'a' || l == 'e' || l == 'i' ||
                            l == 'o' || l == 'u'){
                        contador++;
                    }
                }
                System.out.println("Quantidade de vogais: " + contador);
                break;

            case 9:
                System.out.println("==== FizzBuzz ==== ");

                for(int i = 1; i <= 30; i++){

                    if(i % 3 == 0 && i % 5 == 0){
                        System.out.println("FizzBuzz");
                    }
                    else if(i % 3 == 0){
                        System.out.println("Fizz");
                    }
                    else if(i % 5 == 0){
                        System.out.println("Buzz");
                    }
                    else{
                        System.out.println(i);
                    }

                }
                break;

            case 10:
                System.out.println("==== Inverter Palavra ==== ");

                System.out.println("Digite uma palavra:");
                String pala = scanner.next();

                String inverter = "";

                for(int i = pala.length() - 1; i >= 0; i--){
                    inverter += pala.charAt(i);
                }

                System.out.println("Palavra invertida: " + inverter);

                break;

            case 11:
                System.out.println("==== Soma dos Números ==== ");

                int num1;
                int num2;
                int num3;
                int soma;

                System.out.println("Digite o primeiro número:");
                num1 = scanner.nextInt();

                System.out.println("Digite o segundo número:");
                num2 = scanner.nextInt();

                System.out.println("Digite o terceiro número:");
                num3 = scanner.nextInt();

                soma = num1 + num2 + num3;

                System.out.println("A soma dos números é: " + soma);
                break;

            default:
                System.out.println("Opss, opção invalida!!");
        }

    }
}

