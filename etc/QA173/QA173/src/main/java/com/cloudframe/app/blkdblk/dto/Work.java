package com.cloudframe.app.blkdblk.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:44. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] umodeBuffer = Field.fillLowValue(40000);

								@Getter @Setter private long umodePos;

								@Getter @Setter private long umodeLen;

								@Getter @Setter private long umodeCnt;

								@Getter @Setter private long vbsCnt;

								@Getter @Setter private long umodeMessageLen;

						@Getter @Setter private char[] umodeFileStatus = Field.fillLowValue(2);

						@Getter @Setter private char[] vbsFileStatus = Field.fillLowValue(2);

								@Getter @Setter private long ip66102IpmMsgLngth;

								@Getter @Setter private int i;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setI(0);
    }





}
  
