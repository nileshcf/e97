package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip2ooo1ErrorIndex is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip2ooo1ErrorIndex extends Ip2ooo1ErrorIndexSerialized { 
   

								@Getter @Setter private int ip2ooo1ErrorMsgSevCd;

								@Getter @Setter private int ip2ooo1ErrorNumber;
	
	/**
	* Constructor for Ip2ooo1ErrorIndex
	**/
    public Ip2ooo1ErrorIndex() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip2ooo1ErrorIndex. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip2ooo1ErrorIndex(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip2ooo1ErrorIndex
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp2ooo1ErrorMsgSevCd(0);
                     setIp2ooo1ErrorNumber(0);
   }


}
  
