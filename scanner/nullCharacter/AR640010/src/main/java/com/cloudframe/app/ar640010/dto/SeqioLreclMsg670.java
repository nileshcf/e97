package com.cloudframe.app.ar640010.dto;

/**
*  The class SeqioLreclMsg670 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class SeqioLreclMsg670 extends SeqioLreclMsg670Serialized {
   


								@Getter @Setter private long seqioLreclValue670;
	
	/**
	* Constructor for SeqioLreclMsg670
	**/
    public SeqioLreclMsg670() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("7002-MCISEQIO-LRECL       : ").toCharArray()
             , getStartOffset() + 0
             ,28
             );
								setSeqioLreclValue670(0L);
    }





}
  
