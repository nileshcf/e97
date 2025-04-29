package com.cloudframe.app.sf311010.dto;

/**
*  The class WorkAcqIcaGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WorkAcqIcaGroup800 extends WorkAcqIcaGroup800Serialized {
   

								@Getter @Setter private long workAcqIca800;
					@Getter @Setter private WorkAcqIca800Redefined workAcqIca800Redefined = new WorkAcqIca800Redefined();
	
	/**
	* Constructor for WorkAcqIcaGroup800
	**/
    public WorkAcqIcaGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWorkAcqIca800Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
