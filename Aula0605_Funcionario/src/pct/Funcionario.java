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
public class Funcionario {
    int numMatricula;
    String nome;
    char nivel; // T = Teinee, J = Junior, P = Pleno, S = Senior
    double salario;
    boolean afastado;
    
    public void calcularInss() {
        System.out.println("Número de Matricula: " + numMatricula);
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Salário: " + salario);
        System.out.println("Afastado: " + afastado);
    }
    
    public void apresentarFuncionario(){
        salario = salario - (salario * 0.1);
        System.out.println("Desconto de 10% do salário: " + salario);
    }
    
}
