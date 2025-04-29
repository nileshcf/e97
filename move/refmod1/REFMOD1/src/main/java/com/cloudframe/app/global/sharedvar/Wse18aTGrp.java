package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse18aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse18aTGrp extends Wse18aTGrpSerialized { 
   

						@Getter @Setter private char[] wseFiller034 = Field.fillLowValue(5);
				@Getter @Setter private Wse18aT wse18aT = new Wse18aT();
	
	/**
	* Constructor for Wse18aTGrp
	**/
    public Wse18aTGrp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse18aTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse18aTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getWse18aT().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes Wse18aTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller034(CONSTANTS.SPACE_5);
          getWse18aT().initialize();
     
   }


}
  
