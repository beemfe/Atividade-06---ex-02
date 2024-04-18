public class FuncionarioTempoParcial extends Funcionario {  
    private String horaDeEntrada;  
    private String horaDeSaída;  
  
    public FuncionarioTempoParcial(int id, String nome, double salario, String horaDeEntrada, String horaDeSaída) {  
        super(id, nome, salario);  
        this.horaDeEntrada = horaDeEntrada;  
        this.horaDeSaída = horaDeSaída;  
    }  
  
    public String getHoraDeEntrada() {  
        return horaDeEntrada;  
    }  
  
    public String getHoraDeSaída() {  
        return horaDeSaída;  
    }  
}
