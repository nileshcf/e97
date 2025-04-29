package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip32101CbhfChkKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip32101CbhfChkKey extends Ip32101CbhfChkKeySerialized { 
   

						@Getter @Setter private char[] ip32101CbhfGftDasetNam = Field.fillLowValue(44);

								@Getter @Setter private long ip32101CbhfFileSeqNum;

						@Getter @Setter private char[] ip32101CbhfIndCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip32101CbhfChkKey
	**/
    public Ip32101CbhfChkKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip32101CbhfChkKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101CbhfChkKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip32101CbhfChkKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp32101CbhfGftDasetNam(CONSTANTS.SPACE_44);
                     setIp32101CbhfFileSeqNum(0);
         setIp32101CbhfIndCd(CONSTANTS.SPACE);
   }


}
  
