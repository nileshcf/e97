package com.cloudframe.app.init1.dto;

/**
*  The class AiypPriorTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


@Data
public class AiypPriorTbl extends AiypPriorTblSerialized { 
   
			@Getter @Setter private List<AiypPrior> aiypPrior = new ArrayList<>();
    	
	
	/**
	* Constructor for AiypPriorTbl
	**/
    public AiypPriorTbl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AiypPriorTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AiypPriorTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
				for (int arrayIndex = 0; arrayIndex < AIYP_PRIOR_SIZE;arrayIndex++) {
						getAiypPrior().add(new AiypPrior(this, beginAiypPrior + 
						arrayIndex * AiypPrior.getAiypPriorFieldLength()));
				}
			for (int arrayIndex = 0; arrayIndex < AIYP_PRIOR_SIZE;arrayIndex++) {
					getAiypPrior().add(new AiypPrior(this, beginAiypPrior + 
						arrayIndex * AiypPrior.getAiypPriorFieldLength()));
			}
    } 

	/**
	 * 	initializes AiypPriorTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (aiypPrior.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  AIYP_PRIOR_SIZE;index++) {
              AiypPrior  newElement = new AiypPrior(this,beginAiypPrior + index * AiypPrior.getAiypPriorFieldLength());
              newElement.initialize();
              getAiypPrior().add(newElement);
          }
     } else {
        if (aiypPrior.size() < AIYP_PRIOR_SIZE) {
          // prefill it first
          for (int index = aiypPrior.size();index <  AIYP_PRIOR_SIZE;index++) {
              AiypPrior  newElement = new AiypPrior(this,beginAiypPrior + index * AiypPrior.getAiypPriorFieldLength());
              getAiypPrior().add(newElement);
          }
        }
        
     	for (int index = 0;index <  AIYP_PRIOR_SIZE;index++) {
     		AiypPrior aiypPriorVar = aiypPrior.get(index);
 			if (aiypPriorVar == null) {
                aiypPriorVar = new AiypPrior(this,beginAiypPrior + index * AiypPrior.getAiypPriorFieldLength());
                  getAiypPrior().set(index, aiypPriorVar);
			} 
			aiypPriorVar.initialize();
		}
     }
   }


}
  
