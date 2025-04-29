package com.cloudframe.app.wm002.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private int callCount;

								@Getter @Setter private int loopCount;

						@Getter @Setter private char[] switchWs = new char[1];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCallCount(0);
								setSwitchWs(fillSpace(1));
    }





}
  
