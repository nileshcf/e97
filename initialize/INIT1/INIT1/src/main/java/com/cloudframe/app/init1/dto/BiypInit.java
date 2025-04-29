package com.cloudframe.app.init1.dto;

/**
*  The class BiypInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class BiypInit extends BiypInitSerialized { 
   

								@Getter @Setter private int fillerc;
				@Getter @Setter private BiypPriorTbl biypPriorTbl = new BiypPriorTbl();
	
	/**
	* Constructor for BiypInit
	**/
    public BiypInit() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BiypInit. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BiypInit(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getBiypPriorTbl().setParent(this,getStartOffset() + 4);
								setFillerc(0);
    } 



}
  
