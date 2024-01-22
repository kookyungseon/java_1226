package adapter;

public abstract class FanAdapter implements Fan {
	
//	Adpater 클래스에서 interface의 강제성을 완화
	
	@Override
	public void on() {};

	@Override
	public void off() {};


}
