package com.cloudframe.app.global.sharedvar;

/**
*  The class Cf20004Data is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Cf20004Data extends Cf20004DataSerialized { 
   
				@Getter @Setter private Cf20004TableDataKey cf20004TableDataKey = new Cf20004TableDataKey();
				@Getter @Setter private Cf20004ItemData cf20004ItemData = new Cf20004ItemData();

						@Getter @Setter private char[] cf20004Items = Field.fillLowValue(425);

								@Getter @Setter private int cf20004PtrToIp2000t2;
	
	/**
	* Constructor for Cf20004Data
	**/
    public Cf20004Data() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Cf20004Data. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004Data(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCf20004TableDataKey().setParent(this,getStartOffset() + 0);
					getCf20004ItemData().setParent(this,getStartOffset() + 10);
    } 

	/**
	 * 	initializes Cf20004Data
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getCf20004TableDataKey().initialize();
     
          getCf20004ItemData().initialize();
     
         setCf20004Items(CONSTANTS.SPACE_425);
                     setCf20004PtrToIp2000t2(0);
   }


}
  
