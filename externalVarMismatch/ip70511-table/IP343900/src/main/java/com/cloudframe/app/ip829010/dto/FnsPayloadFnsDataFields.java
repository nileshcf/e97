package com.cloudframe.app.ip829010.dto;

/**
*  The class FnsPayloadFnsDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FnsPayloadFnsDataFields extends FnsPayloadFnsDataFieldsSerialized { 
   
				@Getter @Setter private FnsPayloadFacDataKey fnsPayloadFacDataKey = new FnsPayloadFacDataKey();
				@Getter @Setter private FnsPayloadFacData fnsPayloadFacData = new FnsPayloadFacData();
	
	/**
	* Constructor for FnsPayloadFnsDataFields
	**/
    public FnsPayloadFnsDataFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FnsPayloadFnsDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPayloadFnsDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getFnsPayloadFacDataKey().setParent(this,getStartOffset() + 0);
					getFnsPayloadFacData().setParent(this,getStartOffset() + 25);
    } 

	/**
	 * 	initializes FnsPayloadFnsDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getFnsPayloadFacDataKey().initialize();
     
          getFnsPayloadFacData().initialize();
     
   }


}
  
