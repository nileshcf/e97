package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse27aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse27aTGrp extends Wse27aTGrpSerialized {
   
				@Getter @Setter private Wse27aT wse27aT = new Wse27aT();
	
	/**
	* Constructor for Wse27aTGrp
	**/
    public Wse27aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse27aT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
