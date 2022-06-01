package desafios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/* Classe Macaco:
Faça um programa e teste interativamente uma classe que modele um macaco com os atributos "nome" e
"bucho" (estômago) e os métodos "comer", "verBucho" e "digerir".

Regras:
a) Crie 2 macacos;
b) Considere que a quantidade máxima de alimentos é 3. Com isso, lembre-se de verificar o conteúdo do
estômago a cada refeição (método "comer"). Por fim, o método "digerir" deve esvaziar o bucho do macaco;
c) Alimentos "dígeriveis" devem ser do tipo String, garanta isso em seu código para que não haja nenhum
macaco canibal.

- criar duas classes(atributos) e dois objetos(2 macacos)
*/
public class Macaco {
    //atributos
    private String nome;
    private List<String> bucho = new ArrayList<>();// list =  estrutura de dados que pode-se colocar outros dados

    //métodos
    public void comer(String comida) { //void = método não retorna nada
        if (bucho.size() == 3) { //size retorna a quantidade de elementos que possui dentro da lista
            System.out.println("Bucho cheio!");
        } else {
            bucho.add(comida);
        }
        System.out.println(bucho);
    }

    public void digerir() {
        if (bucho.isEmpty()) {//isEmpty = método de lista que verifica se a List está vazia
            System.out.println("Bucho Vazio!");
        } else {
            bucho.remove(bucho.get(0));// remove = método da lista que remove elementos de dentro dela; get = método onde coloca-se a posição pedida
        }
        System.out.println(bucho);
    }




}
