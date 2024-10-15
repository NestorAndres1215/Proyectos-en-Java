package Calculadora;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {

    private JFrame frame;
    private JTextField pantalla;
    private String operador = "";
    private double num1 = 0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculadora().crearVentana());
    }

    public void crearVentana() {
        frame = new JFrame("Calculadora");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Pantalla de la calculadora
        pantalla = new JTextField();
        pantalla.setEditable(false);
        pantalla.setFont(new Font("Arial", Font.PLAIN, 24));
        frame.add(pantalla, BorderLayout.NORTH);

        // Panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(6, 4));

        // Botones de la calculadora
        String[] botones = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C", "√", "^", "Borrar"
        };

        for (String texto : botones) {
            JButton boton = new JButton(texto);
            boton.setFont(new Font("Arial", Font.PLAIN, 24));
            boton.addActionListener(new BotonListener());
            panelBotones.add(boton);
        }

        frame.add(panelBotones, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private class BotonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String comando = e.getActionCommand();

            switch (comando) {
                case "C":
                    pantalla.setText("");
                    num1 = 0;
                    operador = "";
                    break;
                case "=":
                    double resultado = calcular(Double.parseDouble(pantalla.getText()));
                    pantalla.setText(String.valueOf(resultado));
                    num1 = 0;
                    operador = "";
                    break;
                case "√":
                    double valor = Double.parseDouble(pantalla.getText());
                    if (valor < 0) {
                        JOptionPane.showMessageDialog(frame, "No se puede calcular la raíz cuadrada de un número negativo.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        pantalla.setText(String.valueOf(Math.sqrt(valor)));
                    }
                    break;
                case "^":
                    if (!pantalla.getText().isEmpty()) {
                        num1 = Double.parseDouble(pantalla.getText());
                        operador = comando; // Guardamos el operador de potencia
                        pantalla.setText(""); // Limpiamos la pantalla para el segundo número
                    }
                    break;
                default:
                    if ("+-*/".contains(comando)) {
                        if (!pantalla.getText().isEmpty()) {
                            num1 = Double.parseDouble(pantalla.getText());
                        }
                        operador = comando;
                        pantalla.setText("");
                    } else {
                        pantalla.setText(pantalla.getText() + comando);
                    }
                    break;
            }
        }
    }

    private double calcular(double num2) {
        switch (operador) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(frame, "No se puede dividir entre cero.", "Error", JOptionPane.ERROR_MESSAGE);
                    return 0;
                }
            case "^":
                return Math.pow(num1, num2); // Potencia
            default:
                return 0;
        }
    }
}
