
package pointofsaleprogram;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;


public class AddingAllTotals 
{
    private int displaySubTotal;
    private JTable recieptTable;
    private JTextField subTotalTextField;
    private JTextField taxTextField;
    private JTextField totalTextField;
    private JTextField totalChangeTextField;
    private JTextField cashTextField;
    public void setCashTextField(JTextField orderCash)
    {
        this.cashTextField = orderCash;
    }
    
    public JTextField getCashTextField()
    {
        return cashTextField;
    }
    
    public void setTotalChangeTextField(JTextField change)
    {
        this.totalChangeTextField = change;
    }
    
    public JTextField getTotalChangeTextField()
    {
      return totalChangeTextField;  
    }
    
    public void setTotalTextField(JTextField orderTotal)
    {
        this.totalTextField = orderTotal;
    }
    
    public JTextField getTotalTextField()
    {
        return totalTextField;
    }
    
    public void setTaxTextField(JTextField orderTax)
    {
        this.taxTextField = orderTax;
    }
    
    public JTextField getTaxTextField()
    {
        return taxTextField;
    }
    
    public void setSubTotalTextField(JTextField orderSubTotal)
    {
        this.subTotalTextField = orderSubTotal;
    }
    
    public JTextField getSubTotalTextField()
    {
        return subTotalTextField;
    }
    
     public void setSubTotal(int value)
    {
        this.displaySubTotal = value;
    }
    
    public int getSubTotal()
    {
        return displaySubTotal;
    }
    
    public void setReceiptTable(JTable table)
    {
        this.recieptTable = table;
    }
    public JTable getReceiptTable()
    {
     return recieptTable;
    }
 
    
    public int calculateSubTotal()
    {
        int subTotal = 0;
      for(int i = 0; i<getReceiptTable().getRowCount(); i++)
      {
              subTotal += Integer.parseInt(getReceiptTable().getValueAt(i,2).toString());      
      }  
      String displaySubTotal = Integer.toString(subTotal);
       getSubTotalTextField().setText(displaySubTotal);
      return subTotal;
    }
    
    public int calculateTax()
    {
        int sum = Integer.parseInt(getSubTotalTextField().getText());
        
        int tax = 4;
        
        int totalTax = sum/tax;
        
        getTaxTextField().setText(Integer.toString(totalTax));
        
        return totalTax;
    }
    
    
    public int calculateTotal()
    {
        int sum = Integer.parseInt(getSubTotalTextField().getText());
        int tax = Integer.parseInt(getTaxTextField().getText());
        
        int total = sum + tax;
        getTotalTextField().setText(Integer.toString(total));
        return total;
    }
    
    public int calculateChange()
    {
        int total = Integer.parseInt(getTotalTextField().getText());
        
        int cash = Integer.parseInt(getCashTextField().getText());
        
        int sum = cash - total;
        
        getTotalChangeTextField().setText(Integer.toString(sum));
        
        return sum;
    }
}
