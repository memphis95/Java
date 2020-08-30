package generics;

public class SimpleGeneric<E> {
	E object;
	SimpleGeneric(E object){
		this.object = object;
	}
	void showObjectType() {
		System.out.println("The Object is"+object);
		System.out.println("Object type is"+object.getClass().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGeneric<String> genClass = new SimpleGeneric<String>("Input");
		genClass.showObjectType();

	}

}
