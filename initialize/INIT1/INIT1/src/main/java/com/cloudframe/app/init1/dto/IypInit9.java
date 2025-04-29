package com.cloudframe.app.init1.dto;

/**
*  The class IypInit9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class IypInit9 extends IypInit9Serialized { 
   

								@Getter @Setter private int filler4;

								@Getter @Setter private int filler5;
				@Getter @Setter private IypPriorTbl9 iypPriorTbl9 = new IypPriorTbl9();
	
	/**
	* Constructor for IypInit9
	**/
    public IypInit9() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IypInit9. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypInit9(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIypPriorTbl9().setParent(this,getStartOffset() + 8);
    } 

	/**
	 * 	initializes IypInit9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIypPriorTbl9().initialize();
     
   }


}
  
