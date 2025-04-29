package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse14aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse14aTGrp extends Wse14aTGrpSerialized { 
   

						@Getter @Setter private char[] wseFiller025 = Field.fillLowValue(5);
				@Getter @Setter private Wse14aT wse14aT = new Wse14aT();
	
	/**
	* Constructor for Wse14aTGrp
	**/
    public Wse14aTGrp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse14aTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse14aTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getWse14aT().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes Wse14aTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller025(CONSTANTS.SPACE_5);
          getWse14aT().initialize();
     
   }


}
  
