package com.cloudframe.app.ar640010.dto;

/**
*  The class SeqioWorkArea200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class SeqioWorkArea200 extends SeqioWorkArea200Serialized {
   
				@Getter @Setter private SeqioVarRecord200 seqioVarRecord200 = new SeqioVarRecord200();
	
	/**
	* Constructor for SeqioWorkArea200
	**/
    public SeqioWorkArea200() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSeqioVarRecord200().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
