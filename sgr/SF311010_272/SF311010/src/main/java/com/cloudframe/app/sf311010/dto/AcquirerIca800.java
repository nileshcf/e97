package com.cloudframe.app.sf311010.dto;

/**
*  The class AcquirerIca800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AcquirerIca800 extends AcquirerIca800Serialized {
   
				@Getter @Setter private AcquirerIcaOnly5800 acquirerIcaOnly5800 = new AcquirerIcaOnly5800();

						@Getter @Setter private char[] acqFiller2800 = Field.fillLowValue(1);
	
	/**
	* Constructor for AcquirerIca800
	**/
    public AcquirerIca800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAcquirerIcaOnly5800().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
