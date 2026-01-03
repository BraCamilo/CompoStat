package view;


import clases.Usuario;
import clases.calculadoraTasaMetabolicaBasal;
import clases.clculadoraIMC;
import clases.CalculadoraGrasaCorporal;

import javax.swing.*;
import java.awt.*;

public class SwingApp extends JFrame {
    private Usuario usuario;



    // Campos para escribir datos
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtPeso;
    private JTextField txtAltura;
    private JTextField txtCintura;
    private JTextField txtCadera;

    private JRadioButton rbHombre;
    private JRadioButton rbMujer;

    public SwingApp() {
        configurarVentana();
        crearFormulario();
        setVisible(true);
    }

    private void configurarVentana() {
        setTitle("Crear Usuario");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void crearFormulario() {

        txtId = new JTextField();
        txtNombre = new JTextField();
        txtEdad = new JTextField();
        txtPeso = new JTextField();
        txtAltura = new JTextField();
        txtCintura = new JTextField();
        txtCadera = new JTextField();

        rbHombre = new JRadioButton("Hombre");
        rbMujer = new JRadioButton("Mujer");

        // 🔹 Panel principal (vertical)
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));

        // 🔹 Panel del formulario (labels + campos)
        JPanel panelFormulario = new JPanel(new GridLayout(7, 2, 5, 5));

        panelFormulario.add(new JLabel("ID:"));
        panelFormulario.add(txtId);

        panelFormulario.add(new JLabel("Nombre:"));
        panelFormulario.add(txtNombre);

        panelFormulario.add(new JLabel("Edad:"));
        panelFormulario.add(txtEdad);

        panelFormulario.add(new JLabel("Peso (kg):"));
        panelFormulario.add(txtPeso);

        panelFormulario.add(new JLabel("Altura (m):"));
        panelFormulario.add(txtAltura);

        panelFormulario.add(new JLabel("Cintura (cm):"));
        panelFormulario.add(txtCintura);

        panelFormulario.add(new JLabel("Cadera (cm):"));
        panelFormulario.add(txtCadera);

        // 🔹 Panel del sexo
        JPanel panelSexo = new JPanel(new FlowLayout());
        panelSexo.add(rbHombre);
        panelSexo.add(rbMujer);

        // 🔹 Botones
        JButton btnCrear = new JButton("Crear Usuario");
        JButton btnTMB = new JButton("Calcular TMB");
        JButton btnIMC = new JButton("Calcular IMC");

        btnCrear.addActionListener(e -> crearUsuario());

        btnTMB.addActionListener(e -> {
            if (usuario == null) {
                JOptionPane.showMessageDialog(this,
                        "Primero debes crear el usuario");
                return;
            }

            double tmb = calculadoraTasaMetabolicaBasal.calcular(usuario);

            JOptionPane.showMessageDialog(this,
                    "Tasa Metabólica Basal:\n" + tmb);
        });

        btnIMC.addActionListener(e -> {
            if (usuario == null) {
                JOptionPane.showMessageDialog(this,
                        "Primero debes crear el usuario");
                return;
            }

            double imc = clculadoraIMC.calularIMC(usuario);

            JOptionPane.showMessageDialog(this,
                    "Indice de masa corporal:\n" + clculadoraIMC.clasificarIMC(imc));
        });

        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.add(btnCrear);
        panelBotones.add(btnTMB);
        panelBotones.add(btnIMC);

        // 🔹 Unir todo
        panelPrincipal.add(panelFormulario);
        panelPrincipal.add(panelSexo);
        panelPrincipal.add(panelBotones);

        add(panelPrincipal);
    }

    private void crearUsuario() {
        try {
            int id = Integer.parseInt(txtId.getText());
            String nombre = txtNombre.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            int peso = Integer.parseInt(txtPeso.getText());
            double altura = Double.parseDouble(txtAltura.getText());
            double cintura = Double.parseDouble(txtCintura.getText());
            double cadera = Double.parseDouble(txtCadera.getText());

            int sexo = rbMujer.isSelected() ? 0 : 1;

            // 🔥 AQUÍ SE LLAMA A TU CONSTRUCTOR 🔥
            usuario = new Usuario(id, nombre, sexo, edad, peso, altura, cintura, cadera);

            JOptionPane.showMessageDialog(this,
                    "Usuario creado correctamente:\n" + usuario.info());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error: revisa los datos",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
