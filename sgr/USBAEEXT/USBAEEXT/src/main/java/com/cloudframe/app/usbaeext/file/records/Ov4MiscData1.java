package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4MiscData1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ov4MiscData1 extends Ov4MiscData1Serialized { 
   

						@Getter @Setter private char[] ov4Md1Oper = Field.fillLowValue(5);

						@Getter @Setter private char[] ov4Md1SortType = Field.fillLowValue(3);


						@Getter @Setter private char[] ov4Md1Tracer = Field.fillLowValue(4);


						@Getter @Setter private char[] ov4Md1Block = Field.fillLowValue(4);


						@Getter @Setter private char[] ov4Md1RrKblk = new char[5];

	
	/**
	* Constructor for Ov4MiscData1
	**/
    public Ov4MiscData1() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ov4MiscData1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4MiscData1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 24
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 34
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 39
             ,1
             );
								setOv4Md1RrKblk(("0000 ").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 45
             ,5
             );
    } 



}
  
