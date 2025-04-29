package com.cloudframe.app.vsammon4.dto;

/**
*  The class Sysid is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Sysid extends SysidSerialized {
   


								@Getter @Setter private int sysidNnn;
	
	/**
	* Constructor for Sysid
	**/
    public Sysid() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("S").toCharArray()
             , getStartOffset() + 0
             ,1
             );
    }





}
  
