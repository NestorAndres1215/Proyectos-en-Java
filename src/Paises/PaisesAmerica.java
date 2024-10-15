package Paises;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class PaisesAmerica {

    private static final Map<String, String> paisesInfo = new HashMap<>();

    static {
        // Información de los países de América
        paisesInfo.put("Argentina", "Nombre Oficial: República Argentina\nPresidente: Javier Milei\nCapital: Buenos Aires\nMoneda: Peso Argentino\nPrefijo Telefónico: +54\nCiudades Destacadas: Córdoba, Mendoza, Rosario\nIdioma: Español");
        paisesInfo.put("Bolivia", "Nombre Oficial: Estado Plurinacional de Bolivia\nPresidente: Luis Arce\nCapital: Sucre\nMoneda: Boliviano\nPrefijo Telefónico: +591\nCiudades Destacadas: La Paz, Santa Cruz, Cochabamba\nIdioma: Español, Quechua, Aymara");
        paisesInfo.put("Brasil", "Nombre Oficial: República Federativa del Brasil\nPresidente: Luiz Inácio Lula da Silva\nCapital: Brasilia\nMoneda: Real Brasileño\nPrefijo Telefónico: +55\nCiudades Destacadas: São Paulo, Río de Janeiro, Salvador\nIdioma: Portugués");
        paisesInfo.put("Canadá", "Nombre Oficial: Canadá\nPrimer Ministro: Justin Trudeau\nCapital: Ottawa\nMoneda: Dólar Canadiense\nPrefijo Telefónico: +1\nCiudades Destacadas: Toronto, Vancouver, Montreal\nIdioma: Inglés, Francés");
        paisesInfo.put("Chile", "Nombre Oficial: República de Chile\nPresidente: Gabriel Boric\nCapital: Santiago\nMoneda: Peso Chileno\nPrefijo Telefónico: +56\nCiudades Destacadas: Valparaíso, Concepción, Antofagasta\nIdioma: Español");
        paisesInfo.put("Colombia", "Nombre Oficial: República de Colombia\nPresidente: Gustavo Petro\nCapital: Bogotá\nMoneda: Peso Colombiano\nPrefijo Telefónico: +57\nCiudades Destacadas: Medellín, Cali, Cartagena\nIdioma: Español");
        paisesInfo.put("Costa Rica", "Nombre Oficial: República de Costa Rica\nPresidente: Rodrigo Chaves Robles\nCapital: San José\nMoneda: Colón Costarricense\nPrefijo Telefónico: +506\nCiudades Destacadas: Alajuela, Cartago, Heredia\nIdioma: Español");
        paisesInfo.put("Cuba", "Nombre Oficial: República de Cuba\nPresidente: Miguel Díaz-Canel\nCapital: La Habana\nMoneda: Peso Cubano\nPrefijo Telefónico: +53\nCiudades Destacadas: Santiago de Cuba, Camagüey, Holguín\nIdioma: Español");
        paisesInfo.put("Ecuador", "Nombre Oficial: República del Ecuador\nPresidente: Daniel Noboa\nCapital: Quito\nMoneda: Dólar estadounidense\nPrefijo Telefónico: +593\nCiudades Destacadas: Guayaquil, Cuenca, Manta\nIdioma: Español");
        paisesInfo.put("El Salvador", "Nombre Oficial: República de El Salvador\nPresidente: Bukele\nCapital: San Salvador\nMoneda: Dólar estadounidense\nPrefijo Telefónico: +503\nCiudades Destacadas: Santa Ana, San Miguel, Sonsonate\nIdioma: Español");
        paisesInfo.put("Estados Unidos", "Nombre Oficial: Estados Unidos de América\nPresidente: Joe Biden\nCapital: Washington D.C.\nMoneda: Dólar estadounidense\nPrefijo Telefónico: +1\nCiudades Destacadas: Nueva York, Los Ángeles, Chicago\nIdioma: Inglés");
        paisesInfo.put("Guatemala", "Nombre Oficial: República de Guatemala\nPresidente: Bernardo Arévalo\nCapital: Ciudad de Guatemala\nMoneda: Quetzal\nPrefijo Telefónico: +502\nCiudades Destacadas: Antigua Guatemala, Quetzaltenango, Escuintla\nIdioma: Español");
        paisesInfo.put("Honduras", "Nombre Oficial: República de Honduras\nPresidente: Xiomara Castro\nCapital: Tegucigalpa\nMoneda: Lempira\nPrefijo Telefónico: +504\nCiudades Destacadas: San Pedro Sula, La Ceiba, Choluteca\nIdioma: Español");
        paisesInfo.put("Jamaica", "Nombre Oficial: Jamaica\nPrimer Ministro: Andrew Holness\nCapital: Kingston\nMoneda: Dólar Jamaicano\nPrefijo Telefónico: +1-876\nCiudades Destacadas: Montego Bay, Ocho Ríos, Negril\nIdioma: Inglés");
        paisesInfo.put("México", "Nombre Oficial: Estados Unidos Mexicanos\nPresidente: Andrés Manuel López Obrador\nCapital: Ciudad de México\nMoneda: Peso Mexicano\nPrefijo Telefónico: +52\nCiudades Destacadas: Guadalajara, Monterrey, Cancún\nIdioma: Español");
        paisesInfo.put("Nicaragua", "Nombre Oficial: República de Nicaragua\nPresidente: Daniel Ortega\nCapital: Managua\nMoneda: Córdoba\nPrefijo Telefónico: +505\nCiudades Destacadas: León, Granada, Masaya\nIdioma: Español");
        paisesInfo.put("Panamá", "Nombre Oficial: República de Panamá\nPresidente: Laurentino Cortizo\nCapital: Ciudad de Panamá\nMoneda: Balboa, Dólar estadounidense\nPrefijo Telefónico: +507\nCiudades Destacadas: Colón, David, Santiago\nIdioma: Español");
        paisesInfo.put("Paraguay", "Nombre Oficial: República del Paraguay\nPresidente: Santiago Peña\nCapital: Asunción\nMoneda: Guaraní\nPrefijo Telefónico: +595\nCiudades Destacadas: Ciudad del Este, Encarnación, Asunción\nIdioma: Español, Guaraní");
        paisesInfo.put("Perú", "Nombre Oficial: República del Perú\nPresidente: Dina Boluarte\nCapital: Lima\nMoneda: Sol Peruano\nPrefijo Telefónico: +51\nCiudades Destacadas: Cusco, Arequipa, Trujillo\nIdioma: Español");
        paisesInfo.put("República Dominicana", "Nombre Oficial: República Dominicana\nPresidente: Luis Abinader\nCapital: Santo Domingo\nMoneda: Peso Dominicano\nPrefijo Telefónico: +1-809\nCiudades Destacadas: Santiago, Punta Cana, La Romana\nIdioma: Español");
        paisesInfo.put("Uruguay", "Nombre Oficial: República Oriental del Uruguay\nPresidente: Luis Lacalle Pou\nCapital: Montevideo\nMoneda: Peso Uruguayo\nPrefijo Telefónico: +598\nCiudades Destacadas: Salto, Paysandú, Colonia del Sacramento\nIdioma: Español");
        paisesInfo.put("Venezuela", "Nombre Oficial: República Bolivariana de Venezuela\nPresidente: Nicolás Maduro\nCapital: Caracas\nMoneda: Bolívar\nPrefijo Telefónico: +58\nCiudades Destacadas: Maracaibo, Valencia, Barquisimeto\nIdioma: Español");
        paisesInfo.put("Chile", "Nombre Oficial: República de Chile\nPresidente: Gabriel Boric\nCapital: Santiago\nMoneda: Peso Chileno\nPrefijo Telefónico: +56\nCiudades Destacadas: Valparaíso, Concepción, Antofagasta\nIdioma: Español");
        paisesInfo.put("Surinam", "Nombre Oficial: República de Surinam\nPresidente: Chandrikapersad Santokhi\nCapital: Paramaribo\nMoneda: Dólar de Surinam\nPrefijo Telefónico: +597\nCiudades Destacadas: Nieuw Nickerie, Moengo, Paramaribo\nIdioma: Neerlandés");
        paisesInfo.put("Guyana", "Nombre Oficial: República Cooperativa de Guyana\nPresidente: Irfaan Ali\nCapital: Georgetown\nMoneda: Dólar Guyanés\nPrefijo Telefónico: +592\nCiudades Destacadas: Linden, New Amsterdam, Anna Regina\nIdioma: Inglés");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Información de Países de América");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelSeleccion = new JLabel("Selecciona un país:");
        labelSeleccion.setBounds(20, 20, 150, 25);
        frame.add(labelSeleccion);

        String[] paises = paisesInfo.keySet().toArray(new String[0]);
        JComboBox<String> comboPaises = new JComboBox<>(paises);
        comboPaises.setBounds(160, 20, 200, 25);
        frame.add(comboPaises);

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
                String paisSeleccionado = (String) comboPaises.getSelectedItem();
                String info = paisesInfo.get(paisSeleccionado);
                areaInformacion.setText(info);
            }
        });

        frame.setVisible(true);
    }
}