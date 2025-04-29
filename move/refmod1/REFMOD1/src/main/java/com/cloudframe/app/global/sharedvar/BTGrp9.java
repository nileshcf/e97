package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrp9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BTGrp9 extends BTGrp9Serialized { 
   

						@Getter @Setter private char[] fillerWs011 = Field.fillLowValue(5);
				@Getter @Setter private BT9 bT9 = new BT9();
	
	/**
	* Constructor for BTGrp9
	**/
    public BTGrp9() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BTGrp9. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp9(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getBT9().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes BTGrp9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs011(CONSTANTS.SPACE_5);
          getBT9().initialize();
     
   }


}
  
