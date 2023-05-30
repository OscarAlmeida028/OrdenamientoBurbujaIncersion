import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       Interfaz interfaz = new Interfaz();
       interfaz.setVisible(true);
       interfaz.setContentPane(interfaz.getPrincipal());
       interfaz.setBounds(100,100,600,500);
       interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       interfaz.setTitle("Ordenamiento");
    }
}