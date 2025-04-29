package com.cloudframe.app.ip989010.dto;

/**
*  The class ComnTblEntry500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ComnTblEntry500 extends ComnTblEntry500Serialized { 
   
				@Getter @Setter private ComnTagKey500 comnTagKey500 = new ComnTagKey500();
				@Getter @Setter private ComnTagData500 comnTagData500 = new ComnTagData500();
	
	/**
	* Constructor for ComnTblEntry500
	**/
    public ComnTblEntry500() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ComnTblEntry500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ComnTblEntry500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getComnTagKey500().setParent(this,getStartOffset() + 0);
					getComnTagData500().setParent(this,getStartOffset() + 13);
    } 



}
  
