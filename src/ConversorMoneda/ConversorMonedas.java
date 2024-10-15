package ConversorMoneda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorMonedas {


    // Tasas de conversión aproximadas (octubre de 2024)
    private static final double TASA_PESO_A_DOLAR = 0.267; // 1 Peso MXN = 0.267 USD
    private static final double TASA_PESO_A_EURO = 0.221; // 1 Peso MXN = 0.221 EUR
    private static final double TASA_PESO_A_SOL = 0.053;  // 1 Peso MXN = 0.053 PEN
    private static final double TASA_PESO_A_YEN = 0.007;  // 1 Peso MXN = 0.007 JPY
    private static final double TASA_PESO_A_LIBRA = 0.021; // 1 Peso MXN = 0.021 GBP
    private static final double TASA_PESO_A_CHF = 0.24;  // 1 Peso MXN = 0.24 CHF

    private static final double TASA_DOLAR_A_PESO = 18.5; // 1 USD = 18.5 MXN
    private static final double TASA_DOLAR_A_EURO = 0.93; // 1 USD = 0.93 EUR
    private static final double TASA_DOLAR_A_SOL = 3.76; // 1 USD = 3.76 PEN
    private static final double TASA_DOLAR_A_YEN = 156.22; // 1 USD = 156.22 JPY
    private static final double TASA_DOLAR_A_LIBRA = 0.77; // 1 USD = 0.77 GBP
    private static final double TASA_DOLAR_A_CHF = 0.91; // 1 USD = 0.91 CHF

    private static final double TASA_EURO_A_PESO = 20.46; // 1 EUR = 20.46 MXN
    private static final double TASA_EURO_A_DOLAR = 1.08; // 1 EUR = 1.08 USD
    private static final double TASA_EURO_A_SOL = 4.04; // 1 EUR = 4.04 PEN
    private static final double TASA_EURO_A_YEN = 168.65; // 1 EUR = 168.65 JPY
    private static final double TASA_EURO_A_LIBRA = 0.83; // 1 EUR = 0.83 GBP
    private static final double TASA_EURO_A_CHF = 0.98; // 1 EUR = 0.98 CHF

    private static final double TASA_LIBRA_A_PESO = 48.43; // 1 GBP = 48.43 MXN
    private static final double TASA_LIBRA_A_DOLAR = 1.29; // 1 GBP = 1.29 USD
    private static final double TASA_LIBRA_A_EURO = 1.21; // 1 GBP = 1.21 EUR
    private static final double TASA_LIBRA_A_SOL = 4.83; // 1 GBP = 4.83 PEN
    private static final double TASA_LIBRA_A_YEN = 217.12; // 1 GBP = 217.12 JPY
    private static final double TASA_LIBRA_A_CHF = 1.19; // 1 GBP = 1.19 CHF

    private static final double TASA_SOL_A_PESO = 18.5; // 1 PEN = 18.5 MXN
    private static final double TASA_SOL_A_DOLAR = 0.27; // 1 PEN = 0.27 USD
    private static final double TASA_SOL_A_EURO = 0.25; // 1 PEN = 0.25 EUR
    private static final double TASA_SOL_A_YEN = 39.87; // 1 PEN = 39.87 JPY
    private static final double TASA_SOL_A_LIBRA = 0.21; // 1 PEN = 0.21 GBP
    private static final double TASA_SOL_A_CHF = 0.24; // 1 PEN = 0.24 CHF

    private static final double TASA_YEN_A_PESO = 0.13; // 1 JPY = 0.13 MXN
    private static final double TASA_YEN_A_DOLAR = 0.0064; // 1 JPY = 0.0064 USD
    private static final double TASA_YEN_A_EURO = 0.0059; // 1 JPY = 0.0059 EUR
    private static final double TASA_YEN_A_SOL = 0.025; // 1 JPY = 0.025 PEN
    private static final double TASA_YEN_A_LIBRA = 0.0046; // 1 JPY = 0.0046 GBP
    private static final double TASA_YEN_A_CHF = 0.0062; // 1 JPY = 0.0062 CHF

    private static final double TASA_CHF_A_PESO = 4.14; // 1 CHF = 4.14 MXN
    private static final double TASA_CHF_A_DOLAR = 1.10; // 1 CHF = 1.10 USD
    private static final double TASA_CHF_A_EURO = 1.02; // 1 CHF = 1.02 EUR
    private static final double TASA_CHF_A_SOL = 4.16; // 1 CHF = 4.16 PEN
    private static final double TASA_CHF_A_YEN = 161.50; // 1 CHF = 161.50 JPY
    private static final double TASA_CHF_A_LIBRA = 0.84; // 1 CHF = 0.84 GBP

    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversor de Monedas");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelMonto = new JLabel("Monto:");
        labelMonto.setBounds(20, 20, 100, 25);
        frame.add(labelMonto);

        JTextField campoMonto = new JTextField();
        campoMonto.setBounds(160, 20, 150, 25);
        frame.add(campoMonto);

        JLabel labelMonedaOrigen = new JLabel("Moneda de Origen:");
        labelMonedaOrigen.setBounds(20, 60, 150, 25);
        frame.add(labelMonedaOrigen);

        String[] monedas = {"Peso", "Dólar", "Euro", "Sol", "Yen", "Libra", "Franco Suizo"};
        JComboBox<String> comboOrigen = new JComboBox<>(monedas);
        comboOrigen.setBounds(160, 60, 150, 25);
        frame.add(comboOrigen);

        JLabel labelMonedaDestino = new JLabel("Moneda de Destino:      ");
        labelMonedaDestino.setBounds(20, 100, 150, 25);
        frame.add(labelMonedaDestino);

        JComboBox<String> comboDestino = new JComboBox<>(monedas);
        comboDestino.setBounds(160, 100, 150, 25);
        frame.add(comboDestino);

        JButton botonConvertir = new JButton("Convertir");
        botonConvertir.setBounds(160, 140, 150, 25);
        frame.add(botonConvertir);

        JLabel labelResultado = new JLabel("Resultado:");
        labelResultado.setBounds(20, 180, 300, 25);
        frame.add(labelResultado);

        botonConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double monto = Double.parseDouble(campoMonto.getText());
                int origen = comboOrigen.getSelectedIndex();
                int destino = comboDestino.getSelectedIndex();
                double resultado = convertir(monto, origen, destino);
                labelResultado.setText("Resultado: " + String.format("%.2f", resultado));
            }
        });

        frame.setVisible(true);
    }

    private static double convertir(double monto, int origen, int destino) {
        double montoConvertido = 0;

        // Conversión según moneda de origen
        if (origen == 0) { // Peso
            if (destino == 0) return monto; // Peso a Peso
            if (destino == 1) montoConvertido = monto * TASA_PESO_A_DOLAR; // Peso a Dólar
            if (destino == 2) montoConvertido = monto * TASA_PESO_A_EURO; // Peso a Euro
            if (destino == 3) montoConvertido = monto * TASA_PESO_A_SOL; // Peso a Sol
            if (destino == 4) montoConvertido = monto * TASA_PESO_A_YEN; // Peso a Yen
            if (destino == 5) montoConvertido = monto * TASA_PESO_A_LIBRA; // Peso a Libra
            if (destino == 6) montoConvertido = monto * TASA_PESO_A_CHF; // Peso a Franco Suizo
        } else if (origen == 1) { // Dólar
            if (destino == 0) montoConvertido = monto * TASA_DOLAR_A_PESO; // Dólar a Peso
            if (destino == 1) return monto; // Dólar a Dólar
            if (destino == 2) montoConvertido = monto * TASA_DOLAR_A_EURO; // Dólar a Euro
            if (destino == 3) montoConvertido = monto * TASA_DOLAR_A_SOL; // Dólar a Sol
            if (destino == 4) montoConvertido = monto * TASA_DOLAR_A_YEN; // Dólar a Yen
            if (destino == 5) montoConvertido = monto * TASA_DOLAR_A_LIBRA; // Dólar a Libra
            if (destino == 6) montoConvertido = monto * TASA_DOLAR_A_CHF; // Dólar a Franco Suizo
        } else if (origen == 2) { // Euro
            if (destino == 0) montoConvertido = monto * TASA_EURO_A_PESO; // Euro a Peso
            if (destino == 1) montoConvertido = monto * TASA_EURO_A_DOLAR; // Euro a Dólar
            if (destino == 2) return monto; // Euro a Euro
            if (destino == 3) montoConvertido = monto * TASA_EURO_A_SOL; // Euro a Sol
            if (destino == 4) montoConvertido = monto * TASA_EURO_A_YEN; // Euro a Yen
            if (destino == 5) montoConvertido = monto * TASA_EURO_A_LIBRA; // Euro a Libra
            if (destino == 6) montoConvertido = monto * TASA_EURO_A_CHF; // Euro a Franco Suizo
        } else if (origen == 3) { // Sol
            if (destino == 0) montoConvertido = monto * TASA_SOL_A_PESO; // Sol a Peso
            if (destino == 1) montoConvertido = monto * TASA_SOL_A_DOLAR; // Sol a Dólar
            if (destino == 2) montoConvertido = monto * TASA_SOL_A_EURO; // Sol a Euro
            if (destino == 3) return monto; // Sol a Sol
            if (destino == 4) montoConvertido = monto * TASA_SOL_A_YEN; // Sol a Yen
            if (destino == 5) montoConvertido = monto * TASA_SOL_A_LIBRA; // Sol a Libra
            if (destino == 6) montoConvertido = monto * TASA_SOL_A_CHF; // Sol a Franco Suizo
        } else if (origen == 4) { // Yen
            if (destino == 0) montoConvertido = monto * TASA_YEN_A_PESO; // Yen a Peso
            if (destino == 1) montoConvertido = monto * TASA_YEN_A_DOLAR; // Yen a Dólar
            if (destino == 2) montoConvertido = monto * TASA_YEN_A_EURO; // Yen a Euro
            if (destino == 3) montoConvertido = monto * TASA_YEN_A_SOL; // Yen a Sol
            if (destino == 4) montoConvertido = monto * TASA_YEN_A_LIBRA; // Yen a Libra
            if (destino == 5) montoConvertido = monto * TASA_YEN_A_CHF; // Yen a Franco Suizo
        } else if (origen == 5) { // Libra
            if (destino == 0) montoConvertido = monto * TASA_LIBRA_A_PESO; // Libra a Peso
            if (destino == 1) montoConvertido = monto * TASA_LIBRA_A_DOLAR; // Libra a Dólar
            if (destino == 2) montoConvertido = monto * TASA_LIBRA_A_EURO; // Libra a Euro
            if (destino == 3) montoConvertido = monto * TASA_LIBRA_A_SOL; // Libra a Sol
            if (destino == 4) montoConvertido = monto * TASA_LIBRA_A_YEN; // Libra a Yen
            if (destino == 5) return monto; // Libra a Libra
            if (destino == 6) montoConvertido = monto * TASA_LIBRA_A_CHF; // Libra a Franco Suizo
        } else if (origen == 6) { // Franco Suizo
            if (destino == 0) montoConvertido = monto * TASA_CHF_A_PESO; // CHF a Peso
            if (destino == 1) montoConvertido = monto * TASA_CHF_A_DOLAR; // CHF a Dólar
            if (destino == 2) montoConvertido = monto * TASA_CHF_A_EURO; // CHF a Euro
            if (destino == 3) montoConvertido = monto * TASA_CHF_A_SOL; // CHF a Sol
            if (destino == 4) montoConvertido = monto * TASA_CHF_A_YEN; // CHF a Yen
            if (destino == 5) montoConvertido = monto * TASA_CHF_A_LIBRA; // CHF a Libra
            if (destino == 6) return monto; // CHF a CHF
        }


        return montoConvertido;
    }
}
