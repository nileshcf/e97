package com.cloudframe.app.ms00d363.dto;

/**
*  The class Ms10frptHeaderRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ms10frptHeaderRec extends Ms10frptHeaderRecSerialized { 
   

						@Getter @Setter private char[] ms10frptHdrRecType = Field.fillLowValue(2);

								@Getter @Setter private long ms10frptHdrEndpt;

								@Getter @Setter private long ms10frptHdrEntIca;

								@Getter @Setter private long ms10frptHdrProc;

								@Getter @Setter private int ms10frptHdrHier;

						@Getter @Setter private char[] ms10frptHdrRptId = Field.fillLowValue(12);

								@Getter @Setter private long ms10frptHdrWrkofYmd;

								@Getter @Setter private int ms10frptHdrCutoffHhmm;

								@Getter @Setter private long ms10frptHdrLineSeqN0;

								@Getter @Setter private long ms10frptHdrProc2;

						@Getter @Setter private char[] ms10frptFill1 = new char[20];

								@Getter @Setter private long ms10frptHdrSysDte;

								@Getter @Setter private long ms10frptHdrSysTime;

						@Getter @Setter private char[] ms10frptFill2 = new char[14];

								@Getter @Setter private long ms10frptHdrMbrIca;

						@Getter @Setter private char[] ms10frptHdrEservFlag = Field.fillLowValue(1);

						@Getter @Setter private char[] ms10frptFill3 = new char[144];
	
	/**
	* Constructor for Ms10frptHeaderRec
	**/
    public Ms10frptHeaderRec() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ms10frptHeaderRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ms10frptHeaderRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMs10frptHdrEndpt(0L);
								setMs10frptHdrEntIca(0L);
								setMs10frptHdrProc(0L);
								setMs10frptHdrLineSeqN0(0L);
								setMs10frptHdrProc2(0L);
								setMs10frptFill1(fillSpace(20));
								setMs10frptFill2(fillSpace(14));
								setMs10frptHdrMbrIca(0L);
								setMs10frptFill3(pad(144," ".toCharArray(),' ',RIGHT_PAD));
    } 



}
  
