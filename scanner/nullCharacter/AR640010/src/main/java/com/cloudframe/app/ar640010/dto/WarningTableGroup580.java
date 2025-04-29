package com.cloudframe.app.ar640010.dto;

/**
*  The class WarningTableGroup580 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WarningTableGroup580 extends WarningTableGroup580Serialized {
   

						@Getter @Setter private char[] warningTable580 = new char[648];
					@Getter @Setter private WarningTable580Redefined warningTable580Redefined = new WarningTable580Redefined();
	
	/**
	* Constructor for WarningTableGroup580
	**/
    public WarningTableGroup580() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWarningTable580Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setWarningTable580("0001TRANSFER STATUS FTSS ROW BULK FILE NAME REPETITION0020NO ELIGIBLE ENDPOINTS FOUND FOR BULK BROADCAST    0021SOME ENDPOINT(S) WILL NOT RECEIVE BULK BROADCAST  0022SOME ENDPOINT(S) DUPLICATED WITHIN BULK BROADCAST 0023BULK BROADCAST FOUND NO ENDPOINT FOR BULK ID/TYPE 0040NO ELIGIBLE ENDPOINTS FOUND FOR LIST BROADCAST    0041SOME ENDPOINT(S) COULD NOT RECEIVE LIST BROADCAST 0042SOME ENDPOINT(S) DUPLICATED WITHIN LIST BROADCAST 0043LIST BROADCAST ENDPOINT FILE CONTAINS NO DATA     0050NO ELIGIBLE INBOUND FILE FOUND READY TO RETRIEVE  0070SPECIFIED FILE DOES NOT NEED TO BE RESET          ....*** UNDOCUMENTED WARNING -- NOTIFY GFT SYSTEMS ***".toCharArray());
    }





}
  
