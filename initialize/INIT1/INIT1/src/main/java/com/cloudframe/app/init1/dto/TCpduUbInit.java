package com.cloudframe.app.init1.dto;

/**
*  The class TCpduUbInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TCpduUbInit extends TCpduUbInitSerialized { 
   





















	
	/**
	* Constructor for TCpduUbInit
	**/
    public TCpduUbInit() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TCpduUbInit. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TCpduUbInit(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 1
             ,4
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 5
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 9
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 19
             ,2
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 21
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(9)
             , getStartOffset() + 25
             ,9
             );
       replaceValue( // serialize and save the value
             fillSpace(9)
             , getStartOffset() + 34
             ,9
             );
       replaceValue( // serialize and save the value
             fillSpace(9)
             , getStartOffset() + 43
             ,9
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 52
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 55
             ,3
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 58
             ,10
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 68
             ,10
             );
       replace( // serialize and save the value
             getPackedString(0L,10,0,true)
             , 78
             ,10
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 88
             ,4
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 92
             ,10
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 102
             ,4
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 106
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 110
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 111
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(50)
             , getStartOffset() + 112
             ,50
             );
    } 


	
	
	

		public static int getTCpduUbInitFieldLength() {
			return T_CPDU_UB_INIT_LENGTH;
		}

}
  
