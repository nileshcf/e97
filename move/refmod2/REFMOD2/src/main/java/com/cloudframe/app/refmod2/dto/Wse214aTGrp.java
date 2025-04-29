package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse214aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse214aTGrp extends Wse214aTGrpSerialized {
   
				@Getter @Setter private Wse214aT wse214aT = new Wse214aT();
	
	/**
	* Constructor for Wse214aTGrp
	**/
    public Wse214aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse214aT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
