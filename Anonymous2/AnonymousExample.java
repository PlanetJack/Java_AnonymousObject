package Anonymous2;

public class AnonymousExample {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous();
		
		anony.field.turnOn();
		anony.field.turnOff();
		
		anony.method1();
		
		anony.method2(new RemoteControl( ) {
			@Override
			public void turnOn() {
				System.out.println("Turn on the SmartTV");
			}
			@Override
			public void turnOff() {
				System.out.println("Turn off the SmartTV");
			}
		});
	}

}
