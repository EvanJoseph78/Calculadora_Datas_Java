public class CalculadoraData {
    private Data data1, data2;
    
    public int diferencaEntreDatas(Data data1, Data data2) {
        Data dataAux;
        int qDiasDecorridos;
        if (data1.compareTo(data2) == -1) {
            dataAux = data1;
            data1 = data2;
            data2 = dataAux;
        }else if (data1.compareTo(data2) == 0) {
            this.data1 = data1;
            this.data2 = data2;
            return 0;
        }
        
        this.data1 = data1;
        this.data2 = data2;

        


        if (data1.getAno() == data2.getAno()) {
            qDiasDecorridos = mesmoAno(data1, data2);
            
        }else {
            qDiasDecorridos = anosDiferentes(data1, data2);
        }




        return qDiasDecorridos;
    }

    public int mesmoAno(Data data1, Data data2) {
        int somaDias;
            if (data1.getMes() == data2.getMes()) {
                somaDias = data2.getDia() - data1.getDia();
            }else {
                somaDias = (data1.quantidadeDiasMes(data1.getMes()) - data1.getDia()) + data2.getDia(); 
                System.out.println("Mes" + data1.getMes());
                System.out.println("quantidade de dias desse Mes" + data1.quantidadeDiasMes(data1.getMes()));
                System.out.println(somaDias);
                for (int i = data1.getMes() + 1; i < data2.getMes(); i++) {
                    somaDias = somaDias + data1.quantidadeDiasMes(i);
                }
            }
        return somaDias;
    }

    public int anosDiferentes(Data data1, Data data2) {
        int somaDias = 0;
        if(data2.getAno() - data1.getAno() == 1 ){
            somaDias = mesmoAno(data1, new Data(31, 12, data1.getAno())) + mesmoAno(new Data(1, 1, data1.getAno()), data2) + 1;
        }else {
            somaDias = mesmoAno(data1, new Data(31, 12, data1.getAno())) + mesmoAno(new Data(1, 1, data1.getAno()), data2) + 1;
            for (int i = data1.getAno() + 1; i < data2.getAno(); i++) {
                if (data1.isBissexto(i)) {
                    somaDias = somaDias + 366;
                }else {
                    somaDias = somaDias + 365;
                }
            }
        }
        return somaDias;
    }
}
