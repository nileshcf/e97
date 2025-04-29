package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip32101RctChkKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip32101RctChkKey extends Ip32101RctChkKeySerialized { 
   

						@Getter @Setter private char[] ip32101RctGftDasetNam = Field.fillLowValue(44);

								@Getter @Setter private long ip32101RctSeqNum;
	
	/**
	* Constructor for Ip32101RctChkKey
	**/
    public Ip32101RctChkKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip32101RctChkKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101RctChkKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip32101RctChkKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp32101RctGftDasetNam(CONSTANTS.SPACE_44);
                     setIp32101RctSeqNum(0);
   }


}
  
