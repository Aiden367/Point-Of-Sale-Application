
package pointofsaleprogram;

import java.util.ArrayList;
import javax.swing.JTable;


public class AddingAllTotals 
{
    private int displaySubTotal;
    //PointOfSaleDisplay pointOfSaleDisplay = new PointOfSaleDisplay();
    private JTable recieptTable;
    ArrayList<Integer> arrList = new ArrayList<Integer>();
    
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
     
      return subTotal;
    }
    
}
