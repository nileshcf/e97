package com.cloudframe.app.ar640010.dto;

/**
*  The class ErrorMsg690 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ErrorMsg690 extends ErrorMsg690Serialized {
   
				@Getter @Setter private ErrorPrefix690 errorPrefix690 = new ErrorPrefix690();


								@Getter @Setter private long errorRequest690;

	
	/**
	* Constructor for ErrorMsg690
	**/
    public ErrorMsg690() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getErrorPrefix690().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
							getErrorPrefix690().setString(("9000-").toCharArray());
       replaceValue( // serialize and save the value
             ("REQUEST NBR: ").toCharArray()
             , getStartOffset() + 5
             ,13
             );
								setErrorRequest690(0L);
       replaceValue( // serialize and save the value
             (" ERROR ENCOUNTERED").toCharArray()
             , getStartOffset() + 27
             ,18
             );
    }





}
  
