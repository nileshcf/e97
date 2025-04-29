package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse214bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse214bTGrp extends Wse214bTGrpSerialized {
   
				@Getter @Setter private Wse214bT wse214bT = new Wse214bT();
	
	/**
	* Constructor for Wse214bTGrp
	**/
    public Wse214bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse214bT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
