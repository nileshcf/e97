package com.cloudframe.app.init1.dto;

/**
*  The class BiypPrior is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class BiypPrior extends BiypPriorSerialized { 
   

						@Getter @Setter private char[] wsbiypDatesPrior = new char[20];

								@Getter @Setter private int wsbiypDiscntIdPrior;
	
	/**
	* Constructor for BiypPrior
	**/
    public BiypPrior() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BiypPrior. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BiypPrior(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWsbiypDatesPrior(fillSpace(20));
								setWsbiypDiscntIdPrior(0);
    } 



}
  
