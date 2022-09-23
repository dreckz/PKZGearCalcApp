import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.EnumMap;

import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import java.awt.List;
import java.awt.Label;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import gearCalcFrame.bladeMaterial;
import gearCalcFrame.gripMaterial;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import java.awt.Color;

/*
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8$MMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM++DMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMI+NMMMMMMMMMMMMMMMMMMM
MMMMMMMMM<3MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMDDMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMM<3MMMMMMMMMMMMMMMMMMMMMMMMMMMM?+MMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM?+NMMMMMMMMMMMMMMONMMMMMM
MMMMMMMMMMMMMMMMMMMMMMM*MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM?+MMMMMMMMMMMMMMN7MMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM??MMMMMMMMMMMMMNOMMMMMMMM
MMMMMMMMMMMMMMM<3MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM+IMMMMMMMMMMMZMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN+8MMMMMMMMMN?IMMMMMMMMMMM
MMMMMMM*MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMDZ++IMMMMMMMMMI?7MMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZ?+?=+OMMMMMMMMM7I+MMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMM<3MMMMMMMMMMMMMMMMMMM8+++?MMMMMM?DMMMMMMMI7I?MMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMM*MMMMMMMMMMM8++++NMO8M87+NMMMMMMMMNDI7IIIMMMMMMMMMM
MMMMMMMMMMMMMMMM*MMMMMMMMMMMMMMMMMMMMMMMM+++++MM$+NZ++MMMMMMMMMMMMI7777MMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMI+++++Z$++I$O+?NMMMM7$MMMMI777IMMMMMMMMM
MMMMMM<3MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM+++++++++++?I+++MMM7??MMM77777IMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMI$ZMM++++++++++++++++MM87I?OO777777OMMMM8MMMM
MMMMMMMMMMMMMMMMMMM<3MMMMMMMMMMMMMMMI++M++++++++++++++++MMNI7III77777IMMMM7Z$NMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN++D++++++++++++++?ZMMMZ777777777DMMMMZZ7NMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8++D+++++++?+$ODNMMMMMM$7777777IMMMMMMN7DMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM?+++++++++??MMMMMMMMN$I777II77$MMMMMNDMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM7++++++++++++MMMMMMMO7777???IMMMMMMD$$NMMMMMM
MMMMMMMMMMMM<3MMMMMMMMMMMMMMMMMMMMN?++++++++++++MMMMMMMI77I???7MMMMMMMOZ7MMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM?+++++++++++++++MM8$I$7?+II$MMMMMMMMMM7$MMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMOZOMMMMMI+++++++++++?++++OMZ7??II+?7IMMO7OMMMMMM7$MMMMMMM
MMMMMMMMMMMMMMMMMMMMMMM?+I8MMM+++++++++++++++++$MMNZ7?II??77M8IIMMMMMM8$$MNMMMMM
MMMMMMMMMMMMMMMMMMMMMMD++?$M7++++++++++++++++?DMM87IIZ7I??7IM$77MMMMMZ$$$7MMMMMM
MMMMMMMMMMMMMMMMMMMMMM+++7M?++++++++++++++++?MMMNIIIID7I?I7I7OIIMMMMZ$$$$8MMMMMM
MMMMMMMMMMMMMMMMMMMMM?++$O7=+++++++++++++++$MMMNI7IONI7??777IMZINMMM7Z$$$MMMMMMM
MMMMMMMMMMMMMMMMMMMM$++77I+++++++++++++?++$MMMMZ7777I7II7777I$I7$MMM7ZZ$$NMMMMMM
MMMMMMMMMMMMMMMMMMMM?++Z?+++++++++++++??+7MMMMMD77777777777777777MMM7ZZ$$8MMMMMM
MMMMMMMMMMMMMMMMM8???++===+++++++++++????MMMMMMMI7777777777777777MMM$$$Z$DMMMMMM
MMMMMMMMMMMMMMMMMM7++++===++++??++++????MMMMMMMN77777777777777778MMN$$$$$MMMMMMM
MMMMMMMMMMMMMMMMMMM?+++=====++?+++++???NMMMMMMMI777777777777777MO87$I$ZZOMMMMMMM
MMMMMMMMMMMMMMMMMMM?+++=++===++++==+???MMMMMMMOI7777777777I7IZMM$Z$?+$Z$MMMMMMMM
MMMMMMMMMMMMMMMMMMN+++++++====+====???ZMMMMMMI777777777777DMMMMOZ?+7Z$MMMMMMMMMM
MMMMMMMMMMI?$MMMMM++++++++==++====+???MMO?N7I777777777777MMZMMM7$I$Z$MMMMMMMMMMM
MMMMMMMMM8+++ZMMM?=++++++++=======+??IMDIIII77777777777IMMM7$MO$$$ZZMMMMMMMMMMMM
MMMMMMMMMM++++O7++++++++++++++===++??8DIII7777777777777NMMO$ZO$Z$$Z$MMMMMMMMMMMM
MMMMMMMMMMI++++++++++++?++++++++=+?IIM$?I7I7777777777$$MMD$Z$$Z$$ZZ$MMMMMMMMMMMM
MMMMMMMMMZ?+++++++++++++++++++++++?I7MIII777777777$$$ZMMM$ZZ$Z$7$ZZ$MMMMMMMMMMMM
MMMMMMMN+++++++++++++++++++++++++?IIMMII7II777777$7ZOM7MM7$$$$$IIZZZMMMMMMMMMMMM
MMMMMMN?+++++++++++++++++++++++++IIIMMII7I77777$$$ODN$Z$$$$$$$$?7ZZNMMMMMMMMMMMM
MMM7MM?+++++++++++++++++++++++++?IIMMMIIII7777$$7MMMN$$$$$$$$$IIZO$MMMMMMMMMMMMM
MMM+OM++++++++++++++++++++++++++IIZMM7IIII777$$$MMNMN$$$$$$$$$7ZOZMMMMMMMMMMMMMM
MM$+IM+++++++++++++++++++++++++II$MMDII777777$$DMDZ8N$$$$$$$ZZOOZMMMMMMMMMMMMMMM
MM?+IM++++++++++++++++++++++++?I?MMMII777I777$7MM$$$$Z$$$$ZZZOOZMMMMMMMMMMMMMMMM
MM7++++++++++++++++++++++++++IIZMMMII777?I77$$$M$$$$Z$$$ZZOOODMMMMMMMMMMMMMMMMMM
MMMN?++++++++++++++++++++++?I7NMMOII777?+777$$8M$$$$$$7$ZOOOMMMMMMMMMMMMMMMMMMMM
MMMMM++++++++++++++++++++?I77MMM8II777++?777$$MM$$$$7$$ZOOZMMMMMMMMMMMMMMMMMMMMM
MMMMM?+++++++++++++++++?I7ZDMM8$I77I?+++I777$7MM$$$$77$OOOMMMMMMMMMMMMMMMMMMMMMM
MMMMMI+?+++++++++++++??IZ8MMM$I777?++++?7I77$$MM$$$$77Z8OMMMMMMMMTBNRMMMMMMMMMMM
MMMMMI+?+++++++++++++I78NMM87I7I?+++++?III7$$DMM$$$$$$OODMMMMMMMMFTWMMMMMMMMMMMM
MMMMM7+?++++++++++??77MMMN$I7I++++++??7I?I7$$MM$ZZ$$7Z8OMMMMMMMMMMMMMMMMMMMMMMMM
MMMMM8??+++++++++??I7NMNO$II?+++?+??I77I77$$DD7$$$$$ZO8DMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMM+?+++++++++?77MMM7I??+++????+777777$$DDI$ZZ$$$7O88MMMMMMMMMMMMMMMMMMMMMMMM
MMMMMM??++++++++?I7DMM8???++?????+????I7$$OM$+ZZ$$$77O88MMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMZ??++++++?I7MMMNI+++???????+?+I7$$$MM$?IZ$$I?7ZO88MMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMM+?++++++?77MMM$?++????????++?7$$OMNZI+$$$7?$$$O88MMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMO??++++?77MMMMI+??????????7$$ZMNZ7+7ZZ7++?$$ZZ88NMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMM7?++++?7DMMM$?+I????I$$$$ONMO$I$$7I+++?I$ZZZZ8OMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMM??+++?7MMMM7??IIII$$$$$NMMZ$7$?++++??IZZ$$ZOOOMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMN??++?7MMMM7+?I77$$$8DMM8$7I+++++?I7$$$ZZZOOOMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMM??+?7MMMMI+I7$$$$MMMMZZI+++????III7ZOO888OMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMM8I??IMMMM7+7$$Z8MMMMZ$?++??????I$O88OO8DNMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMIIIMMMM7?Z$DMMMMMZ$?+??????+$OOOONMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMM$IOMMM$7$NMMMMM8$7++++???I$8OO8MMMMMMMMMMMMMMMMMMMMMMMMM:DMMMMMMMM
MMMMMMMMMMMMMMMN7MMM8$NMMMMMM$Z??????IZOOMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMM$MMMMMMDZZ777$ZO88MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMNOOOO8MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
 * 1.0
 * 
 * This is a gear calculation app completely written in Java.
 *
 * The use case for this is for calculating gear stats before having to go on an adventure to get it.
 * The algorithms used are meant for the PokecraftZ modpack 
 * 
 * PokecraftZ is a modpack where players survive against the growing zombie apocalypse with companions
 * like real-time fighting pokemon, build a civ with functional NPC's, and Dark Souls-like combat.
 * 
 * Enjoy!
 * 
 */

public class gearCalcFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel fullPanel;
	
	//MATERIAL TAXONOMIES
	//add new materials here
	//TODO: Make input fields for users to input customly crafted materials
	enum bladeMaterial {WOOD,IRON,DIAMOND;}
	enum gripMaterial {STICK,LEATHER,WOOL;}
	static double[] woodProp = {4,0.9,200};
    static double[] ironProp = {6,0.9,800};
    static double[] diamondProp = {8,0.9,3000};
    static double[] woolProp = {1.1,0.9,1.1};
    static double[] leatherProp = {1.25,1.1,1.0};
    static double[] stickProp = {0.9,1.25,1.0};
	//GUI Private Vars
	private static JButton calculateButton;
	private JLabel dmgOutputLabel;
	private JLabel durabilityOutputLabel;
	private JLabel speedOutputLabel;
	private JComboBox bladeMaterials_1 = new JComboBox();
	private JComboBox bladeMaterials_2 = new JComboBox();
	private JComboBox bladeMaterials_3 = new JComboBox();
	private JComboBox hiltMaterials_1 = new JComboBox();
	private JComboBox hiltMaterials_2 = new JComboBox();
	private JComboBox hiltMaterials_3 = new JComboBox();
	private JComboBox gripMaterials_1 = new JComboBox();
	private JComboBox gripMaterials_2 = new JComboBox();
	private JComboBox gripMaterials_3 = new JComboBox();
	/*
	 * TRANSACTIONAL  VAR INTERFACE
	 * [x]ds = [X] Damage Score
	 * [x]ss = [X] Swing Speed
	 * [x]d = [X] Durability
	 * For future additions and enchants for direct stat manipulation
	 */
	/*
	//Blade Temporary Stat States (FUTURE ADDITION FOR ENCHANT MODS)
	 *
	double bds1, bds2, bds3 = 0;
	double bss1, bss2, bss3 = 0;
	double bd1, bd2, bd3 = 0;
	//Hilt Stat States
	double hds1, hds2, hds3 = 0;
	double hss1, hss2, hss3 = 0;
	double hd1, hd2, hd3 = 0;
	//Grip Stat States
	double gdm1, gdm2, gdm3 = 0;
	double gsm1, gsm2, gsm3 = 0;
	double gd1, gd2, gd3 = 0;
	*/
	/*
	double bdsavg = (bds1 + bds2 + bds3)/3;
	double bssavg = (bss1 + bss2 + bss3)/3;
	double bdavg = (bd1, bd2, bd3)/3;
	
	double hdsavg = (hds1 + hds2 + hds3)/3;
	double hssavg = (hss1 + hss2 + hss3)/3;
	double hdavg = (hd1 + hd2 + hd3)/3;
	
	double gdmavg (gdm1 + gdm2 + gdm3)/3;
	double gsmavg = (gsm1 + gsm2 + gsm3)/3;
	double gdavg = (gd1 + gd2 + gd3)/3;
	*/
	// Public Vars for Label Outputs and Math
	// the thing you see calculated
	double finalOutputDMG;
	double finalOutputSpeed;
	double finalOutputDurability;
	//MICA = Material Input Capture Array
	static double[] bladeMICA1 = woodProp;
	static double[] bladeMICA2 = woodProp;
	static double[] bladeMICA3  = woodProp;
	static double[] hiltMICA1 = woodProp;
	static double[] hiltMICA2 = woodProp;
	static double[] hiltMICA3 = woodProp;
	static double[] gripMICA1 = woolProp;
	static double[] gripMICA2= woolProp;
	static double[] gripMICA3 = woodProp;
	/**
	 * Launches the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gearCalcFrame frame = new gearCalcFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
} 
	/**
	 * GUI WINDOW FRAME
	 */
	public  gearCalcFrame() {
		setTitle("Gear Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 388);
		fullPanel = new JPanel();
		fullPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(fullPanel);
		fullPanel.setLayout(null);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(new Color(24, 12, 31));
		headerPanel.setBounds(0, 0, 600, 50);
		fullPanel.add(headerPanel);
		
		JLabel title = new JLabel("POKECRAFTZ GEAR CALCULATOR");
		title.setForeground(new Color(255, 255, 255));
		title.setFont(new Font("AppleGothic", Font.BOLD, 32));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		headerPanel.add(title);
		
		JPanel subHeaderPanel = new JPanel();
		subHeaderPanel.setBackground(new Color(255, 255, 255));
		subHeaderPanel.setBounds(0, 50, 600, 50);
		fullPanel.add(subHeaderPanel);
		
		JLabel subTitle = new JLabel("SWORD");
		subTitle.setForeground(new Color(24, 12, 31));
		subTitle.setHorizontalAlignment(SwingConstants.CENTER);
		subTitle.setFont(new Font("AppleGothic", Font.BOLD, 24));
		subHeaderPanel.add(subTitle);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(new Color(24, 12, 31));
		FlowLayout flowLayout = (FlowLayout) leftPanel.getLayout();
		flowLayout.setVgap(30);
		flowLayout.setAlignOnBaseline(true);
		leftPanel.setBounds(0, 100, 401, 266);
		fullPanel.add(leftPanel);
		
		JLabel bladeLabel = new JLabel("Blade:");
		bladeLabel.setForeground(new Color(255, 255, 255));
		bladeLabel.setFont(new Font("AppleGothic", Font.BOLD, 16));
		leftPanel.add(bladeLabel);
		
		bladeMaterials_1.setForeground(new Color(24, 12, 31));
		leftPanel.add(bladeMaterials_1);
		bladeMaterials_1.setModel(new DefaultComboBoxModel(bladeMaterial.values()));
		bladeMaterials_1.setSelectedIndex(0);
		bladeMaterials_1.setFont(new Font("AppleGothic", Font.PLAIN, 10));
		
		bladeMaterials_2 = new JComboBox();
		bladeMaterials_2.setModel(new DefaultComboBoxModel(bladeMaterial.values()));
		bladeMaterials_2.setSelectedIndex(0);
		bladeMaterials_2.setForeground(new Color(24, 12, 31));
		bladeMaterials_2.setFont(new Font("AppleGothic", Font.PLAIN, 10));
		leftPanel.add(bladeMaterials_2);
		
		bladeMaterials_3 = new JComboBox();
		bladeMaterials_3.setBackground(new Color(255, 255, 255));
		bladeMaterials_3.setForeground(new Color(24, 12, 31));
		bladeMaterials_3.setModel(new DefaultComboBoxModel(bladeMaterial.values()));
		bladeMaterials_3.setSelectedIndex(0);
		bladeMaterials_3.setFont(new Font("AppleGothic", Font.PLAIN, 10));
		leftPanel.add(bladeMaterials_3);
		
		JLabel hiltLabel = new JLabel("Hilt:");
		hiltLabel.setForeground(new Color(255, 255, 255));
		hiltLabel.setFont(new Font("AppleGothic", Font.BOLD, 16));
		leftPanel.add(hiltLabel);
		
		hiltMaterials_1 = new JComboBox();
		hiltMaterials_1.setForeground(new Color(24, 12, 31));
		hiltMaterials_1.setModel(new DefaultComboBoxModel(bladeMaterial.values()));
		hiltMaterials_1.setSelectedIndex(0);
		hiltMaterials_1.setFont(new Font("AppleGothic", Font.PLAIN, 10));
		leftPanel.add(hiltMaterials_1);
		
		
		hiltMaterials_2 = new JComboBox();
		hiltMaterials_2.setForeground(new Color(24, 12, 31));
		hiltMaterials_2.setModel(new DefaultComboBoxModel(bladeMaterial.values()));
		hiltMaterials_2.setSelectedIndex(0);
		hiltMaterials_2.setFont(new Font("AppleGothic", Font.PLAIN, 10));
		leftPanel.add(hiltMaterials_2);
		
		hiltMaterials_3 = new JComboBox();
		hiltMaterials_3.setForeground(new Color(24, 12, 31));
		hiltMaterials_3.setModel(new DefaultComboBoxModel(bladeMaterial.values()));
		hiltMaterials_3.setSelectedIndex(0);
		hiltMaterials_3.setFont(new Font("AppleGothic", Font.PLAIN, 10));
		leftPanel.add(hiltMaterials_3);
		
		JLabel gripLabel = new JLabel("Grip:");
		gripLabel.setForeground(new Color(255, 255, 255));
		gripLabel.setFont(new Font("AppleGothic", Font.BOLD, 16));
		leftPanel.add(gripLabel);
		
		gripMaterials_1 = new JComboBox();
		gripMaterials_1.setForeground(new Color(24, 12, 31));
		gripMaterials_1.setModel(new DefaultComboBoxModel(gripMaterial.values()));
		gripMaterials_1.setSelectedIndex(0);
		gripMaterials_1.setFont(new Font("AppleGothic", Font.PLAIN, 10));
		leftPanel.add(gripMaterials_1);
		
		gripMaterials_2 = new JComboBox();
		gripMaterials_2.setForeground(new Color(24, 12, 31));
		gripMaterials_2.setModel(new DefaultComboBoxModel(gripMaterial.values()));
		gripMaterials_2.setSelectedIndex(0);
		gripMaterials_2.setFont(new Font("AppleGothic", Font.PLAIN, 10));
		leftPanel.add(gripMaterials_2);
		
		gripMaterials_3 = new JComboBox();
		gripMaterials_3.setForeground(new Color(24, 12, 31));
		gripMaterials_3.setModel(new DefaultComboBoxModel(gripMaterial.values()));
		gripMaterials_3.setSelectedIndex(0);
		gripMaterials_3.setFont(new Font("AppleGothic", Font.PLAIN, 10));
		leftPanel.add(gripMaterials_3);
		//ACTIONARY CALCULATION BUTTON
		calculateButton = new JButton("Calculate");
		calculateButton.setForeground(new Color(24, 12, 31));
		calculateButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//I tried to staying away... but I had no choice... 
				//Switch Casing for each input and correlating to materials
				switch (bladeMaterials_1.getSelectedIndex()) {
		        case 0: bladeMICA1 = woodProp;
		            break;
		        case 1: bladeMICA1 = ironProp;
		            break;
		        case 2: bladeMICA1 = diamondProp;
		            break;
		    }
		        switch (bladeMaterials_2.getSelectedIndex()) {
		        case 0: bladeMICA2 = woodProp;
		            break;
		        case 1: bladeMICA2 = ironProp;
		            break;
		        case 2: bladeMICA2 = diamondProp;
		            break;
		    }
		        switch (bladeMaterials_3.getSelectedIndex()) {
		        case 0: bladeMICA3 = woodProp;
		            break;
		        case 1: bladeMICA3 = ironProp;
		            break;
		        case 2: bladeMICA3 = diamondProp;
		            break;
		    }
		        switch (hiltMaterials_1.getSelectedIndex()) {
		        case 0: hiltMICA1 = woodProp;
		            break;
		        case 1: hiltMICA1 = ironProp;
		            break;
		        case 2: hiltMICA1 = diamondProp;
		            break;
		    }
		        switch (hiltMaterials_2.getSelectedIndex()) {
		        case 0: hiltMICA2 = woodProp;
		            break;
		        case 1: hiltMICA2 = ironProp;
		            break;
		        case 2: hiltMICA2 = diamondProp;
		            break;
		    }
		        switch (hiltMaterials_3.getSelectedIndex()) {
		        case 0: hiltMICA3 = woodProp;
		            break;
		        case 1: hiltMICA3 = ironProp;
		            break;
		        case 2: hiltMICA3 = diamondProp;
		            break;
		    }
		        switch (gripMaterials_1.getSelectedIndex()) {
		        case 0: gripMICA1 = woodProp;
		            break;
		        case 1: gripMICA1 = ironProp;
		            break;
		        case 2: gripMICA1 = diamondProp;
		            break;
		    }
		        switch (gripMaterials_2.getSelectedIndex()) {
		        case 0: gripMICA2 = woodProp;
		            break;
		        case 1: gripMICA2 = ironProp;
		            break;
		        case 2: gripMICA2 = diamondProp;
		            break;
		    }
		        switch (gripMaterials_3.getSelectedIndex()) {
		        case 0: gripMICA3 = woodProp;
		            break;
		        case 1: gripMICA3 = ironProp;
		            break;
		        case 2: gripMICA3 = diamondProp;
		            break;
		    }
		        /*
		         * STAT MATHEMATICS
		         * Started with enum hash map and transformed into coupled 2d array matrix
		         * The MICA's capture the input data.
		         * Hands off in calculation to each type/stat aggregator
		         * Final formula is processed by "finalOutput[X]"
		         */
		        //Blade Stat Averages
				double bdsavg = (bladeMICA1[0] + bladeMICA2[0] + bladeMICA3[0])/3;
				double bssavg = (bladeMICA1[1] + bladeMICA2[1] + bladeMICA3[1])/3;
				double bdavg = (bladeMICA1[2] + bladeMICA2[2] + bladeMICA3[2])/3;
				//Hilt Stat Averages
				double hdsavg = (hiltMICA1[0] + hiltMICA2[0] + hiltMICA3[0])/3;
				double hssavg = (hiltMICA1[1] + hiltMICA2[1] + hiltMICA3[1])/3;
				double hdavg = (hiltMICA1[2] + hiltMICA2[2] + hiltMICA3[2])/3;
				//Grip Stat Averages
				double gdmavg = (gripMICA1[0] + gripMICA2[0] + gripMICA3[0])/3;
				double gsmavg = (gripMICA1[1] + gripMICA2[1] + gripMICA3[1])/3;
				double gdavg = (gripMICA1[2] + gripMICA2[2] + gripMICA3[2])/3;
				//Final Outputs
				double finalOutputDMG = ((bdsavg + hdsavg)/2)*gdmavg;
				double finalOutputSpeed = ((bssavg + hssavg)/2)*gsmavg;
				double finalOutputDurability = ((bdavg + hdavg)/2)*gdavg;
		        //Label Setting
				dmgOutputLabel.setText(finalOutputDMG + " Hearts");
				speedOutputLabel.setText(finalOutputSpeed + " Swing Speed");
				durabilityOutputLabel.setText(finalOutputDurability + " Durability");
			
			}});
		calculateButton.setFont(new Font("AppleGothic", Font.PLAIN, 16));
		leftPanel.add(calculateButton);
		
		JPanel rightTopPanel = new JPanel();
		rightTopPanel.setBackground(new Color(24, 12, 31));
		rightTopPanel.setBounds(400, 100, 200, 89);
		fullPanel.add(rightTopPanel);
		
		JLabel gearScoreTitle = new JLabel("Gear Score:");
		gearScoreTitle.setForeground(new Color(255, 255, 255));
		gearScoreTitle.setHorizontalAlignment(SwingConstants.CENTER);
		gearScoreTitle.setFont(new Font("AppleGothic", Font.BOLD, 21));
		rightTopPanel.add(gearScoreTitle);
		
		JLabel gearScoreNumeral = DefaultComponentFactory.getInstance().createLabel("B");
		gearScoreNumeral.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		gearScoreNumeral.setForeground(new Color(255, 255, 255));
		rightTopPanel.add(gearScoreNumeral);
		
		JPanel rightBottomPanel = new JPanel();
		rightBottomPanel.setBackground(new Color(24, 12, 31));
		rightBottomPanel.setBounds(400, 188, 200, 178);
		fullPanel.add(rightBottomPanel);
		
		JLabel dmgLabel = new JLabel("DMG/Swing:");
		dmgLabel.setForeground(new Color(255, 255, 255));
		dmgLabel.setAlignmentY(0.0f);
		dmgLabel.setFont(new Font("AppleGothic", Font.BOLD, 16));
		
		JLabel speedLabel = new JLabel("Speed:");
		speedLabel.setAlignmentY(0.0f);
		speedLabel.setForeground(new Color(255, 255, 255));
		speedLabel.setFont(new Font("AppleGothic", Font.BOLD, 16));
		rightBottomPanel.setLayout(new GridLayout(0, 1, 0, 0));
		rightBottomPanel.add(dmgLabel);
		
		dmgOutputLabel = new JLabel("0 Hearts");
		dmgOutputLabel.setFont(new Font("AppleGothic", Font.PLAIN, 12));
		dmgOutputLabel.setForeground(new Color(255, 255, 255));
		rightBottomPanel.add(dmgOutputLabel);
		rightBottomPanel.add(speedLabel);
		
		
		speedOutputLabel = new JLabel("1.0 Swing Speed");
		speedOutputLabel.setFont(new Font("AppleGothic", Font.PLAIN, 12));
		rightBottomPanel.add(speedOutputLabel);
		speedOutputLabel.setForeground(new Color(255, 255, 255));
		
		JLabel durabilityLabel = new JLabel("Durability:");
		durabilityLabel.setForeground(new Color(255, 255, 255));
		durabilityLabel.setFont(new Font("AppleGothic", Font.BOLD, 16));
		durabilityLabel.setAlignmentY(0.0f);
		rightBottomPanel.add(durabilityLabel);
		
		durabilityOutputLabel = new JLabel("0 Durability");
		durabilityOutputLabel.setFont(new Font("AppleGothic", Font.PLAIN, 12));
		durabilityOutputLabel.setForeground(new Color(255, 255, 255));
		rightBottomPanel.add(durabilityOutputLabel);
	}
}
