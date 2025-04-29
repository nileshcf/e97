package com.cloudframe.app.mcissues.dto;

/**
*  The class DtlRecord3800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class DtlRecord3800 extends DtlRecord3800Serialized {
   

						@Getter @Setter private char[] dtlCount800 = Field.fillLowValue(10);
	
	/**
	* Constructor for DtlRecord3800
	**/
    public DtlRecord3800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes DtlRecord3800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setDtlCount800(CONSTANTS.SPACE_10);
   }


}
  
