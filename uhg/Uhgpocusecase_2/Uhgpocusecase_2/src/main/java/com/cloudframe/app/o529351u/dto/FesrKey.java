package com.cloudframe.app.o529351u.dto;

/**
*  The class FesrKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FesrKey extends FesrKeySerialized {
   

								@Getter @Setter private int fesrSpiNbr;

						@Getter @Setter private char[] fesrToPs = Field.fillLowValue(2);

						@Getter @Setter private char[] fesrToSvc = Field.fillLowValue(6);

						@Getter @Setter private char[] fesrToCause = Field.fillLowValue(1);
	
	/**
	* Constructor for FesrKey
	**/
    public FesrKey() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
