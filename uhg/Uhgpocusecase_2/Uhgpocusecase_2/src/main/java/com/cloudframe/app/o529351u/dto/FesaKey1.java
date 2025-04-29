package com.cloudframe.app.o529351u.dto;

/**
*  The class FesaKey1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FesaKey1 extends FesaKey1Serialized {
   

						@Getter @Setter private char[] fesaPolicy1 = Field.fillLowValue(6);

								@Getter @Setter private int fesaPlanVar1;

								@Getter @Setter private int fesaEffDate1;

								@Getter @Setter private int fesaSpiNbr1;
	
	/**
	* Constructor for FesaKey1
	**/
    public FesaKey1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
