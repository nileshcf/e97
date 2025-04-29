package com.cloudframe.app.ip305710.dto;

/**
*  The class AbendMessage900 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:46. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class AbendMessage900 extends AbendMessage900Serialized {
   



						@Getter @Setter private char[] abendCode900 = new char[4];


						@Getter @Setter private char[] abendText900 = new char[80];
	
	/**
	* Constructor for AbendMessage900
	**/
    public AbendMessage900() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP305710").toCharArray()
             , getStartOffset() + 0
             ,8
             );
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 8
             ,1
             );
								setAbendCode900(fillSpace(4));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 13
             ,1
             );
								setAbendText900(pad(80," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  
