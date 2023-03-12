import javax.swing.JOptionPane;

public class InterfaceGrafica {


    public void iniciaApp() {
        Data data1 = inputUsuario("Entre com a primeira Data: "); 
        Data data2 = inputUsuario("Entre com a segunda Data: ");
        CalculadoraData c = new CalculadoraData();
        System.out.println(c.diferencaEntreDatas(data1, data2));
        JOptionPane.showMessageDialog(null,"Passaram-se " + c.diferencaEntreDatas(data1, data2) + " dias.");
        
    }

    public Data inputUsuario(String mensagem) {
        String data = JOptionPane.showInputDialog(null, mensagem);
        PatternFinder p = new PatternFinder(data, "[0-9]+[\\- | \\/]+[0-9]+[\\- | \\/]+[0-9]+");
        if(p.isEqual() == false) {
            inputUsuario("Data inválida! Entre com uma data válida: dd-mm-aaaa"); 
        }
        String[] s = data.split("-");
        Data dataEntrada = new Data(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]));
        if(dataEntrada.getDia() == 0) {
            inputUsuario("Data inválida! Entre com uma data válida: dd-mm-aaaa"); 
        }
        
        return dataEntrada;
    }
}