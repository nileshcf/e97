package com.cloudframe.app.sf305120.dto;

/**
*  The class Z9Int32Group800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Z9Int32Group800 extends Z9Int32Group800Serialized {
   

								@Getter @Setter private int z9Int32800;
					@Getter @Setter private Z9Int32X800 z9Int32X800 = new Z9Int32X800();
	
	/**
	* Constructor for Z9Int32Group800
	**/
    public Z9Int32Group800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getZ9Int32X800().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setZ9Int32800(0);
    }





}
  
