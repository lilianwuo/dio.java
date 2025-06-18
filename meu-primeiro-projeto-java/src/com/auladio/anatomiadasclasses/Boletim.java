package com.auladio.anatomiadasclasses;


public class Boletim {
    public static void main(String[] args) {
        int mediaFinal = 2;
        if (mediaFinal < 6)
            System.out.println("Reprovado");
        else if (mediaFinal == 6)
            System.out.println("Prova Minerva");
        else
            System.out.println("Aprovado");
    }
}

