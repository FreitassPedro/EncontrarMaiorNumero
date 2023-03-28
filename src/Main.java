import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantia de números totais: ");
        int capacity = sc.nextInt();
        ArrayList<Integer> numeros = new ArrayList<>(capacity);
        System.out.println("Digite os números: ");
        for (int i = 0; i < capacity; i++) {
            numeros.add(sc.nextInt());
        }
        Map<Integer, Integer> contagemNumeros = new HashMap<>();
        for (int numero : numeros) {
            if (contagemNumeros.containsKey(numero)) {
                contagemNumeros.put(numero, contagemNumeros.get(numero) + 1);
            } else {
                contagemNumeros.put(numero, 1);}
        }
        int numeroMaximo = 0;
        int quantiaMax = 0;
       for (Map.Entry<Integer, Integer> entry : contagemNumeros.entrySet()) {
            int numero = entry.getKey();
            int quantidade = entry.getValue();
            if (quantidade >= quantiaMax) {
                if (quantidade == quantiaMax) {
                    System.out.println("Outro número que mais se repete é: " + numero);
                } else {
                    System.out.println("O número que mais se repete é: " + numero);
                    numeroMaximo = numero;
                    quantiaMax = quantidade;
                }
            }
        }
        sc.close();
    }
}
