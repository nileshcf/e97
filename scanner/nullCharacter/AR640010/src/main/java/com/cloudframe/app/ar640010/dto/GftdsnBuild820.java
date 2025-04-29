package com.cloudframe.app.ar640010.dto;

/**
*  The class GftdsnBuild820 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class GftdsnBuild820 extends GftdsnBuild820Serialized { 
   


						@Getter @Setter private char[] gftdsnSystemId820 = new char[2];


						@Getter @Setter private char[] gftdsnBulkId820 = new char[4];


						@Getter @Setter private char[] gftdsnXferMthdCd820 = new char[1];


						@Getter @Setter private char[] gftdsnEndptId820 = new char[7];


						@Getter @Setter private char[] gftdsnYear820 = new char[2];

						@Getter @Setter private char[] gftdsnMonth820 = new char[2];

						@Getter @Setter private char[] gftdsnDay820 = new char[2];


						@Getter @Setter private char[] gftdsnHour820 = new char[2];

						@Getter @Setter private char[] gftdsnMinute820 = new char[2];

						@Getter @Setter private char[] gftdsnSecond820 = new char[2];


						@Getter @Setter private char[] gftdsnRotorChar820 = new char[1];

								@Getter @Setter private int gftdsnCyclNum820;

	
	/**
	* Constructor for GftdsnBuild820
	**/
    public GftdsnBuild820() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for GftdsnBuild820. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GftdsnBuild820(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 0
             ,1
             );
								setGftdsnSystemId820(("AR").toCharArray());
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 3
             ,1
             );
								setGftdsnBulkId820(fillSpace(4));
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 8
             ,1
             );
								setGftdsnXferMthdCd820(fillSpace(1));
       replaceValue( // serialize and save the value
             (".E").toCharArray()
             , getStartOffset() + 10
             ,2
             );
								setGftdsnEndptId820(fillSpace(7));
       replaceValue( // serialize and save the value
             (".D").toCharArray()
             , getStartOffset() + 19
             ,2
             );
								setGftdsnYear820(fillSpace(2));
								setGftdsnMonth820(fillSpace(2));
								setGftdsnDay820(fillSpace(2));
       replaceValue( // serialize and save the value
             (".T").toCharArray()
             , getStartOffset() + 27
             ,2
             );
								setGftdsnHour820(fillSpace(2));
								setGftdsnMinute820(fillSpace(2));
								setGftdsnSecond820(fillSpace(2));
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 35
             ,1
             );
								setGftdsnRotorChar820(fillSpace(1));
								setGftdsnCyclNum820(0);
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 40
             ,1
             );
    } 



}
  
