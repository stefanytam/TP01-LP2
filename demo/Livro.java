/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author stefa
 */
public class Livro {

    private String titulo, autor, editora, anoedicao;

    public Livro(String _titulo, String _autor, String _editora, String _anoedicao) {
        titulo = _titulo;
        autor = _autor;
        editora = _editora;
        anoedicao = _anoedicao;
    }

    public Livro() {
    }

    public void setTitulo(String _titulo) {
        titulo = _titulo;
    }

    public void setAutor(String _autor) {
        autor = _autor;
    }

    public void setEditora(String _editora) {
        editora = _editora;
    }

    public void setAnoEdicao(String _anoedicao) {
        anoedicao = _anoedicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getAnoEdicao() {
        return anoedicao;
    }

    public String getDados() {
        return " Título.......: " + titulo + "\n"
                + " Autor........: " + autor + "\n"
                + " Editora......: " + editora + "\n"
                + " Ano..........: " + anoedicao + "\n";
    }
}
