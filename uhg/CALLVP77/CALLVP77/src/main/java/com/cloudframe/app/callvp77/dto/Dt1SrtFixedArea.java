package com.cloudframe.app.callvp77.dto;

/**
*  The class Dt1SrtFixedArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dt1SrtFixedArea extends Dt1SrtFixedAreaSerialized { 
   

								@Getter @Setter private int dt1SrtItemCnt;
				@Getter @Setter private Dt1SrtArray dt1SrtArray = new Dt1SrtArray();
	
	/**
	* Constructor for Dt1SrtFixedArea
	**/
    public Dt1SrtFixedArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dt1SrtFixedArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1SrtFixedArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getDt1SrtArray().setParent(this,getStartOffset() + 4);
    } 



}
  
