package com.cloudframe.app.d529351u.dto;

/**
*  The class D51uReturnArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class D51uReturnArea extends D51uReturnAreaSerialized { 
   
				@Getter @Setter private D51uNonArrayData d51uNonArrayData = new D51uNonArrayData();
				@Getter @Setter private D51uArrayData d51uArrayData = new D51uArrayData();
	
	/**
	* Constructor for D51uReturnArea
	**/
    public D51uReturnArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uReturnArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uReturnArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getD51uNonArrayData().setParent(this,getStartOffset() + 0);
					getD51uArrayData().setParent(this,getStartOffset() + 89);
    } 



}
  
