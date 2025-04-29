package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503Bd32BulkDataTranLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf503Bd32BulkDataTranLog extends Sf503Bd32BulkDataTranLogSerialized { 
   
				@Getter @Setter private Sf503Bd32BulkId sf503Bd32BulkId = new Sf503Bd32BulkId();
	
	/**
	* Constructor for Sf503Bd32BulkDataTranLog
	**/
    public Sf503Bd32BulkDataTranLog() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf503Bd32BulkDataTranLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503Bd32BulkDataTranLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSf503Bd32BulkId().setParent(this,getStartOffset() + 1);
    } 



}
  
