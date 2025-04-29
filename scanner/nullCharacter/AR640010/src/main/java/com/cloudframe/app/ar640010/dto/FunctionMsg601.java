package com.cloudframe.app.ar640010.dto;

/**
*  The class FunctionMsg601 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FunctionMsg601 extends FunctionMsg601Serialized {
   


						@Getter @Setter private char[] functionRequest601 = new char[1];


						@Getter @Setter private char[] functionDesc601 = new char[47];
	
	/**
	* Constructor for FunctionMsg601
	**/
    public FunctionMsg601() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0011-FUNCTION ID: ").toCharArray()
             , getStartOffset() + 0
             ,18
             );
								setFunctionRequest601(fillSpace(1));
       replaceValue( // serialize and save the value
             (" - ").toCharArray()
             , getStartOffset() + 19
             ,3
             );
								setFunctionDesc601(fillSpace(47));
    }





}
  
