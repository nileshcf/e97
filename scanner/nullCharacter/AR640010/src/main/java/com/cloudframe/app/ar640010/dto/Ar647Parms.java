package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar647Parms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ar647Parms extends Ar647ParmsSerialized {
   

						@Getter @Setter private char[] ar647ProgramId = new char[8];

								@Getter @Setter private short ar647ReturnCode;

						@Getter @Setter private char[] ar647OldDsn = new char[44];

						@Getter @Setter private char[] ar647NewDsn = new char[44];
				@Getter @Setter private Ar647FunctionFailureCodes ar647FunctionFailureCodes = new Ar647FunctionFailureCodes();
	
	/**
	* Constructor for Ar647Parms
	**/
    public Ar647Parms() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAr647FunctionFailureCodes().setParent(this,getStartOffset() + 98);
	   	/*  end of offset */
								setAr647ProgramId(("AR647010").toCharArray());
								setAr647ReturnCode((short)0);
								setAr647OldDsn(fillSpace(44));
								setAr647NewDsn(fillSpace(44));
    }





}
  
