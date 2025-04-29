package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse215bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse215bSGrp extends Wse215bSGrpSerialized {
   
				@Getter @Setter private Wse215bS wse215bS = new Wse215bS();
	
	/**
	* Constructor for Wse215bSGrp
	**/
    public Wse215bSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse215bS().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }





}
  
