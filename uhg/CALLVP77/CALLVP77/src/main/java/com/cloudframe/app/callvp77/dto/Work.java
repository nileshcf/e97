package com.cloudframe.app.callvp77.dto;

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
   

								@Getter @Setter private int inputStatus;

								@Getter @Setter private int outputStatus;

								@Getter @Setter private short eofFlag;

						@Getter @Setter private char[] vp776a0001 = new char[8];

								@Getter @Setter private int inSrtCnt;

								@Getter @Setter private int noItemsTobeSorted;

								@Getter @Setter private int j;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setVp776a0001(("VP776A00").toCharArray());
								setInSrtCnt(0);
								setNoItemsTobeSorted(0);
								setJ(0);
    }





}
  
