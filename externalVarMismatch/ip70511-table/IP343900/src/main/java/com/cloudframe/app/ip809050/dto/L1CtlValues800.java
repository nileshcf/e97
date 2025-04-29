package com.cloudframe.app.ip809050.dto;

/**
*  The class L1CtlValues800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class L1CtlValues800 extends L1CtlValues800Serialized {
   

						@Getter @Setter private char[] l1CtlAb800 = new char[3];

								@Getter @Setter private int l1CtlMti800;

								@Getter @Setter private int l1CtlFunc800;

						@Getter @Setter private char[] l1CtlSi800 = new char[1];

						@Getter @Setter private char[] l1CtlRi800 = new char[1];

								@Getter @Setter private int l1CtlProcess800;

								@Getter @Setter private int l1CtlMsgrc800;

						@Getter @Setter private char[] l1CtlExrc800 = new char[2];

						@Getter @Setter private char[] l1CtlMccgrp800 = new char[1];

						@Getter @Setter private char[] l1CtlPrdcode800 = new char[3];

								@Getter @Setter private int l1CtlBussl800;

								@Getter @Setter private long l1CtlBussi800;

						@Getter @Setter private char[] l1CtlIrd800 = new char[2];
	
	/**
	* Constructor for L1CtlValues800
	**/
    public L1CtlValues800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setL1CtlAb800(fillSpace(3));
								setL1CtlMti800(0);
								setL1CtlFunc800(0);
								setL1CtlSi800(fillSpace(1));
								setL1CtlRi800(fillSpace(1));
								setL1CtlProcess800(0);
								setL1CtlMsgrc800(0);
								setL1CtlExrc800(fillSpace(2));
								setL1CtlMccgrp800(fillSpace(1));
								setL1CtlPrdcode800(fillSpace(3));
								setL1CtlBussl800(0);
								setL1CtlBussi800(0L);
								setL1CtlIrd800(fillSpace(2));
    }





}
  
