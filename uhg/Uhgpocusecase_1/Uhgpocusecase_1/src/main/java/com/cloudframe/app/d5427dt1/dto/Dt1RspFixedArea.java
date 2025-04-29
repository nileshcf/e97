package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Dt1RspFixedArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Dt1RspFixedArea extends Dt1RspFixedAreaSerialized { 
   

						@Getter @Setter private char[] dt1RspViewName = Field.fillLowValue(8);

						@Getter @Setter private char[] dt1RspViewVersion = Field.fillLowValue(2);
				@Getter @Setter private Dt1RspLegacyResponseData dt1RspLegacyResponseData = new Dt1RspLegacyResponseData();

						@Getter @Setter private char[] dt1RspEmpid = Field.fillLowValue(10);

						@Getter @Setter private char[] dt1RspPolicy = Field.fillLowValue(6);

								@Getter @Setter private int dt1RspDepNbr;

						@Getter @Setter private char[] dt1RspFirstName = Field.fillLowValue(12);

						@Getter @Setter private char[] dt1RspLastName = Field.fillLowValue(20);

						@Getter @Setter private char[] dt1RspRel = Field.fillLowValue(2);

						@Getter @Setter private char[] dt1RspSystem = Field.fillLowValue(1);

								@Getter @Setter private int dt1RspPlanVariation;

								@Getter @Setter private int dt1RspReportingCode;

						@Getter @Setter private char[] dt1RspFundingResponsibility = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1RspPatPhiInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1RspUhpInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1RspCcmRelSrvcInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1RspCcmPriorAuthInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1RspEbrPriorAuthInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1RspEbcPriorAuthInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1RspOncPolPrtcpCd = Field.fillLowValue(1);

								@Getter @Setter private int dt1RspTotalClaimCount;

								@Getter @Setter private int dt1RspCurrentClaimCount;

						@Getter @Setter private char[] dt1RspExplCode = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1RspNextKey = Field.fillLowValue(80);

						@Getter @Setter private char[] dt1RspClmContainerName = Field.fillLowValue(16);

								@Getter @Setter private long dt1RspClmContainerItemCnt;

								@Getter @Setter private long dt1RspClmContainerItemLen;

						@Getter @Setter private char[] dt1RspGenTstPrtcpCd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1RspSecOpinVendCd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1RspUgiInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1RspLgiInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1RspExdInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1RspFillerArea = Field.fillLowValue(154);
	
	/**
	* Constructor for Dt1RspFixedArea
	**/
    public Dt1RspFixedArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dt1RspFixedArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1RspFixedArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getDt1RspLegacyResponseData().setParent(this,getStartOffset() + 10);
    } 

	/**
	 * 	initializes Dt1RspFixedArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setDt1RspViewName(CONSTANTS.SPACE_8);
         setDt1RspViewVersion(CONSTANTS.SPACE_2);
          getDt1RspLegacyResponseData().initialize();
     
         setDt1RspEmpid(CONSTANTS.SPACE_10);
         setDt1RspPolicy(CONSTANTS.SPACE_6);
                     setDt1RspDepNbr(0);
         setDt1RspFirstName(CONSTANTS.SPACE_12);
         setDt1RspLastName(CONSTANTS.SPACE_20);
         setDt1RspRel(CONSTANTS.SPACE_2);
         setDt1RspSystem(CONSTANTS.SPACE);
                     setDt1RspPlanVariation(0);
                     setDt1RspReportingCode(0);
         setDt1RspFundingResponsibility(CONSTANTS.SPACE);
         setDt1RspPatPhiInd(CONSTANTS.SPACE);
         setDt1RspUhpInd(CONSTANTS.SPACE);
         setDt1RspCcmRelSrvcInd(CONSTANTS.SPACE);
         setDt1RspCcmPriorAuthInd(CONSTANTS.SPACE);
         setDt1RspEbrPriorAuthInd(CONSTANTS.SPACE);
         setDt1RspEbcPriorAuthInd(CONSTANTS.SPACE);
         setDt1RspOncPolPrtcpCd(CONSTANTS.SPACE);
                     setDt1RspTotalClaimCount(0);
                     setDt1RspCurrentClaimCount(0);
         setDt1RspExplCode(CONSTANTS.SPACE);
         setDt1RspNextKey(CONSTANTS.SPACE_80);
         setDt1RspClmContainerName(CONSTANTS.SPACE_16);
                     setDt1RspClmContainerItemCnt(0);
                     setDt1RspClmContainerItemLen(0);
         setDt1RspGenTstPrtcpCd(CONSTANTS.SPACE);
         setDt1RspSecOpinVendCd(CONSTANTS.SPACE);
         setDt1RspUgiInd(CONSTANTS.SPACE);
         setDt1RspLgiInd(CONSTANTS.SPACE);
         setDt1RspExdInd(CONSTANTS.SPACE);
         setDt1RspFillerArea(CONSTANTS.SPACE_154);
   }


}
  
