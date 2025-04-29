package com.cloudframe.app.cfstring.dto;

/**
*  The class ExtCustAcctNo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ExtCustAcctNo extends ExtCustAcctNoSerialized { 
   

								@Getter @Setter private long extCustIdNo;

								@Getter @Setter private long extAcctNo;
	
	/**
	* Constructor for ExtCustAcctNo
	**/
    public ExtCustAcctNo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ExtCustAcctNo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtCustAcctNo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setExtCustIdNo(8762L);
								setExtAcctNo(2345L);
    } 



}
  
