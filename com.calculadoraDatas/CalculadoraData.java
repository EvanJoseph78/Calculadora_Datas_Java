public class CalculadoraData {
    private Data data1, data2;
    
    public int diferencaEntreDatas(Data data1, Data data2) {
        Data dataAux; 
        this.data1 = data1;
        this.data2 = data2;
        if(data1.getAno() <= data2.getAno()){
            System.out.println("Teste 1");
            if(data1.getMes() <= data2.getMes()){
                System.out.println("Teste 2");
                if(data1.getDia() <= data2.getDia()){
                    System.out.println("Teste 3"); 
                    if (data1.getDia() == data2.getDia()){
                        System.out.println("Teste 4");
                        return 0;
                    }
                }else {
                    dataAux = this.data1;
                    this.data1 = this.data2;
                    this.data2 = dataAux;
                }
            }else {
                dataAux = this.data1;
                this.data1 = this.data2;
                this.data2 = dataAux;
            }
        }else {
            System.out.println("''''''");
            dataAux = this.data1;
            System.out.println("kkkk" + dataAux);
            this.data1 = this.data2;
            System.out.println(data1);
            this.data2 = dataAux;
            System.out.println(data2);
        }

        this.data1 = data1;
        this.data2 = data2;
        System.out.println("A data 1 é:" + this.data1);  
        System.out.println("A data 2 é:" + this.data2);  
        


        return 10;
    }
}
