package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004MsgData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip40004MsgData extends Ip40004MsgDataSerialized { 
   

								@Getter @Setter private int ip40004MsgLen;

						@Getter @Setter private char[] ip40004MsgDetail = Field.fillLowValue(27383);
	
	/**
	* Constructor for Ip40004MsgData
	**/
    public Ip40004MsgData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip40004MsgData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004MsgData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip40004MsgData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp40004MsgLen(0);
         setIp40004MsgDetail(CONSTANTS.SPACE_27383);
   }


}
  
