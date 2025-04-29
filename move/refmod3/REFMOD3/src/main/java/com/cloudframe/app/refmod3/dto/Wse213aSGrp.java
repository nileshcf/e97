package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse213aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse213aSGrp extends Wse213aSGrpSerialized {
   
				@Getter @Setter private Wse213aS wse213aS = new Wse213aS();
	
	/**
	* Constructor for Wse213aSGrp
	**/
    public Wse213aSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse213aS().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }





}
  
