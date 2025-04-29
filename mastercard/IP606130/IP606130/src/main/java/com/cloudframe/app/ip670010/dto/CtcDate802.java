package com.cloudframe.app.ip670010.dto;

/**
*  The class CtcDate802 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class CtcDate802 extends CtcDate802Serialized {
   

								@Getter @Setter private int ctcCcyy802;
				@Getter @Setter private CtcCcyy802Redefined ctcCcyy802Redefined = new CtcCcyy802Redefined();
				@Getter @Setter private CtcMmdd802 ctcMmdd802 = new CtcMmdd802();
				@Getter @Setter private CtcJddd802 ctcJddd802 = new CtcJddd802();
	
	/**
	* Constructor for CtcDate802
	**/
    public CtcDate802() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCtcCcyy802Redefined().setParent(this,getStartOffset() + 0);
					getCtcMmdd802().setParent(this,getStartOffset() + 4);
					getCtcJddd802().setParent(this,getStartOffset() + 4);
	   	/*  end of offset */
    }





}
  
