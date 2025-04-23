package com.cloudframe.app.cfdate02.dto;

/**
*  The class LCpduUbInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LCpduUbInit extends LCpduUbInitSerialized { 
   



















	
	/**
	* Constructor for LCpduUbInit
	**/
    public LCpduUbInit() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for LCpduUbInit. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LCpduUbInit(Field parent,int begin) {
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
             fillSpace(52)
             , getStartOffset() + 110
             ,52
             );
    } 


	
	
	

		public static int getLCpduUbInitFieldLength() {
			return L_CPDU_UB_INIT_LENGTH;
		}

}
  
