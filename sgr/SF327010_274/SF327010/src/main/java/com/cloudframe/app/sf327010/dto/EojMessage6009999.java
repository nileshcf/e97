package com.cloudframe.app.sf327010.dto;

/**
*  The class EojMessage6009999 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class EojMessage6009999 extends EojMessage6009999Serialized {
   


								@Getter @Setter private int returnCode6009999;
	
	/**
	* Constructor for EojMessage6009999
	**/
    public EojMessage6009999() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" SF327010-9999 END OF STEP, CONDITION CODE = ").toCharArray()
             , getStartOffset() + 0
             ,45
             );
								setReturnCode6009999(0);
    }





}
  
