package com.cloudframe.app.global.sharedvar;

/**
*  The class Cf20004TableKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Cf20004TableKey extends Cf20004TableKeySerialized { 
   
				@Getter @Setter private Cf20004TableId cf20004TableId = new Cf20004TableId();

						@Getter @Setter private char[] cf20004EffectiveDate = Field.fillLowValue(10);
	
	/**
	* Constructor for Cf20004TableKey
	**/
    public Cf20004TableKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Cf20004TableKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004TableKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCf20004TableId().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Cf20004TableKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getCf20004TableId().initialize();
     
         setCf20004EffectiveDate(CONSTANTS.SPACE_10);
   }


}
  
