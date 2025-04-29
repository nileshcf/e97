package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse220aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse220aTGrp extends Wse220aTGrpSerialized {
   
				@Getter @Setter private Wse220aT wse220aT = new Wse220aT();
	
	/**
	* Constructor for Wse220aTGrp
	**/
    public Wse220aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse220aT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
