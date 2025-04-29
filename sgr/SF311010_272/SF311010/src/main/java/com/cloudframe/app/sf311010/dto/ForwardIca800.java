package com.cloudframe.app.sf311010.dto;

/**
*  The class ForwardIca800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ForwardIca800 extends ForwardIca800Serialized {
   
				@Getter @Setter private ForwardIcaOnly5800 forwardIcaOnly5800 = new ForwardIcaOnly5800();

						@Getter @Setter private char[] fwdFiller2800 = Field.fillLowValue(1);
	
	/**
	* Constructor for ForwardIca800
	**/
    public ForwardIca800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getForwardIcaOnly5800().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
