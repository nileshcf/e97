package com.cloudframe.app.d5427dt1.dto;

/**
*  The class StsResponseVars is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class StsResponseVars extends StsResponseVarsSerialized { 
   

						@Getter @Setter private char[] stsRespMessageType = Field.fillLowValue(1);

						@Getter @Setter private char[] stsRespAdditionalInfo1 = Field.fillLowValue(100);

						@Getter @Setter private char[] stsRespAdditionalInfo2 = Field.fillLowValue(100);

						@Getter @Setter private char[] stsRespDataValue = Field.fillLowValue(30);

								@Getter @Setter private long stsCicsresp;

								@Getter @Setter private long stsCicsresp2;

								@Getter @Setter private long stsEibtaskn;

								@Getter @Setter private long stsSqlcode;

						@Getter @Setter private char[] stsSqlstate = Field.fillLowValue(5);

						@Getter @Setter private char[] stsParagraph = Field.fillLowValue(30);
	
	/**
	* Constructor for StsResponseVars
	**/
    public StsResponseVars() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for StsResponseVars. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsResponseVars(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes StsResponseVars
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setStsRespMessageType(CONSTANTS.SPACE);
         setStsRespAdditionalInfo1(CONSTANTS.SPACE_100);
         setStsRespAdditionalInfo2(CONSTANTS.SPACE_100);
         setStsRespDataValue(CONSTANTS.SPACE_30);
                     setStsCicsresp(0);
                     setStsCicsresp2(0);
                     setStsEibtaskn(0);
                     setStsSqlcode(0);
         setStsSqlstate(CONSTANTS.SPACE_5);
         setStsParagraph(CONSTANTS.SPACE_30);
   }


}
  
