package com.cloudframe.app.global.sharedvar;

/**
*  The class FnsPldRdFacDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class FnsPldRdFacDataKey extends FnsPldRdFacDataKeySerialized { 
   

						@Getter @Setter private char[] fnsPldRdPrimaryAcctNbr = Field.fillLowValue(19);
				@Getter @Setter private FnsPldRdExpirationDate fnsPldRdExpirationDate = new FnsPldRdExpirationDate();
	
	/**
	* Constructor for FnsPldRdFacDataKey
	**/
    public FnsPldRdFacDataKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FnsPldRdFacDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPldRdFacDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getFnsPldRdExpirationDate().setParent(this,getStartOffset() + 19);
    } 

	/**
	 * 	initializes FnsPldRdFacDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFnsPldRdPrimaryAcctNbr(CONSTANTS.SPACE_19);
          getFnsPldRdExpirationDate().initialize();
     
   }


}
  
