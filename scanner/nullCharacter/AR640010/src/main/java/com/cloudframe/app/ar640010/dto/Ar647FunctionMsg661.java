package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar647FunctionMsg661 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ar647FunctionMsg661 extends Ar647FunctionMsg661Serialized {
   


								@Getter @Setter private long ar647FunctionReturn661;


								@Getter @Setter private long ar647FunctionReason661;


								@Getter @Setter private long ar647FunctionAbend661;

	
	/**
	* Constructor for Ar647FunctionMsg661
	**/
    public Ar647FunctionMsg661() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("6023-RETURN-CODE:  ").toCharArray()
             , getStartOffset() + 0
             ,19
             );
								setAr647FunctionReturn661(0L);
       replaceValue( // serialize and save the value
             (", REASON-CODE: ").toCharArray()
             , getStartOffset() + 28
             ,15
             );
								setAr647FunctionReason661(0L);
       replaceValue( // serialize and save the value
             (", ABEND-CODE: ").toCharArray()
             , getStartOffset() + 52
             ,14
             );
								setAr647FunctionAbend661(0L);
       replaceValue( // serialize and save the value
             (" - SEE \"9999-\" MESSAGE").toCharArray()
             , getStartOffset() + 75
             ,22
             );
    }





}
  
