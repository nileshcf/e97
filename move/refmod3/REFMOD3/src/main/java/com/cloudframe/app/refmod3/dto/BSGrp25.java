package com.cloudframe.app.refmod3.dto;

/**
*  The class BSGrp25 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class BSGrp25 extends BSGrp25Serialized {
   
				@Getter @Setter private BS25 bS25 = new BS25();
	
	/**
	* Constructor for BSGrp25
	**/
    public BSGrp25() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBS25().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }





}
  
