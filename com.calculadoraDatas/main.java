public class main {
    public static void main(String[] args) {
        Data d1 = new Data(4, 2, 2001);
        Data d2 = new Data(4, 2, 2000);

        CalculadoraData c = new CalculadoraData();
        System.out.println(c.diferencaEntreDatas(d1, d2));

        
    } 
}
