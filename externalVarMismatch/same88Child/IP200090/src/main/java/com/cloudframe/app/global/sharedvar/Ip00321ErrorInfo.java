package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00321ErrorInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00321ErrorInfo extends Ip00321ErrorInfoSerialized { 
   

								@Getter @Setter private int ip00321ErrorMsgSevCd;

								@Getter @Setter private int ip00321ErrorNumber;

								@Getter @Setter private int ip00321ErrorMessageNumber;

						@Getter @Setter private char[] ip00321IpmFieldType = Field.fillLowValue(1);

								@Getter @Setter private long ip00321IpmFieldNumber;

								@Getter @Setter private long ip00321IpmSubfieldNumber;
	
	/**
	* Constructor for Ip00321ErrorInfo
	**/
    public Ip00321ErrorInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00321ErrorInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00321ErrorInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00321ErrorInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00321ErrorMsgSevCd(0);
                     setIp00321ErrorNumber(0);
                     setIp00321ErrorMessageNumber(0);
         setIp00321IpmFieldType(CONSTANTS.SPACE);
                     setIp00321IpmFieldNumber(0);
                     setIp00321IpmSubfieldNumber(0);
   }


}
  
