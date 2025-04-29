package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse19aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse19aTGrp extends Wse19aTGrpSerialized { 
   

						@Getter @Setter private char[] wseFiller036 = Field.fillLowValue(5);
				@Getter @Setter private Wse19aT wse19aT = new Wse19aT();
	
	/**
	* Constructor for Wse19aTGrp
	**/
    public Wse19aTGrp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse19aTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse19aTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getWse19aT().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes Wse19aTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller036(CONSTANTS.SPACE_5);
          getWse19aT().initialize();
     
   }


}
  
