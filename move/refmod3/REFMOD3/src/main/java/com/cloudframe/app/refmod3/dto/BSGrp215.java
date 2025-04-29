package com.cloudframe.app.refmod3.dto;

/**
*  The class BSGrp215 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class BSGrp215 extends BSGrp215Serialized {
   
				@Getter @Setter private BS215 bS215 = new BS215();
	
	/**
	* Constructor for BSGrp215
	**/
    public BSGrp215() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBS215().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }





}
  
