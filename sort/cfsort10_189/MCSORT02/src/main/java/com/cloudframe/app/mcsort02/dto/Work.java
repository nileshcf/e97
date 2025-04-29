package com.cloudframe.app.mcsort02.dto;

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
   

						@Getter @Setter private char[] sys002Status = Field.fillLowValue(2);

						@Getter @Setter private char[] sys004Status = Field.fillLowValue(2);

						@Getter @Setter private char[] sys005Status = Field.fillLowValue(2);

						@Getter @Setter private char[] sortOutStatus = Field.fillLowValue(2);

								@Getter @Setter private long ipmRdw410;

								@Getter @Setter private long sortOutRecLen;

								@Getter @Setter private long sortRdw;

						@Getter @Setter private char[] eofFlag = Field.fillLowValue(1);

						@Getter @Setter private char[] noRecords = Field.fillLowValue(1);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
