import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame {

    private JTabbedPane tabbedPane1;
    private JPanel Principal;
    private JTabbedPane tabbedPane2;
    private JTextArea textAMostrarArreglos;
    private JTextField textTamanio;
    private JButton btnGenerar;
    private JButton btnOrdenarPorIncersión;
    private JTextArea textAOrdenamientoIncersion;
    private JTextArea textATiempoIncersion;
    private JButton btnOrdenarPorBurbuja;
    private JTextArea textAOrdenamientoBurbuja;
    private JTextArea textATiempoBurbuja;

    public Interfaz() {
        Ordenamiento ordenamiento = new Ordenamiento();
        textAOrdenamientoBurbuja.setEditable(false);
        textAOrdenamientoIncersion.setEditable(false);
        textAMostrarArreglos.setEditable(false);
        btnGenerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int numDatos = Integer.parseInt(textTamanio.getText());
                    ordenamiento.generarArreglos(numDatos);
                    textAMostrarArreglos.setText("");
                    int[] numeros = ordenamiento.getArreglo();
                    for (int i = 0; i < numeros.length; i++) {
                        textAMostrarArreglos.append(numeros[i] + "\n");
                    }
                }catch (Exception x){
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un número y que sea válido");
                }
            }
        });
        btnOrdenarPorIncersión.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ordenamiento.Insercion();
                textAOrdenamientoIncersion.setText("");
                int[] numeros = ordenamiento.getArrInsercion();
                for (int i = 0; i < numeros.length; i++) {
                    textAOrdenamientoIncersion.append(numeros[i] + "\n");
                }

            }
        });
        btnOrdenarPorBurbuja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ordenamiento.Burbuja();
                textAOrdenamientoBurbuja.setText("");
                int[] numeros = ordenamiento.getArrBurbuja();
                for (int i = 0; i < numeros.length; i++) {
                    textAOrdenamientoBurbuja.append(numeros[i] + "\n");
                }
            }
        });
    }

    public JPanel getPrincipal() {
        return Principal;
    }
}
