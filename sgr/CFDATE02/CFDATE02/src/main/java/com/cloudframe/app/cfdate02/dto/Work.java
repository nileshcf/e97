package com.cloudframe.app.cfdate02.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private long bkupDtIso;

								@Getter @Setter private int integerOfDate;

						@Getter @Setter private char[] paygoSplanTableX = Field.fillLowValue(52);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setBkupDtIso(0L);
								setIntegerOfDate(0);
    }





}
  
