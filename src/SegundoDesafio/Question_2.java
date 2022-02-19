package SegundoDesafio;

import java.util.Scanner;

public class Question_2 {
    /**
     * Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro
     * exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha
     * forte quando ela satisfaz os seguintes critérios:
     * ● Possui no mínimo 6 caracteres.
     * ● Contém no mínimo 1 digito.
     * ● Contém no mínimo 1 letra em minúsculo.
     * ● Contém no mínimo 1 letra em maiúsculo.
     * ● Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
     */
    public static void main(String[] args) {
        System.out.println("SEJA BEM VINDO!!!\n" +
                "Irei lhe auxiliar com sua senha. Mas antes disso, lembre-se de que sua senha deve: \n" +
                "\t● Possuir no mínimo 6 caracteres.\n" +
                "\t● Conter no mínimo 1 digito.\n" +
                "\t● Conter no mínimo 1 letra em minúsculo.\n" +
                "\t● Conter no mínimo 1 letra em maiúsculo.\n" +
                "\t● Conter no mínimo 1 caractere especial. Os digitos especiais são: !@#$%^&*()-+\n");
        Scanner scan = new Scanner(System.in);

        int tamanhoIdealDaSenha = 6, maiusculas = 0, minusculas = 0;
        int caracteresEspeciais = 0, digitos = 0;
        char ch;

        System.out.print("Entre com sua senha: ");
        String senha = scan.nextLine();

        int tamanhoDaSenha = senha.length();
        if(tamanhoDaSenha < tamanhoIdealDaSenha) {
            System.out.println("\nO tamanho da senha tem que ter pelo menos 6 caracteres.");
            System.out.println(String.format("Você pode tornar sua senha mais forte acrescentando " +
                    "mais %d", tamanhoIdealDaSenha - tamanhoDaSenha) + " caractere(s)");
            return;
        } else {
            for(int i = 0; i < tamanhoDaSenha; i++) {
                ch = senha.charAt(i);
                if(Character.isUpperCase(ch)) {
                    maiusculas++;
                }
                else if(Character.isLowerCase(ch)) {
                    minusculas++;
                }
                else if(Character.isDigit(ch)) {
                    digitos++;
                } else {
                    if(ch=='<' || ch=='>') {
                        System.out.println("\nA senha possui caracteres indevidos!");
                        return;
                    } else {
                        caracteresEspeciais++;
                    }
                }
            }
        }
        if(maiusculas!=0 && minusculas!=0 && digitos!=0 && caracteresEspeciais!=0)
        {
            if(tamanhoDaSenha >= 8)
            {
                System.out.println("\nA tua senha é forte.");
            } else {
                System.out.println("\nA força da sua senha é média.");
            }
            System.out.println("\n----Sua senha contém:----");
            System.out.println("Maiusculas: " + maiusculas);
            System.out.println("Minúsculas: " + minusculas);
            System.out.println("Caracteres: " + digitos);
            System.out.println("Caracteres especiais: " + caracteresEspeciais);
        }
        else
        {
            if(maiusculas == 0)
                System.out.println("\nA senha deve conter pelo menos um caractere maiusculo.");
            if(minusculas == 0)
                System.out.println("\nA senha deve conter pelo menos um caractere minúsculas.");
            if(digitos == 0)
                System.out.println("\nA senha deve conter pelo menos um digito.");
            if(caracteresEspeciais == 0)
                System.out.println("\nA senha deve conter pelo menos um caractere especial.");
        }
        scan.close();
    }
}
