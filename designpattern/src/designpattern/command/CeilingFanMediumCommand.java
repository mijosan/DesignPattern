package designpattern.command;

/**
 * 행동과 리시버를 한객체에 집어넣고 execute()라는 메소드 하나만 외부에 공개하는 방법
 * 이 메소드 호출에 의해서 리시버에서 일련의 작업이 처리됩니다. 외부에서 볼 떄는
 * 어떤 객체가 리시버 역할을 하는지, 그 리시버에서 실제로 어떤 일을 하는지 알 수 없습니다. 그냥 execute() 메소드를 
 * 호출하면 요구 사항이 처리된다는 것만 알 수 있다.
 */
public class CeilingFanMediumCommand implements Command{
	CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.medium();
	}
	
	@Override
	public void undo() {
		if(prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		}else if(prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		}else if(prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		}else if(prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}
}
