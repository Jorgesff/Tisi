/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import projeto.Objetos.Restaurante;

/**
 *
 * @author jorgesff
 */
public class ModeloTabela extends AbstractTableModel {
    private  ArrayList<Restaurante> linhas = null;
    private String[] colunas = null;
    
    public ModeloTabela(ArrayList<Restaurante> lin, String[] col) {
        this.setLinhas(lin);
        this.setColunas(col);
    }

    public ArrayList<Restaurante> getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList<Restaurante> linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    @Override
    public int getRowCount() {
        return this.linhas.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
    
}
