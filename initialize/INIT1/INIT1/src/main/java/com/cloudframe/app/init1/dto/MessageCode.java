package com.cloudframe.app.init1.dto;

/**
*  The class MessageCode is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class MessageCode extends MessageCodeSerialized { 
   

								@Getter @Setter private short messageCodeLen;

						@Getter @Setter private char[] messageCodeText = Field.fillLowValue(10);
	
	/**
	* Constructor for MessageCode
	**/
    public MessageCode() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MessageCode. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MessageCode(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMessageCodeLen((short)0);
    } 

	/**
	 * 	initializes MessageCode
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setMessageCodeLen((short)0);
         setMessageCodeText(CONSTANTS.SPACE_10);
   }


}
  
