package estudos.Stream.Pipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> stream = list.stream().map(i ->i*10);
        System.out.println(Arrays.toString(stream.toArray()));

        int sum=list.stream().reduce(0, (a,b)->a+b);// reduce pega o elemento inicial e uma funcao para gerar um resultado
        System.out.println(sum);

        List<Integer> newlist=list.stream().filter(x-> x%2==0).map(x->x*10).collect(Collectors.toList());// o filter coloca uma condicao
        System.out.println(Arrays.toString(newlist.toArray()));

    }
}
