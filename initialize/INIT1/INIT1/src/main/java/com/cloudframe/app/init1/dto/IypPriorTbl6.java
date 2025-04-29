package com.cloudframe.app.init1.dto;

/**
*  The class IypPriorTbl6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class IypPriorTbl6 extends IypPriorTbl6Serialized { 
   
			private List<IypPrior6> iypPrior6 = new ArrayList<>();
    	
	
	/**
	* Constructor for IypPriorTbl6
	**/
    public IypPriorTbl6() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IypPriorTbl6. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypPriorTbl6(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
				for (int arrayIndex = 0; arrayIndex < IYP_PRIOR_6_SIZE;arrayIndex++) {
						iypPrior6.add(new IypPrior6(this, beginIypPrior6 + 
						arrayIndex * IypPrior6.getIypPrior6FieldLength()));
				}
			for (int arrayIndex = 0; arrayIndex < IYP_PRIOR_6_SIZE;arrayIndex++) {
					iypPrior6.add(new IypPrior6(this, beginIypPrior6 + 
						arrayIndex * IypPrior6.getIypPrior6FieldLength()));
			}
    } 

	/**
	 *	Returns the  value of iypPrior6
	 *  Corresponding COBOL Variable is WS-6IYP-PRIOR
	 *	@return iypPrior6
	 */
   public List<IypPrior6> getIypPrior6() {
       return iypPrior6;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return iypPrior6
	 */
	public IypPrior6 getIypPrior6(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIypPrior6(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IYP_PRIOR_6_SIZE) {
             	index = IYP_PRIOR_6_SIZE -1; // can't exceed max array size
             	logger.trace("iypPrior6 - Array index exceeded max Size {}, resetting it to max allowed",IYP_PRIOR_6_SIZE); 
	    }
		if (index >= iypPrior6.size()) {
       		for (int fillIndex =  iypPrior6.size() -1; fillIndex < index;fillIndex++) {
		       iypPrior6.add(null);
		    }
			iypPrior6.set(index,
			   	   	new IypPrior6(this,beginIypPrior6 + index * IypPrior6.getIypPrior6FieldLength()) 
				                        ); 	
		} 
   	   IypPrior6 value = iypPrior6.get(index);
   	   if (value == null) {
   	      iypPrior6.set(index,
			   	   	new IypPrior6(this,beginIypPrior6 + index * IypPrior6.getIypPrior6FieldLength()) 
				                        ); 
		  value = iypPrior6.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update IypPrior6 at index with the passed value
	 *  Corresponding COBOL Variable is WS-6IYP-PRIOR
	 *  @param index
	 *	@param value
	 */
  public void setIypPrior6(int index,char[] value) {
   	getIypPrior6(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes IypPriorTbl6
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (iypPrior6.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IYP_PRIOR_6_SIZE;index++) {
              IypPrior6  newElement = new IypPrior6(this,beginIypPrior6 + index * IypPrior6.getIypPrior6FieldLength());
              newElement.initialize();
               iypPrior6.add(newElement);
          }
     } else {
        if (iypPrior6.size() < IYP_PRIOR_6_SIZE) {
          // prefill it first
          for (int index = iypPrior6.size();index <  IYP_PRIOR_6_SIZE;index++) {
              IypPrior6  newElement = new IypPrior6(this,beginIypPrior6 + index * IypPrior6.getIypPrior6FieldLength());
               iypPrior6.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IYP_PRIOR_6_SIZE;index++) {
     		IypPrior6 iypPrior6Var = iypPrior6.get(index);
 			if (iypPrior6Var == null) {
                iypPrior6Var = new IypPrior6(this,beginIypPrior6 + index * IypPrior6.getIypPrior6FieldLength());
                  iypPrior6.set(index, iypPrior6Var);
			} 
			iypPrior6Var.initialize();
		}
     }
   }

		public static int getIypPriorTbl6FieldLength() {
			return IYP_PRIOR_TBL_6_LENGTH;
		}

}
  
