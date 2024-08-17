package com.mycompany.projectjava02;

public class ProjectJava02 {

    public static void main(String[] args) {
        System.out.println("Informações do Paciente");
        Pessoa paciente = new Paciente("1234", "Sulamerica", "Jose", 25, "13456879");
        paciente.imprimirInfo();
        
        
        System.out.println("Informações do Enfermeiro");
        
        Pessoa enfermeiro = new Enfermeiro(12, "UTI", "123456", "Fernanda", 35, "12354698754");
        enfermeiro.imprimirInfo();
    }
}
