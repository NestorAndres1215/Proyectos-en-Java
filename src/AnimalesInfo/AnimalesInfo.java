package AnimalesInfo;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class AnimalesInfo {

    private static final Map<String, String> animalesInfo = new HashMap<>();

    static {
        // Información de los animales
        animalesInfo.put("Perro", "Nombre Científico: Canis lupus familiaris\nHábitat: Doméstico\nDieta: Omnívoro\nEsperanza de Vida: 10-15 años\nDescripción: Los perros son animales leales y protectores, conocidos por su relación cercana con los humanos.");
        animalesInfo.put("Gato", "Nombre Científico: Felis catus\nHábitat: Doméstico\nDieta: Carnívoro\nEsperanza de Vida: 12-15 años\nDescripción: Los gatos son animales independientes y curiosos, apreciados por su comportamiento juguetón.");
        animalesInfo.put("Elefante", "Nombre Científico: Elephas maximus\nHábitat: Savanas y bosques\nDieta: Herbívoro\nEsperanza de Vida: 60-70 años\nDescripción: Los elefantes son los mamíferos terrestres más grandes, conocidos por su memoria y su comportamiento social.");
        animalesInfo.put("Tigre", "Nombre Científico: Panthera tigris\nHábitat: Selvas y bosques\nDieta: Carnívoro\nEsperanza de Vida: 10-15 años en la naturaleza\nDescripción: Los tigres son grandes felinos conocidos por su pelaje a rayas y su habilidad como cazadores.");
        animalesInfo.put("Delfín", "Nombre Científico: Delphinus delphis\nHábitat: Oceánicos y costeros\nDieta: Carnívoro\nEsperanza de Vida: 20-60 años\nDescripción: Los delfines son mamíferos acuáticos inteligentes, conocidos por su comportamiento social y su capacidad para comunicarse.");
        animalesInfo.put("Águila", "Nombre Científico: Aquila chrysaetos\nHábitat: Montañas y bosques\nDieta: Carnívoro\nEsperanza de Vida: 20-30 años\nDescripción: Las águilas son aves rapaces, conocidas por su aguda vista y su habilidad para cazar.");
        animalesInfo.put("Cebra", "Nombre Científico: Equus zebra\nHábitat: Sabana y praderas\nDieta: Herbívoro\nEsperanza de Vida: 20-30 años\nDescripción: Las cebras son conocidas por su distintivo pelaje a rayas blancas y negras, que las ayuda a camuflarse.");
        animalesInfo.put("Oso", "Nombre Científico: Ursidae\nHábitat: Bosques y montañas\nDieta: Omnívoro\nEsperanza de Vida: 20-30 años en la naturaleza\nDescripción: Los osos son grandes mamíferos conocidos por su fuerza y su comportamiento solitario.");
        animalesInfo.put("Rana", "Nombre Científico: Anura\nHábitat: Agua dulce y zonas húmedas\nDieta: Carnívoro\nEsperanza de Vida: 4-15 años\nDescripción: Las ranas son anfibios que pasan parte de su vida en el agua y otra parte en tierra, conocidas por su canto.");
        animalesInfo.put("Tortuga", "Nombre Científico: Testudines\nHábitat: Terrestre y acuático\nDieta: Herbívoro o carnívoro, según la especie\nEsperanza de Vida: 50-100 años\nDescripción: Las tortugas son reptiles conocidos por su caparazón y su longevidad.");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Información de Animales");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelSeleccion = new JLabel("Selecciona un animal:");
        labelSeleccion.setBounds(20, 20, 150, 25);
        frame.add(labelSeleccion);

        String[] animales = animalesInfo.keySet().toArray(new String[0]);
        JComboBox<String> comboAnimales = new JComboBox<>(animales);
        comboAnimales.setBounds(160, 20, 200, 25);
        frame.add(comboAnimales);

        JButton botonMostrar = new JButton("Mostrar Información");
        botonMostrar.setBounds(100, 60, 200, 25);
        frame.add(botonMostrar);

        JTextArea areaInformacion = new JTextArea();
        areaInformacion.setBounds(20, 100, 350, 250);
        areaInformacion.setLineWrap(true);
        areaInformacion.setWrapStyleWord(true);
        areaInformacion.setEditable(false);
        frame.add(areaInformacion);

        botonMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String animalSeleccionado = (String) comboAnimales.getSelectedItem();
                String info = animalesInfo.get(animalSeleccionado);
                areaInformacion.setText(info);
            }
        });

        frame.setVisible(true);
    }
}
