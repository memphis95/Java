package generics;

public class WildCardGenerics<E> {
	E obj;
	WildCardGenerics(E obj){
		this.obj = obj;
	}
	void showWildCardObj(WildCardGenerics<? extends Number> num) {
		System.out.println("the object "+obj);
		System.out.println("the object type is"+obj.getClass().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildCardGenerics<Integer> iWild = new WildCardGenerics<Integer>(10);

		WildCardGenerics<Double> dWild = new WildCardGenerics<Double>(34522.2);

		WildCardGenerics<Long> lWild = new WildCardGenerics<Long>(234567898765567l);

		WildCardGenerics<Float> fWild = new WildCardGenerics<Float>(99.9f);



		iWild.showWildCardObj(iWild);

		dWild.showWildCardObj(dWild);

		lWild.showWildCardObj(lWild);

		fWild.showWildCardObj(fWild);

	}

}
