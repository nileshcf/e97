package com.cloudframe.app.vsammon7.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private long i;

								@Getter @Setter private short j;

								@Getter @Setter private short q;

								@Getter @Setter private short r;

								@Getter @Setter private int rnCnt;

						@Getter @Setter private char[] eofSw = new char[1];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setI(0L);
								setEofSw(fillSpace(1));
    }





}
  
