package com.cloudframe.app.ip662010.dto;

/**
*  The class PGroup400 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class PGroup400 extends PGroup400Serialized {
   

								@Getter @Setter private short p400;
					@Getter @Setter private P400Redefined p400Redefined = new P400Redefined();
	
	/**
	* Constructor for PGroup400
	**/
    public PGroup400() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getP400Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setP400((short)0);
    }





}
  
