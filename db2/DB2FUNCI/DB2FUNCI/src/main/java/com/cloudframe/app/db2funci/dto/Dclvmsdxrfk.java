package com.cloudframe.app.db2funci.dto;

/**
*  The class Dclvmsdxrfk is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dclvmsdxrfk extends DclvmsdxrfkSerialized {
   

						@Getter @Setter private char[] crossReferenceCd = Field.fillLowValue(12);

						@Getter @Setter private char[] typeXrefCd = Field.fillLowValue(2);

						@Getter @Setter private char[] securityAdpNbr01 = Field.fillLowValue(7);
	
	/**
	* Constructor for Dclvmsdxrfk
	**/
    public Dclvmsdxrfk() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
