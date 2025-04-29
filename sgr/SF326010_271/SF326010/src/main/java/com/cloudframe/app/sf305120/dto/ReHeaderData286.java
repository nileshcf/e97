package com.cloudframe.app.sf305120.dto;

/**
*  The class ReHeaderData286 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ReHeaderData286 extends ReHeaderData286Serialized {
   

						@Getter @Setter private char[] reHeaderId286 = new char[2];

								@Getter @Setter private int reVersion286;

								@Getter @Setter private long reHdrLength286;

								@Getter @Setter private int reTlvLength286;

						@Getter @Setter private char[] reServiceResults286 = new char[1006];
	
	/**
	* Constructor for ReHeaderData286
	**/
    public ReHeaderData286() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setReHeaderId286(("RE").toCharArray());
								setReVersion286(1);
								setReHdrLength286(0L);
								setReTlvLength286(0);
								setReServiceResults286("    000                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ".toCharArray());
    }





}
  
