package com.cloudframe.app.ip989010.dto;

/**
*  The class PdsStrTag300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class PdsStrTag300 extends PdsStrTag300Serialized {
   


								@Getter @Setter private int pdsStrCd300;

	
	/**
	* Constructor for PdsStrTag300
	**/
    public PdsStrTag300() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("<pds code=\"").toCharArray()
             , getStartOffset() + 0
             ,11
             );
								setPdsStrCd300(0);
       replaceValue( // serialize and save the value
             ("\">").toCharArray()
             , getStartOffset() + 15
             ,2
             );
    }





}
  
