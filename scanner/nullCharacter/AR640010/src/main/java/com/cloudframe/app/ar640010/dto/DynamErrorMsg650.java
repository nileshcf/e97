package com.cloudframe.app.ar640010.dto;

/**
*  The class DynamErrorMsg650 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class DynamErrorMsg650 extends DynamErrorMsg650Serialized {
   


								@Getter @Setter private char[] dynamErrorRc650 = new char[9];
							


						@Getter @Setter private char[] dynamFunction650 = new char[8];


							@Getter @Setter private char[] dynamErrorMsg650ConditionGroup4 = new char[12];
						
	
	/**
	* Constructor for DynamErrorMsg650
	**/
    public DynamErrorMsg650() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("5000-MCDYNAM ERROR - RETURN-CODE: ").toCharArray()
             , getStartOffset() + 0
             ,34
             );
								setDynamErrorRc650(fillSpace(9));
       replaceValue( // serialize and save the value
             (", FUNCTION: ").toCharArray()
             , getStartOffset() + 43
             ,12
             );
								setDynamFunction650(fillSpace(8));
       replaceValue( // serialize and save the value
             (" = ").toCharArray()
             , getStartOffset() + 63
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(12)
             , getStartOffset() + 66
             ,12
             );
    }





}
  
