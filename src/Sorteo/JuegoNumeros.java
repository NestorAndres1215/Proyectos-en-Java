package Sorteo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JuegoNumeros extends JFrame {
    private JTextArea resultadoArea;
    private JTextField numero1Field, numero2Field, numero3Field;
    private JButton jugarButton;

    public JuegoNumeros() {
        // Configuración de la ventana
        setTitle("Juego de Números");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Componentes
        JLabel label1 = new JLabel("Número 1:");
        label1.setBounds(50, 30, 100, 30);
        add(label1);
        
        numero1Field = new JTextField();
        numero1Field.setBounds(150, 30, 100, 30);
        add(numero1Field);

        JLabel label2 = new JLabel("Número 2:");
        label2.setBounds(50, 70, 100, 30);
        add(label2);

        numero2Field = new JTextField();
        numero2Field.setBounds(150, 70, 100, 30);
        add(numero2Field);

        JLabel label3 = new JLabel("Número 3:");
        label3.setBounds(50, 110, 100, 30);
        add(label3);

        numero3Field = new JTextField();
        numero3Field.setBounds(150, 110, 100, 30);
        add(numero3Field);

        jugarButton = new JButton("Jugar");
        jugarButton.setBounds(150, 150, 100, 30);
        add(jugarButton);

        resultadoArea = new JTextArea();
        resultadoArea.setBounds(50, 190, 300, 100);
        resultadoArea.setEditable(false); // Para evitar que se edite
        add(resultadoArea);

        // Acción del botón
        jugarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jugar();
            }
        });
    }

    private void jugar() {
        // Obtener los números ingresados
        int num1 = Integer.parseInt(numero1Field.getText());
        int num2 = Integer.parseInt(numero2Field.getText());
        int num3 = Integer.parseInt(numero3Field.getText());

        // Generar 10 números aleatorios
        Random random = new Random();
        int[] numerosAleatorios = new int[10];
        StringBuilder numerosTexto = new StringBuilder("Números generados: ");
        for (int i = 0; i < 10; i++) {
            numerosAleatorios[i] = random.nextInt(100) + 1; // Números entre 1 y 100
            numerosTexto.append(numerosAleatorios[i]).append(" ");
        }

        // Verificar si los 3 números del jugador están entre los generados
        boolean ganado = contieneNumero(numerosAleatorios, num1) && 
                         contieneNumero(numerosAleatorios, num2) && 
                         contieneNumero(numerosAleatorios, num3);

        // Mostrar resultado
        if (ganado) {
            numerosTexto.append("\n¡Ganaste!");
        } else {
            numerosTexto.append("\nPerdiste.");
        }

        resultadoArea.setText(numerosTexto.toString()); // Mostrar los números en el JTextArea
    }

    private boolean contieneNumero(int[] numeros, int numero) {
        for (int n : numeros) {
            if (n == numero) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        JuegoNumeros juego = new JuegoNumeros();
        juego.setVisible(true);
    }
}
