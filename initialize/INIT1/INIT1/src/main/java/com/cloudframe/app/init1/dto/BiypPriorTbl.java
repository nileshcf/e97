package com.cloudframe.app.init1.dto;

/**
*  The class BiypPriorTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class BiypPriorTbl extends BiypPriorTblSerialized { 
   
			@Getter @Setter private List<BiypPrior> biypPrior = new ArrayList<>();
    	
	
	/**
	* Constructor for BiypPriorTbl
	**/
    public BiypPriorTbl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BiypPriorTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BiypPriorTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
				for (int arrayIndex = 0; arrayIndex < BIYP_PRIOR_SIZE;arrayIndex++) {
						getBiypPrior().add(new BiypPrior(this, beginBiypPrior + 
						arrayIndex * BiypPrior.getBiypPriorFieldLength()));
				}
			for (int arrayIndex = 0; arrayIndex < BIYP_PRIOR_SIZE;arrayIndex++) {
					getBiypPrior().add(new BiypPrior(this, beginBiypPrior + 
						arrayIndex * BiypPrior.getBiypPriorFieldLength()));
			}
    } 



}
  
