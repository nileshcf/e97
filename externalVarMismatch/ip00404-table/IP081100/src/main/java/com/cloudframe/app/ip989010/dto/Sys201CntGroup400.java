package com.cloudframe.app.ip989010.dto;

/**
*  The class Sys201CntGroup400 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys201CntGroup400 extends Sys201CntGroup400Serialized {
   

								@Getter @Setter private long sys201Cnt400;

						@Getter @Setter private char[] sys201CntX400 = Field.fillLowValue(8);
	
	/**
	* Constructor for Sys201CntGroup400
	**/
    public Sys201CntGroup400() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSys201Cnt400(0L);
    }





}
  
