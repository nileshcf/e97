package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrp13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BTGrp13 extends BTGrp13Serialized { 
   

						@Getter @Setter private char[] fillerWs023 = Field.fillLowValue(5);
				@Getter @Setter private BT13 bT13 = new BT13();
	
	/**
	* Constructor for BTGrp13
	**/
    public BTGrp13() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BTGrp13. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp13(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getBT13().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes BTGrp13
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs023(CONSTANTS.SPACE_5);
          getBT13().initialize();
     
   }


}
  
