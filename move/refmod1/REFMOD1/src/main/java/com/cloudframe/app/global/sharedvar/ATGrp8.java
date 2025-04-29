package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrp8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class ATGrp8 extends ATGrp8Serialized { 
   

						@Getter @Setter private char[] fillerWs06 = Field.fillLowValue(5);
				@Getter @Setter private AT8 aT8 = new AT8();
	
	/**
	* Constructor for ATGrp8
	**/
    public ATGrp8() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ATGrp8. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp8(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getAT8().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes ATGrp8
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs06(CONSTANTS.SPACE_5);
          getAT8().initialize();
     
   }


}
  
