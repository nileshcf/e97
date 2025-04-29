package com.cloudframe.app.mcissues.dto;

/**
*  The class InputVars800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class InputVars800 extends InputVars800Serialized {
   

								@Getter @Setter private long inputTableId800;

						@Getter @Setter private char[] inputSegId800 = Field.fillLowValue(4);
	
	/**
	* Constructor for InputVars800
	**/
    public InputVars800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes InputVars800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setInputTableId800(0);
         setInputSegId800(CONSTANTS.SPACE_4);
   }


}
  
