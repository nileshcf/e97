package com.cloudframe.app.ms00d363.dto;

/**
*  The class Ms10frptDetDelvKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ms10frptDetDelvKey extends Ms10frptDetDelvKeySerialized { 
   

						@Getter @Setter private char[] ms10frptDkeyRecType = Field.fillLowValue(2);

								@Getter @Setter private long ms10frptDkeyEndpt;

								@Getter @Setter private long ms10frptDkeyEntIca;

								@Getter @Setter private long ms10frptDkeyProc;

								@Getter @Setter private int ms10frptDkeyHier;

						@Getter @Setter private char[] ms10frptDkeyRptId = Field.fillLowValue(12);

								@Getter @Setter private long ms10frptDkeyWrkofYmd;

								@Getter @Setter private int ms10frptDkeyCutoffHhmm;

								@Getter @Setter private long ms10frptDkeyLnSeqno;

						@Getter @Setter private char[] ms10frptInhProcFlag = Field.fillLowValue(1);
	
	/**
	* Constructor for Ms10frptDetDelvKey
	**/
    public Ms10frptDetDelvKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ms10frptDetDelvKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ms10frptDetDelvKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
