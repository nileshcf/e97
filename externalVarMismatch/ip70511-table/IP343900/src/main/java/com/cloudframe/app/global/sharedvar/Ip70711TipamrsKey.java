package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70711TipamrsKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip70711TipamrsKey extends Ip70711TipamrsKeySerialized { 
   

						@Getter @Setter private char[] ip70711GftDasetNam = Field.fillLowValue(44);

								@Getter @Setter private int ip70711FileSeqNum;

						@Getter @Setter private char[] ip70711ServCd = Field.fillLowValue(4);

								@Getter @Setter private int ip70711TxnNum;
	
	/**
	* Constructor for Ip70711TipamrsKey
	**/
    public Ip70711TipamrsKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip70711TipamrsKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70711TipamrsKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip70711TipamrsKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp70711GftDasetNam(CONSTANTS.SPACE_44);
                     setIp70711FileSeqNum(0);
         setIp70711ServCd(CONSTANTS.SPACE_4);
                     setIp70711TxnNum(0);
   }


}
  
