package pojoPackageSerialization;

import java.util.List;

public class QuotationProductDOList {

	 private String productId;
	 private int productVersion;
	 private String productPlanOptionCd;
	 private int sumInsured;
	 private String zoneCd;
	 private String productTypeCd;
	 private String paymentFrequencyCd;
	 private List<QuotationProductInsuredDOList> quotationProductInsuredDOList;
	 
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getProductVersion() {
		return productVersion;
	}
	public void setProductVersion(int productVersion) {
		this.productVersion = productVersion;
	}
	public String getProductPlanOptionCd() {
		return productPlanOptionCd;
	}
	public void setProductPlanOptionCd(String productPlanOptionCd) {
		this.productPlanOptionCd = productPlanOptionCd;
	}
	public int getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(int sumInsured) {
		this.sumInsured = sumInsured;
	}
	public String getZoneCd() {
		return zoneCd;
	}
	public void setZoneCd(String zoneCd) {
		this.zoneCd = zoneCd;
	}
	public String getProductTypeCd() {
		return productTypeCd;
	}
	public void setProductTypeCd(String productTypeCd) {
		this.productTypeCd = productTypeCd;
	}
	public String getPaymentFrequencyCd() {
		return paymentFrequencyCd;
	}
	public void setPaymentFrequencyCd(String paymentFrequencyCd) {
		this.paymentFrequencyCd = paymentFrequencyCd;
	}
	public List<QuotationProductInsuredDOList> getQuotationProductInsuredDOList() {
		return quotationProductInsuredDOList;
	}
	public void setQuotationProductInsuredDOList(List<QuotationProductInsuredDOList> quotationProductInsuredDOList) {
		this.quotationProductInsuredDOList = quotationProductInsuredDOList;
	}
	
	 
}

