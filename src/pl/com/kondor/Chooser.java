package pl.com.kondor;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


@SuppressWarnings("serial")
public class Chooser extends JPanel
   implements ActionListener {
   Interface inter;
   JButton go;
   JTextPane txtpnRootDirectory = new JTextPane();
   JFileChooser chooser;
   String choosertitle;
   String rootDirectory = "Katalog G³ówny";

  public Chooser(Interface i) {
	this.inter = i;
    go = new JButton("...");
    go.setBounds(10, 11, 35, 28);
    go.addActionListener(this);
    setLayout(null);
    add(go);
    txtpnRootDirectory.setEditable(false);
    
    
    txtpnRootDirectory.setText(rootDirectory);
    txtpnRootDirectory.setBounds(55, 15, 350, 20);
    add(txtpnRootDirectory);
   }

  public void actionPerformed(ActionEvent e) {            
    chooser = new JFileChooser(); 
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle(choosertitle);
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    //
    // disable the "All files" option.
    //
    chooser.setAcceptAllFileFilterUsed(false);
    //    
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
      System.out.println("getCurrentDirectory(): " 
         +  chooser.getCurrentDirectory());
      System.out.println("getSelectedFile() : " 
         +  chooser.getSelectedFile());
      rootDirectory = chooser.getSelectedFile().getPath();
      txtpnRootDirectory.setText(rootDirectory);
      inter.logWrite("Root selected: " + rootDirectory);
      }
    else {
      System.out.println("No Selection ");
      }
     }

  public Dimension getPreferredSize(){
    return new Dimension(200, 200);
    }
}