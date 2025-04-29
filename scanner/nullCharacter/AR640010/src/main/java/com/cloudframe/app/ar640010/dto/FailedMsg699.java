package com.cloudframe.app.ar640010.dto;

/**
*  The class FailedMsg699 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FailedMsg699 extends FailedMsg699Serialized {
   



								@Getter @Setter private long failedRequest699;


								@Getter @Setter private int failedTotal699;
	
	/**
	* Constructor for FailedMsg699
	**/
    public FailedMsg699() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("9999-").toCharArray()
             , getStartOffset() + 0
             ,5
             );
       replaceValue( // serialize and save the value
             ("REQUEST NBR: ").toCharArray()
             , getStartOffset() + 5
             ,13
             );
								setFailedRequest699(0L);
       replaceValue( // serialize and save the value
             (" FAILED - TOTAL ERRORS: ").toCharArray()
             , getStartOffset() + 27
             ,24
             );
								setFailedTotal699(0);
    }





}
  
