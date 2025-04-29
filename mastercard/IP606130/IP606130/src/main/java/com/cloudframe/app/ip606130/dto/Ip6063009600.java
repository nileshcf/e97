package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip6063009600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ip6063009600 extends Ip6063009600Serialized {
   


						@Getter @Setter private char[] tabSubId6003009 = new char[3];

	
	/**
	* Constructor for Ip6063009600
	**/
    public Ip6063009600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" TABLE SUB ID ").toCharArray()
             , getStartOffset() + 0
             ,14
             );
								setTabSubId6003009(fillSpace(3));
       replaceValue( // serialize and save the value
             (" WAS NOT FOUND ON TABLE IP0000T1.  ").toCharArray()
             , getStartOffset() + 17
             ,35
             );
    }





}
  
