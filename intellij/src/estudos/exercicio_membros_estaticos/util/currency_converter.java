package estudos.exercicio_membros_estaticos.util;

public class currency_converter {
    public static double converter(double dollar,double quantity){
        return dollar*quantity*1.06;
    }
    public static void impost(double converter){
        converter+=converter*0.06;
    }
}
