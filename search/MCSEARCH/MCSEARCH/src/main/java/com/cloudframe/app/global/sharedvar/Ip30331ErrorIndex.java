package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip30331ErrorIndex is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip30331ErrorIndex extends Ip30331ErrorIndexSerialized { 
   

								@Getter @Setter private int ip30331ErrorMsgSevCd;

								@Getter @Setter private int ip30331ErrorNumber;
	
	/**
	* Constructor for Ip30331ErrorIndex
	**/
    public Ip30331ErrorIndex() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip30331ErrorIndex. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip30331ErrorIndex(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip30331ErrorIndex
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp30331ErrorMsgSevCd(0);
                     setIp30331ErrorNumber(0);
   }


}
  
