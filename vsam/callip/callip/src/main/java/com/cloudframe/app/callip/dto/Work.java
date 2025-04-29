package com.cloudframe.app.callip.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] ip66201001 = new char[8];

						@Getter @Setter private char[] ip65001001 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIp66201001(("IP662010").toCharArray());
								setIp65001001(("IP650010").toCharArray());
    }





}
  
