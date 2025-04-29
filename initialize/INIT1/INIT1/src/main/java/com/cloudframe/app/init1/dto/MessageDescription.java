package com.cloudframe.app.init1.dto;

/**
*  The class MessageDescription is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class MessageDescription extends MessageDescriptionSerialized { 
   

								@Getter @Setter private short messageDescriptionLen;

						@Getter @Setter private char[] messageDescriptionText = Field.fillLowValue(255);
	
	/**
	* Constructor for MessageDescription
	**/
    public MessageDescription() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MessageDescription. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MessageDescription(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMessageDescriptionLen((short)0);
    } 

	/**
	 * 	initializes MessageDescription
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setMessageDescriptionLen((short)0);
         setMessageDescriptionText(CONSTANTS.SPACE_255);
   }


}
  
