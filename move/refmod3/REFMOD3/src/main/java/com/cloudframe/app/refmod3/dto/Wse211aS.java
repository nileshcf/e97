package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse211aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse211aS extends Wse211aSSerialized {
   

						@Getter @Setter private char[] wse211aSFld1 = Field.fillLowValue(30);

						@Getter @Setter private char[] wse211aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse211aS
	**/
    public Wse211aS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes Wse211aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse211aSFld1(CONSTANTS.SPACE_30);
         setWse211aSFld2(CONSTANTS.SPACE_30);
   }


}
  
