package com.cloudframe.app.init1.dto;

/**
*  The class LCpduVisionInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LCpduVisionInit extends LCpduVisionInitSerialized { 
   





















	
	/**
	* Constructor for LCpduVisionInit
	**/
    public LCpduVisionInit() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for LCpduVisionInit. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LCpduVisionInit(Field parent,int begin) {
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


	
	
	

		public static int getLCpduVisionInitFieldLength() {
			return L_CPDU_VISION_INIT_LENGTH;
		}

}
  
