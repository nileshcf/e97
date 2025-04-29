package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrp18 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BTGrp18 extends BTGrp18Serialized { 
   

						@Getter @Setter private char[] fillerWs035 = Field.fillLowValue(5);
				@Getter @Setter private BT18 bT18 = new BT18();
	
	/**
	* Constructor for BTGrp18
	**/
    public BTGrp18() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BTGrp18. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp18(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getBT18().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes BTGrp18
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs035(CONSTANTS.SPACE_5);
          getBT18().initialize();
     
   }


}
  
