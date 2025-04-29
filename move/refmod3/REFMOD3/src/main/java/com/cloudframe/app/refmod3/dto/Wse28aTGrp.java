package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse28aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse28aTGrp extends Wse28aTGrpSerialized {
   
				@Getter @Setter private Wse28aT wse28aT = new Wse28aT();
	
	/**
	* Constructor for Wse28aTGrp
	**/
    public Wse28aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse28aT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
