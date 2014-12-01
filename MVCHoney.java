public class MVCHoney {
	public static void main(String [] args){
		System.out.println("MVCHoney tread: " + Thread.activeCount());
		HoneyView view = new HoneyView();
		System.out.println("MVCHoney tread: " + Thread.activeCount());
		HoneyModel model = new HoneyModel();
		System.out.println("MVCHoney tread: " + Thread.activeCount());
		HoneyController controller = new HoneyController(view, model);

		System.out.println("MVCHoney tread: " + Thread.activeCount());
		view.setVisible(true);

		System.out.println("MVCHoney tread: " + Thread.activeCount());

	}
}