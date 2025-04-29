package com.cloudframe.app.sf326010.dto;

/**
*  The class CompileInfoMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class CompileInfoMsg600 extends CompileInfoMsg600Serialized {
   

				@Getter @Setter private CompileDate600 compileDate600 = new CompileDate600();

				@Getter @Setter private CompileTime600 compileTime600 = new CompileTime600();

	
	/**
	* Constructor for CompileInfoMsg600
	**/
    public CompileInfoMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCompileDate600().setParent(this,getStartOffset() + 30);
					getCompileTime600().setParent(this,getStartOffset() + 48);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF326010-0002  COMPILE DATE = ").toCharArray()
             , getStartOffset() + 0
             ,30
             );
       replaceValue( // serialize and save the value
             ("  TIME= ").toCharArray()
             , getStartOffset() + 40
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 56
             ,8
             );
    }





}
  
