package com.cloudframe.app.init1.dto;

/**
*  The class Rl001CycleInputData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Rl001CycleInputData extends Rl001CycleInputDataSerialized {
   
				@Getter @Setter private Rl001DtlRecord rl001DtlRecord = new Rl001DtlRecord();

						@Getter @Setter private char[] rl001HdrRecord = Field.fillLowValue(700);

						@Getter @Setter private char[] rl001TlrRecord = Field.fillLowValue(700);
	
	/**
	* Constructor for Rl001CycleInputData
	**/
    public Rl001CycleInputData() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getRl001DtlRecord().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
