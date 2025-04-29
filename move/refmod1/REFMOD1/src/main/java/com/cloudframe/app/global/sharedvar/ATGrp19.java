package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrp19 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class ATGrp19 extends ATGrp19Serialized { 
   

						@Getter @Setter private char[] fillerWs036 = Field.fillLowValue(5);
				@Getter @Setter private AT19 aT19 = new AT19();
	
	/**
	* Constructor for ATGrp19
	**/
    public ATGrp19() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ATGrp19. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp19(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getAT19().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes ATGrp19
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs036(CONSTANTS.SPACE_5);
          getAT19().initialize();
     
   }


}
  
