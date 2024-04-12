//Classe Calendário: Crie uma classe Calendário que represente uma data (dia, mês, ano). Implemente métodos para exibir a data no formato dd/mm/aaaa e para verificar se o ano é bissexto.
public class Calendario{
    public int dia_calendario;
    public int mes_calendario;
    public int ano_calendario;
    public String data_calendario;

    public Calendario(int dia_calendario, int mes_calendario, int ano_calendario, String data_calendario){
        this.dia_calendario = dia_calendario;
        this.mes_calendario = mes_calendario;
        this.ano_calendario = ano_calendario;
        this.data_calendario = data_calendario;
    }

    public void set_data(int dia_calendario, int mes_calendario, int ano_calendario, String data_calendario){
        data_calendario = dia_calendario + "/" + mes_calendario + "/" + ano_calendario;
    }

    public void ano_bissexto(int ano_calendario, boolean define_bissexto){
        define_bissexto = false;

        if((ano_calendario % 4 == 0 && ano_calendario % 100 != 0) || (ano_calendario % 400 != 0)){
            define_bissexto = true;
            System.out.println("O ano é bissexto");
        }
        else{
            System.out.println("O ano não é bissexto");
        }
    }
}