package resources;

public enum APIResource {

	getQuoteRes("/v1/rest/api/cigna/QuoteCompute");
	
	String resource;
	
	APIResource(String resource){
		
		this.resource=resource;
		
	}
	

	public String Getresource() {
		
		return resource;
	}
	
}
