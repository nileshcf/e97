package com.cloudframe.app.refmod1.dto;

/**
*  The class AS1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AS1 extends AS1Serialized {
   

						@Getter @Setter private char[] aSFld11 = Field.fillLowValue(30);

						@Getter @Setter private char[] aSFld21 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS1
	**/
    public AS1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes AS1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld11(CONSTANTS.SPACE_30);
         setASFld21(CONSTANTS.SPACE_40);
   }


}
  
