package com.cloudframe.app.ip200090.dto;

/**
*  The class SyntaxPgmTableGroup500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class SyntaxPgmTableGroup500 extends SyntaxPgmTableGroup500Serialized {
   
					@Getter @Setter private SyntaxPgmTable500 syntaxPgmTable500 = new SyntaxPgmTable500();
					@Getter @Setter private SyntaxPgmRedTable500 syntaxPgmRedTable500 = new SyntaxPgmRedTable500();
	
	/**
	* Constructor for SyntaxPgmTableGroup500
	**/
    public SyntaxPgmTableGroup500() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSyntaxPgmTable500().setParent(this,getStartOffset() + 0);
					getSyntaxPgmRedTable500().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
