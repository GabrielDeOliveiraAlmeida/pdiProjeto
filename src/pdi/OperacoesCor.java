/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdi;

/**
 *
 * @author cc161255426
 */
public class OperacoesCor {
    
    public static Matriz extrairCanais(MatrizCor matriz, int cor){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        for(int i=0; i<matriz.altura; i++){
            for(int j=0; j<matriz.largura; j++){
                resul.matriz[i][j] = matriz.matriz[i][j][cor];                    
                
            }
        }
        return resul;
    }
    
    
    public static Matriz extrairCanaisCMY(MatrizCor matriz, int cor){
        Matriz resul = new Matriz(matriz.altura, matriz.largura);
        for(int i=0; i<matriz.altura; i++){
            for(int j=0; j<matriz.largura; j++){
                resul.matriz[i][j] = 255 - matriz.matriz[i][j][cor]; 
            }
        }
        return resul;
    }
    
    
    public static MatrizCor juntarCanais(Matriz matrizR, Matriz matrizG, Matriz matrizB){
        MatrizCor resul = new MatrizCor(matrizR.altura, matrizR.largura);
        for(int i=0; i<matrizR.altura; i++){
            for(int j=0; j<matrizR.largura; j++){
                resul.matriz[i][j][0] = matrizR.matriz[i][j]; 
                resul.matriz[i][j][1] = matrizG.matriz[i][j];
                resul.matriz[i][j][2] = matrizB.matriz[i][j];
            }
        }
        return resul;
    }
    
    public static MatrizCor RGBtoHSI(MatrizCor matriz){
        double R,G,B;
        double h,s,l;
        double r,g,b;
        MatrizCor resul = new MatrizCor(matriz.altura, matriz.largura);
        for(int i=0; i<matriz.altura; i++){
            for(int j=0; j<matriz.largura; j++){
                R = matriz.matriz[i][j][0];
                G = matriz.matriz[i][j][1];
                B = matriz.matriz[i][j][2];
                r = R/(R+G+B);
                g = G/(R+G+B);
                b = B/(R+G+B);
                if(b<=g) h = Math.cos((0.5*((r-g)+(r-b)))/(Math.sqrt((r-b)*(r-b)+(r-b)*(g-b))));
                else h = 2*Math.PI  - Math.cos((0.5*((r-g)+(r-b)))/(Math.sqrt((r-b)*(r-b)+(r-b)*(g-b))));
                
                s = 1.0 - 3.0*min(r,g,b);
                l = (R+G+B)/(3*255);
//                System.out.println("h=" + h);

                resul.matriz[i][j][0]  = (int)((255.0*h)/(2*Math.PI));
                resul.matriz[i][j][1] = (int)  (255.0*s);
                resul.matriz[i][j][2] = (int) (255.0*l);
            }
        }
        return resul;
    }
    
    private static double min(double r, double g, double b){
        if(r<g && r<b) return r;
        else if(g<r && g<b) return g;
        else return b;
    }
        
        
}
    
