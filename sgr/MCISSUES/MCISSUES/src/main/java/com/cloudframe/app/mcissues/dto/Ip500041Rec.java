package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip500041Rec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip500041Rec extends Ip500041RecSerialized {
   

						@Getter @Setter private char[] ip500041TableId = Field.fillLowValue(11);
	
	/**
	* Constructor for Ip500041Rec
	**/
    public Ip500041Rec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes Ip500041Rec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp500041TableId(CONSTANTS.SPACE_11);
   }


}
  
