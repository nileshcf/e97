package com.cloudframe.app.sf327010.dto;

/**
*  The class CompileMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class CompileMsg600 extends CompileMsg600Serialized {
   

				@Getter @Setter private CompileDate600 compileDate600 = new CompileDate600();

				@Getter @Setter private CompileTime600 compileTime600 = new CompileTime600();

	
	/**
	* Constructor for CompileMsg600
	**/
    public CompileMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCompileDate600().setParent(this,getStartOffset() + 29);
					getCompileTime600().setParent(this,getStartOffset() + 47);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF327010-0001 COMPILE-DATE = ").toCharArray()
             , getStartOffset() + 0
             ,29
             );
       replaceValue( // serialize and save the value
             ("  TIME= ").toCharArray()
             , getStartOffset() + 39
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 55
             ,8
             );
    }





}
  
