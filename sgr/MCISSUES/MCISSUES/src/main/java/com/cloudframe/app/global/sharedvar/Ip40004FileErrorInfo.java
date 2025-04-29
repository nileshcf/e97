package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004FileErrorInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip40004FileErrorInfo extends Ip40004FileErrorInfoSerialized { 
   

						@Getter @Setter private char[] ip40004ErrorMsgSevCdFil = Field.fillLowValue(2);

								@Getter @Setter private int ip40004ErrorNumberFil;

								@Getter @Setter private int ip40004ErrorMsgNumberFil;

						@Getter @Setter private char[] ip40004IpmFieldTypeFil = Field.fillLowValue(1);

								@Getter @Setter private long ip40004IpmFieldNumberFil;

								@Getter @Setter private long ip40004IpmSubfldNumberFil;
	
	/**
	* Constructor for Ip40004FileErrorInfo
	**/
    public Ip40004FileErrorInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip40004FileErrorInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004FileErrorInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip40004FileErrorInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp40004ErrorMsgSevCdFil(CONSTANTS.SPACE_2);
                     setIp40004ErrorNumberFil(0);
                     setIp40004ErrorMsgNumberFil(0);
         setIp40004IpmFieldTypeFil(CONSTANTS.SPACE);
                     setIp40004IpmFieldNumberFil(0);
                     setIp40004IpmSubfldNumberFil(0);
   }


}
  
