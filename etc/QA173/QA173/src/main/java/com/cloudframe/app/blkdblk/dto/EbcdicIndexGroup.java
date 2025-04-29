package com.cloudframe.app.blkdblk.dto;

/**
*  The class EbcdicIndexGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:44. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class EbcdicIndexGroup extends EbcdicIndexGroupSerialized {
   

								@Getter @Setter private short ebcdicIndex;
					@Getter @Setter private EbcdicBytes ebcdicBytes = new EbcdicBytes();
	
	/**
	* Constructor for EbcdicIndexGroup
	**/
    public EbcdicIndexGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getEbcdicBytes().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
