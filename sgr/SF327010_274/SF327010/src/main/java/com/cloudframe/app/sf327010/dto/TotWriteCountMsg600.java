package com.cloudframe.app.sf327010.dto;

/**
*  The class TotWriteCountMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TotWriteCountMsg600 extends TotWriteCountMsg600Serialized {
   


								@Getter @Setter private char[] writeCount600 = Field.fillLowValue(14);
	
	/**
	* Constructor for TotWriteCountMsg600
	**/
    public TotWriteCountMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" SF327010- TOTAL NUMBER OF RECORDS WRITTEN         = ").toCharArray()
             , getStartOffset() + 0
             ,53
             );
    }





}
  
