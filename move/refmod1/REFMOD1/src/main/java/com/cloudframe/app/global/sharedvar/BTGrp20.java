package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrp20 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BTGrp20 extends BTGrp20Serialized { 
   

						@Getter @Setter private char[] fillerWs039 = Field.fillLowValue(5);
				@Getter @Setter private BT20 bT20 = new BT20();
	
	/**
	* Constructor for BTGrp20
	**/
    public BTGrp20() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BTGrp20. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp20(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getBT20().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes BTGrp20
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs039(CONSTANTS.SPACE_5);
          getBT20().initialize();
     
   }


}
  
