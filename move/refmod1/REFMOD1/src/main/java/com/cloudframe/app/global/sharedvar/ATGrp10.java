package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrp10 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class ATGrp10 extends ATGrp10Serialized { 
   

						@Getter @Setter private char[] fillerWs013 = Field.fillLowValue(5);
				@Getter @Setter private AT10 aT10 = new AT10();
	
	/**
	* Constructor for ATGrp10
	**/
    public ATGrp10() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ATGrp10. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp10(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getAT10().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes ATGrp10
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs013(CONSTANTS.SPACE_5);
          getAT10().initialize();
     
   }


}
  
