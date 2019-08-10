
class Plant {
	private String latName;
	private String svkName;
	private String page;
	
	public Plant(String l,String s, String p) {
		latName = l;
		svkName = s;
		page = p;
	}

	/**
	 * @return the svkName
	 */
	public String getSvkName() {
		return svkName;
	}

	/**
	 * @return the latName
	 */
	public String getLatName() {
		return latName;
	}

	/**
	 * @return the page
	 */
	public String getPage() {
		return page;
	}
	
	@Override
	public String toString() {
		return svkName;
	}
}
