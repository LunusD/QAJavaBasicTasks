import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaintWizard extends JPanel implements ActionListener {

	private JFrame frame;
	private JTextField roomSizeText;

	JLabel duluxCostLabel = new JLabel("Cost:");

	JLabel duluxCost = new JLabel("0");

	JLabel duluxAmountNeededLabel = new JLabel("No. of Pots Needed:");

	JLabel duluxAmountNeeded = new JLabel("0");

	JLabel duluxPaintsLabel = new JLabel("DuluxourousPaints (10L)");

	JLabel averageJoeCostLabel = new JLabel("Cost:");

	JLabel averageJoeCost = new JLabel("0");

	JLabel averageJoeAmountNeededLabel = new JLabel("No. of Pots Needed:");

	JLabel averageJoeAmountNeeded = new JLabel("0");

	JLabel aberageJoeLabel = new JLabel("AverageJoes (15L)");

	JLabel cheapoCostLabel = new JLabel("Cost:");

	JLabel cheapoCost = new JLabel("0");

	JLabel cheapoLabel = new JLabel("CheapoMax (20L)");

	JLabel cheapoAmountNeededLabel = new JLabel("No. of Pots Needed:");

	JLabel cheapoAmountNeeded = new JLabel("0");

	JLabel cheapestOptionLabel = new JLabel("Cheapest Option:");

	JLabel cheapestOption = new JLabel("N/A");

	JLabel leastWasteLabel = new JLabel("Least Waste:");

	JLabel leastWaste = new JLabel("N/A");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaintWizard window = new PaintWizard();
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
	public PaintWizard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 670, 323);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel roomSizeLabel = new JLabel("Enter Room Size (sq meter)");

		roomSizeText = new JTextField();
		roomSizeText.setColumns(10);

		JButton calculateButton = new JButton("Calculate Prices");
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float roomSize = Float.parseFloat(roomSizeText.getText());

				cheapoAmountNeeded.setText(Float.toString(calculateCheapoPots(roomSize)));
				cheapoCost.setText(Float.toString(calculateCheapoCost(roomSize)));

				averageJoeAmountNeeded.setText(Float.toString(calculateAverageJoePots(roomSize)));
				averageJoeCost.setText(Float.toString(calculateAverageJoeCost(roomSize)));
				
				duluxAmountNeeded.setText(Float.toString(calculateDuluxPots(roomSize)));
				duluxCost.setText(Float.toString(calculateDuluxCost(roomSize)));
				
				cheapestOption.setText(findCheapestOption(roomSize));
				leastWaste.setText(findLeastWaste(roomSize));
			}
		});

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(duluxCostLabel, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(cheapoLabel, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
									.addGap(116))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(aberageJoeLabel, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(cheapoAmountNeededLabel, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
												.addComponent(cheapoCostLabel, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(cheapoCost, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
												.addComponent(cheapoAmountNeeded, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
													.addComponent(averageJoeCostLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(averageJoeAmountNeededLabel, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
													.addComponent(duluxPaintsLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addComponent(duluxAmountNeededLabel, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(averageJoeCost, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
												.addComponent(duluxAmountNeeded, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
												.addComponent(duluxCost, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
												.addComponent(averageJoeAmountNeeded, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))))
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(leastWasteLabel, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
									.addGap(18))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(cheapestOptionLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addGap(24)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(leastWaste, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(28)
									.addComponent(cheapestOption)))
							.addGap(58))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(roomSizeLabel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(roomSizeText, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(calculateButton)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(roomSizeLabel)
						.addComponent(roomSizeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(calculateButton))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(cheapoLabel)
						.addComponent(leastWasteLabel)
						.addComponent(leastWaste))
					.addGap(1)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(cheapoAmountNeeded, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addComponent(cheapestOptionLabel)
							.addComponent(cheapestOption))
						.addComponent(cheapoAmountNeededLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(cheapoCostLabel)
						.addComponent(cheapoCost, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(aberageJoeLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(averageJoeAmountNeededLabel)
						.addComponent(averageJoeAmountNeeded, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(averageJoeCostLabel)
						.addComponent(averageJoeCost))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(duluxPaintsLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(duluxAmountNeeded)
						.addComponent(duluxAmountNeededLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(duluxCostLabel)
						.addComponent(duluxCost))
					.addGap(78))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

	private float calculateCheapoPots(float roomSize) {
		float cheapoCoveragePerLitre = 10;
		float totalCheapoCoverage = cheapoCoveragePerLitre * 20;
		
		float potsNeeded = (float) Math.ceil(roomSize / totalCheapoCoverage);
		
		return potsNeeded;
	}

	private float calculateCheapoCost(float roomSize) {
		float cheapoPrice = (float) 19.99;
		float potsNeeded = calculateCheapoPots(roomSize);
		
		float calculatedCost = cheapoPrice*potsNeeded;
		return calculatedCost;
	}

	private float calculateAverageJoePots(float roomSize) {
		float averageJoeCoveragePerLitre = 11;
		float totalAverageJoeCoverage = averageJoeCoveragePerLitre * 15;
		
		float potsNeeded = (float) Math.ceil(roomSize / totalAverageJoeCoverage);
		
		return potsNeeded;
	}

	private float calculateAverageJoeCost(float roomSize) {
		float averageJoePrice = (float) 17.99;
		float potsNeeded = calculateAverageJoePots(roomSize);
		
		float calculatedCost = averageJoePrice * potsNeeded;
		return calculatedCost;
	}
	
	private float calculateDuluxPots(float roomSize) {
		float duluxCoveragePerLitre = 20;
		float totalDuluxCoverage = duluxCoveragePerLitre * 10;
		
		float potsNeeded = (float) Math.ceil(roomSize / totalDuluxCoverage);
		return potsNeeded;
	}
	
	private float calculateDuluxCost(float roomSize) {
		float duluxPrice = (float) 25;
		float potsNeeded = calculateDuluxPots(roomSize);
		
		float calculatedCost = duluxPrice * potsNeeded;
		return calculatedCost;
	}
	
	private String findCheapestOption(float roomSize) {
		float cheapoCost = calculateCheapoCost(roomSize);
		float averageJoeCost = calculateAverageJoeCost(roomSize);
		float duluxCost = calculateDuluxCost(roomSize);
		
		String lowestCost;

		if(cheapoCost < averageJoeCost) {
			if(cheapoCost < duluxCost) {
				lowestCost = "CheapoMax";
			} else {
				lowestCost = "DuluxourousPaints";
			}
		} else if (averageJoeCost < duluxCost) {
			lowestCost = "AverageJoes";
		} else {
			lowestCost = "DuluxourousPaints";
		}
		
		return lowestCost;
	}
	
	private String findLeastWaste(float roomSize) {
		float cheapoPotsNeeded = calculateCheapoPots(roomSize);
		float cheapoCoveragePerPot = 10 * 20;
		float totalCheapoCoverage = cheapoPotsNeeded * cheapoCoveragePerPot;
		
		float cheapoCoverageRemaining = totalCheapoCoverage - roomSize;
		float cheapoPaintRemaining = cheapoCoverageRemaining / 10;
		
		float averageJoePotsNeeded = calculateAverageJoePots(roomSize);
		float averageJoeCoveragePerPot = 11 * 15;
		float totalAverageJoeCoverage = averageJoePotsNeeded * averageJoeCoveragePerPot;
		
		float averageJoeCoverageRemaining = totalAverageJoeCoverage - roomSize;
		float averageJoePaintRemaining = averageJoeCoverageRemaining / 11;
		
		float duluxPotsNeeded = calculateDuluxPots(roomSize);
		float duluxCoveragePerPot = 20 * 10;
		float totalDuluxCoverage = duluxPotsNeeded * duluxCoveragePerPot;
		
		float duluxCoverageRemaining = totalDuluxCoverage - roomSize;
		float duluxPaintRemaining = duluxCoverageRemaining / 20;
		
		String leastWaste;

		if(cheapoPaintRemaining <= averageJoePaintRemaining) {
			if(cheapoPaintRemaining <= duluxPaintRemaining) {
				leastWaste = "CheapoMax";
			} else {
				leastWaste = "DuluxourousPaints";
			}
		} else if (averageJoePaintRemaining <= duluxPaintRemaining) {
			leastWaste = "AverageJoes";
		} else {
			leastWaste = "DuluxourousPaints";
		}
		
		return leastWaste;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
