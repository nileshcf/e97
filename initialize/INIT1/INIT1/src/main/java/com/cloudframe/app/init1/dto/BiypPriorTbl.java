package com.cloudframe.app.init1.dto;

/**
*  The class BiypPriorTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class BiypPriorTbl extends BiypPriorTblSerialized { 
   
			private List<BiypPrior> biypPrior = new ArrayList<>();
    	
	
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
						biypPrior.add(new BiypPrior(this, beginBiypPrior + 
						arrayIndex * BiypPrior.getBiypPriorFieldLength()));
				}
			for (int arrayIndex = 0; arrayIndex < BIYP_PRIOR_SIZE;arrayIndex++) {
					biypPrior.add(new BiypPrior(this, beginBiypPrior + 
						arrayIndex * BiypPrior.getBiypPriorFieldLength()));
			}
    } 

	/**
	 *	Returns the  value of biypPrior
	 *  Corresponding COBOL Variable is WS-BIYP-PRIOR
	 *	@return biypPrior
	 */
   public List<BiypPrior> getBiypPrior() {
       return biypPrior;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return biypPrior
	 */
	public BiypPrior getBiypPrior(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getBiypPrior(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= BIYP_PRIOR_SIZE) {
             	index = BIYP_PRIOR_SIZE -1; // can't exceed max array size
             	logger.trace("biypPrior - Array index exceeded max Size {}, resetting it to max allowed",BIYP_PRIOR_SIZE); 
	    }
		if (index >= biypPrior.size()) {
       		for (int fillIndex =  biypPrior.size() -1; fillIndex < index;fillIndex++) {
		       biypPrior.add(null);
		    }
			biypPrior.set(index,
			   	   	new BiypPrior(this,beginBiypPrior + index * BiypPrior.getBiypPriorFieldLength()) 
				                        ); 	
		} 
   	   BiypPrior value = biypPrior.get(index);
   	   if (value == null) {
   	      biypPrior.set(index,
			   	   	new BiypPrior(this,beginBiypPrior + index * BiypPrior.getBiypPriorFieldLength()) 
				                        ); 
		  value = biypPrior.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update BiypPrior at index with the passed value
	 *  Corresponding COBOL Variable is WS-BIYP-PRIOR
	 *  @param index
	 *	@param value
	 */
  public void setBiypPrior(int index,char[] value) {
   	getBiypPrior(index).setString(value);
   }
   
	

	
	
	

		public static int getBiypPriorTblFieldLength() {
			return BIYP_PRIOR_TBL_LENGTH;
		}

}
  
