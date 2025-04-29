package com.cloudframe.app.gp004760.dto;

/**
*  The class NspkExtractRec800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class NspkExtractRec800 extends NspkExtractRec800Serialized {
   

								@Getter @Setter private int nspkCabCd800;

						@Getter @Setter private char[] nspkTcc800 = Field.fillLowValue(1);

	
	/**
	* Constructor for NspkExtractRec800
	**/
    public NspkExtractRec800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 5
             ,5
             );
    }





}
  
