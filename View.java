package javaapplication1;
import javax.swing.*;

public class View {
    void switchVotacao(){
        int n = 0;
        while(n!=9){
            n = Integer.parseInt(JOptionPane.showInputDialog("SISTEMA VOTAÇÃO!\n"
                    + "digite"
                    + "\n1 – Carregar Seção/Número Eleitor"
                    + "\n2 – Classificar por Seção"
                    + "\n3 – Gravar Registros"
                    + "\n4 – Mostrar Indicadores"
                    + " \n9 – Finalizar" ));
            
            switch(n){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4: mostrarIndicadores();
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"sistema finalizado");
            }
        }
        
    }
    
    void mostrarIndicadores(){
        int n =0;
        
          while(n!=9){
            n = Integer.parseInt(JOptionPane.showInputDialog("Mostrar Indicadores!\n"
                    + "digite"
                    + "1 – Quantidade Eleitores por Seção\n"
                    + "2 –Seção com Maior e Menor número de Eleitores "
                    + "3 – Quantidade de votos por candidato"
                    + "4 – 10 primeiros colocadas (nro cand. e qtd votos)"
                    + "9 – Finaliza consulta" ));
            
            switch(n){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"sistema finalizado");
            }
        }
    }
}
