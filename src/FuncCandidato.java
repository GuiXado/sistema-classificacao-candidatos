import javax.swing.*;
import java.io.*;
public class FuncCandidato {
    int i;
    String cand = "candidatos.txt";
    
    public ClasseCandidato[] leitura(ClasseCandidato[] cc) throws IOException{
        BufferedReader ler = new BufferedReader(new FileReader(cand));
        
        for(i = 0; i < cc.length; i++) cc[i] = new ClasseCandidato();
        
        for(i = 0; i < cc.length; i++){
            cc[i].incr = Integer.parseInt(ler.readLine());
            cc[i].nome = ler.readLine();
            cc[i].idade = Integer.parseInt(ler.readLine());
            cc[i].numde = Integer.parseInt(ler.readLine());
            cc[i].ponto = Integer.parseInt(ler.readLine());
        }
        ler.close();
        return cc;
    }
    
    public String Func(ClasseCandidato[] cc, int num, int i){
        if(i >= cc.length) return "candidato n?o encontrado";
        if(num == cc[i].incr) return "Candidato: " + cc[i].nome;
        return Func(cc, num, i +1);
    }
    
    String clas = "Classificados.txt";
    public void Classifica (ClasseCandidato[] cc) throws IOException{
        BufferedWriter esc = new BufferedWriter(new FileWriter(clas));
        
        for (i = 0; i < cc.length - 1; i++){
            for(int j = 0; j < cc.length - i - 1; j++){
                if(
                    cc[j].ponto < cc[j+1].ponto ||
                        
                    (cc[j].ponto == cc[j+1].ponto &&
                    cc[j].idade < 60 && cc[j+1].idade >=60) ||
                        
                    (cc[j].ponto == cc[j+1].ponto &&
                    cc[j].idade == cc[j+1].idade &&
                    cc[j].numde < cc[j+1].numde)
                ){
                    ClasseCandidato temp = cc[j];
                    cc[j] = cc[j+1];
                    cc[j+1] = temp; 
                }
            }
        }
        for(i = 0; i < 2; i++){
            if (i == 0) esc.write("Candidatos Aprovado!");
            esc.write("Inscriç?o: " + cc[i].incr + "\n");
            esc.write("Nome: " + cc[i].nome + "\n");
            esc.write("Idade: " + cc[i].idade + "\n");
            esc.write("Numero dependentes: " + cc[i].numde + "\n");
            esc.write("Pontuaç?o: " +cc[i].ponto + "\n");
        }
        esc.close();
        JOptionPane.showMessageDialog(null, "Classificados.txt gerado!");
    }
}
