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
        btnGenerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numDatos = Integer.parseInt(textTamanio.getText());
                ordenamiento.QuemarDatosNumDatos(numDatos);
                textAMostrarArreglos.setText("");
                int[] numeros = ordenamiento.getArreglo();
                for (int i = 0; i < numeros.length; i++) {
                    textAMostrarArreglos.append(numeros[i] + "\n");
                }
            }
        });
        btnOrdenarPorIncersión.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ordenamiento.Insercion();
                textAOrdenamientoIncersion.setText("");
                int[] numeros = ordenamiento.mostrarArrInsercion();
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
                int[] numeros = ordenamiento.mostrarArrBurbuja();
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
