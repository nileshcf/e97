package com.cloudframe.app.cfdate02.dto;

/**
*  The class TCpduVisionInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TCpduVisionInit extends TCpduVisionInitSerialized { 
   





















	
	/**
	* Constructor for TCpduVisionInit
	**/
    public TCpduVisionInit() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TCpduVisionInit. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TCpduVisionInit(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             getBinaryString((short)0,2)
             , getStartOffset() + 0
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 2
             ,2
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 4
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 8
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 10
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 13
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 15
             ,1
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 16
             ,10
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 26
             ,10
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 36
             ,4
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 40
             ,4
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 44
             ,4
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 48
             ,10
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
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 78
             ,2
             );
       replaceValue(pad(1,"0","0",LEFT_PAD),getStartOffset() + 80,1);
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 81
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 82
             ,1
             );
       replaceValue(pad(8,"0L","0",LEFT_PAD),getStartOffset() + 83,8);
       replaceValue(pad(8,"0L","0",LEFT_PAD),getStartOffset() + 91,8);
    } 


	
	
	

		public static int getTCpduVisionInitFieldLength() {
			return T_CPDU_VISION_INIT_LENGTH;
		}

}
  
