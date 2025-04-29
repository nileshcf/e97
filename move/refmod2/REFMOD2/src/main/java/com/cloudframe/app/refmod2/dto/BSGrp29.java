package com.cloudframe.app.refmod2.dto;

/**
*  The class BSGrp29 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class BSGrp29 extends BSGrp29Serialized {
   
				@Getter @Setter private BS29 bS29 = new BS29();
	
	/**
	* Constructor for BSGrp29
	**/
    public BSGrp29() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBS29().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }





}
  
