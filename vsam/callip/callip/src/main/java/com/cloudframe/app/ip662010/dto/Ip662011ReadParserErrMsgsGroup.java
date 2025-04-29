package com.cloudframe.app.ip662010.dto;

/**
*  The class Ip662011ReadParserErrMsgsGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ip662011ReadParserErrMsgsGroup extends Ip662011ReadParserErrMsgsGroupSerialized {
   

						@Getter @Setter private char[] ip662011ReadParserErrMsgs = new char[600];
					@Getter @Setter private Ip662011ReadParserErrMsgsRedefined ip662011ReadParserErrMsgsRedefined = new Ip662011ReadParserErrMsgsRedefined();
	
	/**
	* Constructor for Ip662011ReadParserErrMsgsGroup
	**/
    public Ip662011ReadParserErrMsgsGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIp662011ReadParserErrMsgsRedefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setIp662011ReadParserErrMsgs(pad(600,"UNPARSEABLE MESSAGE.  BITMAP 2 (DE1) NOT FOUND.             UNPARSEABLE MESSAGE.  NON-NUMERIC PDS ID.                   UNPARSEABLE MESSAGE.  DUPLICATE PDS FOUND.                  UNPARSEABLE MESSAGE.  INVALID TAG TYPE.                     UNPARSEABLE MESSAGE.  NON-NUMERIC OR ZERO LENGTH.           UNPARSEABLE MESSAGE.  TOO MANY TAGS FOR TAG TABLE.          UNPARSEABLE MESSAGE.  NO PDS DEFINED WITH THIS NUMBER.      UNPARSEABLE MESSAGE.  NO \"\\\" AT END OF SUBFIELD.            UNPARSEABLE MESSAGE.  CARRIER LENGTH LESS THAN 8.           UNPARSEABLE MESSAGE.  PARSED LENGTH NOT EQUAL TO RDW.       ".toCharArray(),' ',RIGHT_PAD));
    }





}
  
