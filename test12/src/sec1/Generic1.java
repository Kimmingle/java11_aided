package sec1;
//제네릭이란 데이터와 관계없이 아무거나 모두 받아서 처리하는 클래스
public class Generic1<T> {		//데이터 타입과 관계없이 쓸 때 T라고 자주 씀
	private T field1;

	
	public Generic1() {
	}

	public Generic1(T field1) {
		super();
		this.field1 = field1;
	}

	public T getField1() {
		return field1;
	}

	public void setField1(T field1) {
		this.field1 = field1;
	}

	
	

}
