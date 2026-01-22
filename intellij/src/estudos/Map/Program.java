package estudos.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String,String> cookies = new TreeMap<String,String>();

        //Adiciona uma chave e um valor vinculado a chave
        cookies.put("username", "Maria");
        cookies.put("password", "1234");
        cookies.put("email", "Maria@gmail.com");
        cookies.put("phone", "999999999");
        //Sobrescreve a primeira versao
        cookies.put("phone", "111111111");

        //remove alguma chave
        cookies.remove("email");

        //verifica a existencia da chave phone
        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        //gera o valo da chave phone
        System.out.println("Phone number: " + cookies.get("phone"));
        //tenta trazer o valor da chave, se nao existir ira retornar 'null'
        System.out.println("Email: " + cookies.get("email"));
        //traz o tamanho do Map
        System.out.println("Size: " + cookies.size());


        for (String key: cookies.keySet()) {
            System.out.println(key + " : " + cookies.get(key));
        }

    }
}
