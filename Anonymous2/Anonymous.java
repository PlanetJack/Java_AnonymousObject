package Anonymous2;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("Turn on the TV");
		}
		@Override
		public void turnOff() {
			System.out.println("Turn off the TV");
		}
	};
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Turn on the Audio");
			}
			@Override
			public void turnOff() {
				System.out.println("Turn off the Audio");
			}
		};
		//메소드 안에 있는 turnOn, turnOff 가 호출 됩니다.
		localVar.turnOn();
		localVar.turnOff();
	}
	void method2(RemoteControl rc) {
		//익명 구현 객체가 실행이 됩니다.
		 rc.turnOn();
		 rc.turnOff();
	}
}
