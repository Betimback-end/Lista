package br.welbert.lista;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestePerformase {
    public static void main(String[] args) {
        exemploListaSimples();

    }

    public static void exemploListaSimples(){
        System.out.println("************************* Exemplo de uma Criacao de Lista Utilizando o ArrayList **********************************");
        System.out.println("");
        List<String> lista = new ArrayList<>(); // Declarando uma lista usando ArrayList
                                                //Adcionando nomes na lista
        lista.add("Celma");
        lista.add("Welbert");
        lista.add("Raimundo");
                                               //Adicionando nomes na lista por índices, onde você mesmo escolhe o índice
        lista.add(2, "Brenda");
        lista.add(4, "Hulk");
        System.out.println(lista);
        System.out.println("");
        System.out.println("");

        System.out.println("************************* Exemplo Utlizando o For wit usando a primeira lista ***********************************");
        System.out.println("");
        for (String nome : lista){
            System.out.println(nome);
            // Usando o "for wit" ele vai reiterando na lista onde você criou com os nomes
            //EX:
            //Celma
            //Welbert
            //Brenda
            //Raimundo
            //Hulk
        }
        System.out.println("");
        System.out.println("");

        System.out.println("***************** Exemplo Utlizando o .Get para realizar pesquisas por indice da primeira lista *****************");
        System.out.println("");
        String meuAmor = lista.get(4) ;         // Usango o .Get para buscar um nome específico
        System.out.println(meuAmor);
        System.out.println("********************* Saudade Eterna meu PePeto ********************");
        System.out.println("");
        System.out.println("");

        System.out.println("************************* Exemplo Utlizando para verificar quantidade de nomes na lista ***********************************");
        System.out.println("");
        System.out.println(lista.size() -1);       //Verificar quantidade da lista
        System.out.println("");
        System.out.println("");

        System.out.println("************************* Exemplo Utlizando para retornar um resultado da pesquisa de algum nome ***********************************");
        System.out.println("");
        boolean existeNome = lista.contains("Hulk");  // Pesquisa algo na lista e retorna um sinal booleano]
        System.out.println(" Existe esse Nome pesquisado");
        System.out.println(existeNome);
        System.out.println("");
        System.out.println("");

        System.out.println("************************* Criando a lista 2 para exemplo de organização dos nomes usando Collections.sort(); ***********************************");
        System.out.println("");
        System.out.println("************************* Ordenando a Lista ************************");
        List<String> nomess = new ArrayList<>();    // Declarando uma lista usando ArrayList
                                                    //Adcionando nomes na lista
        nomess.add("Celma");
        nomess.add("Welbert");
        nomess.add("Raimundo");

                                                   //Adicionando nomes na lista por índices, onde você mesmo escolhe o índice
        nomess.add(2, "Brenda");
        nomess.add(4, "Hulk");
        Collections.sort(nomess);
        System.out.println(nomess);

    }
}
