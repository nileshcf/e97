package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar649Parameters is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ar649Parameters extends Ar649ParametersSerialized {
   

						@Getter @Setter private char[] ar649ProgramId = new char[8];
				@Getter @Setter private Ar649UserParms ar649UserParms = new Ar649UserParms();

								@Getter @Setter private short ar649ReturnCode;

								@Getter @Setter private short ar649ActionCode;

						@Getter @Setter private char[] ar649XferMthdCd = new char[1];

						@Getter @Setter private char[] ar649CommitActionCd = new char[1];
	
	/**
	* Constructor for Ar649Parameters
	**/
    public Ar649Parameters() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAr649UserParms().setParent(this,getStartOffset() + 8);
	   	/*  end of offset */
								setAr649ProgramId(("AR649010").toCharArray());
								setAr649ReturnCode((short)0);
								setAr649ActionCode((short)0);
								setAr649XferMthdCd(fillSpace(1));
								setAr649CommitActionCd(("Y").toCharArray());
    }





}
  
