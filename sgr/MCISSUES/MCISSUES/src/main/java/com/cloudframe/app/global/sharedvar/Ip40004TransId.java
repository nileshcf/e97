package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004TransId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip40004TransId extends Ip40004TransIdSerialized { 
   

						@Getter @Setter private char[] ip40004TransType = Field.fillLowValue(3);

								@Getter @Setter private long ip40004TransRefDate;

						@Getter @Setter private char[] ip40004TransProcessorId = Field.fillLowValue(11);

								@Getter @Setter private long ip40004TransSeqNum;
	
	/**
	* Constructor for Ip40004TransId
	**/
    public Ip40004TransId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip40004TransId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004TransId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip40004TransId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp40004TransType(CONSTANTS.SPACE_3);
                     setIp40004TransRefDate(0);
         setIp40004TransProcessorId(CONSTANTS.SPACE_11);
                     setIp40004TransSeqNum(0);
   }


}
  
