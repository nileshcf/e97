package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrp13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class ATGrp13 extends ATGrp13Serialized { 
   

						@Getter @Setter private char[] fillerWs021 = Field.fillLowValue(5);
				@Getter @Setter private AT13 aT13 = new AT13();
	
	/**
	* Constructor for ATGrp13
	**/
    public ATGrp13() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ATGrp13. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp13(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getAT13().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes ATGrp13
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs021(CONSTANTS.SPACE_5);
          getAT13().initialize();
     
   }


}
  
