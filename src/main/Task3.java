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
import javax.swing.JTextField;

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

	private static final String PICURL1 = "animal1.png";
	private static final String PICURL2 = "animal2.png";
	private static final String PICURL3 = "animal3.png";
	private static final String PICURL4 = "animal4.png";
	private static final String PICURL5 = "animal5.png";
	private static final String PICURL6 = "animal6.png";
	private static final String PICURL7 = "animal7.png";
	private static final String PICURL8 = "animal8.png";
	private static final String PICURL9 = "animal9.png";
	private static final String PICURL10 = "animal10.png";
	
	private JFrame frame;
	private JPanel contentPane;
	private JTextField txt;
	private JLabel lblWords;
	
	private JButton lblPicture1, lblPicture2, lblPicture3, lblPicture4, lblPicture5, lblPicture6, lblPicture7, lblPicture8, lblPicture9, lblPicture10;
	
	private int numDisplayed;
	private Random random;
	private JLabel lblTips;
	
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
			gbl_contentPane.rowHeights = new int[]{60, 120, 35, 120, 15, 30, 30, 0, 0, 0};
			gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
			gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			contentPane.setLayout(gbl_contentPane);
			
			GridBagConstraints gbc_lblPicture_1 = new GridBagConstraints();
			gbc_lblPicture_1.gridwidth = 2;
			gbc_lblPicture_1.insets = new Insets(10, 20, 10, 20);
			gbc_lblPicture_1.gridx = 1;
			gbc_lblPicture_1.gridy = 1;
			contentPane.add(getLbl1(), gbc_lblPicture_1);
			

			GridBagConstraints gbc_lblPicture_2 = new GridBagConstraints();
			gbc_lblPicture_2.gridwidth = 2;
			gbc_lblPicture_2.insets = new Insets(10, 20, 10, 20);
			gbc_lblPicture_2.gridx = 3;
			gbc_lblPicture_2.gridy = 1;
			contentPane.add(getLbl2(), gbc_lblPicture_2);
			
			GridBagConstraints gbc_lblPicture_3 = new GridBagConstraints();
			gbc_lblPicture_3.gridwidth = 2;
			gbc_lblPicture_3.insets = new Insets(10, 20, 10, 20);
			gbc_lblPicture_3.gridx = 5;
			gbc_lblPicture_3.gridy = 1;
			contentPane.add(getLbl3(), gbc_lblPicture_3);
			
			GridBagConstraints gbc_lblPicture_4 = new GridBagConstraints();
			gbc_lblPicture_4.gridwidth = 2;
			gbc_lblPicture_4.insets = new Insets(10, 20, 10, 20);
			gbc_lblPicture_4.gridx = 7;
			gbc_lblPicture_4.gridy = 1;
			contentPane.add(getLbl4(), gbc_lblPicture_4);
			
			GridBagConstraints gbc_lblPictrue_5 = new GridBagConstraints();
			gbc_lblPictrue_5.gridwidth = 2;
			gbc_lblPictrue_5.insets = new Insets(10, 20, 10, 20);
			gbc_lblPictrue_5.gridx = 9;
			gbc_lblPictrue_5.gridy = 1;
			contentPane.add(getLbl5(), gbc_lblPictrue_5);
			
			GridBagConstraints gbc_lblPicture_6 = new GridBagConstraints();
			gbc_lblPicture_6.gridwidth = 2;
			gbc_lblPicture_6.insets = new Insets(0, 0, 5, 5);
			gbc_lblPicture_6.gridx = 1;
			gbc_lblPicture_6.gridy = 3;
			contentPane.add(getLbl6(), gbc_lblPicture_6);
			
			GridBagConstraints gbc_lblPicture_7 = new GridBagConstraints();
			gbc_lblPicture_7.gridwidth = 2;
			gbc_lblPicture_7.insets = new Insets(0, 0, 5, 5);
			gbc_lblPicture_7.gridx = 3;
			gbc_lblPicture_7.gridy = 3;
			contentPane.add(getLbl7(), gbc_lblPicture_7);
			
			GridBagConstraints gbc_lblPicture_8 = new GridBagConstraints();
			gbc_lblPicture_8.gridwidth = 2;
			gbc_lblPicture_8.insets = new Insets(0, 0, 5, 5);
			gbc_lblPicture_8.gridx = 5;
			gbc_lblPicture_8.gridy = 3;
			contentPane.add(getLbl8(), gbc_lblPicture_8);
			
			GridBagConstraints gbc_lblPicture_9 = new GridBagConstraints();
			gbc_lblPicture_9.gridwidth = 2;
			gbc_lblPicture_9.insets = new Insets(0, 0, 5, 5);
			gbc_lblPicture_9.gridx = 7;
			gbc_lblPicture_9.gridy = 3;
			contentPane.add(getLbl9(), gbc_lblPicture_9);
			
			GridBagConstraints gbc_lblPicture_10 = new GridBagConstraints();
			gbc_lblPicture_10.gridwidth = 2;
			gbc_lblPicture_10.insets = new Insets(0, 0, 5, 5);
			gbc_lblPicture_10.gridx = 9;
			gbc_lblPicture_10.gridy = 3;
			contentPane.add(getLbl10(), gbc_lblPicture_10);
			

			GridBagConstraints gbc_lblWords = new GridBagConstraints();
			gbc_lblWords.anchor = GridBagConstraints.EAST;
			gbc_lblWords.gridwidth = 3;
			gbc_lblWords.insets = new Insets(0, 0, 5, 5);
			gbc_lblWords.gridx = 4;
			gbc_lblWords.gridy = 5;
			contentPane.add(getLblWords(), gbc_lblWords);
			

			GridBagConstraints gbc_txt = new GridBagConstraints();
			gbc_txt.fill = GridBagConstraints.HORIZONTAL;
			gbc_txt.insets = new Insets(0, 0, 5, 5);
			gbc_txt.gridx = 7;
			gbc_txt.gridy = 5;
			contentPane.add(getTxt(), gbc_txt);
			txt.setToolTipText("Enter a number");
			txt.setColumns(10);
			
			JButton btnCheck = new JButton("Check!");
			
			// add Mouse adapter to get Mouse Event and check answers
			btnCheck.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent event) {
					String n = txt.getText();
					if(Integer.parseInt(n) > 10 || Integer.parseInt(n) < 0) {
						txt.setText("");
					}
					else {
						if(!txt.getText().equals(""))
							check();
					}
				}
			});
			btnCheck.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
			GridBagConstraints gbc_btnCheck = new GridBagConstraints();
			gbc_btnCheck.insets = new Insets(0, 0, 5, 5);
			gbc_btnCheck.gridx = 6;
			gbc_btnCheck.gridy = 6;
			contentPane.add(btnCheck, gbc_btnCheck);
			GridBagConstraints gbc_lblTips = new GridBagConstraints();
			gbc_lblTips.gridwidth = 9;
			gbc_lblTips.insets = new Insets(0, 0, 5, 5);
			gbc_lblTips.gridx = 2;
			gbc_lblTips.gridy = 7;
			contentPane.add(getLblTips(), gbc_lblTips);
		}
		return contentPane;
	}
	
	/**
	 * get Label that contains picture
	 * new JLabel if null
	 * @return label
	 */
	private JButton getLbl1() {
		if(lblPicture1 == null) {
			lblPicture1 = new JButton();
			lblPicture1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					removeAnimal(1);
				}
			});
			lblPicture1.setIcon(new ImageIcon(Task3.class.getResource(PICURL1)));
		}
		return lblPicture1;
	}
	
	/**
	 * get Label that contains picture
	 * new JLabel if null
	 * @return label
	 */
	private JButton getLbl2() {
		if(lblPicture2 == null) {
			lblPicture2 = new JButton();
			lblPicture2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					removeAnimal(2);
				}
			});
			lblPicture2.setIcon(new ImageIcon(Task3.class.getResource(PICURL2)));
		}
		return lblPicture2;
	}
	
	/**
	 * get Label that contains picture
	 * new JLabel if null
	 * @return label
	 */
	private JButton getLbl3() {
		if(lblPicture3 == null) {
			lblPicture3 = new JButton();
			lblPicture3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					removeAnimal(3);
				}
			});
			lblPicture3.setIcon(new ImageIcon(Task3.class.getResource(PICURL3)));
		}
		return lblPicture3;
	}
	
	/**
	 * get Label that contains picture
	 * new JLabel if null
	 * @return label
	 */
	private JButton getLbl4() {
		if(lblPicture4 == null) {
			lblPicture4 = new JButton();
			lblPicture4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					removeAnimal(4);
				}
			});
			lblPicture4.setIcon(new ImageIcon(Task3.class.getResource(PICURL4)));
		}
		return lblPicture4;
	}
	
	/**
	 * get Label that contains picture
	 * new JLabel if null
	 * @return label
	 */
	private JButton getLbl5() {
		if(lblPicture5 == null) {
			lblPicture5 = new JButton();
			lblPicture5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					removeAnimal(5);
				}
			});
			lblPicture5.setIcon(new ImageIcon(Task3.class.getResource(PICURL5)));
		}
		return lblPicture5;
	}
	
	/**
	 * get Label that contains picture
	 * new JLabel if null
	 * @return label
	 */
	private JButton getLbl6() {
		if(lblPicture6 == null) {
			lblPicture6 = new JButton();
			lblPicture6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					removeAnimal(6);
				}
			});
			lblPicture6.setIcon(new ImageIcon(Task3.class.getResource(PICURL6)));
		}
		return lblPicture6;
	}
	
	/**
	 * get Label that contains picture
	 * new JLabel if null
	 * @return label
	 */
	private JButton getLbl7() {
		if(lblPicture7 == null) {
			lblPicture7 = new JButton();
			lblPicture7.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					removeAnimal(7);
				}
			});
			lblPicture7.setIcon(new ImageIcon(Task3.class.getResource(PICURL7)));
		}
		return lblPicture7;
	}
	
	/**
	 * get Label that contains picture
	 * new JLabel if null
	 * @return label
	 */
	private JButton getLbl8() {
		if(lblPicture8 == null) {
			lblPicture8 = new JButton();
			lblPicture8.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					removeAnimal(8);
				}
			});
			lblPicture8.setIcon(new ImageIcon(Task3.class.getResource(PICURL8)));
		}
		return lblPicture8;
	}
	
	/**
	 * get Label that contains picture
	 * new JLabel if null
	 * @return label
	 */
	private JButton getLbl9() {
		if(lblPicture9 == null) {
			lblPicture9 = new JButton();
			lblPicture9.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					removeAnimal(9);
				}
			});
			lblPicture9.setIcon(new ImageIcon(Task3.class.getResource(PICURL9)));
		}
		return lblPicture9;
	}
	
	/**
	 * get Label that contains picture
	 * new JLabel if null
	 * @return label
	 */
	private JButton getLbl10() {
		if(lblPicture10 == null) {
			lblPicture10 = new JButton();
			lblPicture10.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					removeAnimal(10);
				}
			});
			lblPicture10.setIcon(new ImageIcon(Task3.class.getResource(PICURL10)));
		}
		return lblPicture10;
	}
	
	/**
	 * get Label that contains words to hint player
	 * new JLabel if null
	 * @return label
	 */
	private JLabel getLblWords() {
		if(lblWords == null) {
			lblWords = new JLabel("How many animals have come to the party?\r\n");
			lblWords.setForeground(new Color(0, 102, 0));
			lblWords.setFont(new Font("Cambria", Font.PLAIN, 15));
		}
		return lblWords;
	}
	
	/**
	 * get JTextField for entering answers
	 * new JTextField if null
	 * @return JTextField
	 */
	private JTextField getTxt() {
		if(txt == null) {
			txt = new JTextField();
			txt.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent event) {
					int k = event.getKeyCode();
					String n = txt.getText();
					if((n.compareTo("10") > 0 || n.compareTo("0") < 0) && k != KeyEvent.VK_ENTER
							&& k != KeyEvent.VK_BACK_SPACE) {
						txt.setText("");
					}
					else {
						if(event.getKeyCode() == KeyEvent.VK_ENTER && !txt.getText().equals(""))
							check();
					}
				}
			});
			txt.setFont(new Font("Arial Black", Font.PLAIN, 15));
		}
		return txt;
	}
	
	/**
	 * check answers
	 */
	private void check() {
		// if number of displayed picture is right
		// get new random number and set picture
		// else return wrong message
		try{
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
		} catch(Exception e) {
			txt.setText("");
		}
	}
	
	/**
	 * set picture randomly
	 */
	private void setPicture() {
		if(numDisplayed == 0) {
			JButton[] jbt = {lblPicture1,lblPicture2,lblPicture3,lblPicture4,lblPicture5,
					lblPicture6,lblPicture7,lblPicture8,lblPicture9,lblPicture10};
			setNotEnable(jbt);
		}
		else if(numDisplayed == 1) {
			lblPicture3.setEnabled(true);
			JButton[] jbt = {lblPicture1,lblPicture2,lblPicture4,lblPicture5,
					lblPicture6,lblPicture7,lblPicture8,lblPicture9,lblPicture10};
			setNotEnable(jbt);
		} else if(numDisplayed == 2) {
			lblPicture3.setEnabled(true);
			lblPicture8.setEnabled(true);
			JButton[] jbt = {lblPicture1,lblPicture2,lblPicture4,lblPicture5,
					lblPicture6,lblPicture7,lblPicture9,lblPicture10};
			setNotEnable(jbt);
		} else if(numDisplayed == 3) {
			lblPicture2.setEnabled(true);
			lblPicture3.setEnabled(true);
			lblPicture8.setEnabled(true);
			JButton[] jbt = {lblPicture1,lblPicture4,lblPicture5,
					lblPicture6,lblPicture7,lblPicture9,lblPicture10};
			setNotEnable(jbt);
		} else if(numDisplayed == 4) {
			lblPicture2.setEnabled(true);
			lblPicture3.setEnabled(true);
			lblPicture8.setEnabled(true);
			lblPicture9.setEnabled(true);
			JButton[] jbt = {lblPicture1,lblPicture4,lblPicture5,
					lblPicture6,lblPicture7,lblPicture10};
			setNotEnable(jbt);
		} else if(numDisplayed == 5) {
			lblPicture2.setEnabled(true);
			lblPicture3.setEnabled(true);
			lblPicture4.setEnabled(true);
			lblPicture8.setEnabled(true);
			lblPicture9.setEnabled(true);
			JButton[] jbt = {lblPicture1,lblPicture5,lblPicture6,lblPicture7,lblPicture10};
			setNotEnable(jbt);
		} else if(numDisplayed == 6) {
			lblPicture2.setEnabled(true);
			lblPicture3.setEnabled(true);
			lblPicture4.setEnabled(true);
			lblPicture7.setEnabled(true);
			lblPicture8.setEnabled(true);
			lblPicture9.setEnabled(true);
			JButton[] jbt = {lblPicture1,lblPicture5,lblPicture6,lblPicture10};
			setNotEnable(jbt);
		} else if(numDisplayed == 7) {
			lblPicture1.setEnabled(true);
			lblPicture2.setEnabled(true);
			lblPicture3.setEnabled(true);
			lblPicture4.setEnabled(true);
			lblPicture7.setEnabled(true);
			lblPicture8.setEnabled(true);
			lblPicture9.setEnabled(true);
			JButton[] jbt = {lblPicture5,lblPicture6,lblPicture10};
			setNotEnable(jbt);
		} else if(numDisplayed == 8) {
			lblPicture1.setEnabled(true);
			lblPicture2.setEnabled(true);
			lblPicture3.setEnabled(true);
			lblPicture4.setEnabled(true);
			lblPicture7.setEnabled(true);
			lblPicture8.setEnabled(true);
			lblPicture9.setEnabled(true);
			lblPicture10.setEnabled(true);
			JButton[] jbt = {lblPicture5,lblPicture6};
			setNotEnable(jbt);
		} else if(numDisplayed == 9) {
			lblPicture1.setEnabled(true);
			lblPicture2.setEnabled(true);
			lblPicture3.setEnabled(true);
			lblPicture4.setEnabled(true);
			lblPicture6.setEnabled(true);
			lblPicture7.setEnabled(true);
			lblPicture8.setEnabled(true);
			lblPicture9.setEnabled(true);
			lblPicture10.setEnabled(true);
			JButton[] jbt = {lblPicture5};
			setNotEnable(jbt);
		} else if(numDisplayed == 10) {
			lblPicture1.setEnabled(true);
			lblPicture2.setEnabled(true);
			lblPicture3.setEnabled(true);
			lblPicture4.setEnabled(true);
			lblPicture5.setEnabled(true);
			lblPicture6.setEnabled(true);
			lblPicture7.setEnabled(true);
			lblPicture8.setEnabled(true);
			lblPicture9.setEnabled(true);
			lblPicture10.setEnabled(true);
		} else {
			throw new RuntimeException();
		}
	}
	
	/**
	 * clear picture of jbt
	 * @param jbt sequence to clear
	 */
	private void setNotEnable(JButton[] jbt) {
		for(int i = 0; i < jbt.length; i++) {
			jbt[i].setEnabled(false);
		}
	}
	
	/**
	 * get Label contains tip message
	 * @return label
	 */
	private JLabel getLblTips() {
		if (lblTips == null) {
			lblTips = new JLabel("Click on animals you wish to kick out of the party!");
			lblTips.setForeground(Color.RED);
		}
		return lblTips;
	}
	
	/**
	 * kick out animal from party
	 * set enabled false that can not kick it again
	 * @param order of animal to remove
	 */
	private void removeAnimal(int order) {
		if(order == 1 && lblPicture1.isEnabled()) {
			lblPicture1.setEnabled(false);
			lblWords.setText("Animal gone! How many animals are in the party now?");
			numDisplayed--;
		} else if(order == 2 && lblPicture2.isEnabled()) {
			lblPicture2.setEnabled(false);
			lblWords.setText("Animal gone! How many animals are in the party now?");
			numDisplayed--;
		} else if(order == 3 && lblPicture3.isEnabled()) {
			lblPicture3.setEnabled(false);
			lblWords.setText("Animal gone! How many animals are in the party now?");
			numDisplayed--;
		} else if(order == 4 && lblPicture4.isEnabled()) {
			lblPicture4.setEnabled(false);
			lblWords.setText("Animal gone! How many animals are in the party now?");
			numDisplayed--;
		} else if(order == 5 && lblPicture5.isEnabled()) {
			lblPicture5.setEnabled(false);
			lblWords.setText("Animal gone! How many animals are in the party now?");
			numDisplayed--;
		} else if(order == 6 && lblPicture6.isEnabled()) {
			lblPicture6.setEnabled(false);
			lblWords.setText("Animal gone! How many animals are in the party now?");
			numDisplayed--;
		} else if(order == 7 && lblPicture7.isEnabled()) {
			lblPicture7.setEnabled(false);
			lblWords.setText("Animal gone! How many animals are in the party now?");
			numDisplayed--;
		} else if(order == 8 && lblPicture8.isEnabled()) {
			lblPicture8.setEnabled(false);
			lblWords.setText("Animal gone! How many animals are in the party now?");
			numDisplayed--;
		} else if(order == 9 && lblPicture9.isEnabled()) {
			lblPicture9.setEnabled(false);
			lblWords.setText("Animal gone! How many animals are in the party now?");
			numDisplayed--;
		} else if(order == 10 && lblPicture10.isEnabled()) {
			lblPicture10.setEnabled(false);
			lblWords.setText("Animal gone! How many animals are in the party now?");
			numDisplayed--;
		}
	}
}
