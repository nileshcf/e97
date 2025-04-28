package com.cloudframe.app.init1.dto;

/**
*  The class AiypPriorTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class AiypPriorTbl extends AiypPriorTblSerialized { 
   
			private List<AiypPrior> aiypPrior = new ArrayList<>();
    	
	
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
						aiypPrior.add(new AiypPrior(this, beginAiypPrior + 
						arrayIndex * AiypPrior.getAiypPriorFieldLength()));
				}
			for (int arrayIndex = 0; arrayIndex < AIYP_PRIOR_SIZE;arrayIndex++) {
					aiypPrior.add(new AiypPrior(this, beginAiypPrior + 
						arrayIndex * AiypPrior.getAiypPriorFieldLength()));
			}
    } 

	/**
	 *	Returns the  value of aiypPrior
	 *  Corresponding COBOL Variable is WS-AIYP-PRIOR
	 *	@return aiypPrior
	 */
   public List<AiypPrior> getAiypPrior() {
       return aiypPrior;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return aiypPrior
	 */
	public AiypPrior getAiypPrior(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getAiypPrior(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= AIYP_PRIOR_SIZE) {
             	index = AIYP_PRIOR_SIZE -1; // can't exceed max array size
             	logger.trace("aiypPrior - Array index exceeded max Size {}, resetting it to max allowed",AIYP_PRIOR_SIZE); 
	    }
		if (index >= aiypPrior.size()) {
       		for (int fillIndex =  aiypPrior.size() -1; fillIndex < index;fillIndex++) {
		       aiypPrior.add(null);
		    }
			aiypPrior.set(index,
			   	   	new AiypPrior(this,beginAiypPrior + index * AiypPrior.getAiypPriorFieldLength()) 
				                        ); 	
		} 
   	   AiypPrior value = aiypPrior.get(index);
   	   if (value == null) {
   	      aiypPrior.set(index,
			   	   	new AiypPrior(this,beginAiypPrior + index * AiypPrior.getAiypPriorFieldLength()) 
				                        ); 
		  value = aiypPrior.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update AiypPrior at index with the passed value
	 *  Corresponding COBOL Variable is WS-AIYP-PRIOR
	 *  @param index
	 *	@param value
	 */
  public void setAiypPrior(int index,char[] value) {
   	getAiypPrior(index).setString(value);
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
               aiypPrior.add(newElement);
          }
     } else {
        if (aiypPrior.size() < AIYP_PRIOR_SIZE) {
          // prefill it first
          for (int index = aiypPrior.size();index <  AIYP_PRIOR_SIZE;index++) {
              AiypPrior  newElement = new AiypPrior(this,beginAiypPrior + index * AiypPrior.getAiypPriorFieldLength());
               aiypPrior.add(newElement);
          }
        }
        
     	for (int index = 0;index <  AIYP_PRIOR_SIZE;index++) {
     		AiypPrior aiypPriorVar = aiypPrior.get(index);
 			if (aiypPriorVar == null) {
                aiypPriorVar = new AiypPrior(this,beginAiypPrior + index * AiypPrior.getAiypPriorFieldLength());
                  aiypPrior.set(index, aiypPriorVar);
			} 
			aiypPriorVar.initialize();
		}
     }
   }

		public static int getAiypPriorTblFieldLength() {
			return AIYP_PRIOR_TBL_LENGTH;
		}

}
  
