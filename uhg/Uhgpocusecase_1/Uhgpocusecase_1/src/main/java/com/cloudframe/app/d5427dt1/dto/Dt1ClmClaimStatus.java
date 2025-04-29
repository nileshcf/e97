package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Dt1ClmClaimStatus is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Dt1ClmClaimStatus extends Dt1ClmClaimStatusSerialized { 
   

						@Getter @Setter private char[] dt1ClmUnprocFlag = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ClmClosedFlag = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ClmPendedFlag = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ClmRejectedFlag = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ClmPaidFlag = Field.fillLowValue(1);
	
	/**
	* Constructor for Dt1ClmClaimStatus
	**/
    public Dt1ClmClaimStatus() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dt1ClmClaimStatus. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClmClaimStatus(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Dt1ClmClaimStatus
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setDt1ClmUnprocFlag(CONSTANTS.SPACE);
         setDt1ClmClosedFlag(CONSTANTS.SPACE);
         setDt1ClmPendedFlag(CONSTANTS.SPACE);
         setDt1ClmRejectedFlag(CONSTANTS.SPACE);
         setDt1ClmPaidFlag(CONSTANTS.SPACE);
   }


}
  
