package com.cloudframe.app.si994010.dto;

/**
*  The class IdxGroup400 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class IdxGroup400 extends IdxGroup400Serialized {
   

								@Getter @Setter private short idx400;
					@Getter @Setter private Idx400Redefined idx400Redefined = new Idx400Redefined();
	
	/**
	* Constructor for IdxGroup400
	**/
    public IdxGroup400() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIdx400Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setIdx400((short)0);
    }





}
  
