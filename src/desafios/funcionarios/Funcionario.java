package desafios.funcionarios;

public abstract class Funcionario { //abstract = servirá apenas como classe mãe, não dará new
    private String nome;
    private long cpf;
    protected final Double SALARIO_MINIMO = 1000.0;

    public Funcionario(String nome, long cpf) { //constructor = alt + insert
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double calcularSalario();

    public String getNome() {  // getter e setter
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Double getSALARIO_MINIMO() {
        return SALARIO_MINIMO;
    }
}


