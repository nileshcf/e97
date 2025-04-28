package com.cloudframe.app.mcindex.dto;

/**
*  The class Index is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/


import com.cloudframe.app.mcindex.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.*;
import java.util.ArrayList;


public class Index extends IndexSerialized {
   
      private List<Integer> zeroIdx4800; 

			private List<IndexTbl1800> indexTbl1800 = new ArrayList<>();
    	
	
	/**
	* Constructor for Index
	**/
    public Index() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < INDEX_TBL_1800_SIZE;arrayIndex++) {
						indexTbl1800.add(new IndexTbl1800(this, beginIndexTbl1800 + 
						arrayIndex * IndexTbl1800.getIndexTbl1800FieldLength()));
				}
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of zeroIdx4800
	 *  Corresponding COBOL Variable is 800-ZERO-IDX4
	 *	@return zeroIdx4800
	 */
	public List<Integer> getZeroIdx4800() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < ZERO_IDX_4800_SIZE;index++) {
        	list.add( getZeroIdx4800( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return zeroIdx4800
	 */
	public int getZeroIdx4800(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getZeroIdx4800(), resetting it to 0",index);
		    index = 0;
        } else if (index >= ZERO_IDX_4800_SIZE) {
             	index = ZERO_IDX_4800_SIZE -1; // can't exceed max array size
             	logger.trace("zeroIdx4800 - Array index exceeded max Size {}, resetting it to max allowed",ZERO_IDX_4800_SIZE); 
	    }   
		return getInt(beginZeroIdx4800+ index*ZERO_IDX_4800_LEN);
   }
	
	/**
	 *	Update ZeroIdx4800 at index with the passed value
	 *  Corresponding COBOL Variable is 800-ZERO-IDX4
	 *  @param index
	 *	@param number
	 */
	public void setZeroIdx4800(int index,int number) {
	   truncated = false; // reset left over truncated flag
		setZeroIdx4800(index,number, true);
	}
	
	public void setZeroIdx4800(int index,long number) {
			setZeroIdx4800(index,(int)number, true);
	}
	
	/**
	 *	Update  ZeroIdx4800 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setZeroIdx4800(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setZeroIdx4800(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= ZERO_IDX_4800_SIZE) {
             	index = ZERO_IDX_4800_SIZE -1; // can't exceed max array size
             	logger.trace("zeroIdx4800 - Array index exceeded max Size "+ZERO_IDX_4800_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeZeroIdx4800(index,value);
		}
   }
	/**
	 *	Returns the  value of indexTbl1800
	 *  Corresponding COBOL Variable is 800-INDEX-TBL1
	 *	@return indexTbl1800
	 */
   public List<IndexTbl1800> getIndexTbl1800() {
       return indexTbl1800;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return indexTbl1800
	 */
	public IndexTbl1800 getIndexTbl1800(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIndexTbl1800(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= INDEX_TBL_1800_SIZE) {
             	index = INDEX_TBL_1800_SIZE -1; // can't exceed max array size
             	logger.trace("indexTbl1800 - Array index exceeded max Size {}, resetting it to max allowed",INDEX_TBL_1800_SIZE); 
	    }
		if (index >= indexTbl1800.size()) {
       		for (int fillIndex =  indexTbl1800.size() -1; fillIndex < index;fillIndex++) {
		       indexTbl1800.add(null);
		    }
			indexTbl1800.set(index,
			   	   	new IndexTbl1800(this,beginIndexTbl1800 + index * IndexTbl1800.getIndexTbl1800FieldLength()) 
				                        ); 	
		} 
   	   IndexTbl1800 value = indexTbl1800.get(index);
   	   if (value == null) {
   	      indexTbl1800.set(index,
			   	   	new IndexTbl1800(this,beginIndexTbl1800 + index * IndexTbl1800.getIndexTbl1800FieldLength()) 
				                        ); 
		  value = indexTbl1800.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update IndexTbl1800 at index with the passed value
	 *  Corresponding COBOL Variable is 800-INDEX-TBL1
	 *  @param index
	 *	@param value
	 */
  public void setIndexTbl1800(int index,char[] value) {
   	getIndexTbl1800(index).setString(value);
   }
   
	

	
	
	

		public static int getIndexFieldLength() {
			return INDEX_LENGTH;
		}

}
  
