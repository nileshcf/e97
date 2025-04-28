package com.cloudframe.app.move0.dto;

/**
*  The class Rl7abTableInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:04. using version 5.0.0.256
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Rl7abTableInfo extends Rl7abTableInfoSerialized { 
   
			private List<Rl7abTbl> rl7abTbl = new ArrayList<>();
    	
	
	/**
	* Constructor for Rl7abTableInfo
	**/
    public Rl7abTableInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rl7abTableInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rl7abTableInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
				for (int arrayIndex = 0; arrayIndex < RL_7AB_TBL_SIZE;arrayIndex++) {
						rl7abTbl.add(new Rl7abTbl(this, beginRl7abTbl + 
						arrayIndex * Rl7abTbl.getRl7abTblFieldLength()));
				}
			for (int arrayIndex = 0; arrayIndex < RL_7AB_TBL_SIZE;arrayIndex++) {
					rl7abTbl.add(new Rl7abTbl(this, beginRl7abTbl + 
						arrayIndex * Rl7abTbl.getRl7abTblFieldLength()));
			}
    } 

	/**
	 *	Returns the  value of rl7abTbl
	 *  Corresponding COBOL Variable is WS-RL7AB-TBL
	 *	@return rl7abTbl
	 */
   public List<Rl7abTbl> getRl7abTbl() {
       return rl7abTbl;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return rl7abTbl
	 */
	public Rl7abTbl getRl7abTbl(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getRl7abTbl(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= RL_7AB_TBL_SIZE) {
             	index = RL_7AB_TBL_SIZE -1; // can't exceed max array size
             	logger.trace("rl7abTbl - Array index exceeded max Size {}, resetting it to max allowed",RL_7AB_TBL_SIZE); 
	    }
		if (index >= rl7abTbl.size()) {
       		for (int fillIndex =  rl7abTbl.size() -1; fillIndex < index;fillIndex++) {
		       rl7abTbl.add(null);
		    }
			rl7abTbl.set(index,
			   	   	new Rl7abTbl(this,beginRl7abTbl + index * Rl7abTbl.getRl7abTblFieldLength()) 
				                        ); 	
		} 
   	   Rl7abTbl value = rl7abTbl.get(index);
   	   if (value == null) {
   	      rl7abTbl.set(index,
			   	   	new Rl7abTbl(this,beginRl7abTbl + index * Rl7abTbl.getRl7abTblFieldLength()) 
				                        ); 
		  value = rl7abTbl.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Rl7abTbl at index with the passed value
	 *  Corresponding COBOL Variable is WS-RL7AB-TBL
	 *  @param index
	 *	@param value
	 */
  public void setRl7abTbl(int index,char[] value) {
   	getRl7abTbl(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Rl7abTableInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (rl7abTbl.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  RL_7AB_TBL_SIZE;index++) {
              Rl7abTbl  newElement = new Rl7abTbl(this,beginRl7abTbl + index * Rl7abTbl.getRl7abTblFieldLength());
              newElement.initialize();
               rl7abTbl.add(newElement);
          }
     } else {
        if (rl7abTbl.size() < RL_7AB_TBL_SIZE) {
          // prefill it first
          for (int index = rl7abTbl.size();index <  RL_7AB_TBL_SIZE;index++) {
              Rl7abTbl  newElement = new Rl7abTbl(this,beginRl7abTbl + index * Rl7abTbl.getRl7abTblFieldLength());
               rl7abTbl.add(newElement);
          }
        }
        
     	for (int index = 0;index <  RL_7AB_TBL_SIZE;index++) {
     		Rl7abTbl rl7abTblVar = rl7abTbl.get(index);
 			if (rl7abTblVar == null) {
                rl7abTblVar = new Rl7abTbl(this,beginRl7abTbl + index * Rl7abTbl.getRl7abTblFieldLength());
                  rl7abTbl.set(index, rl7abTblVar);
			} 
			rl7abTblVar.initialize();
		}
     }
   }

		public static int getRl7abTableInfoFieldLength() {
			return RL_7AB_TABLE_INFO_LENGTH;
		}

}
  
