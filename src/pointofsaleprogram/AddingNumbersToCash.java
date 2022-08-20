
package pointofsaleprogram;

import javax.swing.JButton;
import javax.swing.JTextField;

public class AddingNumbersToCash 
{
    private JTextField cashTextField;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton sixButton;
    private JButton fiveButton;
    private JButton fourButton;
    private JButton threeButton;
    private JButton twoButton;
    private JButton oneButton;
    private JButton dotButton;
    private JButton clearButton;
    private JButton zeroButton;
    
    public void setSevenButton(JButton seven)
    {
        this.sevenButton = seven;
    }
    
    public JButton getSevenButton()
    {
        return sevenButton;
    }
    
    public void setEightButton(JButton eight)
    {
        this.eightButton = eight;
    }
    
    public JButton getEightButton()
    {
        return eightButton;
    }
    public void setNineButton(JButton nine)
    {
        this.nineButton = nine;
    }
    
    public JButton getNineButton()
    {
        return nineButton;
    }
    public void setSixButton(JButton six)
    {
        this.sixButton = six;
    }
    
    public JButton getSixButton()
    {
        return sixButton;
    }
    public void setFiveButton(JButton five)
    {
        this.fiveButton = five;
    }
    
    public JButton getFiveButton()
    {
        return fiveButton;
    }
    public void setFourButton(JButton four)
    {
        this.fourButton = four;
    }
    
    public JButton getFourButton()
    {
        return fourButton;
    }
    public void setThreeButton(JButton three)
    {
        this.threeButton = three;
    }
    
    public JButton getThreeButton()
    {
        return threeButton;
    }
    public void setTwoButton(JButton two)
    {
        this.twoButton = two;
    }
    
    public JButton getTwoButton()
    {
        return twoButton;
    }
    public void setOneButton(JButton one)
    {
        this.oneButton = one;
    }
    
    public JButton getOneButton()
    {
        return oneButton;
    }
    public void setDotButton(JButton dot)
    {
        this.dotButton = dot;
    }
    
    public JButton getDotButton()
    {
        return dotButton;
    }
    public void setClearButton(JButton clear)
    {
        this.clearButton = clear;
    }
    
    public JButton getClearButton()
    {
        return clearButton;
    }
    
    public void setZeroButton(JButton zero)
    {
        this.zeroButton = zero;
    }
    
    public JButton getZeroButton()
    {
        return zeroButton;
    }
     
    public void setCashTextField(JTextField orderCash)
    {
        this.cashTextField = orderCash;
    }
    
    public JTextField getCashTextField()
    {
        return cashTextField;
    }
    
    public void addOne()
    {
        String enterNumber = getCashTextField().getText();
        
        if(enterNumber == "")
        {
           getCashTextField().setText(getOneButton().getText()); 
        }else
        {
            enterNumber = getCashTextField().getText() + getOneButton().getText();
            getCashTextField().setText(enterNumber);
        }
    }
     public void addTwo()
    {
        String enterNumber = getCashTextField().getText();
        
        if(enterNumber == "")
        {
           getCashTextField().setText(getTwoButton().getText()); 
        }else
        {
            enterNumber = getCashTextField().getText() + getTwoButton().getText();
            getCashTextField().setText(enterNumber);
        }
    }
     public void addThree()
    {
        String enterNumber = getCashTextField().getText();
        
        if(enterNumber == "")
        {
           getCashTextField().setText(getThreeButton().getText()); 
        }else
        {
            enterNumber = getCashTextField().getText() + getThreeButton().getText();
            getCashTextField().setText(enterNumber);
        }
    }
     public void addFour()
    {
        String enterNumber = getCashTextField().getText();
        
        if(enterNumber == "")
        {
           getCashTextField().setText(getFourButton().getText()); 
        }else
        {
            enterNumber = getCashTextField().getText() + getFourButton().getText();
            getCashTextField().setText(enterNumber);
        }
    }
     public void addFive()
    {
        String enterNumber = getCashTextField().getText();
        
        if(enterNumber == "")
        {
           getCashTextField().setText(getFiveButton().getText()); 
        }else
        {
            enterNumber = getCashTextField().getText() + getFiveButton().getText();
            getCashTextField().setText(enterNumber);
        }
    }
     public void addSix()
    {
        String enterNumber = getCashTextField().getText();
        
        if(enterNumber == "")
        {
           getCashTextField().setText(getSixButton().getText()); 
        }else
        {
            enterNumber = getCashTextField().getText() + getSixButton().getText();
            getCashTextField().setText(enterNumber);
        }
    }
     public void addSeven()
    {
        String enterNumber = getCashTextField().getText();
        
        if(enterNumber == "")
        {
           getCashTextField().setText(getSevenButton().getText()); 
        }else
        {
            enterNumber = getCashTextField().getText() + getSevenButton().getText();
            getCashTextField().setText(enterNumber);
        }
    }
     public void addEight()
    {
        String enterNumber = getCashTextField().getText();
        
        if(enterNumber == "")
        {
           getCashTextField().setText(getEightButton().getText()); 
        }else
        {
            enterNumber = getCashTextField().getText() + getEightButton().getText();
            getCashTextField().setText(enterNumber);
        }
    }
     public void addNine()
    {
        String enterNumber = getCashTextField().getText();
        
        if(enterNumber == "")
        {
           getCashTextField().setText(getNineButton().getText()); 
        }else
        {
            enterNumber = getCashTextField().getText() + getNineButton().getText();
            getCashTextField().setText(enterNumber);
        }
    }
     public void addDot()
    {
        String enterNumber = getCashTextField().getText();
        
        if(enterNumber == "")
        {
           getCashTextField().setText(getDotButton().getText()); 
        }else
        {
            enterNumber = getCashTextField().getText() + getDotButton().getText();
            getCashTextField().setText(enterNumber);
        }
    }
     public void addClear()
    {
        String enterNumber = getCashTextField().getText();
        
        if(enterNumber == "")
        {
           getCashTextField().setText(getClearButton().getText()); 
        }else
        {
            enterNumber = getCashTextField().getText() + getClearButton().getText();
            getCashTextField().setText(enterNumber);
        }
    }
    
     public void addZero()
    {
        String enterNumber = getCashTextField().getText();
        
        if(enterNumber == "")
        {
           getCashTextField().setText(getZeroButton().getText()); 
        }else
        {
            enterNumber = getCashTextField().getText() + getZeroButton().getText();
            getCashTextField().setText(enterNumber);
        }
    }
      
}
