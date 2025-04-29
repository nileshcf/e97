package com.cloudframe.app.mcrecur.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private short idx;

						@Getter @Setter private char[] ptrIp666030800 = new char[8];

						@Getter @Setter private char[] quicksort300 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPtrIp666030800(("IP666030").toCharArray());
								setQuicksort300(("IP666030").toCharArray());
    }





}
  
