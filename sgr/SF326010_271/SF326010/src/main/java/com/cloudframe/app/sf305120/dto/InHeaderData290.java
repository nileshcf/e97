package com.cloudframe.app.sf305120.dto;

/**
*  The class InHeaderData290 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class InHeaderData290 extends InHeaderData290Serialized {
   

						@Getter @Setter private char[] inHeaderId290 = new char[2];

								@Getter @Setter private int inVersion290;

								@Getter @Setter private long inHdrLength290;

								@Getter @Setter private int inTlvLength290;

						@Getter @Setter private char[] inServiceResults290 = new char[1006];
	
	/**
	* Constructor for InHeaderData290
	**/
    public InHeaderData290() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setInHeaderId290(("RE").toCharArray());
								setInVersion290(1);
								setInHdrLength290(0L);
								setInTlvLength290(0);
								setInServiceResults290("    000                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ".toCharArray());
    }





}
  
