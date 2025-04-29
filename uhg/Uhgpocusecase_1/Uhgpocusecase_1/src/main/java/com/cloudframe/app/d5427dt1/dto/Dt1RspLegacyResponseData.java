package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Dt1RspLegacyResponseData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Dt1RspLegacyResponseData extends Dt1RspLegacyResponseDataSerialized { 
   

								@Getter @Setter private int dt1RspReturnCode;

								@Getter @Setter private int dt1RspExplanationCode;

								@Getter @Setter private int dt1RspRespCode;

								@Getter @Setter private long dt1RspSqlCode;

						@Getter @Setter private char[] dt1RspErrSection = Field.fillLowValue(8);
	
	/**
	* Constructor for Dt1RspLegacyResponseData
	**/
    public Dt1RspLegacyResponseData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dt1RspLegacyResponseData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1RspLegacyResponseData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Dt1RspLegacyResponseData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setDt1RspReturnCode(0);
                     setDt1RspExplanationCode(0);
                     setDt1RspRespCode(0);
                     setDt1RspSqlCode(0);
         setDt1RspErrSection(CONSTANTS.SPACE_8);
   }


}
  
