public class FuncionarioTempoIntegral extends Funcionario {  
    private double bancoDeHoras;  
  
    public FuncionarioTempoIntegral(int id, String nome, double salario, double bancoDeHoras) {  
        super(id, nome, salario);  
        this.bancoDeHoras = bancoDeHoras;  
    }  
  
    public double getBancoDeHoras() {  
        return bancoDeHoras;  
    }  
}
