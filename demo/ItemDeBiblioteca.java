/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author stefa
 */
public interface ItemDeBiblioteca {

    static final int diasemprestimo = 7;

    public boolean getEmprestado();

    public String getLocalizacao();

    public void Empresta();

    public void Devolve();
}
