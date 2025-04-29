package com.cloudframe.app.sf311010.dto;

/**
*  The class WorkFwdIcaGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WorkFwdIcaGroup800 extends WorkFwdIcaGroup800Serialized {
   

								@Getter @Setter private long workFwdIca800;
					@Getter @Setter private WorkFwdIca800Redefined workFwdIca800Redefined = new WorkFwdIca800Redefined();
	
	/**
	* Constructor for WorkFwdIcaGroup800
	**/
    public WorkFwdIcaGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWorkFwdIca800Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
