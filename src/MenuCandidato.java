import javax.swing.*;
import java.io.*;
public class MenuCandidato {
    public static void main(String x[]) throws IOException{
        ClasseCandidato[] cc = new ClasseCandidato[50];
        FuncCandidato fc = new FuncCandidato();
        int n;
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n"
                + "1 - Leitura dos Candidatos\n"
                + "2 - Pesquisa do candidato\n"
                + "3 - Grava os melhores\n"
                + "9 - FIM"));
            switch(n){
                case 1:
                    cc = fc.leitura(cc);
                    JOptionPane.showMessageDialog(null, "Leitura realizada com sucesso!");
                    break;
                case 2:
                    int nu = Integer.parseInt(JOptionPane.showInputDialog("Candidato a consultar"));
                    String func = fc.Func(cc, nu, 0);
                    JOptionPane.showMessageDialog(null, func);
                    break;
                case 3:
                    fc.Classifica(cc);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM!");
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "Opç?o invalida!");
                    break;
            }
        }while(n != 9);
    }
}
