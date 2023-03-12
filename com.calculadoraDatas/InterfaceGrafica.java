import javax.swing.JOptionPane;

public class InterfaceGrafica {


    public void iniciaApp() {
        inputUsuario("Entre com a primeira Data: "); 
        // data1.getData();
        inputUsuario("Entre com a segunda Data: ");
        // data2.getData();
        // CalculadoraData c = new CalculadoraData(data1, data2);
        // c.calculaDiferencaData();
        
    }

    public void inputUsuario(String mensagem) {
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
        

    }
}