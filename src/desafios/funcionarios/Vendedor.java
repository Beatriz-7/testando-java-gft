package desafios.funcionarios;

public class Vendedor extends Funcionario{
   private double comissao;
   private long nemeroVendas;

    public Vendedor(String nome, long cpf, double comissao, long nemeroVendas) { //constructor
        super(nome, cpf);
        this.comissao = comissao;
        this.nemeroVendas = nemeroVendas;
    }

    @Override
    public double calcularSalario() {
        return super.SALARIO_MINIMO + (this.comissao * this.nemeroVendas);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public long getNemeroVendas() {
        return nemeroVendas;
    }

    public void setNemeroVendas(long nemeroVendas) {
        this.nemeroVendas = nemeroVendas;
    }
}
