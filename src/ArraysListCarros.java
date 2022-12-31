import javax.swing.*;
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

        carros.remove("VECTRA"); //ele faz a varredura, localizando o procurado, irá remover
        System.out.println(carros);

        //insere no arraylist um valor string por meio de chamada de tela
        carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));
        System.out.println(carros);

        if(carros.contains("COROLLA")){
            for (int i =0; i < carros.size(); i++){
                if ("COROLLA".equals(carros.get(i))){
                    carros.set(i, "BUGATTI");
                    break;
                }
            }
        }else {
            System.out.println("Não encontrei o argumentado pesquisado");
        }
        System.out.println(carros);
    }
}
