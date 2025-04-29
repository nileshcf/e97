package com.cloudframe.app.sf305120.dto;

/**
*  The class Z9Int16Group800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Z9Int16Group800 extends Z9Int16Group800Serialized {
   

								@Getter @Setter private short z9Int16800;
					@Getter @Setter private Z9Int16X800 z9Int16X800 = new Z9Int16X800();
	
	/**
	* Constructor for Z9Int16Group800
	**/
    public Z9Int16Group800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getZ9Int16X800().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setZ9Int16800((short)0);
    }





}
  
