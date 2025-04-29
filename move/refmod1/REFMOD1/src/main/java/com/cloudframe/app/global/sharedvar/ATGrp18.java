package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrp18 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class ATGrp18 extends ATGrp18Serialized { 
   

						@Getter @Setter private char[] fillerWs034 = Field.fillLowValue(5);
				@Getter @Setter private AT18 aT18 = new AT18();
	
	/**
	* Constructor for ATGrp18
	**/
    public ATGrp18() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ATGrp18. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp18(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getAT18().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes ATGrp18
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs034(CONSTANTS.SPACE_5);
          getAT18().initialize();
     
   }


}
  
