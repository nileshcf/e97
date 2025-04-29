package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln6c is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HdPage1Ln6c extends HdPage1Ln6cSerialized {
   

						@Getter @Setter private char[] hd16cCc = new char[1];




						@Getter @Setter private char[] hd15SettIca = new char[6];

	
	/**
	* Constructor for HdPage1Ln6c
	**/
    public HdPage1Ln6c() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd16cCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("SETTLEMENT ICA     :").toCharArray()
             , getStartOffset() + 2
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 22
             ,1
             );
								setHd15SettIca(fillSpace(6));
       replaceValue( // serialize and save the value
             pad(104," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 29
             ,104
             );
    }





}
  
