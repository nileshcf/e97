package com.cloudframe.app.ar640010.dto;

/**
*  The class VersionId1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class VersionId1000 extends VersionId1000Serialized { 
   

						@Getter @Setter private char[] versionDate1000 = new char[10];


						@Getter @Setter private char[] versionMod1000 = new char[1];
	
	/**
	* Constructor for VersionId1000
	**/
    public VersionId1000() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for VersionId1000. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public VersionId1000(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setVersionDate1000(("2013-04-15").toCharArray());
       replaceValue( // serialize and save the value
             ("#").toCharArray()
             , getStartOffset() + 10
             ,1
             );
								setVersionMod1000(("0").toCharArray());
    } 



}
  
