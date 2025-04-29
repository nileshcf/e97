package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse217aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse217aTGrp extends Wse217aTGrpSerialized {
   
				@Getter @Setter private Wse217aT wse217aT = new Wse217aT();
	
	/**
	* Constructor for Wse217aTGrp
	**/
    public Wse217aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse217aT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
