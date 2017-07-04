public class Main {

	public static void main(String []args) {
		FatherObj ord = new FatherObj("123", "Org1", new int[]{1, 2, 3});
		System.out.println(ord.getOrder());

		Child chi = new Child("123", "Child", new int[]{20, 23, 34}, "33 TEST Street");
		System.out.println(chi.getOrder());
	}
}
