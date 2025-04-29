package com.cloudframe.app.global.sharedvar;

/**
*  The class FnsPldRdFnsDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FnsPldRdFnsDataFields extends FnsPldRdFnsDataFieldsSerialized { 
   
				@Getter @Setter private FnsPldRdFacDataKey fnsPldRdFacDataKey = new FnsPldRdFacDataKey();
				@Getter @Setter private FnsPldRdFacData fnsPldRdFacData = new FnsPldRdFacData();
	
	/**
	* Constructor for FnsPldRdFnsDataFields
	**/
    public FnsPldRdFnsDataFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FnsPldRdFnsDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPldRdFnsDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getFnsPldRdFacDataKey().setParent(this,getStartOffset() + 0);
					getFnsPldRdFacData().setParent(this,getStartOffset() + 25);
    } 

	/**
	 * 	initializes FnsPldRdFnsDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getFnsPldRdFacDataKey().initialize();
     
          getFnsPldRdFacData().initialize();
     
   }


}
  
