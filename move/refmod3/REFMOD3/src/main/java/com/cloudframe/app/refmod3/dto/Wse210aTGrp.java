package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse210aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse210aTGrp extends Wse210aTGrpSerialized {
   
				@Getter @Setter private Wse210aT wse210aT = new Wse210aT();
	
	/**
	* Constructor for Wse210aTGrp
	**/
    public Wse210aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse210aT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
