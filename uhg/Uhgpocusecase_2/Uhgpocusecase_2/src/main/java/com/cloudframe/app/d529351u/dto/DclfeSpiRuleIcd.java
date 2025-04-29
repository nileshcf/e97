package com.cloudframe.app.d529351u.dto;

/**
*  The class DclfeSpiRuleIcd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class DclfeSpiRuleIcd extends DclfeSpiRuleIcdSerialized {
   

						@Getter @Setter private char[] ricdSpiTblId = Field.fillLowValue(7);

						@Getter @Setter private char[] ricdStsCd = Field.fillLowValue(1);

								@Getter @Setter private short ricdClmIcdSeqNbr;

						@Getter @Setter private char[] ricdDerivPlOfSvcCd = Field.fillLowValue(2);

						@Getter @Setter private char[] ricdDerivSvcCd = Field.fillLowValue(6);

						@Getter @Setter private char[] ricdDerivCausCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ricdCreatDttm = Field.fillLowValue(26);

						@Getter @Setter private char[] ricdClmIcdInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ricdClmIcdFromCd = Field.fillLowValue(7);

						@Getter @Setter private char[] ricdClmIcdToCd = Field.fillLowValue(7);

						@Getter @Setter private char[] ricdPgmId = Field.fillLowValue(8);

						@Getter @Setter private char[] ricdLstUpdtDttm = Field.fillLowValue(26);

						@Getter @Setter private char[] ricdLstUpdtUserId = Field.fillLowValue(9);
	
	/**
	* Constructor for DclfeSpiRuleIcd
	**/
    public DclfeSpiRuleIcd() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes DclfeSpiRuleIcd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRicdSpiTblId(CONSTANTS.SPACE_7);
         setRicdStsCd(CONSTANTS.SPACE);
         	setRicdClmIcdSeqNbr((short)0);
         setRicdDerivPlOfSvcCd(CONSTANTS.SPACE_2);
         setRicdDerivSvcCd(CONSTANTS.SPACE_6);
         setRicdDerivCausCd(CONSTANTS.SPACE);
         setRicdCreatDttm(CONSTANTS.SPACE_26);
         setRicdClmIcdInd(CONSTANTS.SPACE);
         setRicdClmIcdFromCd(CONSTANTS.SPACE_7);
         setRicdClmIcdToCd(CONSTANTS.SPACE_7);
         setRicdPgmId(CONSTANTS.SPACE_8);
         setRicdLstUpdtDttm(CONSTANTS.SPACE_26);
         setRicdLstUpdtUserId(CONSTANTS.SPACE_9);
   }


}
  
