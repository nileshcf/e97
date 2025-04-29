package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrp11 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BTGrp11 extends BTGrp11Serialized { 
   

						@Getter @Setter private char[] fillerWs017 = Field.fillLowValue(5);
				@Getter @Setter private BT11 bT11 = new BT11();
	
	/**
	* Constructor for BTGrp11
	**/
    public BTGrp11() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BTGrp11. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp11(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getBT11().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes BTGrp11
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs017(CONSTANTS.SPACE_5);
          getBT11().initialize();
     
   }


}
  
