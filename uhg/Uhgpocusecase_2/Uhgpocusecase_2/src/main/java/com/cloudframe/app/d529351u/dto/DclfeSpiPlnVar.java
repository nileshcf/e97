package com.cloudframe.app.d529351u.dto;

/**
*  The class DclfeSpiPlnVar is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class DclfeSpiPlnVar extends DclfeSpiPlnVarSerialized {
   

						@Getter @Setter private char[] plnvSpiTblId = Field.fillLowValue(7);

						@Getter @Setter private char[] plnvStsCd = Field.fillLowValue(1);

						@Getter @Setter private char[] plnvPolNbr = Field.fillLowValue(6);

						@Getter @Setter private char[] plnvPlnNbr = Field.fillLowValue(4);

						@Getter @Setter private char[] plnvEffDt = Field.fillLowValue(10);

						@Getter @Setter private char[] plnvCreatDttm = Field.fillLowValue(26);

						@Getter @Setter private char[] plnvCancDt = Field.fillLowValue(10);

						@Getter @Setter private char[] plnvPgmId = Field.fillLowValue(8);

						@Getter @Setter private char[] plnvLstUpdtDttm = Field.fillLowValue(26);

						@Getter @Setter private char[] plnvLstUpdtUserId = Field.fillLowValue(9);
	
	/**
	* Constructor for DclfeSpiPlnVar
	**/
    public DclfeSpiPlnVar() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes DclfeSpiPlnVar
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setPlnvSpiTblId(CONSTANTS.SPACE_7);
         setPlnvStsCd(CONSTANTS.SPACE);
         setPlnvPolNbr(CONSTANTS.SPACE_6);
         setPlnvPlnNbr(CONSTANTS.SPACE_4);
         setPlnvEffDt(CONSTANTS.SPACE_10);
         setPlnvCreatDttm(CONSTANTS.SPACE_26);
         setPlnvCancDt(CONSTANTS.SPACE_10);
         setPlnvPgmId(CONSTANTS.SPACE_8);
         setPlnvLstUpdtDttm(CONSTANTS.SPACE_26);
         setPlnvLstUpdtUserId(CONSTANTS.SPACE_9);
   }


}
  
