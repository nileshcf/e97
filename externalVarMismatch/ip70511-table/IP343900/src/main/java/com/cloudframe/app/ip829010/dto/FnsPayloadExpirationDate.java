package com.cloudframe.app.ip829010.dto;

/**
*  The class FnsPayloadExpirationDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class FnsPayloadExpirationDate extends FnsPayloadExpirationDateSerialized { 
   

						@Getter @Setter private char[] fnsPayloadExprMonth = Field.fillLowValue(2);
				@Getter @Setter private FnsPayloadExprYear fnsPayloadExprYear = new FnsPayloadExprYear();
	
	/**
	* Constructor for FnsPayloadExpirationDate
	**/
    public FnsPayloadExpirationDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FnsPayloadExpirationDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPayloadExpirationDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getFnsPayloadExprYear().setParent(this,getStartOffset() + 2);
    } 

	/**
	 * 	initializes FnsPayloadExpirationDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFnsPayloadExprMonth(CONSTANTS.SPACE_2);
          getFnsPayloadExprYear().initialize();
     
   }


}
  
