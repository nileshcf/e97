package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrp14 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class ATGrp14 extends ATGrp14Serialized { 
   

						@Getter @Setter private char[] fillerWs025 = Field.fillLowValue(5);
				@Getter @Setter private AT14 aT14 = new AT14();
	
	/**
	* Constructor for ATGrp14
	**/
    public ATGrp14() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ATGrp14. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp14(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getAT14().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes ATGrp14
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs025(CONSTANTS.SPACE_5);
          getAT14().initialize();
     
   }


}
  
