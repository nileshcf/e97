package com.cloudframe.app.init1.dto;

/**
*  The class IypPriorTbl9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class IypPriorTbl9 extends IypPriorTbl9Serialized { 
   
			private List<IypPrior9> iypPrior9 = new ArrayList<>();
    	
	
	/**
	* Constructor for IypPriorTbl9
	**/
    public IypPriorTbl9() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IypPriorTbl9. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypPriorTbl9(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
				for (int arrayIndex = 0; arrayIndex < IYP_PRIOR_9_SIZE;arrayIndex++) {
						iypPrior9.add(new IypPrior9(this, beginIypPrior9 + 
						arrayIndex * IypPrior9.getIypPrior9FieldLength()));
				}
			for (int arrayIndex = 0; arrayIndex < IYP_PRIOR_9_SIZE;arrayIndex++) {
					iypPrior9.add(new IypPrior9(this, beginIypPrior9 + 
						arrayIndex * IypPrior9.getIypPrior9FieldLength()));
			}
    } 

	/**
	 *	Returns the  value of iypPrior9
	 *  Corresponding COBOL Variable is WS-9IYP-PRIOR
	 *	@return iypPrior9
	 */
   public List<IypPrior9> getIypPrior9() {
       return iypPrior9;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return iypPrior9
	 */
	public IypPrior9 getIypPrior9(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIypPrior9(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IYP_PRIOR_9_SIZE) {
             	index = IYP_PRIOR_9_SIZE -1; // can't exceed max array size
             	logger.trace("iypPrior9 - Array index exceeded max Size {}, resetting it to max allowed",IYP_PRIOR_9_SIZE); 
	    }
		if (index >= iypPrior9.size()) {
       		for (int fillIndex =  iypPrior9.size() -1; fillIndex < index;fillIndex++) {
		       iypPrior9.add(null);
		    }
			iypPrior9.set(index,
			   	   	new IypPrior9(this,beginIypPrior9 + index * IypPrior9.getIypPrior9FieldLength()) 
				                        ); 	
		} 
   	   IypPrior9 value = iypPrior9.get(index);
   	   if (value == null) {
   	      iypPrior9.set(index,
			   	   	new IypPrior9(this,beginIypPrior9 + index * IypPrior9.getIypPrior9FieldLength()) 
				                        ); 
		  value = iypPrior9.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update IypPrior9 at index with the passed value
	 *  Corresponding COBOL Variable is WS-9IYP-PRIOR
	 *  @param index
	 *	@param value
	 */
  public void setIypPrior9(int index,char[] value) {
   	getIypPrior9(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes IypPriorTbl9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (iypPrior9.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IYP_PRIOR_9_SIZE;index++) {
              IypPrior9  newElement = new IypPrior9(this,beginIypPrior9 + index * IypPrior9.getIypPrior9FieldLength());
              newElement.initialize();
               iypPrior9.add(newElement);
          }
     } else {
        if (iypPrior9.size() < IYP_PRIOR_9_SIZE) {
          // prefill it first
          for (int index = iypPrior9.size();index <  IYP_PRIOR_9_SIZE;index++) {
              IypPrior9  newElement = new IypPrior9(this,beginIypPrior9 + index * IypPrior9.getIypPrior9FieldLength());
               iypPrior9.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IYP_PRIOR_9_SIZE;index++) {
     		IypPrior9 iypPrior9Var = iypPrior9.get(index);
 			if (iypPrior9Var == null) {
                iypPrior9Var = new IypPrior9(this,beginIypPrior9 + index * IypPrior9.getIypPrior9FieldLength());
                  iypPrior9.set(index, iypPrior9Var);
			} 
			iypPrior9Var.initialize();
		}
     }
   }

		public static int getIypPriorTbl9FieldLength() {
			return IYP_PRIOR_TBL_9_LENGTH;
		}

}
  
