/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdi;

import java.util.Arrays;

/**
 *
 * @author cc161255426
 */
public class Operacoes {
    
    public static Matriz somarMatrizes(Matriz matrizA, Matriz matrizB){
        Matriz matrizResultado = new Matriz(matrizA.altura, matrizA.largura);
        for(int i=0; i< matrizA.altura; i++){
            for(int j=0; j<matrizB.largura; j++){
                matrizResultado.matriz[i][j] = matrizA.matriz[i][j] + matrizB.matriz[i][j];
            }
        }
        return matrizResultado;
    }
    
        public static Matriz subtrairMatrizes(Matriz matrizA, Matriz matrizB){
        Matriz matrizResultado = new Matriz(matrizA.altura, matrizA.largura);
        int val;
        for(int i=0; i< matrizA.altura; i++){
            for(int j=0; j<matrizB.largura; j++){
                val =matrizA.matriz[i][j] - matrizB.matriz[i][j];
                if(val < 0 ){
                    matrizResultado.matriz[i][j] = 0;
                }else{
                    matrizResultado.matriz[i][j] = val;
                }
                //matrizResultado.matriz[i][j] = abs(matrizA.matriz[i][j] - matrizB.matriz[i][j]);
            }
        }
        return matrizResultado;
    }
    
    public static Matriz escurecer(Matriz matriz, int valor){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        int val;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                val = matriz.matriz[i][j] - valor;
                if(val <0)
                    resul.matriz[i][j] = 0;
                else
                    resul.matriz[i][j] = val;
            }
        }
        return resul;
    }
    
    public static Matriz negativo(Matriz matriz){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        int val;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                val = 255 - matriz.matriz[i][j] ;
                resul.matriz[i][j] = val;
            }
        }
        return resul;
    }
    
    public static Matriz clarearSoma(Matriz matriz, int valor){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        int val;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                val = valor + matriz.matriz[i][j] ;
                if(val > 255) val = 255;
                resul.matriz[i][j] = val;
            }
        }
        return resul;
    }
    
    public static Matriz clarearMult(Matriz matriz, double valor){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        int val;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){
                val =(int)  (matriz.matriz[i][j] * valor);
                if(val > 255) val = 255;
                resul.matriz[i][j] = val;
            }
        }
        return resul;
    }
    
    public static Matriz girar(Matriz matriz, int sentido){
        
         Matriz resul = new Matriz(matriz.largura, matriz.altura);
         System.out.println(matriz.altura +" "+ matriz.largura);
        int val;
        switch(sentido){
            case 90:
                for(int i =0; i<matriz.altura; i++){
                    for(int j=0 ; j<matriz.largura; j++){ 
                        val = matriz.matriz[i][j];
                        resul.matriz[j][i] = val;
                    }
                }
                break;
            case -90:
                for(int i =0; i<resul.altura; i++){
                    for(int j=0 ; j<resul.largura; j++){
                        resul.matriz[i][resul.largura - j - 1] = matriz.matriz[j][i];
                    }
                }
                break;
            case 180:
                resul = new Matriz(matriz.largura, matriz.altura);
                for(int i =0; i<resul.altura; i++){
                    for(int j=0 ; j<resul.largura; j++){
                        resul.matriz[resul.altura - i - 1][resul.largura - j - 1] = matriz.matriz[i][j];
                    }
                }
                break;
        }
            
        return resul;
    }
    
public static Matriz binario(Matriz matriz, int valor){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        System.out.println(matriz.altura +" "+ matriz.largura);
        int val;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){ 
                val = matriz.matriz[i][j];
                if(val < valor){
                    resul.matriz[i][j] = 0;
                }else{
                    resul.matriz[i][j] = 255;
                }
            }
        }    
        return resul;
    }

    public static Matriz espelhoVertical(Matriz matriz){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        System.out.println(matriz.altura +" "+ matriz.largura);
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){ 
                resul.matriz[i][j] = matriz.matriz[(matriz.altura - 1) - i][j];
            }
        }    
        return resul;
    }
    
    public static Matriz espelhoHorizontal(Matriz matriz){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        System.out.println(matriz.altura +" "+ matriz.largura);
        int val;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){ 
                resul.matriz[i][matriz.largura - 1 - j] = matriz.matriz[i][j];
            }
        }    
        return resul;
    }
    
    public static Matriz reducaoCinza(Matriz matriz, int nivel){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        System.out.println(matriz.altura +" "+ matriz.largura);
        int val;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){ 
                val = matriz.matriz[i][j];
                if(val < 16){
                    
                }else if(val < 32){
                    
                }
                resul.matriz[i][j] = nivel * ((int) (matriz.matriz[i][j] / nivel));
            }
        }    
        return resul;
    }
    
    public static Matriz intervaloA(Matriz matriz, int A, int B,int valorFora, int valorDentro){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        int val;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){ 
                val = matriz.matriz[i][j];
                if(val < B && val > A){
                    resul.matriz[i][j] = valorDentro;
                }else{
                    resul.matriz[i][j] = valorFora;
                }
            }
        }    
        return resul;
    }
    
    public static Matriz intervaloB(Matriz matriz, int A, int B, int valor){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        int val;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){ 
                val = matriz.matriz[i][j];
                if(val < B && val > A){
                    resul.matriz[i][j] = valor;
                }else{
                    resul.matriz[i][j] = val;
                }
            }
        }    
        return resul;
    }
    
    public static Matriz subA(Matriz matriz, int A, int B, int valorDentro, int valorFora){
        Matriz resul = intervaloA(matriz, A, B, valorDentro, valorFora);
        return subtrairMatrizes(matriz, resul);
    }

    public static Matriz subB(Matriz matriz, int A, int B, int valor){
        Matriz resul = intervaloB(matriz, A, B, valor);
        return subtrairMatrizes(resul, matriz);
    }
    
    public static Matriz gamma(Matriz matriz, double c ,  double gama){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        double intervalo;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){ 
                intervalo = (matriz.matriz[i][j] / 255.0);
                resul.matriz[i][j] = (int) (255*c*(Math.pow(intervalo, gama)));
            }
        }    
        return resul;
    }
    
    public static Matriz gammaLog(Matriz matriz, double c ){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        double intervalo;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){ 
                intervalo = (matriz.matriz[i][j] / 255.0);
                resul.matriz[i][j] = (int) (255*c*Math.log10(1 + intervalo));
            }
        }    
        return resul;
    }
    
    public static Matriz zoom(Matriz matriz, int valor){
        Matriz resul = new Matriz(matriz.altura*valor, matriz.largura*valor);
        double intervalo;
        for(int i =0; i<matriz.altura; i=i+=valor){
            for(int j=0 ; j<matriz.largura; j=j+valor){ 
                for(int z1=0; z1<valor; z1++){
                    for(int z2=0; z2<valor; z2++){
                        resul.matriz[i+z1][j+z2] = matriz.matriz[i][j];
                    }    
                }
            }
        }            
        return resul;
    }
    
    public static int[] histograma(Matriz matriz){
        int[] hist = new int[255];
        Arrays.fill(hist, 0);
        int cor;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){ 
                cor = matriz.matriz[i][j];
                hist[cor]++;
            }
        }
        return hist;
    }
    
    public static Matriz eqReta(Matriz matriz, int min, int max){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        int m = 255/(max - min);
        int x ,  y;
        for(int i =0; i<matriz.altura; i++){
            for(int j=0 ; j<matriz.largura; j++){ 
                x = matriz.matriz[i][j] - min;
                y = (int)(m*x);
                if( y < min) resul.matriz[i][j] =0;
                else if(y  > max) resul.matriz[i][j] = 255;
                else
                resul.matriz[i][j] = y;
            }
        }            
        return resul;
        
    }
    
    public static Matriz filtro(Matriz matriz, int[][] filter){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        int soma;
        double mult = somaFiltro(filter);
        System.out.println(mult);
        int tam = (filter.length-1)/2; 
        for(int i =0; i<matriz.altura; i++){
            for(int j=0; j<matriz.largura; j++){
                soma = 0;
                    for(int p=0; p < filter.length ; p++){
                        for(int q=0; q < filter.length ; q++){
                            if(isBorda(matriz, (i-tam+ p), (j-tam+q))){
                                soma += filter[p][q] * matriz.matriz[i-tam+ p][j-tam+q];
                            }else{
                                soma+=0;
                            }      
                        }
                    }
                resul.matriz[i][j] = (int)(soma/mult);
            }
        }
       return resul;
    }
    
     public static Matriz filtroLaplaciano(Matriz matriz, int[][] filter){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        int soma;
        int tam = (filter.length-1)/2; 
        for(int i =0; i<matriz.altura; i++){
            for(int j=0; j<matriz.largura; j++){
                soma = 0;
                for(int p=0; p < filter.length ; p++){
                    for(int q=0; q < filter.length ; q++){
                        if(isBorda(matriz, (i-tam+ p), (j-tam+q))){
                            soma += filter[p][q] * matriz.matriz[i-tam+ p][j-tam+q];
                        }else{
                            soma+=0;
                        }      
                    }
                }
                resul.matriz[i][j] = soma;
            }
        }
       return resul;
    }
    
    public static int somaFiltro(int[][] filtro){
        int soma =0;
        for(int i=0; i<filtro.length; i++){
            for(int j=0; j<filtro.length; j++){
                soma+=filtro[i][j];
            }
        }
        return soma;
    }
    public static Boolean isBorda(Matriz matriz, int x, int y){
        if(x >= 0 && y>=0 &&  x < matriz.altura &&  y <matriz.largura ){
            return true;
        }else{
            return false;
        }
    }
    
    public static int[] equilizar(Matriz matriz){
        
        
        int[] hist = histograma(matriz);
        float[] eq = new float[255];
        float soma;
        for(int i =0; i<255;i++){
            
            eq[i] = ((float)hist[i] /(float)(matriz.altura*matriz.largura));
            soma=0;
            for(int j=0; j<=i; j++){
                soma+=eq[j];
            }
            hist[i] = (int)(Math.abs(255*soma));
            
        }
        return hist;
    }

}
