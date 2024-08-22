
package com.mycompany.javaproject01;

import java.util.ArrayList;

public class JavaProject01 {

    public static void main(String[] args) {
        /*var nome = "Bruno"; declaração de variavel 
        byte idade = 22;  para numeros pequenos, a melhor escola é o byte
        char letra = 'A';
        */
        
        
        /*Vetor - estáticos com tamanhos pré definidos
        int[] idades; dessa forma ele não esta inicializado
        int [] idades = {2, 3, 4}; dessa forma já inicia com length 3 e com valores estabelecidos
        idades [0] = 4;
        
        //ou


        int[] idades = new int[10];
        String[] nomes = new String[10];
        boolean[] saoBrasileiros = new boolean[10];

        */

        
        //Vetor - dinâmicos com ArrayList com os comandos para manipular a lista
        /*
        ArrayList<Integer> idades = new ArrayList<Integer>();
        idades.add(22); //Add Serve para adicionar um valor
        idades.add(50);
        idades.add(30);
        idades.remove(0); // remove serve para remover um valor baseado em sua posição, no caso index 0 é o primeiro valor
        idades.get(1); // get serve para pegar um numero em sua posição de index
        idades.size(); // sizer serve para ver o tamanho do array
        */
        
        //Casting implicito - quando faz a transformação de um tipo para 
        //o outro mas sem mostrar a linguagem faz de maneira automatica
        
        
        int idade1 = 22;
        double idade2 = idade1; // dessa forma ele aumenta a faixa de representação e inclu .00 no final, transformando assim automaticamente em double
        
        //Casting Explicito indica que estamos ciente que estamos perdendo um pedaço da faixa de representação, ou seja do tamanho que aquele parametro pode oferecer
         
        idade1 = (int) idade2; // basta colocar entre parenteses o parametro que vai se transformar
        
        
        //Para transformar uma letra do char para uma String
        //valueOf é um metodo auxiliar
        /*
        char letra = 'a';
        String nome = String.valueOf(letra);
        letra = nome.charAt(0); //converter string em char
        String nome2 = String.valueOf(idade1); // Tramsforma o valor que era int em uma String
        */
        
        
        
    }
      
}
