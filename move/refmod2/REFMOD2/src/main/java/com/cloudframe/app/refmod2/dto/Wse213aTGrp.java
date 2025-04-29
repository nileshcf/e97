package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse213aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse213aTGrp extends Wse213aTGrpSerialized {
   
				@Getter @Setter private Wse213aT wse213aT = new Wse213aT();
	
	/**
	* Constructor for Wse213aTGrp
	**/
    public Wse213aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse213aT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
