package com.cloudframe.app.ar640010.dto;

/**
*  The class IdentityMsg601 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class IdentityMsg601 extends IdentityMsg601Serialized {
   


								@Getter @Setter private long identityRequest601;

	
	/**
	* Constructor for IdentityMsg601
	**/
    public IdentityMsg601() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0010-REQUEST NBR: ").toCharArray()
             , getStartOffset() + 0
             ,18
             );
								setIdentityRequest601(0L);
       replaceValue( // serialize and save the value
             (" STARTED").toCharArray()
             , getStartOffset() + 27
             ,8
             );
    }





}
  
