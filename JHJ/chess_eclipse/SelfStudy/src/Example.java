
public class Example {
	public static void main(String[] args) {
		Thread m_thread = new Thread() {
			int LoofCounter = 1000;
			@Override
			public void run() {

				for(int i=1; i<= LoofCounter; ++i) {
					System.out.print("B");

					if(i%50 ==0)
						System.out.println();
				}
				super.run();
			}
		};
		ThreadTest t_thread = new ThreadTest();

		m_thread.start();
		t_thread.start();
	}
}
