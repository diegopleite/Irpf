package pucrs.progoo.irpf;

public class Irpf {
    private String nome;
    private String cpf;
    private double totRendimentos;
    private double inss;
    private int nroDep;
    private int idade;
    double impostoDevido;
    public Irpf(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        double totRendimentos;
        double inss;
        int nroDep;
        int idade;
        double impostoDevido;
    }
    public Double getTotRendimentos(){

        return totRendimentos;

    }

    public void setTotRendimentos(double totRendimentos){

        this.totRendimentos = totRendimentos;

    }

    public double getContrPrev(){

        return inss/100;

    }

    public void setContrPrev(double contrPrev){
      this.inss = contrPrev;

    }
    public int getNroDep(){
        return nroDep;
    }
    public void setNroDep(int nroDep){
        this.nroDep = nroDep;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double impostoDevido() {
        double baseCalculo = totRendimentos - totRendimentos * inss;
        if (idade < 65) {
            if (nroDep > 0 && nroDep <= 2) {
                baseCalculo = baseCalculo - baseCalculo * 0.025;
            }
            if (nroDep >= 3 && nroDep <= 5){
                baseCalculo = baseCalculo - baseCalculo * 0.05;
            }

            if (nroDep > 5){
                baseCalculo = baseCalculo - baseCalculo * 0.1;
            }
        }
        if (idade > 65){
            if (nroDep > 0 && nroDep <= 2) {
                baseCalculo = baseCalculo - baseCalculo * 0.03;
            }
            if (nroDep >= 3 && nroDep <= 5){
                baseCalculo = baseCalculo - baseCalculo * 0.45;
            }

            if (nroDep > 5){
                baseCalculo = baseCalculo - baseCalculo * 0.06;
            }
        }
        if(baseCalculo < 10000){
            impostoDevido = 0;
        }
        if(baseCalculo >= 10000 && baseCalculo <=20000){
            impostoDevido = (baseCalculo - 10000)*0.15;
        }
        if(baseCalculo>20000){
            impostoDevido = 1500 + ((baseCalculo - 20000)*0.3);
        }
     return impostoDevido;
    }


}
