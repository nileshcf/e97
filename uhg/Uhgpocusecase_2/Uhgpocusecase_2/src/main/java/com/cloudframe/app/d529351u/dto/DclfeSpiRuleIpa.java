package com.cloudframe.app.d529351u.dto;

/**
*  The class DclfeSpiRuleIpa is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class DclfeSpiRuleIpa extends DclfeSpiRuleIpaSerialized {
   

						@Getter @Setter private char[] ripaSpiTblId = Field.fillLowValue(7);

						@Getter @Setter private char[] ripaStsCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ripaDerivPlOfSvcCd = Field.fillLowValue(2);

						@Getter @Setter private char[] ripaDerivSvcCd = Field.fillLowValue(6);

						@Getter @Setter private char[] ripaDerivCausCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ripaCreatDttm = Field.fillLowValue(26);

						@Getter @Setter private char[] ripaClmIpa1Cd = Field.fillLowValue(3);

						@Getter @Setter private char[] ripaClmIpa2Cd = Field.fillLowValue(3);

						@Getter @Setter private char[] ripaClmIpa3Cd = Field.fillLowValue(3);

						@Getter @Setter private char[] ripaPgmId = Field.fillLowValue(8);

						@Getter @Setter private char[] ripaLstUpdtDttm = Field.fillLowValue(26);

						@Getter @Setter private char[] ripaLstUpdtUserId = Field.fillLowValue(9);

						@Getter @Setter private char[] ripaGrpTbl1Nbr = Field.fillLowValue(4);

						@Getter @Setter private char[] ripaGrpTbl2Nbr = Field.fillLowValue(4);

						@Getter @Setter private char[] ripaGrpTbl3Nbr = Field.fillLowValue(4);
	
	/**
	* Constructor for DclfeSpiRuleIpa
	**/
    public DclfeSpiRuleIpa() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes DclfeSpiRuleIpa
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRipaSpiTblId(CONSTANTS.SPACE_7);
         setRipaStsCd(CONSTANTS.SPACE);
         setRipaDerivPlOfSvcCd(CONSTANTS.SPACE_2);
         setRipaDerivSvcCd(CONSTANTS.SPACE_6);
         setRipaDerivCausCd(CONSTANTS.SPACE);
         setRipaCreatDttm(CONSTANTS.SPACE_26);
         setRipaClmIpa1Cd(CONSTANTS.SPACE_3);
         setRipaClmIpa2Cd(CONSTANTS.SPACE_3);
         setRipaClmIpa3Cd(CONSTANTS.SPACE_3);
         setRipaPgmId(CONSTANTS.SPACE_8);
         setRipaLstUpdtDttm(CONSTANTS.SPACE_26);
         setRipaLstUpdtUserId(CONSTANTS.SPACE_9);
         setRipaGrpTbl1Nbr(CONSTANTS.SPACE_4);
         setRipaGrpTbl2Nbr(CONSTANTS.SPACE_4);
         setRipaGrpTbl3Nbr(CONSTANTS.SPACE_4);
   }


}
  
