package com.cloudframe.app.sf305120.dto;

/**
*  The class X86Int16Group800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class X86Int16Group800 extends X86Int16Group800Serialized {
   

								@Getter @Setter private short x86Int16800;
					@Getter @Setter private X86Int16X800 x86Int16X800 = new X86Int16X800();
	
	/**
	* Constructor for X86Int16Group800
	**/
    public X86Int16Group800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getX86Int16X800().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setX86Int16800((short)0);
    }





}
  
