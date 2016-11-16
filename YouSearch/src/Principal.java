import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
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
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 729);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAndrsGirn = new JButton("");
		btnAndrsGirn.setIcon(new ImageIcon(System.getProperty("user.dir") +  "\\Walterrr.jpg"));
		btnAndrsGirn.setForeground(new Color(128, 0, 0));
		btnAndrsGirn.setFont(new Font("Stencil", Font.PLAIN, 16));
		btnAndrsGirn.setBackground(new Color(255, 255, 255));
		btnAndrsGirn.setBounds(45, 294, 247, 263);
		frame.getContentPane().add(btnAndrsGirn);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\Harry.png"));
		btnNewButton.setBounds(358, 294, 247, 263);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\jesse.jpg"));
		btnNewButton_1.setBounds(681, 294, 247, 263);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\cafecito.png"));
		btnNewButton_2.setBounds(978, 294, 272, 263);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblAndrsGirn = new JLabel("ANDR\u00C9S");
		lblAndrsGirn.setHorizontalAlignment(SwingConstants.CENTER);
		lblAndrsGirn.setForeground(new Color(255, 255, 255));
		lblAndrsGirn.setFont(new Font("Arial Narrow", Font.PLAIN, 30));
		lblAndrsGirn.setBounds(45, 581, 250, 28);
		frame.getContentPane().add(lblAndrsGirn);
		
		JLabel lblPaulinaCano = new JLabel("PAULINA");
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
		lblNewLabel.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\Diapositiva1.PNG"));
		lblNewLabel.setBounds(0, -35, 1616, 746);
		frame.getContentPane().add(lblNewLabel);
	}
}
