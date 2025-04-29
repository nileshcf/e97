package com.cloudframe.app.sf327010.dto;

/**
*  The class HdrLine1201 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HdrLine1201 extends HdrLine1201Serialized {
   







						@Getter @Setter private char[] runDate201 = new char[2];


						@Getter @Setter private char[] runMonth201 = new char[3];


						@Getter @Setter private char[] runYear201 = new char[4];

	
	/**
	* Constructor for HdrLine1201
	**/
    public HdrLine1201() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF327010-AA ").toCharArray()
             , getStartOffset() + 0
             ,12
             );
       replaceValue( // serialize and save the value
             fillSpace(35)
             , getStartOffset() + 12
             ,35
             );
       replaceValue( // serialize and save the value
             ("  MASTERCARD WORLDWIDE  ").toCharArray()
             , getStartOffset() + 47
             ,24
             );
       replaceValue( // serialize and save the value
             fillSpace(32)
             , getStartOffset() + 71
             ,32
             );
       replaceValue( // serialize and save the value
             ("RUN DATE:").toCharArray()
             , getStartOffset() + 103
             ,9
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 112
             ,1
             );
								setRunDate201(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 115
             ,1
             );
								setRunMonth201(fillSpace(3));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 119
             ,1
             );
								setRunYear201(fillSpace(4));
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 124
             ,10
             );
    }





}
  
