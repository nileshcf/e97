package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip08101RptInds is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip08101RptInds extends Ip08101RptIndsSerialized { 
   

						@Getter @Setter private char[] ip08101ThreshProcOpt = Field.fillLowValue(1);

						@Getter @Setter private char[] ip08101RunIndicator = Field.fillLowValue(1);

						@Getter @Setter private char[] ip08101RerunOption = Field.fillLowValue(1);

						@Getter @Setter private char[] ip08101LocationInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip08101CreErrDetCoRpt = Field.fillLowValue(1);

						@Getter @Setter private char[] ip08101CreErrDetIpRpt = Field.fillLowValue(1);

						@Getter @Setter private char[] ip08101CreErrDetInstId = Field.fillLowValue(1);

						@Getter @Setter private char[] ip08101CreErrDetInstAcpt = Field.fillLowValue(1);

						@Getter @Setter private char[] ip08101CreErrSumInstId = Field.fillLowValue(1);

						@Getter @Setter private char[] ip08101CreErrSumTrans = Field.fillLowValue(1);

						@Getter @Setter private char[] ip08101CreFinFileDet = Field.fillLowValue(1);

						@Getter @Setter private char[] ip08101CreFinFileTot = Field.fillLowValue(1);

						@Getter @Setter private char[] ip08101CreFinTransTot = Field.fillLowValue(1);

						@Getter @Setter private char[] ip08101CreFinRunTot = Field.fillLowValue(1);

						@Getter @Setter private char[] ip08101CreThreshSum = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip08101RptInds
	**/
    public Ip08101RptInds() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip08101RptInds. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip08101RptInds(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip08101RptInds
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp08101ThreshProcOpt(CONSTANTS.SPACE);
         setIp08101RunIndicator(CONSTANTS.SPACE);
         setIp08101RerunOption(CONSTANTS.SPACE);
         setIp08101LocationInd(CONSTANTS.SPACE);
         setIp08101CreErrDetCoRpt(CONSTANTS.SPACE);
         setIp08101CreErrDetIpRpt(CONSTANTS.SPACE);
         setIp08101CreErrDetInstId(CONSTANTS.SPACE);
         setIp08101CreErrDetInstAcpt(CONSTANTS.SPACE);
         setIp08101CreErrSumInstId(CONSTANTS.SPACE);
         setIp08101CreErrSumTrans(CONSTANTS.SPACE);
         setIp08101CreFinFileDet(CONSTANTS.SPACE);
         setIp08101CreFinFileTot(CONSTANTS.SPACE);
         setIp08101CreFinTransTot(CONSTANTS.SPACE);
         setIp08101CreFinRunTot(CONSTANTS.SPACE);
         setIp08101CreThreshSum(CONSTANTS.SPACE);
   }


}
  
