public class MVCHoney {
	public static void main(String [] args){
		System.out.println("MVCHoney started");

		HoneyView view = new HoneyView();
		HoneyModel model = new HoneyModel();
		HoneyController controller = new HoneyController(view, model);

		view.setVisible(true);
	}
}