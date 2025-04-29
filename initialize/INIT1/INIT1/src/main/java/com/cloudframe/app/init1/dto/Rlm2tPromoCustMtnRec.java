package com.cloudframe.app.init1.dto;

/**
*  The class Rlm2tPromoCustMtnRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Rlm2tPromoCustMtnRec extends Rlm2tPromoCustMtnRecSerialized {
   

								@Getter @Setter private int rlm2tCustIdNo;

						@Getter @Setter private char[] rlm2tNpa = Field.fillLowValue(3);

						@Getter @Setter private char[] rlm2tNxx = Field.fillLowValue(3);

						@Getter @Setter private char[] rlm2tTln = Field.fillLowValue(4);

						@Getter @Setter private char[] rlm2tMtnEffDt = Field.fillLowValue(10);

								@Getter @Setter private int rlm2tOffrTypId;

						@Getter @Setter private char[] rlm2tOffrTypCd = Field.fillLowValue(2);

								@Getter @Setter private int rlm2tFreeUsgMin;

						@Getter @Setter private char[] rlm2tAllowTypCd = Field.fillLowValue(2);

						@Getter @Setter private char[] rlm2tAllowCrTyp = Field.fillLowValue(1);
				@Getter @Setter private Rlm2tQualifyDt rlm2tQualifyDt = new Rlm2tQualifyDt();
				@Getter @Setter private Rlm2tEndDt rlm2tEndDt = new Rlm2tEndDt();

								@Getter @Setter private long rlm2tFreeTmLeft;

								@Getter @Setter private int rlm2tPromoConnectId;

								@Getter @Setter private long rlm2tLnOfSvcIdNoP2;

								@Getter @Setter private int rlm2tLnOfSvcIdNoP1;

						@Getter @Setter private char[] rlm2tLnSvcProdEffTs = Field.fillLowValue(26);

						@Getter @Setter private char[] rlm2tLnSvcProdEndTs = Field.fillLowValue(26);

								@Getter @Setter private int rlm2tAcctNo;

								@Getter @Setter private short rlm2tBlSegregateNo;

								@Getter @Setter private short rlm2tJobIterationNo;

						@Getter @Setter private char[] rlm2tBlStreamCd = Field.fillLowValue(1);

						@Getter @Setter private char[] rlm2tDbUserid = Field.fillLowValue(8);

						@Getter @Setter private char[] rlm2tDbTmstamp = Field.fillLowValue(26);
	
	/**
	* Constructor for Rlm2tPromoCustMtnRec
	**/
    public Rlm2tPromoCustMtnRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getRlm2tQualifyDt().setParent(this,getStartOffset() + 37);
					getRlm2tEndDt().setParent(this,getStartOffset() + 47);
	   	/*  end of offset */
    }



	/**
	 * 	initializes Rlm2tPromoCustMtnRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setRlm2tCustIdNo(0);
         setRlm2tNpa(CONSTANTS.SPACE_3);
         setRlm2tNxx(CONSTANTS.SPACE_3);
         setRlm2tTln(CONSTANTS.SPACE_4);
         setRlm2tMtnEffDt(CONSTANTS.SPACE_10);
                     setRlm2tOffrTypId(0);
         setRlm2tOffrTypCd(CONSTANTS.SPACE_2);
                     setRlm2tFreeUsgMin(0);
         setRlm2tAllowTypCd(CONSTANTS.SPACE_2);
         setRlm2tAllowCrTyp(CONSTANTS.SPACE);
          getRlm2tQualifyDt().initialize();
     
          getRlm2tEndDt().initialize();
     
                     setRlm2tFreeTmLeft(0);
                     setRlm2tPromoConnectId(0);
                     setRlm2tLnOfSvcIdNoP2(0);
                     setRlm2tLnOfSvcIdNoP1(0);
         setRlm2tLnSvcProdEffTs(CONSTANTS.SPACE_26);
         setRlm2tLnSvcProdEndTs(CONSTANTS.SPACE_26);
                     setRlm2tAcctNo(0);
         	setRlm2tBlSegregateNo((short)0);
         	setRlm2tJobIterationNo((short)0);
         setRlm2tBlStreamCd(CONSTANTS.SPACE);
         setRlm2tDbUserid(CONSTANTS.SPACE_8);
         setRlm2tDbTmstamp(CONSTANTS.SPACE_26);
   }


}
  
