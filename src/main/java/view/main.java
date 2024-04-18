public class Main {  
    public static void main(String[] args) {  
        Controle controle = new Controle();  
  
        Funcionario funcionario1 = controle.contratar(1, "João", 2000, "Tempo Integral");  
        Funcionario funcionario2 = controle.contratar(2, "Maria", 1500, "Tempo Parcial");  
        Funcionario funcionario3 = controle.contratar(3, "José", 1000, "Temporario");  
  
        System.out.println("Funcionário 1:");  
        System.out.println("ID: " + funcionario1.getId());  
        System.out.println("Nome: " + funcionario1.getNome());  
        System.out.println("Salário: " + funcionario1.getSalario());  
  
        System.out.println("Funcionário 2:");  
        System.out.println("ID: " + funcionario2.getId());  
        System.out.println("Nome: " + funcionario2.getNome());  
        System.out.println("Salário: " + funcionario2.getSalario());  
  
        System.out.println("Funcionário 3:");  
        System.out.println("ID: " + funcionario3.getId());  
        System.out.println("Nome: " + funcionario3.getNome());  
        System.out.println("Salário: " + funcionario3.getSalario());  
    }  
}
