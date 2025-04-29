package com.cloudframe.app.cfstring.dto;

/**
*  The class ExtBillCycleDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ExtBillCycleDt extends ExtBillCycleDtSerialized { 
   

						@Getter @Setter private char[] slash1 = new char[1];

						@Getter @Setter private char[] slash2 = new char[1];
	
	/**
	* Constructor for ExtBillCycleDt
	**/
    public ExtBillCycleDt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ExtBillCycleDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtBillCycleDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSlash1(("/").toCharArray());
								setSlash2(("/").toCharArray());
    } 



}
  
