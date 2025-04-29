package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse8bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse8bTGrp extends Wse8bTGrpSerialized { 
   

						@Getter @Setter private char[] wseFiller07 = Field.fillLowValue(5);
				@Getter @Setter private Wse8bT wse8bT = new Wse8bT();
	
	/**
	* Constructor for Wse8bTGrp
	**/
    public Wse8bTGrp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse8bTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse8bTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getWse8bT().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes Wse8bTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller07(CONSTANTS.SPACE_5);
          getWse8bT().initialize();
     
   }


}
  
