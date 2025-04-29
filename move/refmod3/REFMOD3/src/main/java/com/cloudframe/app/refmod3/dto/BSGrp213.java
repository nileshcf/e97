package com.cloudframe.app.refmod3.dto;

/**
*  The class BSGrp213 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class BSGrp213 extends BSGrp213Serialized {
   
				@Getter @Setter private BS213 bS213 = new BS213();
	
	/**
	* Constructor for BSGrp213
	**/
    public BSGrp213() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBS213().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }





}
  
