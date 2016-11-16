/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * PROYECTO 2 - YouSearch
 * Descripción:
    Sistema de recomendación de películas
 * Integrantes:
    Paulina Cano - 15053
    Marlon Hernández - 15144
    Andrés Girón - 15174
    Brandon Hernández - 15326
 * Principal.java
    Esta clase es la interfaz gráfica GUI para el manejo del programa
 */

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.LinkedList;
import javax.swing.SwingConstants;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

public class Principal {

	private JFrame frame, frame1;
        private String nombre, gustos, recomendacion;
        private Queries query = new Queries();

	/**
	 * Launch the application.
	 */
            public static void main(String[] args) {
                //Se crea una fabrica para crear bases de datos
                GraphDatabaseFactory dbFactory = new GraphDatabaseFactory();
                //Se obtiene la dirección de la base de datos, esta cambia en cada computadora:
                File directorio = new File("C:\\Users\\usuario\\Documents\\Neo4j\\default.graphdb");
                //Se utiliza el objeto tipo file para ingresar al archivo del grafoDataBase = dbFactory.newEmbeddedDatabase(directorio);
                GraphDatabaseService DataBase = dbFactory.newEmbeddedDatabase(directorio);
                DataBase.execute("MATCH (n)\n" + "OPTIONAL MATCH (n)-[r]-()\n" + "DELETE n,r");
                //Se crea la base de datos, llena con valores predeterminados
                DataBase Base = new DataBase();
                Base.levantarDataBase(DataBase);
                
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
                                    Principal window = new Principal(DataBase);
                                    window.frame.setVisible(true);                                                                     
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal(GraphDatabaseService DataBase) {
                initialize(DataBase);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(GraphDatabaseService DB) {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 729);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAndrsGirn = new JButton("");
		btnAndrsGirn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                                nombre = "Andres";
                                frame1.setVisible(true);
                                frame.setVisible(false);
			}
		});
		btnAndrsGirn.setIcon(new ImageIcon(System.getProperty("user.dir") +  "\\images\\Walterrr.jpg"));
		btnAndrsGirn.setForeground(new Color(128, 0, 0));
		btnAndrsGirn.setFont(new Font("Stencil", Font.PLAIN, 16));
		btnAndrsGirn.setBackground(new Color(255, 255, 255));
		btnAndrsGirn.setBounds(45, 294, 247, 263);
		frame.getContentPane().add(btnAndrsGirn);
                		
		JButton btnNewButton = new JButton("");
                btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                                nombre = "Paulina";
                                frame1.setVisible(true);
                                frame.setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\images\\Harry.png"));
		btnNewButton.setBounds(358, 294, 247, 263);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
                btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                                nombre = "Brandon";
                                frame1.setVisible(true);
                                frame.setVisible(false);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\images\\jesse.jpg"));
		btnNewButton_1.setBounds(681, 294, 247, 263);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
                btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                                nombre = "Marlon";
                                frame1.setVisible(true);
                                frame.setVisible(false);
			}
		});
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\images\\cafecito.png"));
		btnNewButton_2.setBounds(978, 294, 272, 263);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblAndrsGirn = new JLabel("ANDR\u00C9S");
		lblAndrsGirn.setHorizontalAlignment(SwingConstants.CENTER);
		lblAndrsGirn.setForeground(new Color(255, 255, 255));
		lblAndrsGirn.setFont(new Font("Arial Narrow", Font.PLAIN, 30));
		lblAndrsGirn.setBounds(45, 581, 250, 28);
		frame.getContentPane().add(lblAndrsGirn);
		
		JLabel lblPaulinaCano = new JLabel("PAULLINA");
		lblPaulinaCano.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaulinaCano.setForeground(Color.WHITE);
		lblPaulinaCano.setFont(new Font("Arial Narrow", Font.PLAIN, 30));
		lblPaulinaCano.setBounds(358, 581, 250, 28);
		frame.getContentPane().add(lblPaulinaCano);
		
		JLabel lblBrandonHern = new JLabel("BRANDON");
		lblBrandonHern.setHorizontalAlignment(SwingConstants.CENTER);
		lblBrandonHern.setForeground(Color.WHITE);
		lblBrandonHern.setFont(new Font("Arial Narrow", Font.PLAIN, 30));
		lblBrandonHern.setBounds(681, 581, 250, 28);
		frame.getContentPane().add(lblBrandonHern);
		
		JLabel lblMarlonHern = new JLabel("MARLON");
		lblMarlonHern.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarlonHern.setForeground(Color.WHITE);
		lblMarlonHern.setFont(new Font("Arial Narrow", Font.PLAIN, 30));
		lblMarlonHern.setBounds(988, 581, 250, 28);
		frame.getContentPane().add(lblMarlonHern);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\images\\Diapositiva1.PNG"));
		lblNewLabel.setBounds(0, -35, 1616, 746);
		frame.getContentPane().add(lblNewLabel);
                
                //***************************************************************************************************************
                // F R A M E * 2 **** SEGUNDA PANTALLA **************************************************************************
                //***************************************************************************************************************
                
                //Se obtiene la lista de datos
                gustos = query.toString(query.gustos(DB, nombre));
                recomendacion = query.toString(query.recomendacion(DB, nombre));
                        
		frame1 = new JFrame();
		frame1.setBounds(100, 100, 1280, 729);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
                           
                JLabel mostrarGustos = new JLabel(gustos);
		mostrarGustos.setHorizontalAlignment(SwingConstants.CENTER);
		mostrarGustos.setForeground(Color.WHITE);
		mostrarGustos.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		mostrarGustos.setBounds(50, 250, 250, 250);
		frame1.getContentPane().add(mostrarGustos);
                
                JLabel mostrarRecomendaciones = new JLabel(recomendacion);
		mostrarRecomendaciones.setHorizontalAlignment(SwingConstants.CENTER);
		mostrarRecomendaciones.setForeground(Color.YELLOW);
		mostrarRecomendaciones.setFont(new Font("Arial Narrow", Font.PLAIN, 20));
		mostrarRecomendaciones.setBounds(50, 581, 250, 250);
		frame1.getContentPane().add(mostrarRecomendaciones);
		
		JButton salida = new JButton("");
                salida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                                frame.setVisible(true);
				frame1.setVisible(false);
			}
		});
		salida.setForeground(new Color(0, 0, 0));
		salida.setBackground(new Color(0, 0, 0));
		salida.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\images\\regresar.png"));
		salida.setBounds(1095, 26, 134, 81);
		frame1.getContentPane().add(salida);
		
		JLabel fondo = new JLabel("New label");
		fondo.setBounds(0, 0, 1262, 682);
		fondo.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\images\\YouSearch.png"));
		frame1.getContentPane().add(fondo);
	}
}
