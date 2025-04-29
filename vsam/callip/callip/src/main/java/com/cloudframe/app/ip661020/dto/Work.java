package com.cloudframe.app.ip661020.dto;

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
   

						@Getter @Setter private char[] isInputFileOpen100 = new char[1];

						@Getter @Setter private char[] terminatingMessage600 = new char[30];

								@Getter @Setter private short abendCode900;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsInputFileOpen100(("N").toCharArray());
								setTerminatingMessage600(("IP661020 TERMINATED ABNORMALLY").toCharArray());
    }





}
  
