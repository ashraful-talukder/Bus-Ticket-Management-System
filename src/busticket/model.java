/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busticket;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

public class model extends AbstractTableModel {
 public String[] columns;
    public  Object[][] rows;
    public model(){}
    public model(Object[][] data,String[] columnName)
    {
        this.rows= data;
        this.columns=columnName;
    
    }
    public Class  getColumnClass(int column)
    {
        if(column==7)
        {
           return Icon.class;
        }
        else
        {
            return getValueAt(0,column).getClass();
        }
    }
    
    @Override
    public int getRowCount() {
     return this.rows.length;
    }

    @Override
    public int getColumnCount() {
     return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.rows[rowIndex][columnIndex];
    }
    public String getColumnName(int col)
    {
        return this.columns[col];
    }
       
}
