package SwingsJFRame;

import javax.swing.*;
import java.awt.event.*;
public class Ventana extends JFrame implements ActionListener {
    JButton boton1;
    public Ventana() {
        getContentPane().setLayout(null);
        boton1=new JButton("Finalizar");
        boton1.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    JOptionPane.showMessageDialog(getContentPane(), "Recuerda quedate en casa");
                }
                if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
                    System.exit(0);
                }
        	}
        });
//        boton1.addMouseListener(new MouseAdapter() {
//        	@Override
//        	public void mouseClicked(MouseEvent e) {
//        		System.exit(0);
//        	}
//        });
        boton1.setBounds(300,250,100,30);
        getContentPane().add(boton1);
        boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {

    }
    
    public static void main(String[] ar) {
        Ventana formulario1=new Ventana();
        formulario1.setBounds(0,0,450,350);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
