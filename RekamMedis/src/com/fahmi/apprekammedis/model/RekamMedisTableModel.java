/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahmi.apprekammedis.model;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author fahmikudo
 */
public class RekamMedisTableModel extends AbstractTableModel{
    private List<RekamMedis> list = new ArrayList<>();
    private final String[] columnNames = {"No. RM", "Nama", "Alamat", "Kelas", "Ruangan"};
    
    

    public void setList(List<RekamMedis> list) {
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
        case 0:
            return list.get(rowIndex).getNoRM();
        case 1:
            return list.get(rowIndex).getNama();
        case 2:
            return list.get(rowIndex).getAlamat();
        case 3:
            return list.get(rowIndex).getKelas();
        case 4:
            return list.get(rowIndex).getRuangan();
        default:
            return null;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}
