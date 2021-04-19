/******************************************
* Driver for Library Box
* Descrition : This driver takes user
   input for book category and shows the 
   user a list of books in selected category.
* @author : Jacob Howard
* @version : beta 1.01 (2/2/19)
******************************************/
import javax.swing.JOptionPane;
public class LibraryRedBoxDriver {
   public static void main(String[] args) {
      optionSelect();
   }
   
   //Category Drop Down Menue
   private static void optionSelect() {
      String[] option = new String[5];
      option[0] = "A";
      option[1] = "B";
      option[2] = "C";
      option[3] = "D";
      option[4] = "E";
      
      
      Object selectedCategory = JOptionPane.showInputDialog(null, "Please select a Category of Book", "Category Selection", JOptionPane.QUESTION_MESSAGE, null, option, "A");
      
      String result = "Selected Category: " + selectedCategory;
                  
      JOptionPane.showMessageDialog(null, result,
            "Here are a list of books in that category", JOptionPane.PLAIN_MESSAGE);
   }
   
     
}
