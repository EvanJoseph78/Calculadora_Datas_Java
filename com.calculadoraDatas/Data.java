public class Data implements Comparable<Data> {
    private int dia, mes, ano;


    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        if(isValid(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else {
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;

        }

    }

    public boolean isBissexto(int ano) {
        return ((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0) ;
    }

    public int quantidadeDiasMes(int mes){
        if (mes == 2){
            System.out.println(this.ano);
            if (isBissexto(this.ano)){
                return 29;
            }
            return 28;
        }else if (mes == 4 || mes == 6|| mes == 9 || mes == 11){
            return 30;
        }else {
            return 31;
        }
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public int compareTo(Data data2) {
        if (ano < data2.getAno()) {
            return 1;
        } else if (ano > data2.getAno()) {
            return -1;
        } else {
            // anos iguais
            if (mes < data2.getMes()) {
                return 1;
            } else if (mes > data2.getMes()) {
                return -1;
            } else {
                // anos e meses iguais
                if (dia < data2.getDia()) {
                    return 1;
                } else if (dia > data2.getDia()) {
                    return -1;
                } else {
                    // datas iguais
                    return 0;
                }
            }
        }
    }

    
    public boolean isValid(int dia, int mes, int ano) {

        if ((ano < 0 || ano > 10000) || (mes < 0) || (mes > 12)) {
            return false;
        }

        if (dia > this.quantidadeDiasMes(this.mes)) {
            return false;
        }

        if (mes == 2 && dia == 29 && !isBissexto(this.ano)){
            return false;
        }

        return true;
    }    


    

    
}

