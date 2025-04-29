package com.cloudframe.app.d5427dt1.dto;

/**
*  The class SrpSortRequestParameters is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SrpSortRequestParameters extends SrpSortRequestParametersSerialized {
   

						@Getter @Setter private char[] srpReturnCode = Field.fillLowValue(2);

								@Getter @Setter private int srpEntryCount;

								@Getter @Setter private int srpEntryLength;

								@Getter @Setter private int srpKeyStart;

								@Getter @Setter private int srpKeyLength;

						@Getter @Setter private char[] srpSequence = Field.fillLowValue(1);
	
	/**
	* Constructor for SrpSortRequestParameters
	**/
    public SrpSortRequestParameters() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
