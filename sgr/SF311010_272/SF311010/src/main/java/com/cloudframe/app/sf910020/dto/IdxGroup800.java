package com.cloudframe.app.sf910020.dto;

/**
*  The class IdxGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class IdxGroup800 extends IdxGroup800Serialized {
   

								@Getter @Setter private short idx800;
					@Getter @Setter private Idx800Redefined idx800Redefined = new Idx800Redefined();
	
	/**
	* Constructor for IdxGroup800
	**/
    public IdxGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIdx800Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setIdx800((short)0);
    }





}
  
