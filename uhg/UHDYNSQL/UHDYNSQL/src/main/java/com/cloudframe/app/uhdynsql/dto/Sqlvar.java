package com.cloudframe.app.uhdynsql.dto;

/**
*  The class Sqlvar is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sqlvar extends SqlvarSerialized { 
   
				@Getter @Setter private Sqlvar1 sqlvar1 = new Sqlvar1();
				@Getter @Setter private Sqlvar2 sqlvar2 = new Sqlvar2();
	
	/**
	* Constructor for Sqlvar
	**/
    public Sqlvar() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sqlvar. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sqlvar(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSqlvar1().setParent(this,getStartOffset() + 0);
					getSqlvar2().setParent(this,getStartOffset() + 0);
    } 



}
  
