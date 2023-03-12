public class Data{
    private int dia, mes, ano;
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean isBissexto(int ano) {
        return ((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0) ;
    }

    public int quantidadeDiasMes(int mes){
        if (mes == 2){
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

    

    
}

