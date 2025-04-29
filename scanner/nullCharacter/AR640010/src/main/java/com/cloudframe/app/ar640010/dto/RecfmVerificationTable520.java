package com.cloudframe.app.ar640010.dto;

/**
*  The class RecfmVerificationTable520 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class RecfmVerificationTable520 extends RecfmVerificationTable520Serialized {
   

								@Getter @Setter private short recfmTblMax520;

						@Getter @Setter private char[] recfmArray520 = new char[25];
				@Getter @Setter private RecfmTable520 recfmTable520 = new RecfmTable520();
	
	/**
	* Constructor for RecfmVerificationTable520
	**/
    public RecfmVerificationTable520() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getRecfmTable520().setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
								setRecfmTblMax520((short)5);
								setRecfmArray520(("FBFB VBVB U U  FSFBSVSVBS").toCharArray());
    }





}
  
