package com.cloudframe.app.cpsc4.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] s0v3DtlRec = new char[2000];

						@Getter @Setter private char[] driftFlag = new char[1];

								@Getter @Setter private int driftDataCnt;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setS0v3DtlRec(pad(2000," ".toCharArray(),' ',RIGHT_PAD));
								setDriftFlag(("N").toCharArray());
								setDriftDataCnt(0);
    }





}
  
