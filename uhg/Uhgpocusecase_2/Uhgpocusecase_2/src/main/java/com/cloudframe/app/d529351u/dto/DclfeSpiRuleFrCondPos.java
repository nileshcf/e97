package com.cloudframe.app.d529351u.dto;

/**
*  The class DclfeSpiRuleFrCondPos is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class DclfeSpiRuleFrCondPos extends DclfeSpiRuleFrCondPosSerialized {
   

						@Getter @Setter private char[] fcndSpiTblId = Field.fillLowValue(7);

						@Getter @Setter private char[] fcndStsCd = Field.fillLowValue(1);

						@Getter @Setter private char[] fcndDerivPlOfSvcCd = Field.fillLowValue(2);

						@Getter @Setter private char[] fcndDerivSvcCd = Field.fillLowValue(6);

						@Getter @Setter private char[] fcndDerivCausCd = Field.fillLowValue(1);

						@Getter @Setter private char[] fcndCreatDttm = Field.fillLowValue(26);

								@Getter @Setter private short fcndFromCondPosSeqNbr;

						@Getter @Setter private char[] fcndFromCondPos = Field.fillLowValue(2);

						@Getter @Setter private char[] fcndPgmId = Field.fillLowValue(8);

						@Getter @Setter private char[] fcndLstUpdtDttm = Field.fillLowValue(26);

						@Getter @Setter private char[] fcndLstUpdtUserId = Field.fillLowValue(9);
	
	/**
	* Constructor for DclfeSpiRuleFrCondPos
	**/
    public DclfeSpiRuleFrCondPos() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes DclfeSpiRuleFrCondPos
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFcndSpiTblId(CONSTANTS.SPACE_7);
         setFcndStsCd(CONSTANTS.SPACE);
         setFcndDerivPlOfSvcCd(CONSTANTS.SPACE_2);
         setFcndDerivSvcCd(CONSTANTS.SPACE_6);
         setFcndDerivCausCd(CONSTANTS.SPACE);
         setFcndCreatDttm(CONSTANTS.SPACE_26);
         	setFcndFromCondPosSeqNbr((short)0);
         setFcndFromCondPos(CONSTANTS.SPACE_2);
         setFcndPgmId(CONSTANTS.SPACE_8);
         setFcndLstUpdtDttm(CONSTANTS.SPACE_26);
         setFcndLstUpdtUserId(CONSTANTS.SPACE_9);
   }


}
  
