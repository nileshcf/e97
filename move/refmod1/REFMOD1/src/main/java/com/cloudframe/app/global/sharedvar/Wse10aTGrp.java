package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse10aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse10aTGrp extends Wse10aTGrpSerialized { 
   

						@Getter @Setter private char[] wseFiller013 = Field.fillLowValue(5);
				@Getter @Setter private Wse10aT wse10aT = new Wse10aT();
	
	/**
	* Constructor for Wse10aTGrp
	**/
    public Wse10aTGrp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse10aTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse10aTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getWse10aT().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes Wse10aTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller013(CONSTANTS.SPACE_5);
          getWse10aT().initialize();
     
   }


}
  
