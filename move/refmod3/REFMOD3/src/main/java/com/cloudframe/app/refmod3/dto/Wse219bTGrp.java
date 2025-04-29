package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse219bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse219bTGrp extends Wse219bTGrpSerialized {
   
				@Getter @Setter private Wse219bT wse219bT = new Wse219bT();
	
	/**
	* Constructor for Wse219bTGrp
	**/
    public Wse219bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse219bT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
