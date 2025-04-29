package com.cloudframe.app.init1.dto;

/**
*  The class DclBlAcctSvcProd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class DclBlAcctSvcProd extends DclBlAcctSvcProdSerialized {
   

								@Getter @Setter private int tb13033CustIdNo;

								@Getter @Setter private int tb13033AcctNo;

								@Getter @Setter private int tb13033SvcProdId;

						@Getter @Setter private char[] tb13033BaSvcProdEffTs = Field.fillLowValue(26);

								@Getter @Setter private int tb13033SvcProdUniqueId;

						@Getter @Setter private char[] tb13033SvcProdExpireDt = Field.fillLowValue(10);

						@Getter @Setter private char[] tb13033SvcProdReinstatInd = Field.fillLowValue(1);

								@Getter @Setter private int tb13033RuleGrpIdLast;

						@Getter @Setter private char[] tb13033BaSvcProdEndTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tb13033OrigSvcProdEffTs = Field.fillLowValue(26);

								@Getter @Setter private int tb13033OrigSvcProdUniqId;

						@Getter @Setter private char[] tb13033VisionUserIdCd = Field.fillLowValue(8);

						@Getter @Setter private char[] tb13033DbUserid = Field.fillLowValue(8);

						@Getter @Setter private char[] tb13033DbTmstamp = Field.fillLowValue(26);

								@Getter @Setter private int tb13033OutletId;

						@Getter @Setter private char[] tb13033SlsRepId = Field.fillLowValue(5);

						@Getter @Setter private char[] tb13033CreateTs = Field.fillLowValue(26);

								@Getter @Setter private int tb13033OrdLnProdUniqueId;

								@Getter @Setter private int tb13033ProdIdTrig;
	
	/**
	* Constructor for DclBlAcctSvcProd
	**/
    public DclBlAcctSvcProd() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes DclBlAcctSvcProd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setTb13033CustIdNo(0);
                     setTb13033AcctNo(0);
                     setTb13033SvcProdId(0);
         setTb13033BaSvcProdEffTs(CONSTANTS.SPACE_26);
                     setTb13033SvcProdUniqueId(0);
         setTb13033SvcProdExpireDt(CONSTANTS.SPACE_10);
         setTb13033SvcProdReinstatInd(CONSTANTS.SPACE);
                     setTb13033RuleGrpIdLast(0);
         setTb13033BaSvcProdEndTs(CONSTANTS.SPACE_26);
         setTb13033OrigSvcProdEffTs(CONSTANTS.SPACE_26);
                     setTb13033OrigSvcProdUniqId(0);
         setTb13033VisionUserIdCd(CONSTANTS.SPACE_8);
         setTb13033DbUserid(CONSTANTS.SPACE_8);
         setTb13033DbTmstamp(CONSTANTS.SPACE_26);
                     setTb13033OutletId(0);
         setTb13033SlsRepId(CONSTANTS.SPACE_5);
         setTb13033CreateTs(CONSTANTS.SPACE_26);
                     setTb13033OrdLnProdUniqueId(0);
                     setTb13033ProdIdTrig(0);
   }


}
  
