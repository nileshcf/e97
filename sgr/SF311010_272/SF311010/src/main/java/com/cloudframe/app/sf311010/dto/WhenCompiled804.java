package com.cloudframe.app.sf311010.dto;

/**
*  The class WhenCompiled804 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WhenCompiled804 extends WhenCompiled804Serialized {
   

						@Getter @Setter private char[] compileDate804 = new char[8];

						@Getter @Setter private char[] compileTime804 = new char[8];

	
	/**
	* Constructor for WhenCompiled804
	**/
    public WhenCompiled804() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCompileDate804(fillSpace(8));
								setCompileTime804(fillSpace(8));
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 16
             ,8
             );
    }





}
  
