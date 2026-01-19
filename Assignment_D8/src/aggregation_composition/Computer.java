package aggregation_composition;

public class Computer {
		private CPU cpu;

		private Keyboard keyboard;

		public Computer() {
			cpu = new CPU(); 
		}

		public Keyboard getKeyboard() {
			return keyboard;
		}

		public void setKeyboard(Keyboard keyboard) {
			this.keyboard = keyboard; 
		}

		public static void main(String[] args) {

			Computer computer = new Computer();
			computer.cpu.process();

			computer.setKeyboard(new Keyboard());
			computer.getKeyboard().type();
		}

		static class CPU {
			public void process() {
				System.out.println("CPU is processing");
			}
		}

		static class Keyboard {
			public void type() {
				System.out.println("Keyboard is typing");
			}
		}
}
