package com.cloudframe.app.ip989010.dto;

/**
*  The class LuhnsWorkArea800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class LuhnsWorkArea800 extends LuhnsWorkArea800Serialized { 
   

								@Getter @Setter private int evenValueDoubled800;
				@Getter @Setter private EvenValue800 evenValue800 = new EvenValue800();

								@Getter @Setter private int currentByte800;

								@Getter @Setter private int oddEvenTotal800;
	
	/**
	* Constructor for LuhnsWorkArea800
	**/
    public LuhnsWorkArea800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for LuhnsWorkArea800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LuhnsWorkArea800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getEvenValue800().setParent(this,getStartOffset() + 0);
								setEvenValueDoubled800(0);
								setCurrentByte800(0);
								setOddEvenTotal800(0);
    } 



}
  
