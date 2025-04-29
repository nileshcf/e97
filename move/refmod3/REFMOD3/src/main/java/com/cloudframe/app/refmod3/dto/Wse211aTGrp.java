package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse211aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse211aTGrp extends Wse211aTGrpSerialized {
   
				@Getter @Setter private Wse211aT wse211aT = new Wse211aT();
	
	/**
	* Constructor for Wse211aTGrp
	**/
    public Wse211aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse211aT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
