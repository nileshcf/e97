package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse218aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse218aTGrp extends Wse218aTGrpSerialized {
   
				@Getter @Setter private Wse218aT wse218aT = new Wse218aT();
	
	/**
	* Constructor for Wse218aTGrp
	**/
    public Wse218aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse218aT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
