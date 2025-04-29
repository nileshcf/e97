package com.cloudframe.app.d529351u.dto;

/**
*  The class DclfeSpiRuleFrToSvc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class DclfeSpiRuleFrToSvc extends DclfeSpiRuleFrToSvcSerialized {
   

						@Getter @Setter private char[] frtoSpiTblId = Field.fillLowValue(7);

						@Getter @Setter private char[] frtoStsCd = Field.fillLowValue(1);

						@Getter @Setter private char[] frtoDerivPlOfSvcCd = Field.fillLowValue(2);

						@Getter @Setter private char[] frtoDerivSvcCd = Field.fillLowValue(6);

						@Getter @Setter private char[] frtoDerivCausCd = Field.fillLowValue(1);

						@Getter @Setter private char[] frtoCreatDttm = Field.fillLowValue(26);

								@Getter @Setter private short frtoFromToSvcSeqNbr;

						@Getter @Setter private char[] frtoClmFrmSvcCd = Field.fillLowValue(6);

						@Getter @Setter private char[] frtoClmToSvcCd = Field.fillLowValue(6);

						@Getter @Setter private char[] frtoSvcTypCd = Field.fillLowValue(1);

						@Getter @Setter private char[] frtoPgmId = Field.fillLowValue(8);

						@Getter @Setter private char[] frtoLstUpdtDttm = Field.fillLowValue(26);

						@Getter @Setter private char[] frtoLstUpdtUserId = Field.fillLowValue(9);

						@Getter @Setter private char[] frtoHipaaCd = Field.fillLowValue(2);
	
	/**
	* Constructor for DclfeSpiRuleFrToSvc
	**/
    public DclfeSpiRuleFrToSvc() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes DclfeSpiRuleFrToSvc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFrtoSpiTblId(CONSTANTS.SPACE_7);
         setFrtoStsCd(CONSTANTS.SPACE);
         setFrtoDerivPlOfSvcCd(CONSTANTS.SPACE_2);
         setFrtoDerivSvcCd(CONSTANTS.SPACE_6);
         setFrtoDerivCausCd(CONSTANTS.SPACE);
         setFrtoCreatDttm(CONSTANTS.SPACE_26);
         	setFrtoFromToSvcSeqNbr((short)0);
         setFrtoClmFrmSvcCd(CONSTANTS.SPACE_6);
         setFrtoClmToSvcCd(CONSTANTS.SPACE_6);
         setFrtoSvcTypCd(CONSTANTS.SPACE);
         setFrtoPgmId(CONSTANTS.SPACE_8);
         setFrtoLstUpdtDttm(CONSTANTS.SPACE_26);
         setFrtoLstUpdtUserId(CONSTANTS.SPACE_9);
         setFrtoHipaaCd(CONSTANTS.SPACE_2);
   }


}
  
