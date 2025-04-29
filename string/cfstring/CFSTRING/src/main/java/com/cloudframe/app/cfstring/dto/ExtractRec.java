package com.cloudframe.app.cfstring.dto;

/**
*  The class ExtractRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.*;


@Data
public class ExtractRec extends ExtractRecSerialized {
   

						@Getter @Setter private char[] extMtn = Field.fillLowValue(10);

						@Getter @Setter private char[] extLname = Field.fillLowValue(25);

						@Getter @Setter private char[] extFname = Field.fillLowValue(20);
				@Getter @Setter private ExtActEffDt extActEffDt = new ExtActEffDt();

						@Getter @Setter private char[] extCarrierName = new char[30];

						@Getter @Setter private char[] extDeviceId = new char[20];

						@Getter @Setter private char[] extRegionCd = new char[2];

								@Getter @Setter private long extOutletId;

						@Getter @Setter private char[] extMfgNme = new char[30];

						@Getter @Setter private char[] extProdNme = Field.fillLowValue(32);

						@Getter @Setter private char[] extAddr1 = new char[30];

						@Getter @Setter private char[] extAddr2 = Field.fillLowValue(30);

						@Getter @Setter private char[] extCity = new char[30];

						@Getter @Setter private char[] extState = new char[2];

						@Getter @Setter private char[] extZipCode = new char[9];

						@Getter @Setter private char[] extAnalogDigitalCd = new char[1];

						@Getter @Setter private char[] extTermnlOptCd = new char[1];

						@Getter @Setter private char[] extWarranty = new char[1];

						@Getter @Setter private char[] extMtnEffDt = new char[8];
				@Getter @Setter private ExtCustAcctNo extCustAcctNo = new ExtCustAcctNo();

						@Getter @Setter private char[] extActDeact = Field.fillLowValue(1);
				@Getter @Setter private ExtFlds extFlds = new ExtFlds();

								@Getter @Setter private int extAuserCnt;
			@Getter @Setter private List<ExtAuthUsers> extAuthUsers = new ArrayList<>();
    	

						@Getter @Setter private char[] extIccid = Field.fillLowValue(20);

						@Getter @Setter private char[] extDeviceIdType = Field.fillLowValue(3);

						@Getter @Setter private char[] dvcTransRsnCd = Field.fillLowValue(2);

						@Getter @Setter private char[] extActvReqDt = Field.fillLowValue(10);

						@Getter @Setter private char[] extCustTypeCd = Field.fillLowValue(2);

						@Getter @Setter private char[] extSfoSpoIndicator = Field.fillLowValue(3);

						@Getter @Setter private char[] extLevel = Field.fillLowValue(1);

						@Getter @Setter private char[] extLineStatus = Field.fillLowValue(2);

						@Getter @Setter private char[] extFinMarketCode = Field.fillLowValue(3);

						@Getter @Setter private char[] extEmailAddr1 = Field.fillLowValue(60);

						@Getter @Setter private char[] extEmailAddr2 = Field.fillLowValue(60);

						@Getter @Setter private char[] extEmailAddr3 = Field.fillLowValue(60);

						@Getter @Setter private char[] extLocationState = Field.fillLowValue(2);

								@Getter @Setter private long extUniqueId;

						@Getter @Setter private char[] extBrandIdentifier = Field.fillLowValue(1);
				@Getter @Setter private ExtBillCycleDt extBillCycleDt = new ExtBillCycleDt();
				@Getter @Setter private ExtServiceStartDt extServiceStartDt = new ExtServiceStartDt();

						@Getter @Setter private char[] extSlsRepId = Field.fillLowValue(5);

						@Getter @Setter private char[] extSlsRepLname = Field.fillLowValue(25);

						@Getter @Setter private char[] extSlsRepFname = Field.fillLowValue(20);

						@Getter @Setter private char[] extChnlDetail = Field.fillLowValue(20);

						@Getter @Setter private char[] extOutletName = Field.fillLowValue(30);

						@Getter @Setter private char[] extDistrictDesc = Field.fillLowValue(20);

						@Getter @Setter private char[] extVzMktDesc = Field.fillLowValue(20);

						@Getter @Setter private char[] extUniqueIdLine = Field.fillLowValue(25);

						@Getter @Setter private char[] extSvcAddr1 = Field.fillLowValue(30);

						@Getter @Setter private char[] extSvcAddr2 = Field.fillLowValue(30);

						@Getter @Setter private char[] extSvcCity = Field.fillLowValue(30);

						@Getter @Setter private char[] extSvcState = Field.fillLowValue(2);

						@Getter @Setter private char[] extSvcZipCode = Field.fillLowValue(9);
				@Getter @Setter private ExtShsArea extShsArea = new ExtShsArea();

						@Getter @Setter private char[] extSkuId = Field.fillLowValue(20);
	
	/**
	* Constructor for ExtractRec
	**/
    public ExtractRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getExtActEffDt().setParent(this,getStartOffset() + 55);
					getExtCustAcctNo().setParent(this,getStartOffset() + 298);
					getExtFlds().setParent(this,getStartOffset() + 314);
				for (int arrayIndex = 0; arrayIndex < EXT_AUTH_USERS_SIZE;arrayIndex++) {
						getExtAuthUsers().add(new ExtAuthUsers(this, beginExtAuthUsers + 
						arrayIndex * ExtAuthUsers.getExtAuthUsersFieldLength()));
				}
					getExtBillCycleDt().setParent(this,getStartOffset() + 1046);
					getExtServiceStartDt().setParent(this,getStartOffset() + 1056);
					getExtShsArea().setParent(this,getStartOffset() + 1332);
	   	/*  end of offset */
								setExtCarrierName(("VERIZON                       ").toCharArray());
								setExtDeviceId(("DEVICEID            ").toCharArray());
								setExtRegionCd(("NE").toCharArray());
								setExtOutletId(15123L);
								setExtMfgNme(("SAMSUNG                       ").toCharArray());
								setExtAddr1(("63 AMBER                      ").toCharArray());
								setExtCity(("ROBBINSVILLE                  ").toCharArray());
								setExtState(("NJ").toCharArray());
								setExtZipCode(("08691    ").toCharArray());
								setExtAnalogDigitalCd(("A").toCharArray());
								setExtTermnlOptCd(("P").toCharArray());
								setExtWarranty(("N").toCharArray());
								setExtMtnEffDt(("12/10/01").toCharArray());
    }





}
  
