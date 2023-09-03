package pojoPackageSerialization;


import java.util.ArrayList;
import java.util.List;


public class GetQuoteApiPojo {

	public static ParentOfListofquotationTO getQuoteApiPojo(String productId ,String PolicyType, String productPlanOptionCd, int noOfAdults ,int noOfKids) {
	
		
		ParentOfListofquotationTO plogu = new ParentOfListofquotationTO();
		
		ListofquotationTO loqu = new ListofquotationTO();
		loqu.setChannelId("350");
		loqu.setProductId(productId);
		loqu.setParentProductId("SPLS03");
		loqu.setParentProductVersion(1);
		loqu.setNoOfAdults(noOfAdults);
		loqu.setNoOfKids(noOfKids);
		loqu.setTenure(1);
		loqu.setProductPlanOptionCd(productPlanOptionCd); //FN-PLS5-HD5 
		loqu.setPolicyType(PolicyType); 			//
		loqu.setSaveFl("YES");
		loqu.setQuoteTypeCd("INITIAL");
		loqu.setQuotationDt("19/08/2023");
		loqu.setAgentId("1607647-01");
		loqu.setCampaignCd("");
		loqu.setProductFamilyCd("SUPERTOPUP");
		loqu.setInwardTypeCd("NEWBUSINESS");
		loqu.setInwardSubTypeCd("PROPOSALDOCUMENT");
		loqu.setCaseType(null);
		
		List <ListofquotationTO> Listloqu = new ArrayList<>();
		Listloqu.add(loqu);
		
		QuotationProductDOList qpl = new QuotationProductDOList();
		
		qpl.setPaymentFrequencyCd("SINGLE");
		qpl.setProductId(productId);
		qpl.setProductVersion(1);
		qpl.setProductPlanOptionCd(productPlanOptionCd);
		qpl.setSumInsured(500000);
		qpl.setZoneCd("ZONE1");
		qpl.setProductTypeCd("SUBPLAN");
		
		List<QuotationProductDOList> Listqpl = new ArrayList<>();
		Listqpl.add(qpl);
		
		QuotationProductInsuredDOList Adult1 = new QuotationProductInsuredDOList();
		
		Adult1.setIssueAge(0);
		Adult1.setGenderCd("MALE");
		Adult1.setInsuredTypeCd("PRIMARY");
		Adult1.setCityCd("Mumbai");
		Adult1.setMobileNum("6387454414");
		Adult1.setEmailAddress("");
		Adult1.setDob("19/08/1994");
		Adult1.setZoneCd("ZONE1");
		Adult1.setRelationCd("SELF");
		Adult1.setProductPlanOptionCd(productPlanOptionCd);
		Adult1.setSumInsured("500000");
		Adult1.setRefGuid("First");
		
		QuotationProductInsuredDOList Adult2 = new QuotationProductInsuredDOList();
		
		Adult2.setIssueAge(0);
		Adult2.setGenderCd("FEMALE");
		Adult2.setInsuredTypeCd("PRIMARY");
		Adult2.setCityCd("Mumbai");
		Adult2.setMobileNum("8356928442");
		Adult2.setEmailAddress("");
		Adult2.setDob("19/08/1975");
		Adult2.setZoneCd("ZONE1");
		Adult2.setRelationCd("WIFE");
		Adult2.setProductPlanOptionCd(productPlanOptionCd);
		Adult2.setSumInsured("500000");
		Adult2.setRefGuid("Second");
		
QuotationProductInsuredDOList Child1 = new QuotationProductInsuredDOList();
		
Child1.setIssueAge(0);
Child1.setGenderCd("MALE");
Child1.setInsuredTypeCd("PRIMARY");
Child1.setCityCd("Mumbai");
Child1.setMobileNum("6387454414");
Child1.setEmailAddress("");
Child1.setDob("19/08/2000");
Child1.setZoneCd("ZONE1");
Child1.setRelationCd("SON");
Child1.setProductPlanOptionCd(productPlanOptionCd);
Child1.setSumInsured("500000");
Child1.setRefGuid("First");

QuotationProductInsuredDOList Child2 = new QuotationProductInsuredDOList();

Child2.setIssueAge(0);
Child2.setGenderCd("FEMALE");
Child2.setInsuredTypeCd("PRIMARY");
Child2.setCityCd("Mumbai");
Child2.setMobileNum("6387454414");
Child2.setEmailAddress("");
Child2.setDob("19/08/2005");
Child2.setZoneCd("ZONE1");
Child2.setRelationCd("UDTR");
Child2.setProductPlanOptionCd(productPlanOptionCd);
Child2.setSumInsured("500000");
Child2.setRefGuid("First");

QuotationProductInsuredDOList Child3 = new QuotationProductInsuredDOList();

Child3.setIssueAge(0);
Child3.setGenderCd("FEMALE");
Child3.setInsuredTypeCd("PRIMARY");
Child3.setCityCd("Mumbai");
Child3.setMobileNum("6387454414");
Child3.setEmailAddress("");
Child3.setDob("19/08/2005");
Child3.setZoneCd("ZONE1");
Child3.setRelationCd("UDTR");
Child3.setProductPlanOptionCd(productPlanOptionCd);
Child3.setSumInsured("500000");
Child3.setRefGuid("First");
		
		List<QuotationProductInsuredDOList> InsuredDOList = new ArrayList<>();
		
		if (noOfAdults == 1 && noOfKids == 0 ) {
			
			InsuredDOList.add(Adult1);
		}
		else if (noOfAdults == 2 && noOfKids == 0 ) {
			
			InsuredDOList.add(Adult1);
			InsuredDOList.add(Adult2);
		}
		else if (noOfAdults == 2 && noOfKids == 1 ) {
			
			InsuredDOList.add(Adult1);
			InsuredDOList.add(Adult2);
			InsuredDOList.add(Child1);
		}
		else if (noOfAdults == 2 && noOfKids == 2 ) {
	
	InsuredDOList.add(Adult1);
	InsuredDOList.add(Adult2);
	InsuredDOList.add(Child1);
	InsuredDOList.add(Child2);
		}
		else if (noOfAdults == 2 && noOfKids == 3 ) {
	
	InsuredDOList.add(Adult1);
	InsuredDOList.add(Adult2);
	InsuredDOList.add(Child1);
	InsuredDOList.add(Child2);
	InsuredDOList.add(Child3);
	
}else if (noOfAdults == 1 && noOfKids == 1 ) {
	
	InsuredDOList.add(Adult1);
	InsuredDOList.add(Child1);
	
}
else if (noOfAdults == 1 && noOfKids == 2 ) {
	
	InsuredDOList.add(Adult1);
	InsuredDOList.add(Child1);
	InsuredDOList.add(Child2);
	
}
else if (noOfAdults == 1 && noOfKids == 3 ) {
	
	InsuredDOList.add(Adult1);
	InsuredDOList.add(Child1);
	InsuredDOList.add(Child2);
	InsuredDOList.add(Child3);
	
}
else {
	System.out.println("Your Fuckiing logic is not working");
}		
		
	
		
		
		qpl.setQuotationProductInsuredDOList(InsuredDOList);

		loqu.setQuotationProductDOList(Listqpl);
		
		plogu.setListofquotationTO(Listloqu);
		
		
		
		
return plogu;			
		
		
		
		
		

	}

}
