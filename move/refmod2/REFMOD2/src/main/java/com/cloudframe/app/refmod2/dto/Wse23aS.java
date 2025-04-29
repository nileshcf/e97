package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse23aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse23aS extends Wse23aSSerialized {
   

						@Getter @Setter private char[] wse23aSFld1 = Field.fillLowValue(30);

						@Getter @Setter private char[] wse23aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse23aS
	**/
    public Wse23aS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes Wse23aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse23aSFld1(CONSTANTS.SPACE_30);
         setWse23aSFld2(CONSTANTS.SPACE_30);
   }


}
  
