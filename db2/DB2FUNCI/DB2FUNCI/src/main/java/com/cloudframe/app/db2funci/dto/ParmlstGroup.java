package com.cloudframe.app.db2funci.dto;

/**
*  The class ParmlstGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ParmlstGroup extends ParmlstGroupSerialized {
   
					@Getter @Setter private Parmlst parmlst = new Parmlst();
					@Getter @Setter private Parmbuf parmbuf = new Parmbuf();
	
	/**
	* Constructor for ParmlstGroup
	**/
    public ParmlstGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getParmlst().setParent(this,getStartOffset() + 0);
					getParmbuf().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
