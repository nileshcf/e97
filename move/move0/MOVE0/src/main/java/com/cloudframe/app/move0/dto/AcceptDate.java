package com.cloudframe.app.move0.dto;

/**
*  The class AcceptDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class AcceptDate extends AcceptDateSerialized {
   

						@Getter @Setter private char[] yyyy01 = new char[4];

						@Getter @Setter private char[] mm01 = new char[2];

						@Getter @Setter private char[] dd01 = new char[2];
	
	/**
	* Constructor for AcceptDate
	**/
    public AcceptDate() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setYyyy01(("2018").toCharArray());
								setMm01(("11").toCharArray());
								setDd01(("28").toCharArray());
    }





}
  
