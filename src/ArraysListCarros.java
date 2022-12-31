import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArraysListCarros {
    public static void main(String[] args) {
        //Construindo o arraylista para carros

        ArrayList<String> carros = new ArrayList<>();

        //adicionando Carros ao arraylist

        carros.add ("KOMBI");
        carros.add ("JAGUAR");
        carros.add ("BMW");
        carros.add ("MERCEDES");
        carros.add ("FUSCA");
        carros.add ("VECTRA");
        carros.add ("COROLLA");

        System.out.println(carros);

        //substituir FUSCA por MITSUBICHI

        carros.set(4, "MITSUBICHI");// ele irá localizar a posição 4 e substituir pelo valor entre ""

        


    }
}
