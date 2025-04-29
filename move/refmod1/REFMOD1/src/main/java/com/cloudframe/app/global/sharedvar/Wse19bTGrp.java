package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse19bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse19bTGrp extends Wse19bTGrpSerialized { 
   

						@Getter @Setter private char[] wseFiller037 = Field.fillLowValue(5);
				@Getter @Setter private Wse19bT wse19bT = new Wse19bT();
	
	/**
	* Constructor for Wse19bTGrp
	**/
    public Wse19bTGrp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse19bTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse19bTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getWse19bT().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes Wse19bTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller037(CONSTANTS.SPACE_5);
          getWse19bT().initialize();
     
   }


}
  
