package com.cloudframe.app.d5427dt1.dto;

/**
*  The class DsmLogArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DsmLogArea extends DsmLogAreaSerialized { 
   
				@Getter @Setter private DsmSqlErrorMsgArea dsmSqlErrorMsgArea = new DsmSqlErrorMsgArea();
	
	/**
	* Constructor for DsmLogArea
	**/
    public DsmLogArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DsmLogArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmLogArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getDsmSqlErrorMsgArea().setParent(this,getStartOffset() + 0);
    } 



}
  
