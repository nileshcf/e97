package com.cloudframe.app.ip989010.dto;

/**
*  The class Tag800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Tag800 extends Tag800Serialized { 
   

								@Getter @Setter private int tagType800;

								@Getter @Setter private int tagNum800;

								@Getter @Setter private int tagOccur800;

								@Getter @Setter private int tagSubfldNo800;

								@Getter @Setter private int tagStart800;

								@Getter @Setter private int tagLngth800;
	
	/**
	* Constructor for Tag800
	**/
    public Tag800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Tag800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Tag800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setTagType800(0);
								setTagNum800(0);
								setTagOccur800(0);
								setTagSubfldNo800(0);
								setTagStart800(0);
								setTagLngth800(0);
    } 



}
  
