package com.cloudframe.app.sf305120.dto;

/**
*  The class MipZLogClassType801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MipZLogClassType801 extends MipZLogClassType801Serialized { 
   

						@Getter @Setter private char[] mipZLogClass801 = new char[1];

						@Getter @Setter private char[] mipZLogTyp801 = new char[1];
	
	/**
	* Constructor for MipZLogClassType801
	**/
    public MipZLogClassType801() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MipZLogClassType801. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MipZLogClassType801(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMipZLogClass801(fillSpace(1));
								setMipZLogTyp801(fillSpace(1));
    } 



}
  
