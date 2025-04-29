package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip6063008600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ip6063008600 extends Ip6063008600Serialized {
   


								@Getter @Setter private int maxEntries6003008;

	
	/**
	* Constructor for Ip6063008600
	**/
    public Ip6063008600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("TABLE IP0000T1 OVERFLOW. CONTAINS MORE THAN  ").toCharArray()
             , getStartOffset() + 0
             ,45
             );
								setMaxEntries6003008(0);
       replaceValue( // serialize and save the value
             (" ENTRIES.").toCharArray()
             , getStartOffset() + 49
             ,9
             );
    }





}
  
