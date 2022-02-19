package TerceiroDesafio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n*****Seja muito bem vindo ao contador de anagramas!*****\n");
        System.out.print("Para iniciarmos, digite por favor uma palavra ou string: ");
        String anagrama = scan.nextLine();

        int totalAnagramasEncontrados = funcaoContaAnagramas(anagrama);
        System.out.println(String.format("Consegui encontrar o total de %d ", totalAnagramasEncontrados)
                + "anagramas dentro de sua palavra.");
        scan.close();
    }

    public static int funcaoContaAnagramas(String s){
        HashMap<String, Integer> mapeandoAnagramas = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                char[] caractere = s.substring(i, j+1).toCharArray();
                Arrays.sort(caractere);
                String valor = new String(caractere);
                if (mapeandoAnagramas.containsKey(valor))
                    mapeandoAnagramas.put(valor, mapeandoAnagramas.get(valor)+1);
                else
                    mapeandoAnagramas.put(valor, 1);
            }
        }
        int contagemDeAnagramas = 0;
        for(String key: mapeandoAnagramas.keySet()){
            int n = mapeandoAnagramas.get(key);
            contagemDeAnagramas += (n * (n-1))/2;
        }
        return contagemDeAnagramas;
    }
}
