package net.markkozel.java.workprojects;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBox;
//import javax.swing.border.SoftBevelBorder;
//import javax.swing.border.BevelBorder;
//import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;

public class JSScrutinizerGui extends JFrame {

	static final long serialVersionUID = 672659595;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSScrutinizerGui frame = new JSScrutinizerGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JSScrutinizerGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 97, 21);
		contentPane.add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpenjsFile = new JMenuItem("Open .js File");
		mnFile.add(mntmOpenjsFile);
		
		JMenuItem mntmSaveResults = new JMenuItem("Save Results");
		mnFile.add(mntmSaveResults);
		
		JMenu mnRun = new JMenu("Run");
		menuBar.add(mnRun);
		
		JMenuItem mntmRunAllTests = new JMenuItem("Run All Tests");
		mnRun.add(mntmRunAllTests);
		
		JMenuItem mntmRunSelectedTests = new JMenuItem("Run Selected Tests");
		mnRun.add(mntmRunSelectedTests);
		
		JPanel panelTestSelector = new JPanel();
		panelTestSelector.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Test Selection", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelTestSelector.setBounds(32, 42, 201, 96);
		contentPane.add(panelTestSelector);
		panelTestSelector.setLayout(null);
		
		JCheckBox chckbxUnusedMethods = new JCheckBox("Unused Methods");
		chckbxUnusedMethods.setBounds(20, 20, 127, 23);
		panelTestSelector.add(chckbxUnusedMethods);
		
		JCheckBox chckbxUnusedVariables = new JCheckBox("Unused Variables");
		chckbxUnusedVariables.setBounds(20, 46, 127, 23);
		panelTestSelector.add(chckbxUnusedVariables);
	}
}
