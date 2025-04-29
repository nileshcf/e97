package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar642FunctionMsg660 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ar642FunctionMsg660 extends Ar642FunctionMsg660Serialized {
   


								@Getter @Setter private long ar642FunctionReturn660;


								@Getter @Setter private long ar642FunctionReason660;


								@Getter @Setter private long ar642FunctionAbend660;
	
	/**
	* Constructor for Ar642FunctionMsg660
	**/
    public Ar642FunctionMsg660() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("6001-INTERNAL FUNCTION - RETURN-CODE: ").toCharArray()
             , getStartOffset() + 0
             ,38
             );
								setAr642FunctionReturn660(0L);
       replaceValue( // serialize and save the value
             (", REASON-CODE: ").toCharArray()
             , getStartOffset() + 47
             ,15
             );
								setAr642FunctionReason660(0L);
       replaceValue( // serialize and save the value
             (", ABEND-CODE: ").toCharArray()
             , getStartOffset() + 71
             ,14
             );
								setAr642FunctionAbend660(0L);
    }





}
  
