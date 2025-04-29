package com.cloudframe.app.ar640010.dto;

/**
*  The class DynamReturnMsg650 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class DynamReturnMsg650 extends DynamReturnMsg650Serialized {
   


								@Getter @Setter private char[] dynamSvc99Rc650 = new char[9];
							


								@Getter @Setter private char[] dynamSvc99Err650 = new char[9];
							


								@Getter @Setter private char[] dynamSvc99Inf650 = new char[9];
							
	
	/**
	* Constructor for DynamReturnMsg650
	**/
    public DynamReturnMsg650() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("5001-MCDYNAM - SVC99 RETURN-CODE: ").toCharArray()
             , getStartOffset() + 0
             ,34
             );
								setDynamSvc99Rc650(fillSpace(9));
       replaceValue( // serialize and save the value
             (", ERROR-CODE: ").toCharArray()
             , getStartOffset() + 43
             ,14
             );
								setDynamSvc99Err650(fillSpace(9));
       replaceValue( // serialize and save the value
             (", INFO-CODE: ").toCharArray()
             , getStartOffset() + 66
             ,13
             );
								setDynamSvc99Inf650(fillSpace(9));
    }





}
  
