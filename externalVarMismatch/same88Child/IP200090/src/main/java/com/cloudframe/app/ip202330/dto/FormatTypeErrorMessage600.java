package com.cloudframe.app.ip202330.dto;

/**
*  The class FormatTypeErrorMessage600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FormatTypeErrorMessage600 extends FormatTypeErrorMessage600Serialized {
   
				@Getter @Setter private ErrorText600 errorText600 = new ErrorText600();
	
	/**
	* Constructor for FormatTypeErrorMessage600
	**/
    public FormatTypeErrorMessage600() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getErrorText600().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
