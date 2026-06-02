package estudos.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        Stream<Integer> streamInt = lista.stream().map(x -> x*10);//map faz uma operacao em toda stream
        System.out.println(Arrays.toString(streamInt.toArray()));

        Stream<String> streamString=Stream.of("alex","bob","carlos");//strem.of coloca dados dentro da stream
        System.out.println(Arrays.toString(streamString.toArray()));

        Stream<Integer> streamInteger = Stream.iterate(0,x->x+2);//iterate usa o primeiro argumento pra saber onde comecar, e depois qual vai ser a condicao dos proximos numeros
        System.out.println(Arrays.toString(streamInteger.limit(10).toArray()));// temos que colocar o limit pois ele ira ate o infinito

        Stream<Long> streamFibonacci = Stream.iterate(new Long[]{0L,1L},p->new Long[] {p[1],p[0]+p[1]}).map(p -> p[0]);// usamos long para burlar o iterate e conseguir colocar mais de um numero no argumento
        System.out.println(Arrays.toString(streamFibonacci.limit(30).toArray()));

    }
}
