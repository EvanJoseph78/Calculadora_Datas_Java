public class CalculadoraData {
    private Data data1, data2;
    
    public int diferencaEntreDatas(Data data1, Data data2) {
        Data dataAux;
        int qDiasDecorridos;
        if (data1.compareTo(data2) == -1) { // se data1 é anterior a data2, inverte as datas
            dataAux = data1;
            data1 = data2;
            data2 = dataAux;
        } else if (data1.compareTo(data2) == 0) { // se as datas são iguais, retorna 0
            this.data1 = data1;
            this.data2 = data2;
            return 0;
        }
        
        this.data1 = data1;
        this.data2 = data2;

        if (data1.getAno() == data2.getAno()) { // se as datas são do mesmo ano, chama a função mesmoAno
            qDiasDecorridos = mesmoAno(data1, data2);
        } else { // se as datas são de anos diferentes, chama a função anosDiferentes
            qDiasDecorridos = anosDiferentes(data1, data2);
        }

        return qDiasDecorridos;
    }

    public int mesmoAno(Data data1, Data data2) {
        int somaDias;
        if (data1.getMes() == data2.getMes()) { // se as datas estão no mesmo mês, subtrai os dias
            somaDias = data2.getDia() - data1.getDia();
        } else { // se as datas estão em meses diferentes, calcula a diferença em dias
            somaDias = (data1.quantidadeDiasMes(data1.getMes()) - data1.getDia()) + data2.getDia(); 
            for (int i = data1.getMes() + 1; i < data2.getMes(); i++) {
                somaDias = somaDias + data1.quantidadeDiasMes(i);
            }
        }
        return somaDias;
    }

    public int anosDiferentes(Data data1, Data data2) {
        int somaDias = 0;
        if(data2.getAno() - data1.getAno() == 1) { // se as datas são de anos consecutivos, soma os dias dos dois anos
            somaDias = mesmoAno(data1, new Data(31, 12, data1.getAno())) + mesmoAno(new Data(1, 1, data1.getAno()), data2) + 1;
        } else { // se as datas são de anos não consecutivos, soma os dias de cada ano completo e dos anos parciais
            somaDias = mesmoAno(data1, new Data(31, 12, data1.getAno())) + mesmoAno(new Data(1, 1, data1.getAno()), data2) + 1;
            for (int i = data1.getAno() + 1; i < data2.getAno(); i++) {
                if (data1.isBissexto(i)) {
                    somaDias = somaDias + 366;
                } else {
                    somaDias = somaDias + 365;
                }
            }
        }
        return somaDias;
    }
}
