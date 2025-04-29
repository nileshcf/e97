package com.cloudframe.app.tmsmmcpy.dto;

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
   

								@Getter @Setter private int smmRecordsRead;

						@Getter @Setter private char[] endSw = new char[1];

						@Getter @Setter private char[] smmEofSw = new char[1];

						@Getter @Setter private char[] sortEofSw = new char[1];

								@Getter @Setter private long invalidSmmCnt;

								@Getter @Setter private long writeSmmCnt;

								@Getter @Setter private long smmDupCnt;

								@Getter @Setter private long depDupKey;

						@Getter @Setter private char[] smmKeyHold = new char[100];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSmmRecordsRead(0);
								setEndSw(fillLowValue(1));
								setSmmEofSw(("N").toCharArray());
								setSortEofSw(("N").toCharArray());
								setInvalidSmmCnt(0L);
								setWriteSmmCnt(0L);
								setSmmDupCnt(0L);
								setDepDupKey(0L);
								setSmmKeyHold(pad(100," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  
