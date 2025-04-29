package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse213bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse213bSGrp extends Wse213bSGrpSerialized {
   
				@Getter @Setter private Wse213bS wse213bS = new Wse213bS();
	
	/**
	* Constructor for Wse213bSGrp
	**/
    public Wse213bSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse213bS().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }





}
  
