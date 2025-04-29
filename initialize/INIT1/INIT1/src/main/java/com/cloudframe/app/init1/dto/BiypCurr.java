package com.cloudframe.app.init1.dto;

/**
*  The class BiypCurr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class BiypCurr extends BiypCurrSerialized { 
   

						@Getter @Setter private char[] wsbiypDatesCurr = new char[20];

								@Getter @Setter private int wsbiypDiscntIdCurr;
	
	/**
	* Constructor for BiypCurr
	**/
    public BiypCurr() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BiypCurr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BiypCurr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWsbiypDatesCurr(fillSpace(20));
								setWsbiypDiscntIdCurr(0);
    } 



}
  
