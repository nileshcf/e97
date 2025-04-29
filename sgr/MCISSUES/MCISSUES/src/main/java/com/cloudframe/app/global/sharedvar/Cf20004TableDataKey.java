package com.cloudframe.app.global.sharedvar;

/**
*  The class Cf20004TableDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Cf20004TableDataKey extends Cf20004TableDataKeySerialized { 
   

						@Getter @Setter private char[] cf20004Ab = Field.fillLowValue(3);
				@Getter @Setter private Cf20004Bs cf20004Bs = new Cf20004Bs();

						@Getter @Setter private char[] cf20004BsR = Field.fillLowValue(7);
	
	/**
	* Constructor for Cf20004TableDataKey
	**/
    public Cf20004TableDataKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Cf20004TableDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004TableDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCf20004Bs().setParent(this,getStartOffset() + 3);
    } 

	/**
	 * 	initializes Cf20004TableDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCf20004Ab(CONSTANTS.SPACE_3);
          getCf20004Bs().initialize();
     
   }


}
  
