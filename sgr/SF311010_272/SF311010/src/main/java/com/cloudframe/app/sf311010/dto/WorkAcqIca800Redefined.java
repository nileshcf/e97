package com.cloudframe.app.sf311010.dto;

/**
*  The class WorkAcqIca800Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WorkAcqIca800Redefined extends WorkAcqIca800RedefinedSerialized { 
   
				@Getter @Setter private AcqIcaOnly5800 acqIcaOnly5800 = new AcqIcaOnly5800();
	
	/**
	* Constructor for WorkAcqIca800Redefined
	**/
    public WorkAcqIca800Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WorkAcqIca800Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WorkAcqIca800Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getAcqIcaOnly5800().setParent(this,getStartOffset() + 1);
    } 



}
  
