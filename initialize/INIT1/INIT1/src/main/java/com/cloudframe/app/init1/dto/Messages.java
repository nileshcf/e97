package com.cloudframe.app.init1.dto;

/**
*  The class Messages is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Messages extends MessagesSerialized { 
   

						@Getter @Setter private char[] messageSeverity = Field.fillLowValue(1);
				@Getter @Setter private MessageCode messageCode = new MessageCode();
				@Getter @Setter private MessageInformation messageInformation = new MessageInformation();
				@Getter @Setter private MessageDescription messageDescription = new MessageDescription();
	
	/**
	* Constructor for Messages
	**/
    public Messages() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Messages. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Messages(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMessageCode().setParent(this,getStartOffset() + 1);
					getMessageInformation().setParent(this,getStartOffset() + 13);
					getMessageDescription().setParent(this,getStartOffset() + 270);
    } 

	/**
	 * 	initializes Messages
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setMessageSeverity(CONSTANTS.SPACE);
          getMessageCode().initialize();
     
          getMessageInformation().initialize();
     
          getMessageDescription().initialize();
     
   }


}
  
