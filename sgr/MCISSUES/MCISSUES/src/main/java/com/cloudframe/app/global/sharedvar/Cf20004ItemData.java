package com.cloudframe.app.global.sharedvar;

/**
*  The class Cf20004ItemData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Cf20004ItemData extends Cf20004ItemDataSerialized { 
   

								@Getter @Setter private int cf20004ItemCount;

								@Getter @Setter private int cf20004SearchStringSt;

								@Getter @Setter private int cf20004ItemLength;

								@Getter @Setter private int cf20004SearchStringLt;

						@Getter @Setter private char[] cf20004ItemType = Field.fillLowValue(1);
	
	/**
	* Constructor for Cf20004ItemData
	**/
    public Cf20004ItemData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Cf20004ItemData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004ItemData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Cf20004ItemData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setCf20004ItemCount(0);
                     setCf20004ItemLength(0);
         setCf20004ItemType(CONSTANTS.SPACE);
   }


}
  
