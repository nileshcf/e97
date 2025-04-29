package com.cloudframe.app.ar640010.dto;

/**
*  The class SqlRetryIntervalGroup350 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SqlRetryIntervalGroup350 extends SqlRetryIntervalGroup350Serialized { 
   

								@Getter @Setter private long sqlRetryInterval350;
	
	/**
	* Constructor for SqlRetryIntervalGroup350
	**/
    public SqlRetryIntervalGroup350() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SqlRetryIntervalGroup350. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqlRetryIntervalGroup350(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSqlRetryInterval350(100L);
    } 



}
  
