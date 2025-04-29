package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70701TipamrqKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip70701TipamrqKey extends Ip70701TipamrqKeySerialized { 
   

						@Getter @Setter private char[] ip70701GftDasetNam = Field.fillLowValue(44);

								@Getter @Setter private int ip70701FileSeqNum;

						@Getter @Setter private char[] ip70701ServCd = Field.fillLowValue(4);

								@Getter @Setter private int ip70701TxnNum;
	
	/**
	* Constructor for Ip70701TipamrqKey
	**/
    public Ip70701TipamrqKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip70701TipamrqKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70701TipamrqKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip70701TipamrqKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp70701GftDasetNam(CONSTANTS.SPACE_44);
                     setIp70701FileSeqNum(0);
         setIp70701ServCd(CONSTANTS.SPACE_4);
                     setIp70701TxnNum(0);
   }


}
  
