package com.cloudframe.app.iovb32k.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private int inFileStatus;

								@Getter @Setter private int outFileStatus;

								@Getter @Setter private short inEofFlag;

								@Getter @Setter private short lreclMax;

								@Getter @Setter private int outRecLen;

								@Getter @Setter private int inRecLen;

								@Getter @Setter private short i;

								@Getter @Setter private short j;

								@Getter @Setter private short k;

								@Getter @Setter private short dataLenMin;

								@Getter @Setter private short dataLenMax;

								@Getter @Setter private short recInCtr;

								@Getter @Setter private short recOutCtr;

								@Getter @Setter private char[] displayNum1 = Field.fillLowValue(6);

								@Getter @Setter private char[] displayNum2 = Field.fillLowValue(6);

								@Getter @Setter private char[] displayNum3 = Field.fillLowValue(6);

						@Getter @Setter private char[] mode = Field.fillLowValue(1);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setInFileStatus(0);
								setOutFileStatus(0);
								setInEofFlag((short)0);
								setLreclMax((short)32750);
								setOutRecLen(0);
								setInRecLen(0);
								setI((short)0);
								setJ((short)0);
								setK((short)0);
								setDataLenMin((short)0);
								setDataLenMax((short)80);
								setRecInCtr((short)0);
								setRecOutCtr((short)0);
    }





}
  
