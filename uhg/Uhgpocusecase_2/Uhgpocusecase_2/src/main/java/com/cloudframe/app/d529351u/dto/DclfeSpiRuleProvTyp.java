package com.cloudframe.app.d529351u.dto;

/**
*  The class DclfeSpiRuleProvTyp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class DclfeSpiRuleProvTyp extends DclfeSpiRuleProvTypSerialized {
   

						@Getter @Setter private char[] ptypSpiTblId = Field.fillLowValue(7);

						@Getter @Setter private char[] ptypStsCd = Field.fillLowValue(1);

								@Getter @Setter private short ptypProvTypSeqNbr;

						@Getter @Setter private char[] ptypDerivPlOfSvcCd = Field.fillLowValue(2);

						@Getter @Setter private char[] ptypDerivSvcCd = Field.fillLowValue(6);

						@Getter @Setter private char[] ptypDerivCausCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ptypCreatDttm = Field.fillLowValue(26);

						@Getter @Setter private char[] ptypProvTyp = Field.fillLowValue(2);

						@Getter @Setter private char[] ptypPgmId = Field.fillLowValue(8);

						@Getter @Setter private char[] ptypLstUpdtDttm = Field.fillLowValue(26);

						@Getter @Setter private char[] ptypLstUpdtUserId = Field.fillLowValue(9);
	
	/**
	* Constructor for DclfeSpiRuleProvTyp
	**/
    public DclfeSpiRuleProvTyp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes DclfeSpiRuleProvTyp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setPtypSpiTblId(CONSTANTS.SPACE_7);
         setPtypStsCd(CONSTANTS.SPACE);
         	setPtypProvTypSeqNbr((short)0);
         setPtypDerivPlOfSvcCd(CONSTANTS.SPACE_2);
         setPtypDerivSvcCd(CONSTANTS.SPACE_6);
         setPtypDerivCausCd(CONSTANTS.SPACE);
         setPtypCreatDttm(CONSTANTS.SPACE_26);
         setPtypProvTyp(CONSTANTS.SPACE_2);
         setPtypPgmId(CONSTANTS.SPACE_8);
         setPtypLstUpdtDttm(CONSTANTS.SPACE_26);
         setPtypLstUpdtUserId(CONSTANTS.SPACE_9);
   }


}
  
