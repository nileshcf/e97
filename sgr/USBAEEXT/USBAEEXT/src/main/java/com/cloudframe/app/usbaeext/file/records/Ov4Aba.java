package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4Aba is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ov4Aba extends Ov4AbaSerialized { 
   

								@Getter @Setter private long ov4AbaNo;

	
	/**
	* Constructor for Ov4Aba
	**/
    public Ov4Aba() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ov4Aba. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4Aba(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 8
             ,1
             );
    } 



}
  
