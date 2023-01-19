package br.com.dio.EntradaESaidaDeArquivos;

import java.io.*;
import java.util.Scanner;

public class Exercicio2IOCaracter {
    public static void main(String[] args) throws IOException {

        lerTecladoEscreverNoDocumento();
    }
    public static void lerTecladoEscreverNoDocumento() throws IOException {


        System.out.println("Digite 3 recomendações de filmes, para finalizar digite: fim e aperte enter");

        Scanner lerTeclado = new Scanner(System.in);
        String linhaCapturada = lerTeclado.nextLine();

        File file = new File("Recomendações1.txt");

        //na linha abaixo será criado o arquivo Recomendações.txt devido ao FileWriter
        // e não devido a classe File
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getName()));

        do {
            bufferedWriter.write(linhaCapturada);//escrever linha digitada
            bufferedWriter.newLine();//pular uma linha
            bufferedWriter.flush();//descarregar buffer
            linhaCapturada=lerTeclado.nextLine();//obtendo novos dados

        }while (!(linhaCapturada.equalsIgnoreCase("fim")));

        System.out.println("O arquivo"+file.getName()+" foi gerado com sucesso");

        bufferedWriter.close();
        lerTeclado.close();


    }


}
