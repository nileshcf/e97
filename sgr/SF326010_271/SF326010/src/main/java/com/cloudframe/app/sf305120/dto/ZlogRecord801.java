package com.cloudframe.app.sf305120.dto;

/**
*  The class ZlogRecord801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ZlogRecord801 extends ZlogRecord801Serialized {
   
				@Getter @Setter private FixedHeader801 fixedHeader801 = new FixedHeader801();

						@Getter @Setter private char[] zlogVariableData801 = new char[8157];
	
	/**
	* Constructor for ZlogRecord801
	**/
    public ZlogRecord801() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getFixedHeader801().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setZlogVariableData801(fillLowValue(8157));
    }





}
  
