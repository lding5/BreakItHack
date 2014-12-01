//import java.awt.event.ActionListener;
import java.awt.event.*;

public class HoneyController {
	private HoneyView view;
	private HoneyModel model;

	public HoneyController(HoneyView view, HoneyModel model){
		this.view = view;
		this.model = model;

		this.view.addHoneyListener(new HoneyListener());
	}

	class HoneyListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			try {
				int honeypot = view.getHoneypot();
				String eater1Name = view.getEater1Name();
				int getEater1Eating = view.getEater1Eating();
				int getEater1Napping = view.getEater1Napping();

				// controller doesn't do anything
				// controller handle interaction betw view and model
				model.execute(honeypot, new HoneyEater(honeypot, eater1Name, getEater1Eating, getEater1Napping));

				System.out.println("before view");
				view.setResult(model.getResult());
				System.out.println("after view");


			} catch (Exception e) {
				view.displayErrorMessage("errrrrror :(");
			}

		}
	}

}