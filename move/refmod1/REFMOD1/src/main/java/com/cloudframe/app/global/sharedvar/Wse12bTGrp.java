package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse12bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse12bTGrp extends Wse12bTGrpSerialized { 
   

						@Getter @Setter private char[] wseFiller019 = Field.fillLowValue(5);
				@Getter @Setter private Wse12bT wse12bT = new Wse12bT();
	
	/**
	* Constructor for Wse12bTGrp
	**/
    public Wse12bTGrp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse12bTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse12bTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getWse12bT().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes Wse12bTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller019(CONSTANTS.SPACE_5);
          getWse12bT().initialize();
     
   }


}
  
