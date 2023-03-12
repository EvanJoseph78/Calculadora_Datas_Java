public class main {
    public static void main(String[] args) {
        Data d1 = new Data(9, 12, 8);
        Data d2 = new Data(31, 1, 2000);


        CalculadoraData c = new CalculadoraData(); 
        System.out.println("A quantidade de dias entre as datas é de: " + c.diferencaEntreDatas(d1, d2));
        // System.out.println(c.diferencaEntreDatas(d1, d2));

        
    } 
}
