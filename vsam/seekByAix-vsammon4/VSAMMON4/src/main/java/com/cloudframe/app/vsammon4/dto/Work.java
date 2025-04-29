package com.cloudframe.app.vsammon4.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private long vskRecordSize;

						@Getter @Setter private char[] startKeytype = Field.fillLowValue(15);

								@Getter @Setter private short sub1;

								@Getter @Setter private long taskNo;

								@Getter @Setter private long reqSize;

								@Getter @Setter private int openFlags;

								@Getter @Setter private long primaryKeyDisp;

						@Getter @Setter private char[] vsamRecordDisp = Field.fillLowValue(221);

						@Getter @Setter private char[] vsvksdsFileStatus = Field.fillLowValue(2);

						@Getter @Setter private char[] eofSw = new char[1];

						@Getter @Setter private char[] charstr = new char[252];

						@Getter @Setter private char[] numstr = new char[200];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setVskRecordSize(0L);
								setEofSw(fillSpace(1));
								setCharstr("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*()-_=+/?\\.,/{}|ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*()-_=+/?\\.,/{}|ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*()-_=+/?\\.,/{}|".toCharArray());
								setNumstr("01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789".toCharArray());
    }





}
  
