package com.cloudframe.app.sf305120.dto;

/**
*  The class ClogRecord801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ClogRecord801 extends ClogRecord801Serialized {
   
				@Getter @Setter private CFixedHeader801 cFixedHeader801 = new CFixedHeader801();

						@Getter @Setter private char[] clogVariableData801 = new char[8157];
	
	/**
	* Constructor for ClogRecord801
	**/
    public ClogRecord801() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCFixedHeader801().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setClogVariableData801(fillLowValue(8157));
    }





}
  
