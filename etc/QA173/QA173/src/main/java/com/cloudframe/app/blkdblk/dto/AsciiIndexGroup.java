package com.cloudframe.app.blkdblk.dto;

/**
*  The class AsciiIndexGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:44. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class AsciiIndexGroup extends AsciiIndexGroupSerialized {
   

								@Getter @Setter private short asciiIndex;
					@Getter @Setter private AsciiBytes asciiBytes = new AsciiBytes();
	
	/**
	* Constructor for AsciiIndexGroup
	**/
    public AsciiIndexGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAsciiBytes().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
