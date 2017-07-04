class FatherObj {
	private final String id;
	private final String name;
	private final int[] sizes;

	FatherObj(String id, String name, int[] sizes) {
		this.id = id;
		this.name = name;
		this.sizes = sizes;
	}

	String getName() {
		return name;
	}

	String getOrder() {
		return "You want a " + name + " id:" + id + " of size:" + sizes[0];
	}
}
