package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse210bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse210bTGrp extends Wse210bTGrpSerialized {
   
				@Getter @Setter private Wse210bT wse210bT = new Wse210bT();
	
	/**
	* Constructor for Wse210bTGrp
	**/
    public Wse210bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse210bT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
