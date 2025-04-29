package com.cloudframe.app.sf305120.dto;

/**
*  The class Message0002600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Message0002600 extends Message0002600Serialized {
   

				@Getter @Setter private CompileDate600 compileDate600 = new CompileDate600();

				@Getter @Setter private CompileTime600 compileTime600 = new CompileTime600();

	
	/**
	* Constructor for Message0002600
	**/
    public Message0002600() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCompileDate600().setParent(this,getStartOffset() + 30);
					getCompileTime600().setParent(this,getStartOffset() + 49);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF305120-0002  COMPILE-DATE = ").toCharArray()
             , getStartOffset() + 0
             ,30
             );
       replaceValue( // serialize and save the value
             ("  TIME = ").toCharArray()
             , getStartOffset() + 40
             ,9
             );
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 57
             ,7
             );
    }





}
  
