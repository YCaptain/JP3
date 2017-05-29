package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 * JungleParty  is a simple application used by children to practice their counting skills
 * @author author
 *
 */
public class Task3 {
	// max number of displayed pictures 
	private final int MAXPIC = 10;
	// different order to give uncommon displayed order of picture
	private static final String[] PICURL = {"animal3.png", "animal8.png", "animal1.png", "animal10.png", "animal2.png",
						"animal9.png", "animal5.png", "animal6.png", "animal4.png", "animal7.png"};
	private JFrame frame;
	private JPanel contentPane;
	private JFormattedTextField txt;
	private JLabel lblWords;
	private JLabel lblTips;
	private JButton[] btnPicture;
	private GridBagConstraints[] gbc;
	private int numDisplayed;
	private Random random;

	/**
	 * Launch the application.
	 * @param args run
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Task3 window = new Task3();
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
	public Task3() {
		numDisplayed = 10;
		random = new Random();
		btnPicture = new JButton[numDisplayed];
		gbc = new GridBagConstraints[numDisplayed];
		initialize();
		Dimension screenSize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize= frame.getSize();
		frame.setLocation((screenSize.width-frameSize.width)/2,(screenSize.height-frameSize.height)/2);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Welcome to the Jungle Party!");
		frame.setBounds(100, 100, 1050, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(getContentPane());
	}
	/**
	 * get contentPane
	 * new a JPanel and layout it if null
	 * @return JPanel
	 */
	private JPanel getContentPane() {
		if(contentPane == null) {
			contentPane = new JPanel();
			GridBagLayout gbl_contentPane = new GridBagLayout();
			gbl_contentPane.columnWidths = new int[]{60, 0, 135, 0, 135, 0, 135, 47, 135, 0, 135, 60, 0};
			gbl_contentPane.rowHeights = new int[]{60, 120, 35, 120, 15, 30, 30, 0, 0};
			gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			contentPane.setLayout(gbl_contentPane);
			// set buttons
			for(int i = 0; i < MAXPIC; i++) {
				btnPicture[i] = new JButton();
				setRemovableAnimal(btnPicture[i]);
				btnPicture[i].setIcon(new ImageIcon(Task3.class.getResource(PICURL[i])));
			}
			// set grid bag constraints
			for(int i = 0; i < 10; i++) {
				gbc[i] = new GridBagConstraints();
				gbc[i].gridwidth = 2;
				gbc[i].insets = new Insets(10, 20, 10, 20);	
				if(i < 5) {
					gbc[i].gridx = i*2 + 1;
					gbc[i].gridy = 1;
				} else if(i < 10) {
					gbc[i].gridx = (i-5)*2 + 1;
					gbc[i].gridy = 3;
				}
			}
			contentPane.add(btnPicture[2], gbc[0]);
			contentPane.add(btnPicture[4], gbc[1]);
			contentPane.add(btnPicture[0], gbc[2]);
			contentPane.add(btnPicture[8], gbc[3]);
			contentPane.add(btnPicture[6], gbc[4]);
			contentPane.add(btnPicture[7], gbc[5]);
			contentPane.add(btnPicture[9], gbc[6]);
			contentPane.add(btnPicture[1], gbc[7]);
			contentPane.add(btnPicture[5], gbc[8]);
			contentPane.add(btnPicture[3], gbc[9]);
			
			// add words label
			GridBagConstraints gbc_lblWords = new GridBagConstraints();
			lblWords = new JLabel("How many animals have come to the party?\r\n");
			lblWords.setForeground(new Color(0, 102, 0));
			lblWords.setFont(new Font("Cambria", Font.PLAIN, 15));
			gbc_lblWords.anchor = GridBagConstraints.EAST;
			gbc_lblWords.gridwidth = 3;
			gbc_lblWords.insets = new Insets(0, 0, 5, 5);
			gbc_lblWords.gridx = 4;
			gbc_lblWords.gridy = 5;
			contentPane.add(lblWords, gbc_lblWords);
			
			// set JTextField to maintain input from player
			GridBagConstraints gbc_txt = new GridBagConstraints();
			gbc_txt.fill = GridBagConstraints.HORIZONTAL;
			gbc_txt.insets = new Insets(0, 0, 5, 5);
			gbc_txt.gridx = 7;
			gbc_txt.gridy = 5;

			txt = new JFormattedTextField();
			txt.getDocument().addDocumentListener(new DocumentListener() {
				// identify if input from user is valid
				// clear txt if it is invalid
				@Override
				public void insertUpdate(DocumentEvent e) {
					String str = txt.getText();
					char num[] = str.toCharArray();
					boolean isNumeric = true;
					for(int i = 0; i < num.length; i ++) {
						if(!Character.isDigit(num[i])) {
							isNumeric = false;
						}
					}if(isNumeric) {
						if((Integer.parseInt(txt.getText()) > 10 || Integer.parseInt(txt.getText()) < 0) && !txt.getText().equals("")) {
							EventQueue.invokeLater(new Runnable() {
								public void run() {
									txt.setText("");
								}
							});
							txt.requestFocus();
						}
					} else {
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								txt.setText("");
							}
						});
						txt.requestFocus();
					}
				}
				@Override
				public void removeUpdate(DocumentEvent e) {
				}
				@Override
				public void changedUpdate(DocumentEvent e) {
				}
			});
			// invoke check()
			txt.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent event) {
					if(event.getKeyCode() == KeyEvent.VK_ENTER && !txt.getText().equals(""))
						check();
				}
			});
			txt.setFont(new Font("Arial Black", Font.PLAIN, 15));
			contentPane.add(txt, gbc_txt);
			txt.setToolTipText("Enter a number");
			txt.setColumns(10);
			
			// add Mouse adapter to get Mouse Event and check answers
			JButton btnCheck = new JButton("Check!");
			btnCheck.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent evnt) {
					if(!txt.getText().equals(""))
						check();
				}
			});
			btnCheck.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
			GridBagConstraints gbc_btnCheck = new GridBagConstraints();
			gbc_btnCheck.insets = new Insets(0, 0, 5, 5);
			gbc_btnCheck.gridx = 6;
			gbc_btnCheck.gridy = 6;
			contentPane.add(btnCheck, gbc_btnCheck);
			
			GridBagConstraints gbc_lblTips = new GridBagConstraints();
			lblTips = new JLabel("Click on animals you wish to kick out of the party!");
			lblTips.setForeground(Color.RED);
			gbc_lblTips.gridwidth = 9;
			gbc_lblTips.insets = new Insets(0, 0, 5, 5);
			gbc_lblTips.gridx = 2;
			gbc_lblTips.gridy = 7;
			contentPane.add(lblTips, gbc_lblTips);
		}
		return contentPane;
	}
	/** 
	 * if number of displayed picture is right
	 *	get new random number and set picture
	 *	else return wrong message.
	 */
	private void check() {
		if(Integer.parseInt(txt.getText()) == numDisplayed) {
			int r = 1+random.nextInt(10);
			while(r == numDisplayed) {
				r = 1+random.nextInt(10);
			}
			numDisplayed = r;
			setPicture();
			lblWords.setText("Correct! How many animals are in the party now?");
			lblWords.setForeground(new Color(0, 102, 0));
			
		} else {
			lblWords.setText("Wrong! Try again!");
			lblWords.setForeground(Color.RED);
		}
		txt.setText("");
	}
	/**
	 * set picture randomly
	 */
	private void setPicture() {
		// set displayed pictures
		for(int i = 0; i < numDisplayed; i++) {
			btnPicture[i].setEnabled(true);
		}
		// clear pictures from buttons
		for(int i = numDisplayed; i < MAXPIC; i++) {
			btnPicture[i].setEnabled(false);
		}
	}
	/**
	 * set animal can be removed
	 * @param button to be set
	 */
	private void setRemovableAnimal(JButton button) {
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(button.isEnabled()) {
					button.setEnabled(false);
					lblWords.setText("Animal gone! How many animals are in the party now?");
					numDisplayed--;
				}
			}
		});
	}
}
