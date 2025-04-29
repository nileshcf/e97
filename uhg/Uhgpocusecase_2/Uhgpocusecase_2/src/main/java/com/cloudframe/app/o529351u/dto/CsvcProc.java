package com.cloudframe.app.o529351u.dto;

/**
*  The class CsvcProc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CsvcProc extends CsvcProcSerialized {
   

						@Getter @Setter private char[] csvcP1st5 = Field.fillLowValue(5);

						@Getter @Setter private char[] csvcPLst1 = Field.fillLowValue(1);

						@Getter @Setter private char[] csvcPLst1A = Field.fillLowValue(1);
	
	/**
	* Constructor for CsvcProc
	**/
    public CsvcProc() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
