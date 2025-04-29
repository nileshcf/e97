package com.cloudframe.app.sf326010.dto;

/**
*  The class ZlogRecord801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ZlogRecord801 extends ZlogRecord801Serialized { 
   
				@Getter @Setter private FixedHeader801 fixedHeader801 = new FixedHeader801();
	
	/**
	* Constructor for ZlogRecord801
	**/
    public ZlogRecord801() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ZlogRecord801. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ZlogRecord801(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getFixedHeader801().setParent(this,getStartOffset() + 0);
    } 



}
  
