package Question_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String anagrama = scan.nextLine();

        subString(anagrama);
        scan.nextInt();
    }

    static void subString(String s){
        HashMap<String, Integer> map= new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                char[] caractere = s.substring(i, j+1).toCharArray();
                Arrays.sort(caractere);
                String valor = new String(caractere);
                if (map.containsKey(valor))
                    map.put(valor, map.get(valor)+1);
                else
                    map.put(valor, 1);
            }
        }
        int contagemDeAnagramas = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            contagemDeAnagramas += (n * (n-1))/2;
        }
        System.out.println(contagemDeAnagramas);
    }
}
