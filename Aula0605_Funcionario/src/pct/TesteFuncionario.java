/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author paulo
 */
public class TesteFuncionario {
    // criação do metodo main
    public static void main(String[] args) {
        
        //criacao e instancia o objeto da classe funcionario
        Funcionario f = new Funcionario();
        
        //construindo nosso objeto
        f.setNumMatricula(10);
        f.setNome("Paulo");
        f.setNivel('S');
        f.setSalario(1000.00);
        f.setAfastado(true);
        
        //teste do metodo para imprimir o funcionário
        System.out.println("\n\t\t\t FUNCIONÁRIO \n");
        f.calcularInss();
        
        // Calculando e imprimindo o salario com desconto
        System.out.println("\n\t\t\t -- SALÁRIO COM DESCONTO --\n");
        f.apresentarFuncionario();
        
        // Outro Funcionário
       Funcionario outroFuncionario = new Funcionario(23, "ricardo", 'P',6500.0, true);
         
        // imprimindo outro Funcionário
        System.out.println("\n\t\t\t -- Outro Funcionario --\n");
        outroFuncionario.apresentarFuncionario();
    }
    
    
}
