package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse13aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse13aTGrp extends Wse13aTGrpSerialized { 
   

						@Getter @Setter private char[] wseFiller021 = Field.fillLowValue(5);
				@Getter @Setter private Wse13aT wse13aT = new Wse13aT();
	
	/**
	* Constructor for Wse13aTGrp
	**/
    public Wse13aTGrp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse13aTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse13aTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getWse13aT().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes Wse13aTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller021(CONSTANTS.SPACE_5);
          getWse13aT().initialize();
     
   }


}
  
