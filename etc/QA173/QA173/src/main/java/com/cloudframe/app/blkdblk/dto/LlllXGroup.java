package com.cloudframe.app.blkdblk.dto;

/**
*  The class LlllXGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:44. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class LlllXGroup extends LlllXGroupSerialized {
   

						@Getter @Setter private char[] llllX = Field.fillLowValue(4);

								@Getter @Setter private long llll;
	
	/**
	* Constructor for LlllXGroup
	**/
    public LlllXGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
