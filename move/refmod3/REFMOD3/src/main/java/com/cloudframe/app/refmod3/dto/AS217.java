package com.cloudframe.app.refmod3.dto;

/**
*  The class AS217 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AS217 extends AS217Serialized {
   

						@Getter @Setter private char[] aSFld1217 = Field.fillLowValue(30);

						@Getter @Setter private char[] aSFld2217 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS217
	**/
    public AS217() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes AS217
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld1217(CONSTANTS.SPACE_30);
         setASFld2217(CONSTANTS.SPACE_40);
   }


}
  
