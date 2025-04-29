package com.cloudframe.app.sf311010.dto;

/**
*  The class WorkCompTwoGroup808 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WorkCompTwoGroup808 extends WorkCompTwoGroup808Serialized {
   

								@Getter @Setter private int workCompTwo808;
					@Getter @Setter private WorkCompTwo808Redefined workCompTwo808Redefined = new WorkCompTwo808Redefined();
	
	/**
	* Constructor for WorkCompTwoGroup808
	**/
    public WorkCompTwoGroup808() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWorkCompTwo808Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
