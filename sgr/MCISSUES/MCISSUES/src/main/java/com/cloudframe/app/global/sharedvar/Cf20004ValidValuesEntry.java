package com.cloudframe.app.global.sharedvar;

/**
*  The class Cf20004ValidValuesEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Cf20004ValidValuesEntry extends Cf20004ValidValuesEntrySerialized { 
   
				@Getter @Setter private Cf20004TableKey cf20004TableKey = new Cf20004TableKey();
				@Getter @Setter private Cf20004Data cf20004Data = new Cf20004Data();
	
	/**
	* Constructor for Cf20004ValidValuesEntry
	**/
    public Cf20004ValidValuesEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Cf20004ValidValuesEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004ValidValuesEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCf20004TableKey().setParent(this,getStartOffset() + 0);
					getCf20004Data().setParent(this,getStartOffset() + 18);
    } 

	/**
	 * 	initializes Cf20004ValidValuesEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getCf20004TableKey().initialize();
     
          getCf20004Data().initialize();
     
   }


}
  
