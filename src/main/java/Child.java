class Child extends FatherObj {
	private final String address;

	Child(String id, String name, int[] sizes, String address) {
		super(id, name, sizes);
		this.address = address;
	}
}
