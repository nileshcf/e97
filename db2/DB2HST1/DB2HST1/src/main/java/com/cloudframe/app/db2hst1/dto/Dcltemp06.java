package com.cloudframe.app.db2hst1.dto;

/**
*  The class Dcltemp06 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dcltemp06 extends Dcltemp06Serialized {
   

						@Getter @Setter private char[] hvEmpNo = Field.fillLowValue(4);

						@Getter @Setter private char[] hvEmpSal = Field.fillLowValue(5);
	
	/**
	* Constructor for Dcltemp06
	**/
    public Dcltemp06() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
