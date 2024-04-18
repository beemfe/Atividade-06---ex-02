public class Controle {  
    public Funcionario contratar(int id, String nome, double salario, String tipo) {  
        switch (tipo) {  
            case "Tempo Integral":  
                return new FuncionarioTempoIntegral(id, nome, salario, 0);  
            case "Tempo Parcial":  
                return new FuncionarioTempoParcial(id, nome, salario, "08:00", "17:00");  
            case "Temporario":  
                return new FuncionarioTemporario(id, nome, salario, 31, 12, 2023);  
            default:  
                return null;  
        }  
    }   
}
