package com.cloudframe.app.ar640010.dto;

/**
*  The class DynamInfoIdent850 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DynamInfoIdent850 extends DynamInfoIdent850Serialized { 
   


						@Getter @Setter private char[] dynamInfoJclDd850 = new char[8];

	
	/**
	* Constructor for DynamInfoIdent850
	**/
    public DynamInfoIdent850() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DynamInfoIdent850. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DynamInfoIdent850(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("DD=").toCharArray()
             , getStartOffset() + 0
             ,3
             );
								setDynamInfoJclDd850(fillSpace(8));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 11
             ,1
             );
    } 



}
  
