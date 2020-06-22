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
    private int numMatricula;
    private String nome;
    private char nivel; // T = Teinee, J = Junior, P = Pleno, S = Senior
    private double salario;
    private boolean afastado;

    Funcionario(int i, String ricardo, char c, double d, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void calcularInss() {
        System.out.println("Número de Matricula: " + getNumMatricula());
        System.out.println("Nome: " + getNome());
        System.out.println("Nível: " + getNivel());
        System.out.println("Salário: " + getSalario());
        System.out.println("Afastado: " + isAfastado());
    }
    
    public void apresentarFuncionario(){
        setSalario(getSalario() - (getSalario() * 0.1));
        System.out.println("Desconto de 10% do salário: " + getSalario());
    }
    
  

    /**
     * @return the numMatricula
     */
    public int getNumMatricula() {
        return numMatricula;
    }

    /**
     * @param numMatricula the numMatricula to set
     */
    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nivel
     */
    public char getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(char nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the afastado
     */
    public boolean isAfastado() {
        return afastado;
    }

    /**
     * @param afastado the afastado to set
     */
    public void setAfastado(boolean afastado) {
        this.afastado = afastado;
    }
    
    public Funcionario(){
        
    }
    
}
