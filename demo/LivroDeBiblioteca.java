/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author stefa
 */
public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {

    protected boolean emprestado;
    protected String localizacao;

    public LivroDeBiblioteca(String titulo, String autor, String editora, String anoEdicao,
            String localizacao, boolean emprestado) {
        super(titulo, autor, editora, anoEdicao);
        this.localizacao = localizacao;
        this.emprestado = emprestado;
    }

    @Override
    public void Empresta() {
        emprestado = true;
        System.out.println(" Deverá ser devolvido em " + diasemprestimo + " dias!\n");
    }

    @Override
    public void Devolve() {
        emprestado = false;
    }

    @Override
    public boolean getEmprestado() {
        return emprestado;
    }

    @Override
    public String getLocalizacao() {
        return localizacao;
    }

    @Override
    public String getDados() {
        String dados = super.getDados();
        dados = dados + " Localização..: " + localizacao + "\n";
        return dados;
    }

}
