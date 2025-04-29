package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar642Parameters is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ar642Parameters extends Ar642ParametersSerialized {
   

						@Getter @Setter private char[] ar642ProgramId = new char[8];

						@Getter @Setter private char[] ar642DatasetId = new char[54];

								@Getter @Setter private short ar642ReturnCode;

						@Getter @Setter private char[] ar642AllocUnit = new char[1];

						@Getter @Setter private char[] ar642RecordFormat = new char[3];

								@Getter @Setter private long ar642UnitsUsed;

								@Getter @Setter private long ar642RecordLength;

								@Getter @Setter private long ar642BlockSize;

						@Getter @Setter private char[] ar642ReturnDsn = new char[44];

								@Getter @Setter private long ar642PrimarySpace;

								@Getter @Setter private long ar642SecondarySpace;
				@Getter @Setter private Ar642FunctionFailureCodes ar642FunctionFailureCodes = new Ar642FunctionFailureCodes();
	
	/**
	* Constructor for Ar642Parameters
	**/
    public Ar642Parameters() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAr642FunctionFailureCodes().setParent(this,getStartOffset() + 132);
	   	/*  end of offset */
								setAr642ProgramId(("AR642010").toCharArray());
								setAr642DatasetId(fillSpace(54));
								setAr642ReturnCode((short)0);
								setAr642AllocUnit(fillSpace(1));
								setAr642RecordFormat(fillSpace(3));
								setAr642UnitsUsed(0L);
								setAr642RecordLength(0L);
								setAr642BlockSize(0L);
								setAr642ReturnDsn(fillSpace(44));
								setAr642PrimarySpace(0L);
								setAr642SecondarySpace(0L);
    }





}
  
