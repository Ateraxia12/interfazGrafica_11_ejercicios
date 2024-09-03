
package GUI.ejercicio1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {

     JLabel etiNombre, Ciudad;
    JButton btnOcultarNombre, btnVisuNombre, btnOcultarCiudad, btnVisuCiudad;

    public VentanaPrincipal() {
       
        iniciarComponentes();
        setTitle("Ventana Principal");
        setSize(600, 250);
        setLayout(null); 
         
}

        private void iniciarComponentes  () {
 etiNombre = new JLabel("Stiven Parra ");
       
        Ciudad = new JLabel("Calarca");
        btnOcultarNombre = new JButton("Ocultar Nombre");
        btnVisuNombre = new JButton("Visualizar Nombre");
        btnOcultarCiudad = new JButton("Ocultar Ciudad");
        btnVisuCiudad = new JButton("Visualizar Ciudad");

        etiNombre.setBounds(50, 30, 190, 30);
        Ciudad.setBounds(50, 70, 100, 30);
        btnOcultarNombre.setBounds(200, 30, 190, 30);
        btnVisuNombre.setBounds(200, 70, 190, 30);
        btnOcultarCiudad.setBounds(200, 110, 190, 30);
        btnVisuCiudad.setBounds(200, 150, 190, 30);

        add(etiNombre);
        add(Ciudad);
        add(btnOcultarNombre);
        add(btnVisuNombre);
        add(btnOcultarCiudad);
        add(btnVisuCiudad);
        
        btnOcultarNombre.addActionListener(this);
        btnVisuNombre.addActionListener(this);
        btnOcultarCiudad.addActionListener(this);
        btnVisuCiudad.addActionListener(this);
    }


       
    // Método para manejar los eventos de los botones
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOcultarNombre) {
            etiNombre.setVisible(false);
        } else if (e.getSource() == btnVisuNombre) {
            etiNombre.setVisible(true);
        } else if (e.getSource() == btnOcultarCiudad) {
            Ciudad.setVisible(false);
        } else if (e.getSource() == btnVisuCiudad) {
           Ciudad.setVisible(true);
        }
    }
}
