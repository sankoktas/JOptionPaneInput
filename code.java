import javax.swing.JOptionPane;
public class KFS_JOptionPaneVariable_Main
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
        System.out.println("I'm sorry, "+ name + "." + " I'm afraid I can't do that");
  
    }
}
