package com.cloudframe.app.d529351u.dto;

/**
*  The class DclfeSpiRuleCpeFlg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class DclfeSpiRuleCpeFlg extends DclfeSpiRuleCpeFlgSerialized {
   

						@Getter @Setter private char[] cpeflSpiTblId = Field.fillLowValue(7);

						@Getter @Setter private char[] cpeflStsCd = Field.fillLowValue(1);

						@Getter @Setter private char[] cpeflDerivPlOfSvcCd = Field.fillLowValue(2);

						@Getter @Setter private char[] cpeflDerivSvcCd = Field.fillLowValue(6);

						@Getter @Setter private char[] cpeflDerivCausCd = Field.fillLowValue(1);

						@Getter @Setter private char[] cpeflCreatDttm = Field.fillLowValue(26);

						@Getter @Setter private char[] cpeflCpeDescCd = Field.fillLowValue(4);

						@Getter @Setter private char[] cpeflPgmId = Field.fillLowValue(8);

						@Getter @Setter private char[] cpeflLstUpdtDttm = Field.fillLowValue(26);

						@Getter @Setter private char[] cpeflLstUpdtUserId = Field.fillLowValue(9);
	
	/**
	* Constructor for DclfeSpiRuleCpeFlg
	**/
    public DclfeSpiRuleCpeFlg() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes DclfeSpiRuleCpeFlg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCpeflSpiTblId(CONSTANTS.SPACE_7);
         setCpeflStsCd(CONSTANTS.SPACE);
         setCpeflDerivPlOfSvcCd(CONSTANTS.SPACE_2);
         setCpeflDerivSvcCd(CONSTANTS.SPACE_6);
         setCpeflDerivCausCd(CONSTANTS.SPACE);
         setCpeflCreatDttm(CONSTANTS.SPACE_26);
         setCpeflCpeDescCd(CONSTANTS.SPACE_4);
         setCpeflPgmId(CONSTANTS.SPACE_8);
         setCpeflLstUpdtDttm(CONSTANTS.SPACE_26);
         setCpeflLstUpdtUserId(CONSTANTS.SPACE_9);
   }


}
  
