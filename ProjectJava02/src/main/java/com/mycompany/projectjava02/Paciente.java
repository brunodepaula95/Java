
package com.mycompany.projectjava02;

public class Paciente extends Pessoa {
    
    String matricula;
    String planoDeSaude;

    public Paciente(String matricula, String planoDeSaude, String nome, int idade, String documento) {
        super(nome, idade, documento);
        this.matricula = matricula;
        this.planoDeSaude = planoDeSaude;
    }
    
    public void imprimirInfo(){
        super.imprimirInfo();
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Plano de Saude: " + this.planoDeSaude);
    }
    
}
