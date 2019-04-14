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
public class PDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Matriz lena = Matriz.abrirArquivo("img/lena.pgm");
//        Matriz lenaRetan = Matriz.abrirArquivo("img/lenaretangulo.pgm");
//        Matriz caveira = Matriz.abrirArquivo("img/caveira.pgm");
//        Matriz spine = Matriz.abrirArquivo("img/spine.pgm");
//        Matriz aerial = Matriz.abrirArquivo("img/aerial.pgm");
//        Matriz hubble = Matriz.abrirArquivo("img/hubble.pgm");
//        Matriz blurring = Matriz.abrirArquivo(("img/blurring.pgm"));
//        Matriz blurringmoon = Matriz.abrirArquivo(("img/blurry_moon.pgm"));
//        Matriz phistf1 = Matriz.abrirArquivo(("img/imagens-histograma/phistf1.pgm"));
        MatrizCor lenna = MatrizCor.abrirArquivo(("img/imagens-cor/lenna.ppm"));
        MatrizCor morango = MatrizCor.abrirArquivo(("img/straw/strawberries.ppm"));
        Matriz cidade = Matriz.abrirArquivo(("img/straw/WashingtonDCBand4.pgm"));
        Matriz cidadeR = Matriz.abrirArquivo(("img/straw/WashingtonDCBand3-RED.pgm"));
        Matriz cidadeG = Matriz.abrirArquivo(("img/straw/WashingtonDCBand2-GREEN.pgm"));
        Matriz cidadeB = Matriz.abrirArquivo(("img/straw/WashingtonDCBand1-BLUE.pgm"));
        Matriz op;
        MatrizCor opCor;
        int hist[];

//        op = Operacoes.escurecer(lena, 133);
//        Matriz.salvarArquivo(op, "img/lenaEscuro.pgm", "escuro");
//        op = Operacoes.negativo(lena);
//        Matriz.salvarArquivo(op, "img/lenaNegativa.pgm", "Negativo");
//        
//        op = Operacoes.clarearSoma(lena, 150);
//        Matriz.salvarArquivo(op, "img/lenaClaroSoma.pgm", "Soma");
//        op = Operacoes.clarearMult(lena, 5.5);
//        Matriz.salvarArquivo(op, "img/lenaClaroMult.pgm", "Mult");
//        op = Operacoes.clarearSoma(lenaRetan, 150);
//        Matriz.salvarArquivo(op, "img/lenaRetanClaroSoma.pgm", "Claro");
//        op = Operacoes.clarearMult(lenaRetan, 0.2);
//        Matriz.salvarArquivo(op, "img/lenaRetanClaroMult.pgm", "claro");
//        op = Operacoes.girar(lena, 180);
//        Matriz.salvarArquivo(op, "img/lena180.pgm", "girar"); 
//        op = Operacoes.girar(lena, -90);
//        Matriz.salvarArquivo(op, "img/lena180.pgm", "girar");       
//        op = Operacoes.girar(lenaRetan, 90);;
//        Matriz.salvarArquivo(op, "img/lenaRetan90.pgm", "girar");
//        op = Operacoes.binario(caveira);
//        Matriz.salvarArquivo(op, "img/caveiraPreto.pgm", "Preto");
//        op = Operacoes.espelhoHorizontal(caveira);
//        Matriz.salvarArquivo(op, "img/caveiraEspelhoHorizontal.pgm", "Preto");
//        op = Operacoes.espelhoVertical(caveira);
//        Matriz.salvarArquivo(op, "img/caveiraEspelhoVertical.pgm", "Preto");
//        op = Operacoes.reducaoCinza(caveira, 2);
//        Matriz.salvarArquivo(op, "img/caveiraReducao.pgm", "Preto");
//        op = Operacoes.intervaloA(caveira, 80, 150, 0, 255);
//        Matriz.salvarArquivo(op, "img/intervaloA.pgm", "Preto");
//        op = Operacoes.intervaloB(caveira, 80, 150, 255);
//        Matriz.salvarArquivo(op, "img/intervaloB.pgm", "Preto");
//        op = Operacoes.subA(caveira, 80, 150, 0, 255);
//        Matriz.salvarArquivo(op, "img/subA.pgm", "Preto");
//        op = Operacoes.subB(caveira, 80, 150, 255);
//        Matriz.salvarArquivo(op, "img/subB.pgm", "Preto");
//        op = Operacoes.gamma(spine, 1, 0.6);
//        Matriz.salvarArquivo(op, "img/spineTransf1.pgm", "Preto");
//        op = Operacoes.gamma(spine, 1, 0.4);
//        Matriz.salvarArquivo(op, "img/spineTransf2.pgm", "Preto");
//        op = Operacoes.gamma(spine, 1, 0.3);
//        Matriz.salvarArquivo(op, "img/spineTransf3.pgm", "Preto");
//        
//        
//        op = Operacoes.gammaLog(spine, 0.9);
//        Matriz.salvarArquivo(op, "img/spineLog1.pgm", "Preto");
//        op = Operacoes.gammaLog(spine, 0.6);
//        Matriz.salvarArquivo(op, "img/spineLog2.pgm", "Preto");
//        
//        
//        op = Operacoes.gamma(aerial, 1, 4.0);
//        Matriz.salvarArquivo(op, "img/aerialTransf1.pgm", "Preto");
//        op = Operacoes.gamma(aerial, 1, 5.0);
//        Matriz.salvarArquivo(op, "img/aerialTransf2.pgm", "Preto");
//        op = Operacoes.gamma(aerial, 1, 6.0);
//        Matriz.salvarArquivo(op, "img/aerialTransf3.pgm", "Preto");
//        
//        op = Operacoes.gammaLog(aerial, 4);
//        Matriz.salvarArquivo(op, "img/aerialLog1.pgm", "Preto");
//        op = Operacoes.gammaLog(aerial,5);
//        Matriz.salvarArquivo(op, "img/aerialLog2.pgm", "Preto");
//        op = Operacoes.zoom(lena,4);
//        Matriz.salvarArquivo(op, "img/lenazoom.pgm", "Preto");
//        hist = Operacoes.histograma(lena);
//        Matriz.saveHist(hist, "img/histograma.txt");
//        op = Operacoes.eqReta(lena, 20, 100);
//        Matriz.salvarArquivo(op, "img/lenaeq.pgm", "Preto");
     //   Matriz filtro = new Matriz(3,3);
//        int[][] filtro = {{0,-1,0},{-1,4,-1},{0,-1,0}};
//        int[][] filtro2 = {{-1,-1,-1},{-1,8,-1},{-1,-1,-1}};
//        int[][] filtro5 = new int[15][15];
//        for(int i=0;i<filtro5.length; i++)
//            for(int j=0; j<filtro5.length; j++)
//                filtro5[i][j] = 1;
//        op = Operacoes.filtro(hubble, filtro);;
//        Matriz.salvarArquivo(op, "img/hubblefiltro.pgm", "Preto");
//        op = Operacoes.filtro(blurringmoon, filtro);;
//        Matriz.salvarArquivo(op, "img/blurringmoon.pgm", "Preto");
//        op = Operacoes.somarMatrizes(blurringmoon, op );
//        Matriz.salvarArquivo(op, "img/blurringmoonSoma.pgm", "Preto");
//        op = Operacoes.filtro(hubble, filtro5);
//        op = Operacoes.binario(op, 64);
//        Matriz.salvarArquivo(op, "img/hubblefiltro.pgm", "Preto");
//        hist = Operacoes.equilizar(phistf1);
//        Matriz.saveHist(hist, "img/imagens-histograma/phistf1.txt");
//        op = OperacoesCor.extrairCanais(lenna,0);
//        Matriz.salvarArquivo(op, "img/imagens-cor/lennaRGB.pgm","extrair");
//        op = OperacoesCor.extrairCanaisCMY(morango, 0);
//        Matriz.salvarArquivo(op, "img/straw/strawberriesC.pgm","extrair");       ;
//        op = OperacoesCor.extrairCanaisCMY(morango, 1);
//        Matriz.salvarArquivo(op, "img/straw/strawberriesM.pgm","extrair");
//        op = OperacoesCor.extrairCanaisCMY(morango, 2);
//        Matriz.salvarArquivo(op, "img/straw/strawberriesY.pgm","extrair");
//        opCor = OperacoesCor.juntarCanais(cidadeR, cidadeG, cidadeB);
//        MatrizCor.salvarArquivo(opCor, "img/straw/cidadeRGB.ppm","extrair");
//        opCor = OperacoesCor.juntarCanais(cidade, cidadeG, cidadeB);
//        MatrizCor.salvarArquivo(opCor, "img/straw/cidadeVermelha.ppm","extrair");
        opCor = OperacoesCor.RGBtoHSI(morango);
        op = OperacoesCor.extrairCanais(opCor, 0);
        Matriz.salvarArquivo(op, "img/straw/strawberriesH.pgm","o");
        op = OperacoesCor.extrairCanais(opCor, 1);
        Matriz.salvarArquivo(op, "img/straw/strawberriesS.pgm","o");
        op = OperacoesCor.extrairCanais(opCor, 2);
        Matriz.salvarArquivo(op, "img/straw/strawberriesI.pgm","o");
        MatrizCor.salvarArquivo(opCor, "img/straw/strawberriesHSL.ppm","extrair");
    }
    
    
   
    
}
