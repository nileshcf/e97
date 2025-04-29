package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse20bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse20bTGrp extends Wse20bTGrpSerialized { 
   

						@Getter @Setter private char[] wseFiller039 = Field.fillLowValue(5);
				@Getter @Setter private Wse20bT wse20bT = new Wse20bT();
	
	/**
	* Constructor for Wse20bTGrp
	**/
    public Wse20bTGrp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse20bTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse20bTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getWse20bT().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes Wse20bTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller039(CONSTANTS.SPACE_5);
          getWse20bT().initialize();
     
   }


}
  
