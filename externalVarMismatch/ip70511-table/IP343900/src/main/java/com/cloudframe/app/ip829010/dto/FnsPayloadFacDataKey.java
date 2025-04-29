package com.cloudframe.app.ip829010.dto;

/**
*  The class FnsPayloadFacDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class FnsPayloadFacDataKey extends FnsPayloadFacDataKeySerialized { 
   

						@Getter @Setter private char[] fnsPayloadPrimaryAcctNbr = Field.fillLowValue(19);
				@Getter @Setter private FnsPayloadExpirationDate fnsPayloadExpirationDate = new FnsPayloadExpirationDate();
	
	/**
	* Constructor for FnsPayloadFacDataKey
	**/
    public FnsPayloadFacDataKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FnsPayloadFacDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPayloadFacDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getFnsPayloadExpirationDate().setParent(this,getStartOffset() + 19);
    } 

	/**
	 * 	initializes FnsPayloadFacDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFnsPayloadPrimaryAcctNbr(CONSTANTS.SPACE_19);
          getFnsPayloadExpirationDate().initialize();
     
   }


}
  
