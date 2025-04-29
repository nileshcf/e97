package com.cloudframe.app.ip989010.file.records;

/**
*  The class Sys204OutRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys204OutRec extends Sys204OutRecSerialized {
   

								@Getter @Setter private long sys204InRecCnt;

						@Getter @Setter private char[] sys204StatusCd = Field.fillLowValue(1);

								@Getter @Setter private long sys204OutRecCnt;
	
	/**
	* Constructor for Sys204OutRec
	**/
    public Sys204OutRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
