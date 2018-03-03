/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MATRIZ ----> ARREGLO DE DOS DIMENSIONES 
        int[][] aiMatriz = new int[3][3];//ARREGLO DE 3 FILAS x 3 COLUMNAS 
        System.out.println(aiMatriz);//solo nos muestra la dirreccion
        aiMatriz[0][0] = 10;
        aiMatriz[0][1] = 20;
        aiMatriz[0][2] = 30;
        aiMatriz[1][0] = 40;
        aiMatriz[1][1] = 50;
        aiMatriz[1][2] = 60;
        aiMatriz[2][0] = 70;
        aiMatriz[2][1] = 80;
        aiMatriz[2][2] = 90;
        System.out.println(aiMatriz[0]);//muestra la dirreccion del arreglo
        System.out.println(aiMatriz[1]);
        System.out.println(aiMatriz[2]);
        //PARA RECORRER UN ARREGLO MULTIDIMENSIONAL, NECESITAMOS UN CICLO PARA CADA DIMENSION, LOS ESTAN ANIDADOS ( UNO DENTRO DEL OTRO)
        for (int i = 0; i < 3; i++) {//PRIMER CORCHETE(FILAS)
            for (int j = 0; j < 3; j++) {//SEGUNDO CORCHETE(COLUMNAS)
                System.out.println(aiMatriz[i][j]);
            }

        }
    }
}
