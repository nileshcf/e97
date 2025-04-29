package com.cloudframe.app.sf305120.dto;

/**
*  The class RhInt16Group810 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class RhInt16Group810 extends RhInt16Group810Serialized {
   

								@Getter @Setter private short rhInt16810;
					@Getter @Setter private RhInt16810Redefined rhInt16810Redefined = new RhInt16810Redefined();
	
	/**
	* Constructor for RhInt16Group810
	**/
    public RhInt16Group810() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getRhInt16810Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setRhInt16810((short)0);
    }





}
  
