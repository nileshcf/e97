package com.cloudframe.app.si994010.dto;

/**
*  The class ParsingPatternValues500Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;


@Data
public class ParsingPatternValues500Redefined extends ParsingPatternValues500RedefinedSerialized { 
   
      private List<char[]> parsingPattern500; 

	
	/**
	* Constructor for ParsingPatternValues500Redefined
	**/
    public ParsingPatternValues500Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ParsingPatternValues500Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ParsingPatternValues500Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
