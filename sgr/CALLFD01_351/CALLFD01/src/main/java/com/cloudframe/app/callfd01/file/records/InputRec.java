package com.cloudframe.app.callfd01.file.records;

/**
*  The class InputRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class InputRec extends InputRecSerialized {
   
				@Getter @Setter private InputKey inputKey = new InputKey();


						@Getter @Setter private char[] inputMarker = Field.fillLowValue(8);

						@Getter @Setter private char[] inputData = Field.fillLowValue(983);
	
	/**
	* Constructor for InputRec
	**/
    public InputRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getInputKey().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
