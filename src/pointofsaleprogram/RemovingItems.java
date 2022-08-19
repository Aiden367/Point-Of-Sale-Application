
package pointofsaleprogram;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class RemovingItems 
{
    
    private JTextField subTotalTextField;
    private JTextField taxTextField;
    private JTextField totalTextField;
    private JTextField cashTextField;
    private JTextField changeTextField;
    private JTable recieptTable;
    
    public void setSubTotalTextField(JTextField orderSubTotal)
    {
        this.subTotalTextField = orderSubTotal;
    }
    
    public JTextField getSubTotalTextField()
    {
        return subTotalTextField;
    }
    
    public void setTaxTextField(JTextField orderTax)
    {
        this.taxTextField = orderTax;
    }
    
    public JTextField getTaxTextField()
    {
        return taxTextField;
    }
    
    public void setTotalTextField(JTextField orderTotal)
    {
        this.totalTextField = orderTotal;
    }
    
    public JTextField getTotalTextField()
    {
        return totalTextField;
    }
    public void setCashTextField(JTextField orderCash)
    {
        this.cashTextField = orderCash;
    }
    
    public JTextField getCashTextField()
    {
        return cashTextField;
    }
    public void setChangeTextField(JTextField orderChange)
    {
        this.changeTextField = orderChange;
    }
    
    public JTextField getChangeTextField()
    {
        return changeTextField;
    }
    
    public void setReceiptTable(JTable table)
    {
        this.recieptTable = table;
    }
    public JTable getReceiptTable()
    {
     return recieptTable;
    }
    public void removeSelectedRow()
    {
        try
        {
        DefaultTableModel model = (DefaultTableModel)  getReceiptTable().getModel();
        
        model.removeRow(getReceiptTable().getSelectedRow());
        
        JOptionPane.showMessageDialog(null,"Item Removed");
        
        }catch(Exception e)
        {
            System.err.print(e);
            JOptionPane.showMessageDialog(null,"Could not remove row");
        }
    }
    
    
    public void clearAll()
    {
        getCashTextField().setText(null);
        getTotalTextField().setText(null);
        getSubTotalTextField().setText(null);
        getChangeTextField().setText(null);
        getTaxTextField().setText(null);
        
        DefaultTableModel model = (DefaultTableModel)  getReceiptTable().getModel();
        
        while (model.getRowCount()>0)
          {
             model.removeRow(0);
          }
    }
}
