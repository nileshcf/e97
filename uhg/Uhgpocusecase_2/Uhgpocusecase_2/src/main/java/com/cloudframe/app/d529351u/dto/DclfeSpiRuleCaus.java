package com.cloudframe.app.d529351u.dto;

/**
*  The class DclfeSpiRuleCaus is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class DclfeSpiRuleCaus extends DclfeSpiRuleCausSerialized {
   

						@Getter @Setter private char[] causSpiTblId = Field.fillLowValue(7);

						@Getter @Setter private char[] causStsCd = Field.fillLowValue(1);

						@Getter @Setter private char[] causDerivPlOfSvcCd = Field.fillLowValue(2);

						@Getter @Setter private char[] causDerivSvcCd = Field.fillLowValue(6);

						@Getter @Setter private char[] causDerivCausCd = Field.fillLowValue(1);

						@Getter @Setter private char[] causCreatDttm = Field.fillLowValue(26);

						@Getter @Setter private char[] causClmCaus1Cd = Field.fillLowValue(1);

						@Getter @Setter private char[] causClmCaus2Cd = Field.fillLowValue(1);

						@Getter @Setter private char[] causClmCaus3Cd = Field.fillLowValue(1);

						@Getter @Setter private char[] causClmCaus4Cd = Field.fillLowValue(1);

						@Getter @Setter private char[] causClmCaus5Cd = Field.fillLowValue(1);

						@Getter @Setter private char[] causClmCaus6Cd = Field.fillLowValue(1);

						@Getter @Setter private char[] causClmCaus7Cd = Field.fillLowValue(1);

						@Getter @Setter private char[] causClmCaus8Cd = Field.fillLowValue(1);

						@Getter @Setter private char[] causPgmId = Field.fillLowValue(8);

						@Getter @Setter private char[] causLstUpdtDttm = Field.fillLowValue(26);

						@Getter @Setter private char[] causLstUpdtUserId = Field.fillLowValue(9);
	
	/**
	* Constructor for DclfeSpiRuleCaus
	**/
    public DclfeSpiRuleCaus() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes DclfeSpiRuleCaus
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCausSpiTblId(CONSTANTS.SPACE_7);
         setCausStsCd(CONSTANTS.SPACE);
         setCausDerivPlOfSvcCd(CONSTANTS.SPACE_2);
         setCausDerivSvcCd(CONSTANTS.SPACE_6);
         setCausDerivCausCd(CONSTANTS.SPACE);
         setCausCreatDttm(CONSTANTS.SPACE_26);
         setCausClmCaus1Cd(CONSTANTS.SPACE);
         setCausClmCaus2Cd(CONSTANTS.SPACE);
         setCausClmCaus3Cd(CONSTANTS.SPACE);
         setCausClmCaus4Cd(CONSTANTS.SPACE);
         setCausClmCaus5Cd(CONSTANTS.SPACE);
         setCausClmCaus6Cd(CONSTANTS.SPACE);
         setCausClmCaus7Cd(CONSTANTS.SPACE);
         setCausClmCaus8Cd(CONSTANTS.SPACE);
         setCausPgmId(CONSTANTS.SPACE_8);
         setCausLstUpdtDttm(CONSTANTS.SPACE_26);
         setCausLstUpdtUserId(CONSTANTS.SPACE_9);
   }


}
  
