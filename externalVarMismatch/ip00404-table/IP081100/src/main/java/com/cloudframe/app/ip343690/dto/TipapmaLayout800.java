package com.cloudframe.app.ip343690.dto;

/**
*  The class TipapmaLayout800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TipapmaLayout800 extends TipapmaLayout800Serialized {
   

						@Getter @Setter private char[] virtualAccountNbr800 = Field.fillLowValue(19);

						@Getter @Setter private char[] primAccountNbr800 = Field.fillLowValue(19);
	
	/**
	* Constructor for TipapmaLayout800
	**/
    public TipapmaLayout800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
