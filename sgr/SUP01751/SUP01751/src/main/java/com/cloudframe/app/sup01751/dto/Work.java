package com.cloudframe.app.sup01751.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private int rowCount;

						@Getter @Setter private char[] db2DateCurrBus = Field.fillLowValue(10);

						@Getter @Setter private char[] cdeTranStaInPrg = Field.fillLowValue(1);

						@Getter @Setter private char[] cdeTranTypDep = Field.fillLowValue(1);

						@Getter @Setter private char[] cdeStaPkgReady = Field.fillLowValue(1);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
