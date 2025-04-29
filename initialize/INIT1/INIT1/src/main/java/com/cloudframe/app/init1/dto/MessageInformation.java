package com.cloudframe.app.init1.dto;

/**
*  The class MessageInformation is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class MessageInformation extends MessageInformationSerialized { 
   

								@Getter @Setter private short messageInformationLen;

						@Getter @Setter private char[] messageInformationText = Field.fillLowValue(255);
	
	/**
	* Constructor for MessageInformation
	**/
    public MessageInformation() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MessageInformation. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MessageInformation(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMessageInformationLen((short)0);
    } 

	/**
	 * 	initializes MessageInformation
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setMessageInformationLen((short)0);
         setMessageInformationText(CONSTANTS.SPACE_255);
   }


}
  
