package com.cloudframe.app.ar640010.dto;

/**
*  The class SeqioReturnMsg670 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class SeqioReturnMsg670 extends SeqioReturnMsg670Serialized {
   


								@Getter @Setter private char[] seqioReturnCode670 = new char[4];
							


							@Getter @Setter private char[] seqioReturnMsg670ConditionGroup3 = new char[23];
						
	
	/**
	* Constructor for SeqioReturnMsg670
	**/
    public SeqioReturnMsg670() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("7001-MCISEQIO-RETURN-CODE : ").toCharArray()
             , getStartOffset() + 0
             ,28
             );
								setSeqioReturnCode670(fillSpace(4));
       replaceValue( // serialize and save the value
             (", CONDITION INDICATED : ").toCharArray()
             , getStartOffset() + 32
             ,24
             );
       replaceValue( // serialize and save the value
             fillSpace(23)
             , getStartOffset() + 56
             ,23
             );
    }





}
  
