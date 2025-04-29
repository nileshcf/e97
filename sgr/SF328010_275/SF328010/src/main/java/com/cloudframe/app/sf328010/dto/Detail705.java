package com.cloudframe.app.sf328010.dto;

/**
*  The class Detail705 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Detail705 extends Detail705Serialized { 
   


						@Getter @Setter private char[] serviceId705 = new char[4];


								@Getter @Setter private char[] totalCnt705 = Field.fillLowValue(11);


								@Getter @Setter private char[] successCnt705 = Field.fillLowValue(11);


								@Getter @Setter private char[] successPercent705 = Field.fillLowValue(6);



								@Getter @Setter private char[] errCnt705 = Field.fillLowValue(11);


								@Getter @Setter private char[] errPercent705 = Field.fillLowValue(6);



								@Getter @Setter private char[] avgTime705 = Field.fillLowValue(14);


								@Getter @Setter private char[] highTime705 = Field.fillLowValue(11);


								@Getter @Setter private char[] lowTime705 = Field.fillLowValue(11);

	
	/**
	* Constructor for Detail705
	**/
    public Detail705() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Detail705. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Detail705(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 0
             ,10
             );
								setServiceId705(fillSpace(4));
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 14
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 29
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 46
             ,2
             );
       replaceValue( // serialize and save the value
             ("%").toCharArray()
             , getStartOffset() + 54
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 55
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 68
             ,2
             );
       replaceValue( // serialize and save the value
             ("%").toCharArray()
             , getStartOffset() + 76
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 77
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 95
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 111
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(11)
             , getStartOffset() + 126
             ,11
             );
    } 



}
  
