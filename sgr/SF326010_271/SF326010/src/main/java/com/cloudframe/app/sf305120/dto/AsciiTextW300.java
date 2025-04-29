package com.cloudframe.app.sf305120.dto;

/**
*  The class AsciiTextW300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AsciiTextW300 extends AsciiTextW300Serialized { 
   
				@Getter @Setter private AsciiTextWGroup300Group1 asciiTextWGroup300Group1 = new AsciiTextWGroup300Group1();

				@Getter @Setter private AsciiTextWGroup300Group5 asciiTextWGroup300Group5 = new AsciiTextWGroup300Group5();
				@Getter @Setter private AsciiTextWGroup300Group8 asciiTextWGroup300Group8 = new AsciiTextWGroup300Group8();
	
	/**
	* Constructor for AsciiTextW300
	**/
    public AsciiTextW300() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AsciiTextW300. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AsciiTextW300(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getAsciiTextWGroup300Group1().setParent(this,getStartOffset() + 0);
					getAsciiTextWGroup300Group5().setParent(this,getStartOffset() + 34);
					getAsciiTextWGroup300Group8().setParent(this,getStartOffset() + 60);
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x30,(byte)0x31,(byte)0x32,(byte)0x33,(byte)0x34,(byte)0x35,(byte)0x36,(byte)0x37,(byte)0x38,(byte)0x39}).toCharArray()
             , getStartOffset() + 24
             ,10
             );
    } 



}
  
