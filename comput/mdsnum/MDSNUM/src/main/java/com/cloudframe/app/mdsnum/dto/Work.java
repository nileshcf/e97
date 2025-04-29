package com.cloudframe.app.mdsnum.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private int impDec;

								@Getter @Setter private long impAmt;

								@Getter @Setter private long impAmte;

								@Getter @Setter private long impAmtT4;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setImpDec(0);
								setImpAmt(0L);
								setImpAmte(0L);
								setImpAmtT4(0L);
    }





}
  
