package com.cloudframe.app.sf311010.dto;

/**
*  The class WorkFwdIca800Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WorkFwdIca800Redefined extends WorkFwdIca800RedefinedSerialized { 
   
				@Getter @Setter private FwdIcaOnly5800 fwdIcaOnly5800 = new FwdIcaOnly5800();
	
	/**
	* Constructor for WorkFwdIca800Redefined
	**/
    public WorkFwdIca800Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WorkFwdIca800Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WorkFwdIca800Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getFwdIcaOnly5800().setParent(this,getStartOffset() + 1);
    } 



}
  
