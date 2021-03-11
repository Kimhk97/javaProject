package generics;

public class Product<T, M> { // T와 M은 제네릭 타입이라고 알려주는 것
	T kind;
	M model;

	public void setKind(T kind) {
		this.kind = kind;
	}

	public T getKind() {
		return kind;
	}

	public void setModel(M model) {
		this.model = model;
	}

	public M getModel() {
		return model;
	}

}
