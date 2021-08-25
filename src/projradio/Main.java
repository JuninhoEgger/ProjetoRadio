package projradio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Radio objRadio = new Radio();

        byte op;
        do {
            System.out.print("::::::::::::::::::::::::::::Rádio::::::::::::::::::::::::::::\n"
                    + "Escolha uma opção abaixo:\n"
                    + "1 – Cadastrar radio\n"
                    + "2 – Mostrar dados do Rádio\n"
                    + "3 – Aumentar volume\n"
                    + "4 – Diminuir volume\n"
                    + "5 – Trocar estação\n"
                    + "0 – Desligar rádio\n"
                    + "Digite aqui a opção desejada:");
            op = leia.nextByte();
            
            switch (op) {
                case 1:
                    System.out.print("Informe os dados do rádio\n"
                            + "Nome: ");
                    objRadio.setNome(leia.next());
                    System.out.print("Estação: ");
                    objRadio.setEstacao(leia.nextDouble());
                    
                    System.out.println("Rádio cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println(objRadio);
                    break;
                case 3:
                    objRadio.aumentarVolume();
                    break;
                case 4:
                    objRadio.diminuirVolume();
                    break;
                case 5:
                    System.out.print("Informe o nome: ");
                    String nome = leia.next();
                    System.out.print("Informe a estação: ");
                    objRadio.trocarEstacao(nome, leia.nextDouble());
                    break;
                case 0:
                    System.out.println("Rádio desligado");
                    break;
                default:
                    System.out.println("Opção inválida\n"
                            + "Digite novamente");
            }

        } while (op!=0);

    }

}
