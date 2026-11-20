package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel {
	/**
	 * El campo para que el usuario ingrese el nombre del restaurante
	 */
	private JTextField txtNombre;

	/**
	 * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a
	 * 5) del restaurante
	 */
	private JComboBox<String> cbbCalificacion;

	/**
	 * Un selector (JComboBox) para que el usuario indique si ya visitó el
	 * restaurante o no
	 */
	private JComboBox<String> cbbVisitado;

	public PanelEditarRestaurante() {
		// Crea el campo para el nombre con una etiqueta al frente
		// TODO completar
		JLabel labNombre = new JLabel("Nombre");
		txtNombre = new JTextField(15);

		// Crea el selector para la calificación con una etiqueta al frente
		// TODO completar
		JLabel labCalificacion = new JLabel("Calidicacion");
		cbbCalificacion = new JComboBox<String>(new String[] { "1", "2", "3", "4", "5" });

		// Crea el selector para indicar si ya ha sido visitado, con una etiqueta al
		// frente
		// TODO completar
		JLabel labVisitado = new JLabel("Visitado");
		cbbVisitado = new JComboBox<String>(new String[] { "No", "Sí" });

		// Agregar todos los elementos al panel
		// TODO completar
		setLayout(new GridLayout(3, 1));

		JPanel panelNombre = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelNombre.add(labNombre);
		panelNombre.add(txtNombre);
		add(panelNombre);

		JPanel panelCalificacion = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelCalificacion.add(labCalificacion);
		panelCalificacion.add(cbbCalificacion);
		add(panelCalificacion);

		JPanel panelVisitado = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelVisitado.add(labVisitado);
		panelVisitado.add(cbbVisitado);
		add(panelVisitado);

	}

	/**
	 * Indica si en el selector se seleccionó la opción que dice que el restaurante
	 * fue visitado
	 * 
	 * @return
	 */
	public boolean getVisitado() {
		// TODO completar
		return cbbVisitado.getSelectedIndex() == 1;
	}

	/**
	 * Indica la calificación marcada en el selector
	 * 
	 * @return
	 */
	public int getCalificacion() {
		String calif = (String) cbbCalificacion.getSelectedItem();
		return Integer.parseInt(calif);
	}

	/**
	 * Indica el nombre digitado para el restaurante
	 * 
	 * @return
	 */
	public String getNombre() {
		// TODO completar
		return txtNombre.getText();
	}
}
