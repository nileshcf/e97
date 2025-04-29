package com.cloudframe.app.ar640010.dto;

/**
*  The class RotorTable540 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;


@Data
public class RotorTable540 extends RotorTable540Serialized {
   
      private List<char[]> rotorChar540; 

	
	/**
	* Constructor for RotorTable540
	**/
    public RotorTable540() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
							for (int arrayIndex = 0; arrayIndex < ROTOR_CHAR_540_SIZE;arrayIndex++) {
								setRotorChar540(arrayIndex,("ABCDEFGHIJKLMNOPQRSTUVWXYZ.").toCharArray());
							}
    }





}
  
