package Usuario;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroUsuario {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Registro de Usuario");
        frame.setSize(600, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelNombre = new JLabel("Nombre:");
        labelNombre.setBounds(20, 20, 100, 25);
        frame.add(labelNombre);

        JTextField campoNombre = new JTextField();
        campoNombre.setBounds(160, 20, 250, 25);
        frame.add(campoNombre);

        JLabel labelApellido = new JLabel("Apellido:");
        labelApellido.setBounds(20, 60, 100, 25);
        frame.add(labelApellido);

        JTextField campoApellido = new JTextField();
        campoApellido.setBounds(160, 60, 250, 25);
        frame.add(campoApellido);

        JLabel labelEmail = new JLabel("Correo Electrónico:");
        labelEmail.setBounds(20, 100, 150, 25);
        frame.add(labelEmail);

        JTextField campoEmail = new JTextField();
        campoEmail.setBounds(160, 100, 250, 25);
        frame.add(campoEmail);

        JLabel labelUsuario = new JLabel("Nombre de Usuario:");
        labelUsuario.setBounds(20, 140, 150, 25);
        frame.add(labelUsuario);

        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(160, 140, 250, 25);
        frame.add(campoUsuario);

        JLabel labelPassword = new JLabel("Contraseña:");
        labelPassword.setBounds(20, 180, 100, 25);
        frame.add(labelPassword);

        JPasswordField campoPassword = new JPasswordField();
        campoPassword.setBounds(160, 180, 250, 25);
        frame.add(campoPassword);

        JLabel labelTelefono = new JLabel("Teléfono:");
        labelTelefono.setBounds(20, 220, 100, 25);
        frame.add(labelTelefono);

        JTextField campoTelefono = new JTextField();
        campoTelefono.setBounds(160, 220, 250, 25);
        frame.add(campoTelefono);

        JLabel labelDNI = new JLabel("DNI:");
        labelDNI.setBounds(20, 260, 100, 25);
        frame.add(labelDNI);

        JTextField campoDNI = new JTextField();
        campoDNI.setBounds(160, 260, 250, 25);
        frame.add(campoDNI);

        JLabel labelGenero = new JLabel("Género:");
        labelGenero.setBounds(20, 300, 100, 25);
        frame.add(labelGenero);

        String[] generos = {"Seleccionar", "Masculino", "Femenino", "Otro"};
        JComboBox<String> comboGenero = new JComboBox<>(generos);
        comboGenero.setBounds(160, 300, 150, 25);
        frame.add(comboGenero);

        JLabel labelPais = new JLabel("País:");
        labelPais.setBounds(20, 340, 100, 25);
        frame.add(labelPais);

        String[] paises = {"Seleccionar", "Argentina", "Bolivia", "Chile", "Colombia", "Ecuador", "Paraguay", "Perú", "Uruguay", "Venezuela"};
        JComboBox<String> comboPais = new JComboBox<>(paises);
        comboPais.setBounds(160, 340, 150, 25);
        frame.add(comboPais);

        JButton botonRegistrar = new JButton("Registrar");
        botonRegistrar.setBounds(120, 380, 150, 25);
        frame.add(botonRegistrar);

        // Crear JTextArea para mostrar la información del usuario
        JTextArea areaInformacion = new JTextArea();
        areaInformacion.setBounds(20, 420, 350, 200);
        areaInformacion.setEditable(false); // No editable
        frame.add(areaInformacion);

        botonRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = campoNombre.getText();
                String apellido = campoApellido.getText();
                String email = campoEmail.getText();
                String usuario = campoUsuario.getText();
                String password = new String(campoPassword.getPassword());
                String telefono = campoTelefono.getText();
                String dni = campoDNI.getText();
                String genero = (String) comboGenero.getSelectedItem();
                String pais = (String) comboPais.getSelectedItem();

                if (nombre.isEmpty() || apellido.isEmpty() || email.isEmpty() || usuario.isEmpty() ||
                        password.isEmpty() || telefono.isEmpty() || dni.isEmpty() || 
                        genero.equals("Seleccionar") || pais.equals("Seleccionar")) {
                    JOptionPane.showMessageDialog(frame, "Por favor, completa todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    StringBuilder informacion = new StringBuilder();
                    informacion.append("Nombre: ").append(nombre).append("\n")
                               .append("Apellido: ").append(apellido).append("\n")
                               .append("Correo: ").append(email).append("\n")
                               .append("Usuario: ").append(usuario).append("\n")
                               .append("Teléfono: ").append(telefono).append("\n")
                               .append("DNI: ").append(dni).append("\n")
                               .append("Género: ").append(genero).append("\n")
                               .append("País: ").append(pais).append("\n");
                    
                    areaInformacion.setText(informacion.toString()); // Mostrar la información en el JTextArea
                }
            }
        });

        frame.setVisible(true);
    }
}

