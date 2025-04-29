package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse14bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse14bTGrp extends Wse14bTGrpSerialized { 
   

						@Getter @Setter private char[] wseFiller027 = Field.fillLowValue(5);
				@Getter @Setter private Wse14bT wse14bT = new Wse14bT();
	
	/**
	* Constructor for Wse14bTGrp
	**/
    public Wse14bTGrp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse14bTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse14bTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getWse14bT().setParent(this,getStartOffset() + 5);
    } 

	/**
	 * 	initializes Wse14bTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller027(CONSTANTS.SPACE_5);
          getWse14bT().initialize();
     
   }


}
  
