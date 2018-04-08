package pucrs.progoo.funcionario;

public class Funcionario {

    private String nome;
    private int codigo;
    private double salarioBase;

    public Funcionario(int codigo, String nome, double salarioBase) {
        this.codigo = codigo;
        this.nome = nome;
        this.salarioBase = salarioBase;

    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getSalarioBase() {
        return (salarioBase);
    }

    public void setSalarioBase(double salB) {
        this.salarioBase = salB;
    }

    public double getSalarioLiquido() {
        double inss = salarioBase * 0.1;
        double ir = 0.0;
        if (salarioBase > 2000.0) {
            ir = (salarioBase - 2000.0) * 0.12;
        }
        return (salarioBase - inss - ir);
    }
}
