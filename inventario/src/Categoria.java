/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexis
 */
public class Categoria {
    private String nomCategoria;

    public Categoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    public Categoria() {
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    @Override
    public String toString() {
        return "Categoria{" + "nomCategoria=" + nomCategoria + '}';
    }
    
}
