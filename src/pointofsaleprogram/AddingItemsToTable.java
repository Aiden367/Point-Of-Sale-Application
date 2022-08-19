
package pointofsaleprogram;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class AddingItemsToTable 
{
    private String itemOne;
    private JTable recieptTable;
    
    public void setReceiptTable(JTable table)
    {
        this.recieptTable = table;
    }
 public JTable getReceiptTable()
 {
     return recieptTable;
 }
 
 public void addingItemOne()
 {
   DefaultTableModel model = (DefaultTableModel)  getReceiptTable().getModel();
   int price = 20;
   Object[] addItem = {"Flour","1",price};
   model.addRow(addItem);
 }
 
 public void addingItemTwo()
 {
   DefaultTableModel model = (DefaultTableModel)  getReceiptTable().getModel();
   int price = 40;
   Object[] addItem = {"Rice","1",price};
   model.addRow(addItem);
 }
 
 public void addingItemThree()
 {
   DefaultTableModel model = (DefaultTableModel)  getReceiptTable().getModel();
   int price = 20;
   Object[] addItem = {"Bread","1",price};
   model.addRow(addItem);
 }
 public void addingItemFour()
 {
   DefaultTableModel model = (DefaultTableModel)  getReceiptTable().getModel();
   int price = 70;
   Object[] addItem = {"Lettuce","1",price};
   model.addRow(addItem);
 }
 public void addingItemFive()
 {
   DefaultTableModel model = (DefaultTableModel)  getReceiptTable().getModel();
   int price = 50;
   Object[] addItem = {"Soda","1",price};
   model.addRow(addItem);
 }
 public void addingItemSix()
 {
   DefaultTableModel model = (DefaultTableModel)  getReceiptTable().getModel();
   int price = 30;
   Object[] addItem = {"Eggs","1",price};
   model.addRow(addItem);
 }
 public void addingItemSeven()
 {
   DefaultTableModel model = (DefaultTableModel)  getReceiptTable().getModel();
   int price = 40;
   Object[] addItem = {"Cake","1",price};
   model.addRow(addItem);
 }
 public void addingItemEight()
 {
   DefaultTableModel model = (DefaultTableModel)  getReceiptTable().getModel();
   int price = 20;
   Object[] addItem = {"Chocolate","1",price};
   model.addRow(addItem);
 }
 public void addingItemNine()
 {
   DefaultTableModel model = (DefaultTableModel)  getReceiptTable().getModel();
   int price = 15;
   Object[] addItem = {"Jelly Beans","1",price};
   model.addRow(addItem);
 }
 public void addingItemTen()
 {
   DefaultTableModel model = (DefaultTableModel)  getReceiptTable().getModel();
   int price = 17;
   Object[] addItem = {"Gummy Bears","1",price};
   model.addRow(addItem);
 }
 public void addingItemEleven()
 {
   DefaultTableModel model = (DefaultTableModel)  getReceiptTable().getModel();
   int price = 5;
   Object[] addItem = {"Lolipops","1",price};
   model.addRow(addItem);
 }
 public void addingItemTwelve()
 {
   DefaultTableModel model = (DefaultTableModel)  getReceiptTable().getModel();
   int price = 23;
   Object[] addItem = {"Milk","1",price};
   model.addRow(addItem);
 }
 public void addingItemThirteen()
 {
   DefaultTableModel model = (DefaultTableModel)  getReceiptTable().getModel();
   int price = 83;
   Object[] addItem = {"Coffee","1",price};
   model.addRow(addItem);
 }
 public void addingItemFourteen()
 {
   DefaultTableModel model = (DefaultTableModel)  getReceiptTable().getModel();
   int price = 16;
   Object[] addItem = {"Chips","1",price};
   model.addRow(addItem);
 }
 public void addingItemFifteen()
 {
   DefaultTableModel model = (DefaultTableModel)  getReceiptTable().getModel();
   int price = 33;
   Object[] addItem = {"Sugar","1",price};
   model.addRow(addItem);
 }
 public void addingItemSixteen()
 {
   DefaultTableModel model = (DefaultTableModel)  getReceiptTable().getModel();
   int price = 21;
   Object[] addItem = {"Mushrooms","1",price};
   model.addRow(addItem);
 }
}
