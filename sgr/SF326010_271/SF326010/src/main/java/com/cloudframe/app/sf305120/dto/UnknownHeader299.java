package com.cloudframe.app.sf305120.dto;

/**
*  The class UnknownHeader299 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class UnknownHeader299 extends UnknownHeader299Serialized {
   

						@Getter @Setter private char[] uuHeaderId299 = new char[2];

								@Getter @Setter private int uuVersion299;

								@Getter @Setter private long uuHdrLength299;

								@Getter @Setter private int uuTlvLength299;

						@Getter @Setter private char[] uuData299 = new char[999];
	
	/**
	* Constructor for UnknownHeader299
	**/
    public UnknownHeader299() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setUuHeaderId299(("??").toCharArray());
								setUuVersion299(1);
								setUuHdrLength299(0L);
								setUuTlvLength299(0);
								setUuData299(pad(999," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  
