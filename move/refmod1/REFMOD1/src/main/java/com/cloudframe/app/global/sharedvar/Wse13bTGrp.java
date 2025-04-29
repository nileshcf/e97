package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse13bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse13bTGrp extends Wse13bTGrpSerialized { 
   

						@Getter @Setter private char[] wseFiller023 = Field.fillLowValue(5);
				@Getter @Setter private Wse13bT wse13bT = new Wse13bT();
	
	/**
	* Constructor for Wse13bTGrp
	**/
    public Wse13bTGrp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse13bTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse13bTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getWse13bT().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes Wse13bTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller023(CONSTANTS.SPACE_5);
          getWse13bT().initialize();
     
   }


}
  
